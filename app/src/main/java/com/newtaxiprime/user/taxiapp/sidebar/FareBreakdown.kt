package com.newtaxiprime.user.taxiapp.sidebar

/**
 * @package com.newtaxiprime.user
 * @subpackage Side_Bar
 * @category FareBreakdown
 * @author Seen Technologies
 *
 */

import android.os.Bundle
import android.widget.TextView
import butterknife.ButterKnife
import butterknife.OnClick
import com.newtaxiprime.user.R
import com.newtaxiprime.user.appcommon.configs.SessionManager
import com.newtaxiprime.user.appcommon.network.AppController
import com.newtaxiprime.user.appcommon.utils.CommonMethods
import com.newtaxiprime.user.appcommon.views.CommonActivity
import com.newtaxiprime.user.databinding.AppActivityFareBreakdownBinding
import com.newtaxiprime.user.taxiapp.datamodels.main.NearestCar
import java.util.*
import javax.inject.Inject

/* ************************************************************
   Price break for selected car details
    *********************************************************** */
class FareBreakdown : CommonActivity() {

    @Inject
    lateinit var sessionManager: SessionManager

    lateinit var amount1: TextView

    lateinit var amount2: TextView

    lateinit var amount3: TextView

    lateinit var amount4: TextView
    lateinit var searchlist: ArrayList<NearestCar>
    var position: Int = 0

    lateinit var binding: AppActivityFareBreakdownBinding

    @Inject
    lateinit var commonMethods: CommonMethods


    fun back() {
        onBackPressed()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AppActivityFareBreakdownBinding.inflate(layoutInflater)

        setContentView(binding.root)
        ButterKnife.bind(this)
        AppController.appComponent.inject(this)
        commonMethods.setheaderText(
            resources.getString(R.string.farebreakdown),
            binding.commonHeader.tvHeadertext
        )
        searchlist = intent.getSerializableExtra("list") as ArrayList<NearestCar>
        position = intent.getIntExtra("position", 0)

        binding.commonHeader.back.setOnClickListener{
            back()
        }

        amount1 = binding.amount1

        amount2 = binding.amount2
        amount3 = binding.amount3
        amount4 = binding.amount4

        /**
         * Show price breakdown for selected car before send request
         */
        amount1.text = sessionManager.currencySymbol + searchlist[position].baseFare
        amount2.text = sessionManager.currencySymbol + searchlist[position].baseFare
        amount3.text = sessionManager.currencySymbol + searchlist[position].perMin
        amount4.text = sessionManager.currencySymbol + searchlist[position].perKm
    }

    /**
     * Back button to close
     */
    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.ub__slide_in_left, R.anim.ub__slide_out_right)
    }
}
