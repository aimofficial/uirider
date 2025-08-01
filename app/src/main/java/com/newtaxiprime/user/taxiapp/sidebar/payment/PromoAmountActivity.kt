package com.newtaxiprime.user.taxiapp.sidebar.payment

/**
 * @package com.newtaxiprime.user
 * @subpackage Side_Bar.payment
 * @category PaymentPage
 * @author Seen Technologies
 *
 */

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import com.newtaxiprime.user.R
import com.newtaxiprime.user.appcommon.configs.SessionManager
import com.newtaxiprime.user.appcommon.network.AppController
import com.newtaxiprime.user.appcommon.utils.CommonMethods
import com.newtaxiprime.user.appcommon.views.CommonActivity
import com.newtaxiprime.user.databinding.AppActivityPromoDetailsBinding
import com.newtaxiprime.user.taxiapp.views.customize.CustomDialog
import org.json.JSONArray
import org.json.JSONException
import java.util.*
import javax.inject.Inject

/* ************************************************************
    Promo code and amount detsils list
    *********************************************************** */
class PromoAmountActivity : CommonActivity() {
    lateinit var dialog: AlertDialog

    @Inject
    lateinit var sessionManager: SessionManager

    @Inject
    lateinit var commonMethods: CommonMethods

    @Inject
    lateinit var customDialog: CustomDialog


    lateinit var listView: RecyclerView

    lateinit var context: Context
    lateinit var promoAmountAdapter: PromoAmountAdapter
    protected var isInternetAvailable: Boolean = false

    lateinit var binding: AppActivityPromoDetailsBinding

    fun onback() {
        onBackPressed()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AppActivityPromoDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ButterKnife.bind(this)
        AppController.appComponent.inject(this)

        context = this
        /**Commmon Header Text View */
        commonMethods.setheaderText(
            resources.getString(R.string.promotions),
            binding.commonHeader.tvHeadertext
        )
        binding.commonHeader.arrow.setOnClickListener{
            onback()
        }
        listView = binding.promotionsList

        dialog = commonMethods.getAlertDialog(this)
        isInternetAvailable = commonMethods.isOnline(applicationContext)

        /**
         * List to show the promo code and amount details
         */
        listView.setHasFixedSize(true)
        listView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        //recyclerView.addItemDecoration(new VerticalLineDecorator(2));

        /*listView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public boolean onSingleTapUp(MotionEvent e) {
                    return true;
                }

            });

            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {

                View child = rv.findChildViewUnder(e.getX(), e.getY());
                if (child != null && gestureDetector.onTouchEvent(e)) {
                    int position = rv.getChildAdapterPosition(child);
                    // tripStatus=tripdetailarraylist.get(position).getStatus();

                    //Toast.makeText(getApplicationContext(), countries.get(position), Toast.LENGTH_SHORT).show();
                }

                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });*/

        loadData()

    }

    /**
     * Get and show the promo code and amount details
     */

    fun loadData() {
        promoAmountModelList.clear()

        try {
            val json = JSONArray(sessionManager.promoDetail)
            if (json.length() > 0) {
                for (i in 0 until json.length()) {
                    val jsonObj = json.getJSONObject(i)
                    val id = jsonObj.getString("id")
                    val promo_amount = jsonObj.getString("amount")
                    val promo_code = jsonObj.getString("code")
                    val promo_exp = jsonObj.getString("expire_date")

                    promoAmountModel = PromoAmountModel(promo_amount, id, promo_code, promo_exp)
                    promoAmountModelList.add(promoAmountModel)

                    val adapter = PromoAmountAdapter(promoAmountModelList, applicationContext)
                    listView.adapter = adapter

                }
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

    }


    override fun onResume() {
        super.onResume()
        isInternetAvailable = commonMethods.isOnline(applicationContext)
        if (!isInternetAvailable) {
            commonMethods.showMessage(this, dialog, getString(R.string.no_connection))
        }

    }

    companion object {

        var promoAmountModelList = ArrayList<PromoAmountModel>()
        var promoAmountModel = PromoAmountModel()
    }


}