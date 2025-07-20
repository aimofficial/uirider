package com.newtaxiprime.user.taxiapp.sidebar

/**
 * @package com.newtaxiprime.user
 * @subpackage Side_Bar
 * @category DriverContactActivity
 * @author Seen Technologies
 *
 */

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import butterknife.ButterKnife
import com.newtaxiprime.user.R
import com.newtaxiprime.user.appcommon.configs.SessionManager
import com.newtaxiprime.user.appcommon.network.AppController
import com.newtaxiprime.user.appcommon.utils.CommonKeys.KEY_CALLER_ID
import com.newtaxiprime.user.appcommon.utils.CommonMethods
import com.newtaxiprime.user.appcommon.views.CommonActivity
import com.newtaxiprime.user.databinding.AppActivityDriverContactBinding
import javax.inject.Inject

/* ************************************************************
   Current trip driver details and contact page
    *********************************************************** */
/*
* Editor:Umasankar
* on: 24/12/2018
 * Edited: Android action call permission removed and moved to Dial (Intent.ACTION_CALL -> Intent.ACTION_DIAL)
* purpose to reduse the no.of permission
* */
class DriverContactActivity : CommonActivity() {


    lateinit var driver_name_contact: TextView

    lateinit var driver_phone_contact: TextView

    lateinit var callbutton: LinearLayout

    lateinit var messageButton: LinearLayout

    private lateinit var binding: AppActivityDriverContactBinding

    @Inject
    lateinit var sessionManager: SessionManager

    @Inject
    lateinit var commonMethods: CommonMethods


    var callerId = ""

    fun onBack() {
        onBackPressed()
    }

    fun messageDriver() {
        CommonMethods.startChatActivityFrom(this)
    }

//    @OnClick(R.id.callbutton)
//    fun initializeCall() {
//
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ButterKnife.bind(this)
        AppController.appComponent.inject(this)
        binding = AppActivityDriverContactBinding.inflate(layoutInflater)
        setContentView(binding.root)


        commonMethods.setheaderText(
            resources.getString(R.string.contact),
            binding.commonHeader.tvHeadertext
        )
        driver_name_contact = binding.driverNameContact

        driver_phone_contact = binding.driverPhoneContact

        callbutton = binding.callbutton

        messageButton = binding.messageButton

        messageButton.setOnClickListener {
            messageDriver()
        }
        callbutton.setOnClickListener {

        }
        binding.commonHeader.back.setOnClickListener {
            onBack()
        }

        driver_name_contact.text = intent.getStringExtra("drivername")
        driver_phone_contact.text = intent.getStringExtra("drivernumber")

        if (sessionManager.bookingType.equals("Manual Booking", ignoreCase = true)) {
            messageButton.visibility = View.GONE
        }
        /**
         * Call driver
         */
        callerId = intent.getStringExtra(KEY_CALLER_ID).toString()
        println("Caller is : " + callerId)

        callbutton.setOnClickListener {

            val intent =
                Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + driver_phone_contact.text.toString()))
            startActivity(intent)

            /*
                        if (sessionManager.bookingType.equals("Manual Booking",ignoreCase = true)) {
                            val intent =  Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + driver_phone_contact.getText().toString()));
                            startActivity(intent);
                        }else {
                            val callScreenIntent = Intent(this@DriverContactActivity, CallProcessingActivity::class.java)
                            callScreenIntent.putExtra(CommonKeys.TYPE_INTENT_ARGUMENT_KEY, CallProcessingActivity.CallActivityType.CallProcessing)
                            callScreenIntent.putExtra(KEY_CALLER_ID, callerId)
                            startActivity(callScreenIntent)
                        }*/
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.ub__slide_in_left, R.anim.ub__slide_out_right)
        finish()
    }

    companion object {

        val CALL = 0x2
    }

}
