@file:Suppress("DEPRECATION")

package com.newtaxiprime.user.taxiapp.views.signinsignup

/**
 * @package com.newtaxiprime.user
 * @subpackage signin_signup
 * @category SigninSignupActivity
 * @author Seen Technologies
 *
 */

//import com.willowtreeapps.signinwithapplebutton.SignInWithAppleCallback
//import com.willowtreeapps.signinwithapplebutton.SignInWithAppleConfiguration
//import com.willowtreeapps.signinwithapplebutton.view.BaseUrl
//import com.willowtreeapps.signinwithapplebutton.view.SignInWithAppleButton
import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.content.res.Configuration
import android.content.res.Resources
import android.net.Uri
import android.os.*
import android.text.Html
import android.text.SpannableStringBuilder
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.ForegroundColorSpan
import android.util.Base64
import android.util.Log
import android.view.Menu
import android.view.View
import android.view.ViewAnimationUtils
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import butterknife.ButterKnife
import com.facebook.*
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.google.gson.Gson
import com.newtaxiprime.user.R
import com.newtaxiprime.user.appcommon.configs.SessionManager
import com.newtaxiprime.user.appcommon.custompalette.FontTextView
import com.newtaxiprime.user.appcommon.datamodels.JsonResponse
import com.newtaxiprime.user.appcommon.helper.Constants
import com.newtaxiprime.user.appcommon.interfaces.ApiService
import com.newtaxiprime.user.appcommon.interfaces.ServiceListener
import com.newtaxiprime.user.appcommon.network.AppController
import com.newtaxiprime.user.appcommon.pushnotification.MyFirebaseInstanceIDService
import com.newtaxiprime.user.appcommon.pushnotification.NotificationUtils
import com.newtaxiprime.user.appcommon.utils.CommonKeys.ACTIVITY_REQUEST_CODE_START_FACEBOOK_ACCOUNT_KIT
import com.newtaxiprime.user.appcommon.utils.CommonKeys.FACEBOOK_ACCOUNT_KIT_PHONE_NUMBER_COUNTRY_CODE_KEY
import com.newtaxiprime.user.appcommon.utils.CommonKeys.FACEBOOK_ACCOUNT_KIT_PHONE_NUMBER_COUNTRY_NAME_CODE_KEY
import com.newtaxiprime.user.appcommon.utils.CommonKeys.FACEBOOK_ACCOUNT_KIT_PHONE_NUMBER_KEY
import com.newtaxiprime.user.appcommon.utils.CommonMethods
import com.newtaxiprime.user.appcommon.utils.CommonMethods.Companion.DebuggableLogE
import com.newtaxiprime.user.appcommon.utils.CommonMethods.Companion.DebuggableLogV
import com.newtaxiprime.user.appcommon.utils.Enums
import com.newtaxiprime.user.appcommon.utils.RequestCallback
import com.newtaxiprime.user.appcommon.utils.userchoice.UserChoice
import com.newtaxiprime.user.appcommon.utils.userchoice.UserChoiceSuccessResponse
import com.newtaxiprime.user.appcommon.views.CommonActivity
import com.newtaxiprime.user.databinding.AppAcitvitySigninSignupBinding
import com.newtaxiprime.user.taxiapp.datamodels.signinsignup.SigninResult
import com.newtaxiprime.user.taxiapp.sidebar.currency.CurrencyModel
import com.newtaxiprime.user.taxiapp.views.customize.CustomDialog
import com.newtaxiprime.user.taxiapp.views.facebookAccountKit.FacebookAccountKitActivity
import com.newtaxiprime.user.taxiapp.views.main.MainActivity
import com.newtaxiprime.user.taxiapp.views.splash.SplashActivity.Companion.checkVersionModel
import org.json.JSONException
import org.json.JSONObject
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.util.*
import javax.inject.Inject

/* ************************************************************
   Sign in and sign up home page
   ************************************************************ */

class SigninSignupActivity : CommonActivity(), ServiceListener, UserChoiceSuccessResponse {


    @Inject
    lateinit var commonMethods: CommonMethods

    @Inject
    lateinit var customDialog: CustomDialog

    @Inject
    lateinit var apiService: ApiService

    @Inject
    lateinit var gson: Gson

    @Inject
    lateinit var userChoice: UserChoice

    /*  @BindView(R.id.connectsocial) lateinit var connectsocial: TextView*/

    lateinit var languageLayout: RelativeLayout

    lateinit var language: TextView

    lateinit var login: Button

    lateinit var splash_logo: ImageView

    lateinit var vGoogle: View

    lateinit var vFacebook: View

    lateinit var privacyText: FontTextView

    lateinit var googleCustomView: CustomView
    lateinit var facebookCustomView: CustomView

    /*@BindView(R.id.sign_in_with_apple_button_white)
    lateinit var signInWithAppleButtonBlack: SignInWithAppleButton */

    private lateinit var languageView: RecyclerView
    private lateinit var languagelist: MutableList<CurrencyModel>
    private var isInternetAvailable: Boolean = false
    lateinit var dialog: AlertDialog

    private lateinit var binding: AppAcitvitySigninSignupBinding


    var count = 1
    lateinit var mGoogleSignInClient: GoogleSignInClient
    private var callbackManager: CallbackManager? = null
    lateinit var fbEmail: String
    lateinit var fbFullName: String
    lateinit var fbID: String
    lateinit var fbImageURL: String
    lateinit var alert: AlertDialog
    lateinit var parameters: Bundle
    private var mIntentInProgress: Boolean = false
    lateinit var loginResult: SigninResult
    lateinit var googleEmail: String
    lateinit var googleFullName: String
    lateinit var googleUserProfile: String
    lateinit var googleID: String

    @Inject
    lateinit var sessionManager: SessionManager

    private var mLastClickTime: Long = 0

    fun lang() {
        languagelist = ArrayList()
        loadlang()
        if (SystemClock.elapsedRealtime() - mLastClickTime < 1000) {
            return
        }
        mLastClickTime = SystemClock.elapsedRealtime();
        userChoice.getUsersLanguages(this, languagelist, Enums.USER_CHOICE_LANGUAGE, this)
    }

    fun login() {

        if (sessionManager.deviceId != null && sessionManager.deviceId != "" && !sessionManager.deviceId.isNullOrEmpty() && sessionManager.deviceId != "null") {
            openLoginActivity()
        } else {
            commonMethods.getFireBaseToken()
            if (sessionManager.deviceId != null && sessionManager.deviceId != "" && !sessionManager.deviceId.isNullOrEmpty() && sessionManager.deviceId != "null") {

                openLoginActivity()
            } else {
                dialogfunction("Unable to get Device Id. Please try again later...")
            }
        }

    }

    fun signUp() {
        if (sessionManager.deviceId != null && sessionManager.deviceId != "" && !sessionManager.deviceId.isNullOrEmpty() && sessionManager.deviceId != "null") {
            openFacebookAccountKitActivity()
        } else {
            commonMethods.getFireBaseToken()
            if (sessionManager.deviceId != null && sessionManager.deviceId != "" && !sessionManager.deviceId.isNullOrEmpty() && sessionManager.deviceId != "null") {

                openFacebookAccountKitActivity()
            } else {
                dialogfunction("Unable to get Device Id. Please try again later...")
            }
        }

    }


    fun fblogin() {
        isInternetAvailable = commonMethods.isOnline(applicationContext)
        if (!isInternetAvailable) {
            commonMethods.showMessage(this, dialog, getString(R.string.no_connection))
        } else {
            commonMethods.showProgressDialog(this)
            LoginManager.getInstance().logOut()//Logout Facebook
            LoginManager.getInstance()
                .logInWithReadPermissions(this, Arrays.asList("public_profile", "email"))
        }
    }


    fun gplogin() {
        isInternetAvailable = commonMethods.isOnline(applicationContext)
        if (!isInternetAvailable) {
            commonMethods.showMessage(this, dialog, getString(R.string.no_connection))
        } else {
            count = 1
            signIn()

        }
    }

    private fun openFacebookAccountKitActivity() {
        FacebookAccountKitActivity.openFacebookAccountKitActivity(this, 0)
    }

    private fun openRegisterActivity(
        phoneNumber: String,
        countryCode: String,
        countryNameCode: String
    ) {
        Log.d("Register", "Register Activity SignIn ")

        val signin = Intent(this, SSRegisterActivity::class.java)
        signin.putExtra(FACEBOOK_ACCOUNT_KIT_PHONE_NUMBER_KEY, phoneNumber)
        signin.putExtra(FACEBOOK_ACCOUNT_KIT_PHONE_NUMBER_COUNTRY_CODE_KEY, countryCode)
        signin.putExtra(FACEBOOK_ACCOUNT_KIT_PHONE_NUMBER_COUNTRY_NAME_CODE_KEY, countryNameCode)
        Log.d("Register", "Register Activity ")
        startActivity(signin)
        overridePendingTransition(R.anim.ub__slide_in_right, R.anim.ub__slide_out_left)
        finish()
    }


    private fun openLoginActivity() {
        val intent = Intent(this, SSLoginActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.ub__slide_in_right, R.anim.ub__slide_out_left)
    }

    /* @OnClick(R.id.connectsocial)
    fun connect() {

        if (sessionManager.deviceId != null&& sessionManager.deviceId != ""&&!sessionManager.deviceId.isNullOrEmpty()&& sessionManager.deviceId != "null") {
            openConnectSocial()
        } else {
            commonMethods.getFireBaseToken()
            if (sessionManager.deviceId != null&& sessionManager.deviceId != ""&&!sessionManager.deviceId.isNullOrEmpty()&& sessionManager.deviceId != "null") {

                openConnectSocial()
            } else {
                dialogfunction("Unable to get Device Id. Please try again later...")
            }
        }
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AppAcitvitySigninSignupBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ButterKnife.bind(this)
        AppController.appComponent.inject(this)


        isInternetAvailable = commonMethods.isOnline(applicationContext)
        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)
        dialog = commonMethods.getAlertDialog(this)


        /**
         * Start firebase push notification service
         */
        if (isInternetAvailable) {
            startService(Intent(this, MyFirebaseInstanceIDService::class.java))
        } else {
            dialogfunction(getString(R.string.turnoninternet))
        }
        setLocale()

        sessionManager.type = "rider"
        //  sessionManager.deviceId =
        commonMethods.getFireBaseToken()
        sessionManager.deviceType = "2"

        DebuggableLogE(TAG, "Firebase reg id: " + sessionManager.deviceId)


        languageLayout = binding.rltLanguage

        language = binding.tvLanguage

        login = binding.login

        splash_logo = binding.ivAppLogo

        vGoogle = binding.vGoogle.root

        vFacebook = binding.vFacebook.root

        initSocialLoginViews()
        socialIsViewOrGone()

        vGoogle.setOnClickListener {
            gplogin()
        }

        login.setOnClickListener {
            login()
        }

        vFacebook.setOnClickListener {
            fblogin()
        }
        binding.signup.setOnClickListener {
            signUp()
        }
        binding.rltLanguage.setOnClickListener {
            lang()
        }

        privacyText = binding.textViewPrivacyPolicy


        val isAttachedToWindow = ViewCompat.isAttachedToWindow(splash_logo)
        splash_logo.visibility = View.VISIBLE
        splash_logo.post {
            try {
                if (isAttachedToWindow) {
                    doCircularReveal()
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        customTextView(privacyText)



    }

    private fun isSocialEnable(): Boolean {
        return !(/*!checkVersionModel.appleLogin && */!checkVersionModel.facebookLogin && !checkVersionModel.googleLogin)
    }

    private fun initSocialLoginViews() {
        googleCustomView = CustomView(vGoogle)
        googleCustomView.ivIcon.setImageDrawable(
            ContextCompat.getDrawable(
                this,
                R.drawable.app_ic_google
            )
        )
        googleCustomView.tvTitle.text = resources.getString(R.string.google)
        facebookCustomView = CustomView(vFacebook)
        facebookCustomView.ivIcon.setImageDrawable(
            ContextCompat.getDrawable(
                this,
                R.drawable.app_ic_facebook
            )
        )
        facebookCustomView.tvTitle.text = resources.getString(R.string.facebook)
    }

    private fun socialIsViewOrGone() {
        /*  if (checkVersionModel.appleLogin) {
              signInWithAppleButtonBlack.visibility = View.VISIBLE
              //Apple login Initialize
              appleLoginInitialize()
          } else {
              signInWithAppleButtonBlack.visibility = View.GONE
          } */
        if (checkVersionModel.facebookLogin) {
            vFacebook.visibility = View.VISIBLE
            //Facebook Initialize
            faceBookInitialize()
        } else {
            vFacebook.visibility = View.GONE
        }

        if (checkVersionModel.googleLogin) {
            vGoogle.visibility = View.VISIBLE
            //GooglePlus Initialize
            googlePlusInitialize()
        } else {
            vGoogle.visibility = View.GONE
        }

        if (checkVersionModel.googleLogin && !checkVersionModel.facebookLogin) {
            changeAlignmentView(vGoogle)
        } else if (!checkVersionModel.googleLogin && checkVersionModel.facebookLogin) {
            changeAlignmentView(vFacebook)
        }
    }

    private fun changeAlignmentView(relativeLayout: View) {
        val rel_btn: LinearLayout.LayoutParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
        relativeLayout.layoutParams = rel_btn

    }

    /*private fun updateViews(){
        val params = LanguageText.layoutParams as RelativeLayout.LayoutParams
        val params2 = language.layoutParams as RelativeLayout.LayoutParams

        params.addRule(RelativeLayout.CENTER_VERTICAL)
        params.addRule(RelativeLayout.ALIGN_PARENT_START)

        params2.addRule(RelativeLayout.CENTER_VERTICAL)
        params2.addRule(RelativeLayout.ALIGN_PARENT_END)

        rltsocial.setPadding(16,20,0,20)

        LanguageText.layoutParams = params
        language.layoutParams = params2
    }
*/
    /**
     * Exit revel animation
     */
    private fun doExitReveal() {


        // get the center for the clipping circle
        val centerX = (splash_logo.left + splash_logo.right) / 2
        val centerY = (splash_logo.top + splash_logo.bottom) / 2

        // get the initial radius for the clipping circle
        val initialRadius = splash_logo.width

        // create the animation (the final radius is zero)
        val anim: Animator?
        anim = ViewAnimationUtils.createCircularReveal(
            splash_logo,
            centerX, centerY, initialRadius.toFloat(), 0f
        )
        anim.duration = 1000
        // make the view invisible when the animation is done
        anim.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                super.onAnimationEnd(animation)
                splash_logo.visibility = View.GONE
            }
        })

        // start the animation
        anim.start()

    }

    /**
     * Circular revel animation
     */
    private fun doCircularReveal() {

        // get the center for the clipping circle
        val centerX = (splash_logo.left + splash_logo.right) / 2
        val centerY = (splash_logo.top + splash_logo.bottom) / 2

        val startRadius = 0
        // get the final radius for the clipping circle
        val endRadius = Math.max(splash_logo.width, splash_logo.height)

        // create the animator for this view (the start radius is zero)
        var anim: Animator? = null
        anim = ViewAnimationUtils.createCircularReveal(
            splash_logo,
            centerX, centerY, startRadius.toFloat(), endRadius.toFloat()
        )
        anim?.duration = 1500

        anim?.start()
    }


    public override fun onResume() {
        super.onResume()

        val lan = sessionManager.language

        language.text = lan
        // clear the notification area when the app is opened
        NotificationUtils.clearNotifications(applicationContext)
    }

    override fun onBackPressed() {
        finishAffinity()
        super.onBackPressed()       // bye

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            splash_logo.visibility = View.VISIBLE
            splash_logo.post { doExitReveal() }
        }
    }

    public override fun onPause() {
        super.onPause()
    }

    /**
     * To message in dialog ( internet not available)
     */
    private fun dialogfunction(message: String) {
        val builder = AlertDialog.Builder(this)
        builder.setMessage(message)
            .setCancelable(false)
            .setPositiveButton(resources.getString(R.string.ok_c)) { dialog, _ ->
                dialog.dismiss()
                //SigninSignupActivity.this.finish();
            }

        val alert = builder.create()
        alert.show()
    }

    private fun loadlang() {
        val languages = resources.getStringArray(R.array.language)
        val langCode = resources.getStringArray(R.array.languageCode)
        for (i in languages.indices) {
            val listdata = CurrencyModel()
            listdata.currencyName = languages[i]
            listdata.currencySymbol = langCode[i]
            languagelist.add(listdata)
        }
    }

    private fun setLocale() {
        val lang = sessionManager.language

        if (lang != "") {

            val langC = sessionManager.languageCode
            val locale = Locale(langC)
            val res: Resources = resources
            val configuration: Configuration = res.getConfiguration()
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                configuration.setLocale(locale)
                val localeList = LocaleList(locale)
                LocaleList.setDefault(localeList)
                configuration.setLocales(localeList)

            } else
                configuration.setLocale(locale)

            createConfigurationContext(configuration)
            this@SigninSignupActivity.resources.updateConfiguration(
                configuration,
                this@SigninSignupActivity.resources.displayMetrics
            )
            DebuggableLogV("locale", "localesetted $locale")
        } else {
            sessionManager.language = "English"
            sessionManager.languageCode = "en"
            setLocale()
            recreate()
            val intent = baseContext.packageManager
                .getLaunchIntentForPackage(baseContext.packageName)
            intent!!.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }
    }

    fun clearSocialCredintials() {
        sessionManager.facebookId = ""
        //sessionManager.appleId = ""
        sessionManager.googleId = ""
        sessionManager.firstName = ""
        sessionManager.lastName = ""
        sessionManager.email = ""
    }

    // private fun appleLoginInitialize() {
    //This BaseUrl.baseUrl For Check the URL is AppleCallback in siginwithApplicationmodule
    /* BaseUrl.appleCallbackUrl = resources.getString(R.string.appleCallback)
     val configuration = SignInWithAppleConfiguration.Builder()
         .clientId(sessionManager.appleLoginClientId!!)
         .redirectUri(resources.getString(R.string.appleCallback))
         .scope(CommonKeys.Apple_Login_Scope)
         .build()

     val callback = object : SignInWithAppleCallback {
         override fun onSuccessOnSignIn(response: String) {

             var json: JSONObject? = null
             try {
                 json = JSONObject(
                     response.substring(
                         response.indexOf("{"),
                         response.lastIndexOf("}") + 1
                     )
                 )
             } catch (e: Exception) {
                 e.printStackTrace()
             }
             var statuscode: String? = ""
             var statusmessage: String? = ""

             try {
                 statuscode = json?.getString("status_code")
                 statusmessage = json?.getString("status_message")
             } catch (e: Exception) {
                 e.printStackTrace()
             }

             if (!statuscode.equals("0")) {
                 commonMethods.showProgressDialog(this@SigninSignupActivity)
             }
             if (statuscode == "1") {
                 //New User
                 commonMethods.hideProgressDialog()
                 createNewUser(response)
             } else if (statuscode == "2") {
                 // Alread user
                 commonMethods.hideProgressDialog()
                 onSuccessLogin(response)
             } else {
                 //Error or Other Response
                 statusmessage?.let {
                     CommonMethods.Companion.DebuggableLogE(
                         "SSSocialActivity:Error Response in Apple Login",
                         it
                     )
                 }
                 //Toast.makeText(this@SSSocialActivity, statusmessage, LENGTH_SHORT).show()
             }

         }

         override fun onSignInWithAppleSuccess(authorizationCode: String) {}

         override fun onSignInWithAppleFailure(error: Throwable) {}

         override fun onSignInWithAppleCancel() {}
     }

     signInWithAppleButtonBlack.setUpSignInWithAppleOnClick(
         supportFragmentManager,
         configuration,
         resources.getString(R.string.sign_apple),
         callback
     )
 }
*/
    /**
     * Facebook SDK initialize
     */
    fun faceBookInitialize() {
        //Facebook Initialize
        FacebookSdk.sdkInitialize(applicationContext)
        callbackManager = CallbackManager.Factory.create()

        /**
         * Get Facebook key hash for devloper
         */
        getFbKeyHash(CommonMethods.appPackageName)

        LoginManager.getInstance().registerCallback(callbackManager,
            object : FacebookCallback<LoginResult> {

                override fun onSuccess(loginResult: LoginResult) {
                    /**
                     * Get facebook user details
                     */
                    val request = GraphRequest.newMeRequest(
                        loginResult.accessToken
                    ) { `object`, _ ->
                        fbEmail = `object`!!.optString("email")
                        fbFullName = `object`!!.optString("name")
                        println("FullName $fbFullName and obejct ${`object`.toString()}")
                        fbID = `object`!!.optString("id")
                        fbImageURL = "https://graph.facebook.com/" + fbID + "/picture";
                        println("FBIMAGE URL " + fbImageURL)

                        if (fbFullName.isNotEmpty()) {
                            var firstName = ""
                            var lastName = ""
                            val idx = fbFullName.lastIndexOf(' ');
                            try {
                                firstName = fbFullName.substring(0, idx);
                                lastName = fbFullName.substring(idx + 1);

                            } catch (e: Exception) {
                                e.printStackTrace()
                            }

                            sessionManager.firstName = firstName
                            sessionManager.lastName = lastName

                        }
                        sessionManager.email = fbEmail
                        sessionManager.facebookId = fbID
                        sessionManager.profilepicture = fbImageURL
                        sessionManager.googleId = ""
                        // sessionManager.appleId = ""
                        isInternetAvailable = commonMethods.isOnline(applicationContext)
                        if (!isInternetAvailable) {
                            commonMethods.showMessage(
                                this@SigninSignupActivity,
                                dialog,
                                getString(R.string.no_connection)
                            )
                        } else {
                            commonMethods.showProgressDialog(this@SigninSignupActivity)

                            apiService.socialoldsignup(
                                commonMethods.getAuthType(),
                                commonMethods.getAuthId()!!,
                                sessionManager.deviceType!!,
                                sessionManager.deviceId!!,
                                sessionManager.languageCode!!
                            ).enqueue(RequestCallback(Enums.REQ_SIGNUP, this@SigninSignupActivity))

                            //  new checkId().execute(url);
                        }
                    }

                    parameters = Bundle()
                    parameters.putString("fields", "id,name,link,gender,birthday,email")
                    request.parameters = parameters
                    request.executeAsync()

                    val bundle = Bundle()
                    bundle.putString("fields", "token_for_business")

                }

                override fun onCancel() {
                    commonMethods.hideProgressDialog()

                }

                override fun onError(e: FacebookException) {
                    commonMethods.hideProgressDialog()
                    DebuggableLogE("Facebooksdk", "Login with Facebook failure", e)
                    Toast.makeText(
                        applicationContext,
                        "An unknown network error has occured",
                        Toast.LENGTH_LONG
                    ).show()

                }

            })
    }

    /**
     * Create FB KeyHash
     */
    fun getFbKeyHash(packageName: String) {

        val info: PackageInfo
        try {
            info = packageManager.getPackageInfo(packageName, PackageManager.GET_SIGNATURES)
            for (signature in info.signatures!!) {
                val md: MessageDigest = MessageDigest.getInstance("SHA")
                md.update(signature.toByteArray())
                val something = String(Base64.encode(md.digest(), 0))
                //String something = new String(Base64.encodeBytes(md.digest()));

                DebuggableLogE("hash key", something)
            }
        } catch (e1: PackageManager.NameNotFoundException) {
            DebuggableLogE("name not found", e1.toString())
        } catch (e: NoSuchAlgorithmException) {
            DebuggableLogE("no such an algorithm", e.toString())
        } catch (e: Exception) {
            DebuggableLogE("exception", e.toString())
        }

    }

    /**
     * Call Facebook StartActivity
     */
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {


        super.onActivityResult(requestCode, resultCode, data)
        commonMethods.hideProgressDialog()

        if (requestCode == RC_SIGN_IN) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            handleSignInResult(task)
            mIntentInProgress = false

        } else if (requestCode == ACTIVITY_REQUEST_CODE_START_FACEBOOK_ACCOUNT_KIT) {


            if (resultCode == RESULT_OK) {
                openRegisterActivity(
                    data!!.getStringExtra(FACEBOOK_ACCOUNT_KIT_PHONE_NUMBER_KEY).toString(),
                    data.getStringExtra(FACEBOOK_ACCOUNT_KIT_PHONE_NUMBER_COUNTRY_CODE_KEY)
                        .toString(),
                    data.getStringExtra(FACEBOOK_ACCOUNT_KIT_PHONE_NUMBER_COUNTRY_NAME_CODE_KEY)
                        .toString()
                )
            }
        } else if (requestCode == ACTIVITY_REQUEST_CODE_START_FACEBOOK_ACCOUNT_KIT) {
            if (resultCode == RESULT_OK) {
                clearSocialCredintials()
                openRegisterActivity(
                    data!!.getStringExtra(FACEBOOK_ACCOUNT_KIT_PHONE_NUMBER_KEY).toString(),
                    data.getStringExtra(FACEBOOK_ACCOUNT_KIT_PHONE_NUMBER_COUNTRY_CODE_KEY)
                        .toString(),
                    data.getStringExtra(FACEBOOK_ACCOUNT_KIT_PHONE_NUMBER_COUNTRY_NAME_CODE_KEY)
                        .toString()
                )
            }
        } else {
            callbackManager!!.onActivityResult(requestCode, resultCode, data)
        }

    }

    fun onSuccessLogin(jsonResp: String) {
        loginResult = gson.fromJson(jsonResp, SigninResult::class.java)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            sessionManager.currencySymbol =
                Html.fromHtml(loginResult.currencySymbol, Html.FROM_HTML_MODE_LEGACY).toString()
        } else {
            sessionManager.currencySymbol = Html.fromHtml(loginResult.currencySymbol).toString()
        }
        sessionManager.currencyCode = loginResult.currencyCode
        sessionManager.accessToken = loginResult.token
        sessionManager.walletAmount = loginResult.walletAmount
        sessionManager.userId = loginResult.userId
        sessionManager.isrequest = false
        commonMethods.hideProgressDialog()
        try {
            val response = JSONObject(jsonResp)
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


    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
        try {
            val account = completedTask.getResult(ApiException::class.java)
            // Signed in successfully, show authenticated UI.

            getProfileInformation(account!!)
        } catch (e: ApiException) {
            // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.
            Log.w("Google login", "signInResult:failed code=" + e.statusCode)
        }

    }

    /********************************************************************
     * Google Signin Start
     */

    fun googlePlusInitialize() {

        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestProfile()
            .requestEmail()
            .requestIdToken(getString(R.string.google_client_id))
            .build()

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso)
    }

    private fun signIn() {
        val signInIntent = mGoogleSignInClient.signInIntent
        startActivityForResult(signInIntent, SigninSignupActivity.RC_SIGN_IN)
    }

    /**
     * Fetching user's information name, email, profile pic
     */
    private fun getProfileInformation(account: GoogleSignInAccount) {


        commonMethods.hideProgressDialog()
        googleID = account.id!!

        googleFullName = account.displayName!!
        if (account.photoUrl != null)
            googleUserProfile = account.photoUrl.toString()
        else
            googleUserProfile = ""

        googleEmail = account.email!!


        googleUserProfile = googleUserProfile.replace("s96-c", "s400-c")
        val splitStr =
            googleFullName.split("\\s+".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val firstName = splitStr[0]
        var lastName = ""
        for (i in 1 until splitStr.size) {
            lastName = lastName + " " + splitStr[i]
        }
        if (lastName == "") lastName = " "

        sessionManager.email = googleEmail
        sessionManager.facebookId = ""
        // sessionManager.appleId = ""
        sessionManager.googleId = googleID
        sessionManager.firstName = firstName
        sessionManager.lastName = lastName
        sessionManager.profilepicture = googleUserProfile + ""

        isInternetAvailable = commonMethods.isOnline(applicationContext)
        if (!isInternetAvailable) {
            commonMethods.showMessage(this, dialog, getString(R.string.no_connection))
        } else {

            if (count == 1) {
                signOut()
                commonMethods.showProgressDialog(this@SigninSignupActivity)
                apiService.socialoldsignup(
                    commonMethods.getAuthType(),
                    commonMethods.getAuthId()!!,
                    sessionManager.deviceType!!,
                    sessionManager.deviceId!!,
                    sessionManager.languageCode!!
                ).enqueue(RequestCallback(Enums.REQ_SIGNUP, this@SigninSignupActivity))
            }
            count++
        }


    }

    private fun signOut() {
        mGoogleSignInClient.signOut().addOnCompleteListener(this) { }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        //  getMenuInflater().inflate(R.menu.main, menu);
        return true
    }

    fun createNewUser(response: String) {
        var json: JSONObject? = null
        try {
            json =
                JSONObject(response.substring(response.indexOf("{"), response.lastIndexOf("}") + 1))
        } catch (e: Exception) {
            e.printStackTrace()
        }
        var email: String? = ""
        // var apple_id: String? = ""
        try {
            email = json?.getString("email_id")
            //     apple_id = json?.getString("apple_id")
            sessionManager.email = email!!
            // sessionManager.appleId = apple_id!!
            sessionManager.facebookId = ""
            sessionManager.googleId = ""
            openFacebookAccountKitActivity()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    companion object {

        var alertDialogStores: android.app.AlertDialog? = null
        private const val TAG = "SigninSignupActivity"
        private val RC_SIGN_IN = 0
    }

    override fun onSuccess(jsonResp: JsonResponse, data: String) {
        commonMethods.hideProgressDialog()
        val statusCode = commonMethods.getJsonValue(
            jsonResp.strResponse,
            Constants.STATUS_CODE,
            String::class.java
        ) as String
        if (jsonResp.isSuccess) {
            /**
             * Status Code 1 -- Existing User
             * Status Code 2 -- For New User
             */
            if (statusCode == "1") {
                onSuccessLogin(jsonResp.strResponse)
            } else if (statusCode == "2") {
                openFacebookAccountKitActivity()
            } else {
                commonMethods.showMessage(this, dialog, jsonResp.statusMsg)
            }
        } else if (!TextUtils.isEmpty(jsonResp.statusMsg)) {
            commonMethods.showMessage(this, dialog, jsonResp.statusMsg)
            DebuggableLogV("jsonResp.getStatusMsg()", "" + jsonResp.statusMsg)
        }
    }

    override fun onFailure(jsonResp: JsonResponse, data: String) {
        if (!TextUtils.isEmpty(jsonResp.statusMsg))
            commonMethods.showMessage(this, dialog, jsonResp.statusMsg)
        commonMethods.hideProgressDialog()
    }


    inner class CustomView internal constructor(view: View?) {


        // @BindView(R.id.tv_title)
        var tvTitle: FontTextView = findViewById<FontTextView>(R.id.tv_title)
        var ivIcon : ImageView = findViewById<ImageView>(R.id.iv_icon)

        //  @BindView(R.id.iv_icon)
        //lateinit var ivIcon: ImageView

        init {
            // tvTitle = binding.tv
            ButterKnife.bind(this, view!!)
        }
    }

    override fun onSuccessUserSelected(
        type: String?,
        userChoiceData: String?,
        userChoiceCode: String?
    ) {
        if (type.equals(Enums.USER_CHOICE_LANGUAGE)) {
            val langocde = sessionManager.languageCode
            val lang = sessionManager.language
            language.text = lang
            val lan = sessionManager.language
            language.text = lan
            setLocale()
            recreate()
            val intent = baseContext.packageManager
                .getLaunchIntentForPackage(baseContext.packageName)
            intent!!.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
            languageLayout.isClickable = true
        }
    }

    /**
     * Custom text view to link
     */
    private fun customTextView(view: TextView) {
        val spanTxt = SpannableStringBuilder(
            resources.getString(R.string.sigin_terms1)
        )
        spanTxt.append(resources.getString(R.string.sigin_terms4))
        spanTxt.setSpan(object : ClickableSpan() {
            override fun onClick(widget: View) {
                val url = resources.getString(R.string.privacy_policy)
                val i = Intent(Intent.ACTION_VIEW)
                i.data = Uri.parse(url)
                i.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(i)
            }
        }, spanTxt.length - resources.getString(R.string.sigin_terms4).length, spanTxt.length, 0)
        spanTxt.setSpan(
            ForegroundColorSpan(ContextCompat.getColor(this, R.color.blue_text_color)),
            spanTxt.length - resources.getString(R.string.sigin_terms4).length,
            spanTxt.length,
            0
        )
        spanTxt.append(".")
        view.movementMethod = LinkMovementMethod.getInstance()
        view.setText(spanTxt, TextView.BufferType.SPANNABLE)
    }
}