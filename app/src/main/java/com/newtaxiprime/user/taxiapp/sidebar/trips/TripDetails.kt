package com.newtaxiprime.user.taxiapp.sidebar.trips

/**
 * @package com.newtaxiprime.user
 * @subpackage Side_Bar.trips
 * @category TripDetails
 * @author Seen Technologies
 *
 */

import android.content.Intent
import android.database.Cursor
import android.os.Bundle
import android.text.TextUtils
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import butterknife.ButterKnife
import com.google.android.gms.maps.model.LatLng
import com.google.gson.Gson
import com.newtaxiprime.user.R
import com.newtaxiprime.user.appcommon.configs.SessionManager
import com.newtaxiprime.user.appcommon.database.SqLiteDb
import com.newtaxiprime.user.appcommon.datamodels.JsonResponse
import com.newtaxiprime.user.appcommon.helper.Constants
import com.newtaxiprime.user.appcommon.interfaces.ApiService
import com.newtaxiprime.user.appcommon.interfaces.ServiceListener
import com.newtaxiprime.user.appcommon.network.AppController
import com.newtaxiprime.user.appcommon.utils.CommonMethods
import com.newtaxiprime.user.appcommon.utils.CommonMethods.Companion.showInternetNotAvailableForStoredDataViewer
import com.newtaxiprime.user.appcommon.utils.CommonMethods.Companion.showNoInternetAlert
import com.newtaxiprime.user.appcommon.utils.Enums.REQ_TRIP_DETAIL
import com.newtaxiprime.user.appcommon.utils.RequestCallback
import com.newtaxiprime.user.appcommon.views.CommonActivity
import com.newtaxiprime.user.databinding.AppActivityTripDetailsBinding
import com.newtaxiprime.user.taxiapp.adapters.PriceRecycleAdapter
import com.newtaxiprime.user.taxiapp.adapters.ViewPagerAdapter
import com.newtaxiprime.user.taxiapp.datamodels.trip.Riders
import com.newtaxiprime.user.taxiapp.datamodels.trip.TripDetailsModel
import com.newtaxiprime.user.taxiapp.sendrequest.DriverRatingActivity
import com.newtaxiprime.user.taxiapp.views.customize.CustomDialog
import com.squareup.picasso.Picasso
import org.json.JSONException
import javax.inject.Inject

/* ************************************************************
    Selected Trip details
    *********************************************************** */
class TripDetails : CommonActivity(), ServiceListener {

    @Inject
    lateinit var dbHelper: SqLiteDb
    private var isViewUpdatedWithLocalDB: Boolean = false

    lateinit var tripId: String

    @Inject
    lateinit var sessionManager: SessionManager
    lateinit var dialog: AlertDialog

    @Inject
    lateinit var commonMethods: CommonMethods

    @Inject
    lateinit var apiService: ApiService

    @Inject
    lateinit var customDialog: CustomDialog

    @Inject
    lateinit var gson: Gson


    lateinit var carname: TextView

    lateinit var mapView: RelativeLayout

    lateinit var driver_name: TextView

    lateinit var datetime: TextView

    lateinit var amountcard: TextView

    lateinit var mapimage: ImageView

    lateinit var ProfileImage: ImageView

    lateinit var profilelayout: RelativeLayout

    lateinit var btnrate: Button

    lateinit var seatcount: TextView

    lateinit var recyclerView: RecyclerView

    lateinit var tvTripid: TextView

    lateinit var tripstatus: TextView

    lateinit var binding: AppActivityTripDetailsBinding

    fun back() {
        onBackPressed()
    }

    fun rate() {
        val rating = Intent(this, DriverRatingActivity::class.java)
        rating.putExtra("imgprofile", tripDetailsModel.driverThumbImage)
        rating.putExtra("tripid", ridersDetails.tripId)
        rating.putExtra("back", 1)
        startActivity(rating)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AppActivityTripDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        carname = binding.carname

        mapView = binding.rltMapview

        driver_name = binding.driverName

        datetime = binding.datetime

        amountcard = binding.amountcard

        mapimage = binding.mapimage

        ProfileImage = binding.ivProfileimage

        profilelayout = binding.profilelayout

        btnrate = binding.btnrate

        btnrate.setOnClickListener {
            rate()
        }
        binding.commonHeader.back.setOnClickListener {
            back()
        }

        seatcount = binding.seatcount

        recyclerView = binding.rvPrice

        tvTripid = binding.tvTripid

        tripstatus = binding.tvTripstatus
        AppController.appComponent.inject(this)
        ButterKnife.bind(this)
        dialog = commonMethods.getAlertDialog(this)
        /**Commmon Header Text View */
        commonMethods.setheaderText(
            resources.getString(R.string.tripDetails),
            binding.commonHeader.tvHeadertext
        )

        val intent = intent
        tripId = intent.getStringExtra("tripId").toString()
        getTripDetails()
    }

    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(Receipt(), getString(R.string.receipt))
        viewPager.adapter = adapter
    }

    /* override fun onTabSelected(tab: TabLayout.Tab) {
        viewPagertripdetails.currentItem = tab.position
    }

    override fun onTabUnselected(tab: TabLayout.Tab) {
        DebuggableLogI("NewTaxi", "Tab")
    }

    override fun onTabReselected(tab: TabLayout.Tab) {
        DebuggableLogI("NewTaxi", "Tab")
    }*/

    private fun getTripDetails() {
        val allHomeDataCursor: Cursor = dbHelper.getDocument(Constants.DB_KEY_TRIP_DETAILS + tripId)
        if (allHomeDataCursor.moveToFirst()) {
            isViewUpdatedWithLocalDB = true
            //tvOfflineAnnouncement.setVisibility(View.VISIBLE)
            try {
                onSuccessTripDetail(allHomeDataCursor.getString(0))
            } catch (e: JSONException) {
                e.printStackTrace()
            }
        } else {
            followProcedureForNoDataPresentInDB()
        }
    }

    private fun getUserTripsDetail() {
        if (commonMethods.isOnline(this)) {
            apiService.getTripDetails(sessionManager.accessToken!!, tripId)
                .enqueue(RequestCallback(REQ_TRIP_DETAIL, this))
        } else {
            showInternetNotAvailableForStoredDataViewer(this)
        }
    }

    fun followProcedureForNoDataPresentInDB() {
        if (commonMethods.isOnline(this)) {
            commonMethods.showProgressDialog(this)
            getUserTripsDetail()
        } else {
            showNoInternetAlert(this, object : CommonMethods.INoInternetCustomAlertCallback {
                override fun onOkayClicked() {
                    finish()
                }

                override fun onRetryClicked() {
                    followProcedureForNoDataPresentInDB()
                }

            })
        }
    }

    override fun onSuccess(jsonResp: JsonResponse, data: String) {
        commonMethods.hideProgressDialog()
        if (!jsonResp.isOnline) {
            if (!TextUtils.isEmpty(data))
                commonMethods.showMessage(this, dialog, data)
            return
        }
        when (jsonResp.requestCode) {

            REQ_TRIP_DETAIL -> if (jsonResp.isSuccess) {
                commonMethods.hideProgressDialog()
                dbHelper.insertWithUpdate(
                    Constants.DB_KEY_TRIP_DETAILS.toString() + tripId,
                    jsonResp.strResponse
                )
                onSuccessTripDetail(jsonResp.strResponse)
            } else if (!TextUtils.isEmpty(jsonResp.statusMsg)) {
                commonMethods.hideProgressDialog()
                commonMethods.showMessage(this, dialog, jsonResp.statusMsg)
            }
        }
    }

    override fun onFailure(jsonResp: JsonResponse, data: String) {
        commonMethods.hideProgressDialog()
        commonMethods.showMessage(this, dialog, data)
    }

    private fun onSuccessTripDetail(jsonResponse: String) {
        tripDetailsModel = gson.fromJson(jsonResponse, TripDetailsModel::class.java)
        ridersDetails = tripDetailsModel!!.riders?.get(0)!!
        recyclerView.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val invoiceModels = tripDetailsModel.riders.get(0).invoice
        if (invoiceModels.size <= 0) {
            profilelayout.visibility = View.GONE
        }
        val adapter = PriceRecycleAdapter(this, invoiceModels)
        recyclerView.adapter = adapter
        binding.tvPickAddress.text = ridersDetails.pickup
        binding.tvDropAddress.text = ridersDetails.drop
        tvTripid.text = resources.getString(R.string.trip_id) + ridersDetails.tripId.toString()
        tripstatus.text = ridersDetails.status
        if ("1".equals(resources.getString(R.string.layout_direction))) {
            tripstatus.gravity = Gravity.START
        } else {
            tripstatus.gravity = Gravity.END
        }
        /*setupViewPager(viewPagertripdetails)

        tabLayouttripdetails.setupWithViewPager(viewPagertripdetails)*/

        if (TextUtils.isEmpty(ridersDetails.mapImage)) {
            val pikcuplatlng = LatLng(
                java.lang.Double.valueOf(ridersDetails.pickupLat),
                java.lang.Double.valueOf(ridersDetails.pickupLng)
            )
            val droplatlng = LatLng(
                java.lang.Double.valueOf(ridersDetails.dropLat),
                java.lang.Double.valueOf(ridersDetails.dropLng)
            )

            //val pathString = "&path=color:0x000000ff%7Cweight:4%7Cenc:" + ridersDetails.tripPath
            val pickupstr = pikcuplatlng.latitude.toString() + "," + pikcuplatlng.longitude
            val dropstr = droplatlng.latitude.toString() + "," + droplatlng.longitude
            val positionOnMap =
                "&markers=size:mid|icon:" + resources.getString(R.string.image_url) + "pickup.png|" + pickupstr
            val positionOnMap1 =
                "&markers=size:mid|icon:" + resources.getString(R.string.image_url) + "drop.png|" + dropstr

            //staticmapview.visibility=View.VISIBLE
            mapView.visibility = View.GONE


            /* addressdetailayout.visibility=View.GONE
            addressdetailayout2.visibility=View.GONE*/


            /*  var staticMapURL: String
              if (tripDetailsModel.tripPath == "") {
                  staticMapURL = "https://maps.googleapis.com/maps/api/staticmap?size=640x250&" +
                          pikcuplatlng.latitude + "," + pikcuplatlng.longitude +
                          "" + positionOnMap + "" + positionOnMap1 + //"&zoom=14" +

                          "&key=" + sessionManager.googleMapKey + "&language=" + Locale.getDefault()
              } else {
                  staticMapURL = "https://maps.googleapis.com/maps/api/staticmap?size=640x250&" +
                          pikcuplatlng.latitude + "," + pikcuplatlng.longitude +
                          pathString + "" + positionOnMap + "" + positionOnMap1 + //"&zoom=14" +

                          "&key=" + sessionManager.googleMapKey + "&language=" + Locale.getDefault()
              }
              Picasso.with(applicationContext).load(staticMapURL)
                      .into(mapimage)*/
        } else {
            /*  addressdetailayout.visibility=View.VISIBLE
            addressdetailayout2.visibility=View.VISIBLE*/
            //  staticmapview.visibility=View.INVISIBLE
            mapView.visibility = View.VISIBLE
            Picasso.get().load(ridersDetails.mapImage)
                .into(mapimage)
        }
        /*Picasso.with(getApplicationContext()).load(tripDetailsModel.getMapImage())
                .placeholder(R.drawable.mapimg).error(R.drawable.ic_app_notification)
                .into(mapimage);*/
        if (tripDetailsModel.isPool!! && tripDetailsModel.seats != 0) {
            seatcount.visibility = View.VISIBLE
            seatcount.setText(resources.getString(R.string.seat_count) + " " + tripDetailsModel.seats.toString())
        } else {
            seatcount.visibility = View.GONE
        }
        carname.text = tripDetailsModel.vehicleName
        binding.tvPickAddress.text = ridersDetails.pickup
        binding.tvDropAddress.text = ridersDetails.drop

        datetime.setText(ridersDetails.creatdate);
        amountcard.text = sessionManager.currencySymbol + ridersDetails.totalFare

        driver_name.text =
            resources.getString(R.string.your_ride_with) + " " + tripDetailsModel.driverName

        /*if (tripDetailsModel.getStatus().equalsIgnoreCase("Rating")){
            btnrate.setVisibility(View.VISIBLE);
        }else {
            btnrate.setVisibility(View.GONE);
        }*/
        val profileurl = tripDetailsModel.driverThumbImage


        if (profileurl != "") {
            Picasso.get().load(profileurl)
                .into(ProfileImage)
        }

        if (invoiceModels.size <= 0) {
            profilelayout.visibility = View.GONE
        }
        if (isViewUpdatedWithLocalDB) {
            isViewUpdatedWithLocalDB = false
            getUserTripsDetail()
        }
    }

    companion object {

        lateinit var tripDetailsModel: TripDetailsModel

        lateinit var ridersDetails: Riders
    }
}
