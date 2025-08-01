package com.newtaxiprime.user.appcommon.views

import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.util.Log
import android.webkit.*
import com.newtaxiprime.user.R
import com.newtaxiprime.user.appcommon.configs.SessionManager
import com.newtaxiprime.user.appcommon.helper.Constants
import com.newtaxiprime.user.appcommon.network.AppController
import com.newtaxiprime.user.appcommon.utils.CommonKeys
import com.newtaxiprime.user.appcommon.utils.CommonMethods
import com.newtaxiprime.user.databinding.ActivityPaymentWebViewBinding
import com.newtaxiprime.user.taxiapp.views.customize.CustomDialog
import org.json.JSONException
import org.json.JSONObject
import java.net.URLEncoder
import javax.inject.Inject

class PaystackWebViewActivity : CommonActivity() {
    @Inject
    lateinit var sessionManager: SessionManager

    @Inject
    lateinit var commonMethods: CommonMethods

    @Inject
    lateinit var customDialog: CustomDialog

    var type: String? = null

    lateinit var progressDialog: ProgressDialog

    var payFor: String? = null

    private lateinit var binding: ActivityPaymentWebViewBinding

    private lateinit var payment_wv: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentWebViewBinding.inflate(layoutInflater)
        payment_wv = binding.paymentWv
        val view = binding.root
        setContentView(view)
        AppController.appComponent.inject(this)
        val payableWalletAmount = intent.getStringExtra("payableWalletAmount")
        payFor = intent.getStringExtra(Constants.INTENT_PAY_FOR)
        type = intent.getStringExtra(Constants.PAY_FOR_TYPE)
        commonMethods.setheaderText(
            resources.getString(R.string.paystack),
            binding.commonHeader.tvHeadertext
        )

        binding.commonHeader.back.setOnClickListener {
            onBackPressed()
        }
        setProgress()

        if (!progressDialog.isShowing) {
            //progressDialog.show()
        }
        commonMethods.showProgressDialog(this)

        payment_wv.webViewClient = object : WebViewClient() {
            override fun onPageStarted(view: WebView, url: String, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                if (!progressDialog.isShowing) {
                    //progressDialog.show()
                }
                commonMethods.showProgressDialog(this@PaystackWebViewActivity)
            }

            override fun onPageFinished(view: WebView, url: String) {
                if (progressDialog.isShowing) {
                    progressDialog.dismiss()
                }
                commonMethods.hideProgressDialog()
                payment_wv.loadUrl("javascript:android.showHTML(document.getElementById('data').innerHTML);")
            }

            override fun onReceivedError(
                view: WebView?,
                request: WebResourceRequest?,
                error: WebResourceError?
            ) {
                super.onReceivedError(view, request, error)
                if (progressDialog.isShowing) {
                    progressDialog.dismiss()
                }
                commonMethods.hideProgressDialog()
            }
        }

        payment_wv.settings.javaScriptEnabled = true
        payment_wv.addJavascriptInterface(MyJavaScriptInterface(this), "android")

        val url = resources.getString(R.string.base_url) + CommonKeys.PAYMENT_PAYSTACK_WEBVIEW_KEY
        val postData = "amount=" + URLEncoder.encode(
            payableWalletAmount,
            "UTF-8"
        ) + "&pay_for=" + URLEncoder.encode(payFor, "UTF-8") + "&payment_type=" + URLEncoder.encode(
            sessionManager.paymentMethod?.lowercase(),
            "UTF-8"
        ) + "&trip_id=" + URLEncoder.encode(
            sessionManager.tripId,
            "UTF-8"
        ) + "&mode=" + URLEncoder.encode("light", "UTF-8") + "&token=" + URLEncoder.encode(
            sessionManager.accessToken,
            "UTF-8"
        )
        payment_wv.postUrl(url, postData.toByteArray())
    }

    private fun setProgress() {
        progressDialog = ProgressDialog(this)
        progressDialog.setMessage(resources.getString(R.string.loading))
        progressDialog.setCancelable(false)
    }

    // Open previous opened link from history on webview when back button pressed
    // Detect when the back button is pressed
    override fun onBackPressed() {
        if (payment_wv.canGoBack()) {
            payment_wv.goBack()
        } else {
            super.onBackPressed()
            finish()
        }
    }

    inner class MyJavaScriptInterface(private var ctx: Context) {
        @JavascriptInterface
        fun showHTML(html: String) {
            println("HTML$html")
            var response: JSONObject? = null
            if (progressDialog.isShowing) {
                progressDialog.dismiss()
            }
            try {
                response = JSONObject(html)
                if (response != null) {
                    val statusCode = response.getString("status_code")
                    val statusMessage = response.getString("status_message")

                    Log.d("OUTPUT IS", statusCode)
                    Log.d("OUTPUT IS", statusMessage)
                    redirect(response.toString())
                }
            } catch (e: JSONException) {
                e.printStackTrace()
            } catch (t: Throwable) {
                Log.e("My App", "${t.message} \"$response\"")
            }
        }
    }

    private fun redirect(htmlResponse: String) {
        val intent = Intent()
        try {
            var walletAmount = ""
            val response = JSONObject(htmlResponse)
            if (response != null) {
                val statusCode = response.getString("status_code")
                val statusMessage = response.getString("status_message")
                intent.putExtra("status_message", statusMessage)
                if (statusCode.equals("1", true)) {
                    if (!payFor.isNullOrEmpty() && payFor.equals(CommonKeys.PAY_FOR_WALLET)) {
                        walletAmount = response.getString("wallet_amount")
                    }
                    if (walletAmount.isNotEmpty())
                        intent.putExtra("walletAmount", walletAmount)
                }
                setResult(RESULT_OK, intent)
                finish()
            }
        } catch (e: Exception) {
            e.printStackTrace()
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}