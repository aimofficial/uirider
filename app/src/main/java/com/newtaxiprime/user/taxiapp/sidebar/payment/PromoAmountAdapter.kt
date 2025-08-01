package com.newtaxiprime.user.taxiapp.sidebar.payment

/**
 * @package com.newtaxiprime.user
 * @subpackage Side_Bar.payment
 * @category DataAdapter
 * @author Seen Technologies
 * 
 */

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.newtaxiprime.user.R
import com.newtaxiprime.user.appcommon.configs.SessionManager
import com.newtaxiprime.user.appcommon.network.AppController

import java.util.ArrayList

import javax.inject.Inject

/* ************************************************************
    Promocode list adapter
    *********************************************************** */

class PromoAmountAdapter(var promodetailarraylist: ArrayList<PromoAmountModel>, var context: Context) : RecyclerView.Adapter<PromoAmountAdapter.ViewHolder>() {
    @Inject
    lateinit var sessionManager: SessionManager


    init {
        AppController.appComponent.inject(this)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): PromoAmountAdapter.ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.app_promo_amount_layout, viewGroup, false)
        return ViewHolder(view)
    }

    /**
     * Bind Promocode and amount details
     */
    override fun onBindViewHolder(viewHolder: PromoAmountAdapter.ViewHolder, i: Int) {

        viewHolder.promoAmount.text = sessionManager.currencySymbol + promodetailarraylist[i].promoAmount + " " + context.resources.getString(R.string.off)
        viewHolder.promoAmtTxt.text = context.resources.getString(R.string.free_trip) + " " + sessionManager.currencySymbol + promodetailarraylist[i].promoAmount + " " + context.resources.getString(R.string.from) + " " + promodetailarraylist[i].promoCode
        viewHolder.promoExp.text = promodetailarraylist[i].promoExp

    }

    override fun getItemCount(): Int {
        return promodetailarraylist.size
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val promoAmount: TextView
        val promoAmtTxt: TextView
        val promoExp: TextView

        init {

            promoAmount = view.findViewById<View>(R.id.promo_amount) as TextView
            promoAmtTxt = view.findViewById<View>(R.id.promo_amt_txt) as TextView
            promoExp = view.findViewById<View>(R.id.promo_exp) as TextView


        }
    }


}
