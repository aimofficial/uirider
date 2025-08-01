package com.newtaxiprime.user.taxiapp.views.addCardDetails

/**
 * @package com.newtaxiprime.user
 * @subpackage views.subviews
 * @category Stripe Activity
 * @author Seen Technologies
 *
 */


/* ************************************************************
                Showing and Adding the payment methods
    *********************************************************** */


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.StrictMode
import android.text.TextUtils
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.newtaxiprime.user.R
import com.newtaxiprime.user.appcommon.configs.SessionManager
import com.newtaxiprime.user.appcommon.datamodels.JsonResponse
import com.newtaxiprime.user.appcommon.interfaces.ApiService
import com.newtaxiprime.user.appcommon.interfaces.ServiceListener
import com.newtaxiprime.user.appcommon.network.AppController
import com.newtaxiprime.user.appcommon.utils.CommonKeys.REQUEST_CODE_PAYMENT
import com.newtaxiprime.user.appcommon.utils.CommonMethods
import com.newtaxiprime.user.appcommon.utils.RequestCallback
import com.newtaxiprime.user.appcommon.views.CommonActivity
import com.newtaxiprime.user.databinding.AppActivityAddCardBinding
import com.newtaxiprime.user.taxiapp.views.customize.CustomDialog
import com.stripe.android.ApiResultCallback
import com.stripe.android.SetupIntentResult
import com.stripe.android.model.ConfirmSetupIntentParams
import com.stripe.android.model.PaymentMethod
import com.stripe.android.model.PaymentMethodCreateParams
import com.stripe.android.model.StripeIntent
import com.stripe.android.view.CardMultilineWidget
import javax.inject.Inject

class AddCardActivity : CommonActivity(), ServiceListener {

    @Inject
    lateinit var apiService: ApiService

    @Inject
    lateinit var commonMethods: CommonMethods

    @Inject
    lateinit var customDialog: CustomDialog

    @Inject
    lateinit var sessionManager: SessionManager

    lateinit var arrow: ImageView
    lateinit var addpayment: Button

    lateinit var binding: AppActivityAddCardBinding

    lateinit var dialog2: AlertDialog

    lateinit var cardMultilineWidget: CardMultilineWidget

    private lateinit var clientSecretKey: String
    protected var isInternetAvailable: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AppActivityAddCardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AppController.appComponent.inject(this)
        /**Commmon Header Text View */
        commonMethods.setheaderText(
            resources.getString(R.string.credit_or_debit_card),
            binding.commonHeader.tvHeadertext
        )
        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)
        isInternetAvailable = commonMethods.isOnline(applicationContext)
        addpayment = binding.addpayment
        arrow = binding.commonHeader.arrow

        cardMultilineWidget = binding.stripe
        cardMultilineWidget.setShouldShowPostalCode(false)

        //  clientSecretKey = intent.getStringExtra("clientSecret")
        /**
         * On back pressed
         */
        arrow.setOnClickListener {
            onBackPressed()
        }


        /**
         * Pay through  Stripe Payment
         */
        addpayment.setOnClickListener { view ->
            if (commonMethods.stripeInstance() != null) {

                getCard()
                hideKeyboard(this)
            } else {
                Toast.makeText(
                    this,
                    resources.getString(R.string.stripe_error_1),
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }

    private fun hideKeyboard(activity: Activity) {
        val imm: InputMethodManager =
            activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        //Find the currently focused view, so we can grab the correct window token from it.
        var view: View? = activity.currentFocus
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = View(activity)
        }
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun getCard() {
        if (isInternetAvailable) {
            commonMethods.showProgressDialog(this)
            apiService.viewCard(sessionManager.accessToken!!).enqueue(RequestCallback(this))
        } else {
            commonMethods.showMessage(
                this@AddCardActivity,
                dialog2,
                getString(R.string.no_connection)
            )
        }
    }


    override fun onSuccess(jsonResp: JsonResponse, data: String) {
        commonMethods.hideProgressDialog()
        if (jsonResp.isSuccess) {
            clientSecretKey = commonMethods.getJsonValue(
                jsonResp.strResponse,
                "intent_client_secret",
                String::class.java
            ) as String
            confirmSetupIntentParams()

            /* val brand = commonMethods.getJsonValue(jsonResp.strResponse, "brand", String::class.java) as String
             val last4 = commonMethods.getJsonValue(jsonResp.strResponse, "last4", String::class.java) as String

             if (!TextUtils.isEmpty(last4)) {
                 rltCard.visibility = View.VISIBLE
                 setCardImage(brand)
                 tvCard.text = "•••• $last4"
                 sessionManager.cardValue = last4
                 sessionManager.cardBrand = brand
                 sessionManager.walletCard = 1
                 ivCardTick.visibility = View.GONE
             } else {
                 rltCard.visibility = View.GONE
             }*/
        } else if (jsonResp.statusCode.equals("2")) {
            clientSecretKey = commonMethods.getJsonValue(
                jsonResp.strResponse,
                "intent_client_secret",
                String::class.java
            ) as String
            confirmSetupIntentParams()
        } else if (!TextUtils.isEmpty(jsonResp.statusMsg) && jsonResp.statusMsg.equals(
                "No record found",
                ignoreCase = true
            )
        ) {
            clientSecretKey = commonMethods.getJsonValue(
                jsonResp.strResponse,
                "intent_client_secret",
                String::class.java
            ) as String
            confirmSetupIntentParams()
        } else {
            commonMethods.showMessage(this, dialog2, jsonResp.statusMsg)
        }

    }

    override fun onFailure(jsonResp: JsonResponse, data: String) {
        commonMethods.hideProgressDialog()
    }

    /**
     * Setup intent For Card
     */
    private fun confirmSetupIntentParams() {
        val card = cardMultilineWidget.paymentMethodCard
        val billingDetails = PaymentMethod.BillingDetails.Builder()
            .setName(sessionManager.firstName)
            .setPhone(sessionManager.phoneNumber)
            .build()
        if (card != null && !clientSecretKey.isEmpty()) {
            // Create SetupIntent confirm parameters with the above
            val paymentMethodParams = PaymentMethodCreateParams
                .create(card, billingDetails)
            val confirmParams = ConfirmSetupIntentParams
                .create(paymentMethodParams, clientSecretKey)
            commonMethods.showProgressDialog(this@AddCardActivity)
            commonMethods.stripeInstance()!!.confirmSetupIntent(this, confirmParams)
        } else {
            commonMethods.hideProgressDialog()
            Toast.makeText(this, resources.getString(R.string.stripe_error_2), Toast.LENGTH_LONG)
                .show()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        commonMethods.hideProgressDialog()
        commonMethods.stripeInstance()
            ?.onSetupResult(requestCode, data, object : ApiResultCallback<SetupIntentResult> {
                override fun onError(e: Exception) {
                    //hideKeyboard(this@AddCardActivity)
                    Toast.makeText(this@AddCardActivity, e.message, Toast.LENGTH_LONG).show()
                    //commonMethods.showMessage(this@AddCardActivity, dialog2, e.message!!)
                }

                override fun onSuccess(result: SetupIntentResult) {
                    val setupIntent = result.intent
                    val status = setupIntent.status
                    if (status == StripeIntent.Status.Succeeded) {
                        val intent = Intent()
                        intent.putExtra("S_intentId", setupIntent.id)
                        setResult(REQUEST_CODE_PAYMENT, intent)
                        finish()
                    } else if (status == StripeIntent.Status.RequiresPaymentMethod) {
                        //hideKeyboard(this@AddCardActivity)
                        Toast.makeText(
                            this@AddCardActivity,
                            resources.getString(R.string.set_canceled),
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }

            })
    }

    override fun onBackPressed() {
        val intent = Intent()
        intent.putExtra("S_intentId", "")
        setResult(REQUEST_CODE_PAYMENT, intent)
        finish()
    }
}
