package com.newtaxiprime.user.taxiapp.sidebar

/**
 * @package com.newtaxiprime.user
 * @subpackage Side_Bar
 * @category EnRoute
 * @author Seen Technologies
 *
 */

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import com.google.firebase.messaging.FirebaseMessaging
import com.newtaxiprime.user.R
import com.newtaxiprime.user.appcommon.configs.SessionManager
import com.newtaxiprime.user.appcommon.network.AppController
import com.newtaxiprime.user.appcommon.pushnotification.Config
import com.newtaxiprime.user.appcommon.pushnotification.NotificationUtils
import com.newtaxiprime.user.appcommon.utils.CommonKeys.KEY_CALLER_ID
import com.newtaxiprime.user.appcommon.utils.CommonMethods
import com.newtaxiprime.user.appcommon.views.CommonActivity
import com.newtaxiprime.user.databinding.AppActivityEnRouteBinding
import com.newtaxiprime.user.taxiapp.datamodels.trip.Riders
import com.newtaxiprime.user.taxiapp.datamodels.trip.TripDetailsModel
import com.newtaxiprime.user.taxiapp.sendrequest.CancelYourTripActivity
import com.squareup.picasso.Picasso
import org.json.JSONException
import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

/* ************************************************************
  Driver start the trip map and route shown
    *********************************************************** */
class EnRoute : CommonActivity() {
    @Inject
    lateinit var sessionManager: SessionManager

    @Inject
    lateinit var commonMethods: CommonMethods

    lateinit var cancel: RelativeLayout

    lateinit var cancel_txt: TextView

    lateinit var driver_name: TextView

    lateinit var arrivel_time: TextView

    lateinit var vehicle_name: TextView

    lateinit var starrating: TextView

    lateinit var driver_car_number: TextView

    lateinit var arrival_txt: TextView

    lateinit var pickup_location: TextView

    lateinit var driver_profile_image: ImageView

    lateinit var commonProfile: View

    var totalDuration = ""

    private lateinit var binding: AppActivityEnRouteBinding

    private var mRegistrationBroadcastReceiver: BroadcastReceiver? = null

    fun onback() {
        onBackPressed()
    }

    fun cancel() {
        val intent = Intent(this, CancelYourTripActivity::class.java)
        startActivity(intent)
    }


    fun contactlayout() {
        val intent = Intent(this, DriverContactActivity::class.java)
        intent.putExtra("drivername", tripDetailsModel.driverName)
        intent.putExtra("drivernumber", tripDetailsModel.mobileNumber)
        intent.putExtra(KEY_CALLER_ID, tripDetailsModel.driverId.toString())
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AppActivityEnRouteBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val extras = intent.extras
        ButterKnife.bind(this)
        AppController.appComponent.inject(this)

        /**Commmon Header Text View */
        commonMethods.setheaderText(
            resources.getString(R.string.enrote),
            binding.commonHeader.tvHeadertext
        )
        /**
         * Get accepted driver details
         */


        cancel = binding.cancel

        cancel_txt = binding.cancelTxt

        driver_name = binding.driverName

        arrivel_time = binding.arrivelTime

        vehicle_name = binding.vehicleName

        starrating = binding.starrating

        driver_car_number = binding.driverCarNumber

        arrival_txt = binding.driverCarNumber

        pickup_location = binding.pickupLocation

        driver_profile_image = binding.commonProfile.profileImage1

        binding.contactlayout.setOnClickListener{
            contactlayout()
        }
        cancel.setOnClickListener{
            cancel()
        }
        binding.commonHeader.arrow.setOnClickListener{
            onback()
        }


        commonProfile = binding.commonProfile.root
        if (extras != null) {
            tripDetailsModel =
                intent.getSerializableExtra("driverDetails") as TripDetailsModel //Obtaining data
            riderdetails = tripDetailsModel.riders.get(0)
            totalDuration = intent.getStringExtra("duration").toString()
        }


        /**
         * Receive push notification
         */
        receivePushNotification()


        /**
         * Show driver details
         */
        insertDriverInfoToSession()
        driver_name.text = tripDetailsModel.driverName


        vehicle_name.text = tripDetailsModel.vehicleName

        if (tripDetailsModel.rating == "" || tripDetailsModel.rating == "0.0") {
            starrating.visibility = View.GONE
        } else {
            starrating.text = tripDetailsModel.rating

        }
        driver_car_number.text = tripDetailsModel.vehicleNumber


        /*   if (tripDetailsModel.arrivalTime > 1) {
               arrival_txt.text = tripDetailsModel.arrivalTime.toString() + " " + resources.getString(R.string.mins)
           } else {
               arrival_txt.text = tripDetailsModel.arrivalTime.toString() + " " + resources.getString(R.string.min)
           }*/

        var etaText: String

        val c = Calendar.getInstance()
        c.add(Calendar.MINUTE, tripDetailsModel.arrivarTime)
        val sdf = SimpleDateFormat("hh:mm a")
        val arTime = sdf.format(c.time)

        println("sessionManager.tripStatus ${sessionManager.tripStatus}")
        if (!TextUtils.isEmpty(totalDuration)) {

            if (sessionManager.tripStatus.equals(
                    "begin_trip",
                    ignoreCase = true
                ) || sessionManager.tripStatus.equals("end_trip", ignoreCase = true)
            ) {
                arrival_txt.text = totalDuration + " " + resources.getString(R.string.to_reach)

            } else {
                arrival_txt.text = totalDuration + " " + resources.getString(R.string.to_arrive)
            }

        } else {
            if (sessionManager.tripStatus.equals(
                    "begin_trip",
                    ignoreCase = true
                ) || sessionManager.tripStatus.equals("end_trip", ignoreCase = true)
            ) {
                arrival_txt.text = resources.getQuantityString(
                    R.plurals.minutes,
                    1,
                    1
                ) + resources.getString(R.string.to_reach)

            } else {
                arrival_txt.text == resources.getQuantityString(
                    R.plurals.minutes,
                    1,
                    1
                ) + resources.getString(R.string.to_arrive)
            }
        }
        if (sessionManager.tripStatus.equals(
                "begin_trip",
                ignoreCase = true
            ) || sessionManager.tripStatus.equals("end_trip", ignoreCase = true)
        ) {
            pickup_location.text = riderdetails.drop
        } else {
            pickup_location.text = riderdetails.pickup
        }

        Picasso.get().load(tripDetailsModel.driverThumbImage)
            .into(driver_profile_image)


        if ((sessionManager.tripStatus != ""
                    //|| !sessionManager.getTripStatus().equals("null")
                    && sessionManager.tripStatus == "begin_trip") || sessionManager.tripStatus == "end_trip"
        ) {
            cancel.isClickable = false
            cancel.isEnabled = false
            cancel_txt.setTextColor(ContextCompat.getColor(this, R.color.cancel_text_color))
        } else {
            cancel.isClickable = true
            cancel.isEnabled = true
            cancel_txt.setTextColor(ContextCompat.getColor(this, R.color.newtaxi_app_black))
        }

    }

    fun insertDriverInfoToSession() {
        sessionManager.driverProfilePic = tripDetailsModel.driverThumbImage
        sessionManager.driverRating = tripDetailsModel.rating
        sessionManager.driverName = tripDetailsModel.driverName
        sessionManager.driverId = tripDetailsModel.driverId.toString()
    }

    /**
     * Receive push notification
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
                            //String trip_id = jsonObject.getJSONObject("custom").getJSONObject("begin_trip").getString("trip_id");
                            cancel.isClickable = false
                            cancel.isEnabled = false
                            cancel_txt.setTextColor(
                                ContextCompat.getColor(
                                    context,
                                    R.color.cancel_text_color
                                )
                            )

                        }


                    } catch (e: JSONException) {

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

    companion object {

        lateinit var tripDetailsModel: TripDetailsModel
        lateinit var riderdetails: Riders

    }


}
