package com.newtaxiprime.user.taxiapp.views.signinsignup


/**
 * @package com.newtaxiprime.user
 * @subpackage signin_signup
 * @category SSResetPassword
 * @author Seen Technologies
 *
 */

import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.text.TextUtils
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.RelativeLayout
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import butterknife.BindView
import butterknife.ButterKnife
import com.google.android.material.textfield.TextInputLayout
import com.google.gson.Gson
import com.newtaxiprime.user.R
import com.newtaxiprime.user.appcommon.configs.SessionManager
import com.newtaxiprime.user.appcommon.datamodels.JsonResponse
import com.newtaxiprime.user.appcommon.interfaces.ApiService
import com.newtaxiprime.user.appcommon.interfaces.ServiceListener
import com.newtaxiprime.user.appcommon.network.AppController
import com.newtaxiprime.user.appcommon.utils.CommonKeys.FACEBOOK_ACCOUNT_KIT_PHONE_NUMBER_COUNTRY_CODE_KEY
import com.newtaxiprime.user.appcommon.utils.CommonKeys.FACEBOOK_ACCOUNT_KIT_PHONE_NUMBER_COUNTRY_NAME_CODE_KEY
import com.newtaxiprime.user.appcommon.utils.CommonKeys.FACEBOOK_ACCOUNT_KIT_PHONE_NUMBER_KEY
import com.newtaxiprime.user.appcommon.utils.CommonMethods
import com.newtaxiprime.user.appcommon.utils.RequestCallback
import com.newtaxiprime.user.appcommon.views.CommonActivity
import com.newtaxiprime.user.databinding.ActivitySsResetpasswordBinding
import com.newtaxiprime.user.taxiapp.datamodels.signinsignup.SigninResult
import com.newtaxiprime.user.taxiapp.views.customize.CustomDialog
import com.newtaxiprime.user.taxiapp.views.main.MainActivity
import org.json.JSONException
import org.json.JSONObject
import javax.inject.Inject

/* ************************************************************
   Rider can reset password when forgot the password
   ************************************************************ */

class SSResetPassword : CommonActivity(), ServiceListener {

    lateinit var dialog: AlertDialog

    @Inject
    lateinit var sessionManager: SessionManager

    @Inject
    lateinit var commonMethods: CommonMethods

    @Inject
    lateinit var apiService: ApiService

    @Inject
    lateinit var customDialog: CustomDialog

    @Inject
    lateinit var gson: Gson

    lateinit var input_password: EditText

    lateinit var input_confirmpassword: EditText

    lateinit var input_layout_password: TextInputLayout

    lateinit var binding: ActivitySsResetpasswordBinding

    lateinit var nextButton: RelativeLayout
    lateinit var signinResult: SigninResult
    protected var isInternetAvailable: Boolean = false
    private var facebookVerifiedMobileNumberCountryCode = ""
    private var facebookVerifiedMobileNumberCountryNameCode = ""
    private var facebookKitVerifiedMobileNumber = ""

    /**
     * Reset Password next button clicked
     */

    operator fun next() {
        onNext()
    }


    fun back() {
        onBackPressed()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySsResetpasswordBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ButterKnife.bind(this)
        AppController.appComponent.inject(this)
        commonMethods.setheaderText(
            resources.getString(R.string.resetpasswords),
            binding.commonHeader.tvHeadertext
        )
        input_password = binding.inputPassword
        input_confirmpassword = binding.inputConfirmpassword
        input_layout_password = binding.inputLayoutPassword
        nextButton = binding.next

        binding.commonHeader.back.setOnClickListener {
            back()
        }
        nextButton.setOnClickListener {
            next()
        }
        getMobileNumerAndCountryCodeFromIntent()
        dialog = commonMethods.getAlertDialog(this)
    }

    private fun getMobileNumerAndCountryCodeFromIntent() {
        if (intent != null) {
            facebookKitVerifiedMobileNumber =
                intent.getStringExtra(FACEBOOK_ACCOUNT_KIT_PHONE_NUMBER_KEY).toString()
            facebookVerifiedMobileNumberCountryCode =
                intent.getStringExtra(FACEBOOK_ACCOUNT_KIT_PHONE_NUMBER_COUNTRY_CODE_KEY).toString()
            facebookVerifiedMobileNumberCountryNameCode =
                intent.getStringExtra(FACEBOOK_ACCOUNT_KIT_PHONE_NUMBER_COUNTRY_NAME_CODE_KEY)
                    .toString()

        }
    }


    fun onNext() {
        isInternetAvailable = commonMethods.isOnline(applicationContext)
        if (!isInternetAvailable) {
            commonMethods.showMessage(this, dialog, getString(R.string.no_connection))
        } else {
            if (!validateFirst()) {
                return
            } else if (!validateConfirmPassword()) {
                return
            } else {
                nextButton.background = ContextCompat.getDrawable(
                    applicationContext,
                    R.drawable.app_curve_button_yellow
                )
                val input_password_str = input_password.text.toString()
                val input_password_confirmstr = input_confirmpassword.text.toString()
                if (input_password_str.length > 5 && input_password_confirmstr.length > 5 && input_password_confirmstr == input_password_str) {

                    sessionManager.password = input_password_str
                    forgotPassword(input_password_str)

                } else {
                    if (input_password_confirmstr != input_password_str) {
                        commonMethods.showMessage(
                            this,
                            dialog,
                            resources.getString(R.string.Passwordmismatch)
                        )
                    } else {
                        commonMethods.showMessage(
                            this,
                            dialog,
                            resources.getString(R.string.InvalidPassword)
                        )
                    }
                }
            }

        }

        hideSoftKeyboard()
    }


    /**
     * Validate first name
     */
    private fun validateFirst(): Boolean {
        if (input_password.text.toString().trim { it <= ' ' }.isEmpty()) {
            //input_layout_password.error = getString(R.string.Enteryourpassword)

            binding.errorPassword.visibility = View.VISIBLE
            requestFocus(input_password)
            return false
        } else {
            //input_layout_password.isErrorEnabled = false
            binding.errorPassword.visibility = View.GONE
        }

        return true
    }

    private fun validateConfirmPassword(): Boolean {
        if (input_confirmpassword.text.toString().trim { it <= ' ' }.isEmpty()) {
            binding.errorConfirmPassword.visibility = View.VISIBLE
            requestFocus(input_password)
            return false
        } else {
            //input_layout_password.isErrorEnabled = false
            binding.errorConfirmPassword.visibility = View.GONE
        }

        return true
    }

    /**
     * Edit text request focus
     */
    private fun requestFocus(view: View) {
        if (view.requestFocus()) {
            window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE)
        }
    }

    /**
     * Back button pressed
     */
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, SigninSignupActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        overridePendingTransition(R.anim.ub__slide_in_left, R.anim.ub__slide_out_right)
        this.finish()
    }

    override fun onSuccess(jsonResp: JsonResponse, data: String) {
        if (jsonResp.isSuccess) {
            commonMethods.hideProgressDialog()
            onSuccessPwd(jsonResp)
        } else if (!TextUtils.isEmpty(jsonResp.statusMsg)) {
            commonMethods.hideProgressDialog()
            commonMethods.showMessage(this, dialog, jsonResp.statusMsg)
        }
    }

    override fun onFailure(jsonResp: JsonResponse, data: String) {
        if (!TextUtils.isEmpty(jsonResp.statusMsg)) {
            commonMethods.hideProgressDialog()
            commonMethods.showMessage(this, dialog, jsonResp.statusMsg)
        }
    }

    /**
     * Forgot password API called
     */
    fun forgotPassword(pwd: String) {
        commonMethods.showProgressDialog(this)
        apiService.forgotpassword(
            facebookKitVerifiedMobileNumber,
            facebookVerifiedMobileNumberCountryNameCode,
            sessionManager.type.toString(),
            pwd,
            sessionManager.deviceType!!,
            sessionManager.deviceId!!
        ).enqueue(RequestCallback(this))
    }

    fun onSuccessPwd(jsonResp: JsonResponse) {
        signinResult = gson.fromJson(jsonResp.strResponse, SigninResult::class.java)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            sessionManager.currencySymbol =
                Html.fromHtml(signinResult.currencySymbol, Html.FROM_HTML_MODE_LEGACY).toString()
        } else {
            sessionManager.currencySymbol = Html.fromHtml(signinResult.currencySymbol).toString()
        }
        sessionManager.walletAmount = signinResult.walletAmount
        sessionManager.isrequest = false
        sessionManager.accessToken = signinResult.token
        sessionManager.userId = signinResult.userId

        try {
            val response = JSONObject(jsonResp.strResponse)
            if (response.has("promo_details")) {
                val promocount = response.getJSONArray("promo_details").length()
                sessionManager.promoDetail = response.getString("promo_details")
                sessionManager.promoCount = promocount
            }
        } catch (j: JSONException) {
            j.printStackTrace()
        }

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.ub__slide_in_right, R.anim.ub__slide_out_left)
    }

    /**
     * Hide keyboard
     */
    private fun hideSoftKeyboard() {
        if (currentFocus != null) {
            val inputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        }
    }
}
