package com.newtaxiprime.user.taxiapp.sendrequest

/**
 * @package com.newtaxiprime.user
 * @subpackage sendrequest
 * @category CancelYourTripActivity
 * @author Seen Technologies
 *
 */

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.PorterDuff
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AlertDialog
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import com.google.firebase.messaging.FirebaseMessaging
import com.google.gson.Gson
import com.newtaxiprime.user.R
import com.newtaxiprime.user.appcommon.configs.SessionManager
import com.newtaxiprime.user.appcommon.datamodels.JsonResponse
import com.newtaxiprime.user.appcommon.interfaces.ApiService
import com.newtaxiprime.user.appcommon.interfaces.ServiceListener
import com.newtaxiprime.user.appcommon.network.AppController
import com.newtaxiprime.user.appcommon.pushnotification.Config
import com.newtaxiprime.user.appcommon.pushnotification.NotificationUtils
import com.newtaxiprime.user.appcommon.utils.CommonMethods
import com.newtaxiprime.user.appcommon.utils.Enums.REQ_CANCEL
import com.newtaxiprime.user.appcommon.utils.Enums.REQ_CANCEL_TRIP
import com.newtaxiprime.user.appcommon.utils.RequestCallback
import com.newtaxiprime.user.appcommon.views.CommonActivity
import com.newtaxiprime.user.databinding.AppActivityCancelYourTripBinding
import com.newtaxiprime.user.taxiapp.datamodels.trip.CancelReasonModel
import com.newtaxiprime.user.taxiapp.datamodels.trip.CancelResultModel
import com.newtaxiprime.user.taxiapp.views.customize.CustomDialog
import com.newtaxiprime.user.taxiapp.views.main.MainActivity
import org.json.JSONException
import org.json.JSONObject
import java.util.*
import javax.inject.Inject

/* ************************************************************
    Rider cancel the trip
    *************************************************************** */
class CancelYourTripActivity : CommonActivity(), ServiceListener {

    var cancelReasonModels = ArrayList<CancelReasonModel>()
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

    lateinit var spinner: Spinner

    lateinit var cancel_reason: EditText
    var cancelreason: String? = null
    lateinit var cancelmessage: String
    protected var isInternetAvailable: Boolean = false
    private var mRegistrationBroadcastReceiver: BroadcastReceiver? = null

    lateinit var binding: AppActivityCancelYourTripBinding


    fun back() {
        finish()
    }

    fun cancelreservation() {
        isInternetAvailable = commonMethods.isOnline(applicationContext)
        if (!isInternetAvailable) {
            commonMethods.showMessage(this, dialog, resources.getString(R.string.no_connection))
        } else {
            /* String spinnerpos = String.valueOf(spinner.getSelectedItemPosition());
            if ("0".equals(spinnerpos)) {
                cancelreason = "";
            } else {
                cancelreason = spinner.getSelectedItem().toString();
            }*/
            cancelmessage = cancel_reason.text.toString()

            /*try {
                cancelmessage = URLEncoder.encode(cancelmessage, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }*/

            /*if (cancelreason.equals("")){
                commonMethods.showMessage(this, dialog, getResources().getString(R.string.cancelreason));
            }else*/
            if (intent.getStringExtra("upcome") != null && intent.getStringExtra("upcome") != "" && intent.getStringExtra(
                    "upcome"
                ) == "upcome"
            ) {

                val tripid = intent.getStringExtra("scheduleID")
                tripid?.let { cancelScheduleTrip(it) }
            } else {
                9

                sessionManager.tripId?.let { cancelTrip(it) }

            }

            //new CancelTrip().execute(url);
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = AppActivityCancelYourTripBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ButterKnife.bind(this)
        AppController.appComponent.inject(this)
        dialog = commonMethods.getAlertDialog(this)
        /**Commmon Header Text View */
        commonMethods.setheaderText(
            resources.getString(R.string.cancel_your_trip),
            binding.commonHeader.tvHeadertext
        )
        /**
         * Receiver push notification
         */
        receivePushNotification()
        binding.cancelreservation.setOnClickListener {
            cancelreservation()
        }
        binding.commonHeader.back.setOnClickListener{
            back()
        }
        spinner = binding.spinner
        cancel_reason = binding.cancelReason
        isInternetAvailable = commonMethods.isOnline(applicationContext)
        /*

        ArrayAdapter<CharSequence> canceladapter;

        // Get Cancel reason
        canceladapter = ArrayAdapter.createFromResource(
                this, R.array.cancel_types, R.layout.spinner_layout);
        canceladapter.setDropDownViewResource(R.layout.spinner_layout);


        spinner.setAdapter(canceladapter);

*/
        getCancelReason()


    }

    fun getCancelReason() {
        commonMethods.showProgressDialog(this)
        apiService.cancelReasons(sessionManager.accessToken!!)
            .enqueue(RequestCallback(REQ_CANCEL, this))
    }

    /**
     * Cancel reason API called
     */
    fun cancelTrip(tripid: String) {
        val position = spinner.selectedItemPosition
        if (position > 0) {
            commonMethods.showProgressDialog(this)
            apiService.cancelTrip(
                cancelReasonModels[position].id.toString(),
                cancelmessage,
                tripid,
                sessionManager.type!!,
                sessionManager.accessToken!!
            ).enqueue(RequestCallback(REQ_CANCEL_TRIP, this))
        } else {
            commonMethods.showMessage(this, dialog, resources.getString(R.string.select_reason))
        }
    }

    /**
     * Cancel Scheduled ride API called
     */
    fun cancelScheduleTrip(tripid: String) {
        val position = spinner.selectedItemPosition
        if (position > 0) {
            commonMethods.showProgressDialog(this)
            apiService.cancelScheduleTrip(
                cancelReasonModels[position].id.toString(),
                cancelmessage,
                tripid,
                sessionManager.type!!,
                sessionManager.accessToken!!
            ).enqueue(RequestCallback(REQ_CANCEL_TRIP, this))
        } else {
            commonMethods.showMessage(this, dialog, resources.getString(R.string.select_reason))
        }
    }

    override fun onSuccess(jsonResp: JsonResponse, data: String) {
        if (!jsonResp.isOnline) {
            if (!TextUtils.isEmpty(data))
                commonMethods.showMessage(this, dialog, data)
            return
        }
        val statuscode = commonMethods.getJsonValue(
            jsonResp.strResponse!!,
            "status_code",
            String::class.java
        ) as String
        when (jsonResp.requestCode) {
            REQ_CANCEL_TRIP -> if (jsonResp.isSuccess) {
                commonMethods.hideProgressDialog()
                if (statuscode.equals("2")) {
                    commonMethods.hideProgressDialog()
                    cancelFunction(jsonResp.statusMsg)
                } else {
                    commonMethods.removeLiveTrackingNodesAfterCompletedTrip(this)
                    commonMethods.removeTripNodesAfterCompletedTrip(this)
                    sessionManager.clearTripID()
                    sessionManager.isDriverAndRiderAbleToChat = false
                    CommonMethods.stopFirebaseChatListenerService(this)
                    CommonMethods.stopSinchService(this)
                    sessionManager.isrequest = false
                    sessionManager.isTrip = false
                    //commonMethods.showMessage(this,dialog,getResources().getString(R.string.cancel_msg));
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
            } else if (!TextUtils.isEmpty(jsonResp.statusMsg)) {
                commonMethods.hideProgressDialog()
                commonMethods.showMessage(this, dialog, jsonResp.statusMsg)
            }

            REQ_CANCEL -> if (jsonResp.isSuccess) {
                commonMethods.hideProgressDialog()
                onSuccessCancelReason(jsonResp)
            } else if (!TextUtils.isEmpty(jsonResp.statusMsg)) {
                commonMethods.hideProgressDialog()
                commonMethods.showMessage(this, dialog, jsonResp.statusMsg)
            }

            else -> {
            }
        }

    }

    fun cancelFunction(statusMsg: String) {
        val builder = android.app.AlertDialog.Builder(this)
        builder.setTitle(statusMsg)
            .setCancelable(false)
            .setPositiveButton(resources.getString(R.string.ok_c)) { dialog, which ->
                dialog.dismiss()
                commonMethods.removeLiveTrackingNodesAfterCompletedTrip(this)
                commonMethods.removeTripNodesAfterCompletedTrip(this)
                sessionManager.clearTripID()
                sessionManager.isDriverAndRiderAbleToChat = false
                CommonMethods.stopFirebaseChatListenerService(this)
                CommonMethods.stopSinchService(this)
                sessionManager.isrequest = false
                sessionManager.isTrip = false
                //commonMethods.showMessage(this,dialog,getResources().getString(R.string.cancel_msg));
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

            }
        builder.create().show()
    }

    private fun onSuccessCancelReason(jsonResp: JsonResponse) {
        val cancelResultModel = gson.fromJson(jsonResp.strResponse, CancelResultModel::class.java)
        if (cancelResultModel != null) {
            val cancelReasonModel = CancelReasonModel()
            cancelReasonModel.id = 0
            cancelReasonModel.reason = getString(R.string.cancel_reason)
            cancelReasonModels.add(cancelReasonModel)
            cancelReasonModels.addAll(cancelResultModel.cancelReasons)

            val cancelReason = arrayOfNulls<String>(cancelReasonModels.size)

            for (i in cancelReasonModels.indices) {
                cancelReason[i] = cancelReasonModels[i].reason
            }

            val adapter = ArrayAdapter(this, R.layout.spinner_layout, cancelReason)
            spinner.getBackground().setColorFilter(
                getResources().getColor(R.color.newtaxi_app_black),
                PorterDuff.Mode.SRC_ATOP
            );
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
            adapter.notifyDataSetChanged()


            /**
             * Cancel trip reasons in spinner
             */
            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parentView: AdapterView<*>,
                    selectedItemView: View?,
                    position: Int,
                    id: Long
                ) {

                }

                override fun onNothingSelected(parentView: AdapterView<*>) {
                    // your code here
                }

            }
        }


    }

    override fun onFailure(jsonResp: JsonResponse, data: String) {
        if (!TextUtils.isEmpty(jsonResp.statusMsg)) {
            commonMethods.hideProgressDialog()
            commonMethods.showMessage(this, dialog, jsonResp.statusMsg)
        }
    }

    /**
     * Get notification from Firebase broadcast
     */
    fun receivePushNotification() {
        mRegistrationBroadcastReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context, intent: Intent) {

                // checking for type intent filter
                if (intent.action == Config.REGISTRATION_COMPLETE) {
                    // FCM successfully registered
                    // now subscribe to `global` topic to receive app wide notifications
                    FirebaseMessaging.getInstance().subscribeToTopic(Config.TOPIC_GLOBAL)


                } else if (intent.action == Config.PUSH_NOTIFICATION) {
                    // new push notification is received

                    val JSON_DATA = sessionManager.pushJson


                    try {
                        val jsonObject = JSONObject(JSON_DATA)

                        if (jsonObject.getJSONObject("custom").has("begin_trip")) {
                            val intent1 =
                                Intent(this@CancelYourTripActivity, MainActivity::class.java)
                            startActivity(intent1)
                        }

                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }

                }
            }
        }
    }

    public override fun onPause() {
        super.onPause()
        LocalBroadcastManager.getInstance(this).unregisterReceiver(mRegistrationBroadcastReceiver!!)
    }

    public override fun onResume() {

        super.onResume()

        // register FCM registration complete receiver
        LocalBroadcastManager.getInstance(this).registerReceiver(
            mRegistrationBroadcastReceiver!!,
            IntentFilter(Config.REGISTRATION_COMPLETE)
        )

        // register new push message receiver
        // by doing this, the activity will be notified each time a new message arrives
        LocalBroadcastManager.getInstance(this).registerReceiver(
            mRegistrationBroadcastReceiver!!,
            IntentFilter(Config.PUSH_NOTIFICATION)
        )

        // clear the notification area when the app is opened
        NotificationUtils.clearNotifications(applicationContext)
    }
}