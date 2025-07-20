package com.newtaxiprime.user.taxiapp.sidebar.referral

import android.content.Intent
import android.graphics.Typeface
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.text.SpannableString
import android.text.Spanned
import android.text.TextUtils
import android.text.style.StyleSpan
import android.view.View
import android.widget.RelativeLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import com.google.gson.Gson
import com.newtaxiprime.user.R
import com.newtaxiprime.user.appcommon.configs.SessionManager
import com.newtaxiprime.user.appcommon.datamodels.JsonResponse
import com.newtaxiprime.user.appcommon.interfaces.ApiService
import com.newtaxiprime.user.appcommon.interfaces.ServiceListener
import com.newtaxiprime.user.appcommon.network.AppController
import com.newtaxiprime.user.appcommon.utils.CommonKeys.CompletedReferralArray
import com.newtaxiprime.user.appcommon.utils.CommonKeys.IncompleteReferralArray
import com.newtaxiprime.user.appcommon.utils.CommonMethods
import com.newtaxiprime.user.appcommon.utils.RequestCallback
import com.newtaxiprime.user.appcommon.views.CommonActivity
import com.newtaxiprime.user.databinding.AppActivityShowReferralOptionBinding
import com.newtaxiprime.user.taxiapp.sidebar.referral.model.ReferredFriendsModel
import com.newtaxiprime.user.taxiapp.views.customize.CustomDialog
import javax.inject.Inject

@Suppress("DEPRECATION")
class ShowReferralOptions : CommonActivity(), ServiceListener {

    lateinit var dialog: AlertDialog

    @Inject
    lateinit var commonMethods: CommonMethods

    @Inject
    lateinit var apiService: ApiService

    @Inject
    lateinit var sessionManager: SessionManager

    @Inject
    lateinit var gson: Gson

    @Inject
    lateinit var customDialog: CustomDialog

    lateinit var rvIncompletedReferrals: RecyclerView

    lateinit var rvCompletedReferrals: RecyclerView


    lateinit var cvIncompleteFriends: ConstraintLayout

    lateinit var scvReferal: ScrollView


    lateinit var cvCompleteFriends: ConstraintLayout

    lateinit var cvReferralHeader: ConstraintLayout

    lateinit var tvReferralCode: TextView


    lateinit var tvTotalEarned: TextView


    lateinit var tvEarnedAmount: TextView


    lateinit var tvReferralBenifitStatement: TextView


    lateinit var rltShare: RelativeLayout



    lateinit var tvNoReferralsYet: TextView

    private var referralCode = ""
    private var referralLink = ""

    lateinit var binding: AppActivityShowReferralOptionBinding

    lateinit private var referredFriendsModel: ReferredFriendsModel


    fun share() {
        shareMyReferralCode()
    }

    /* @OnClick(R.id.rlt_share)
     fun share() {
         shareMyReferralCode()
     }*/


    fun backPressed() {
        onBackPressed()
    }


    fun connect() {
        CommonMethods.copyContentToClipboard(this, referralCode)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AppActivityShowReferralOptionBinding.inflate(layoutInflater)

        setContentView(binding.root)

        ButterKnife.bind(this)
        AppController.appComponent.inject(this)

        rvIncompletedReferrals = binding.rvInCompletedReferrals

        rvCompletedReferrals = binding.rvCompletedReferrals

        cvIncompleteFriends = binding.constraintLayoutInCompletedFriends

        scvReferal = binding.scvReferal

        cvCompleteFriends = binding.constraintLayoutCompletedFriends

        cvReferralHeader = binding.constraintLayoutReferralCode

        tvReferralCode = binding.tvReferralCode

        tvTotalEarned = binding.tvTotalEarned

        tvEarnedAmount = binding.tvAmount

        tvReferralBenifitStatement = binding.tvReferralBenifitText

        rltShare = binding.rltShare

        binding.imagShare.setOnClickListener{
            share()
        }
        binding.imagCopy.setOnClickListener{
            connect()
        }

        binding.commonHeader.arrow.setOnClickListener{
            backPressed()
        }
        tvNoReferralsYet = binding.tvNoReferralsYet
        /**Commmon Header Text View */
        commonMethods.setheaderText(
            resources.getString(R.string.referral),
            binding.commonHeader.tvHeadertext
        )
        dialog = commonMethods.getAlertDialog(this)
        scvReferal.visibility = View.GONE
        initView()

    }

    fun shareMyReferralCode() {
        val share = Intent(Intent.ACTION_SEND)
        share.type = "text/plain"
        share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET)

        // Add data to the intent, the receiving app will decide
        // what to do with it.
        share.putExtra(
            Intent.EXTRA_SUBJECT,
            resources.getString(R.string.app_name) + " " + resources.getString(R.string.referral)
        )
        share.putExtra(
            Intent.EXTRA_TEXT,
            resources.getString(R.string.invite_msg) + " " + spannableString(referralCode) + " " + referralLink
        )

        startActivity(Intent.createChooser(share, resources.getString(R.string.share_code)))
    }

    private fun spannableString(referralCode: String): String {
        val ss = SpannableString(referralCode)
        ss.setSpan(
            StyleSpan(Typeface.BOLD),
            0,
            referralCode.length,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        return ss.toString()
    }

    private fun initView() {
        showOrHideReferralAccordingToSessionData()

        getReferralInformationFromAPI()
    }

    private fun showOrHideReferralAccordingToSessionData() {
        if (sessionManager.isReferralOptionEnabled) {
            cvReferralHeader.visibility = View.VISIBLE
        } else {
            cvReferralHeader.visibility = View.GONE
        }
    }

    private fun getReferralInformationFromAPI() {
        commonMethods.showProgressDialog(this)
        apiService.getReferralDetails(sessionManager.accessToken!!).enqueue(RequestCallback(this))
    }

    override fun onSuccess(jsonResp: JsonResponse, data: String) {
        commonMethods.hideProgressDialog()
        if (jsonResp.isSuccess) {
            scvReferal.visibility = View.VISIBLE
            onSuccessResult(jsonResp.strResponse)
        } else if (!TextUtils.isEmpty(jsonResp.statusMsg)) {
            commonMethods.showMessage(this, dialog, jsonResp.statusMsg)

        }
    }

    private fun onSuccessResult(strResponse: String) {
        referredFriendsModel = gson.fromJson(strResponse, ReferredFriendsModel::class.java)
        updateReferralCodeInUI()
        if (referredFriendsModel.pendingReferrals.size != 0 || referredFriendsModel.completedReferrals.size != 0) {

            showReferralsNotAvailable(true)

            proceedCompleteReferralDetails()
            proceedIncompleteReferralDetails()
        } else {
            showReferralsNotAvailable(false)
        }
    }

    private fun updateReferralCodeInUI() {
        referralCode = referredFriendsModel.referralCode
        referralLink = referredFriendsModel.referralLink
        tvReferralCode.text = referralCode
        if ("1".equals(resources.getString(R.string.layout_direction), ignoreCase = true)) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                tvReferralBenifitStatement.text = resources.getString(
                    R.string.max_referral_earning_statement,
                    setCurrencyFrontForRTL(
                        Html.fromHtml(
                            referredFriendsModel.referralAmount,
                            Html.FROM_HTML_MODE_LEGACY
                        ).toString()
                    )
                )
            } else {
                tvReferralBenifitStatement.text = resources.getString(
                    R.string.max_referral_earning_statement,
                    setCurrencyFrontForRTL(
                        Html.fromHtml(referredFriendsModel.referralAmount).toString()
                    )
                )
            }
        } else {
            tvReferralBenifitStatement.text = resources.getString(
                R.string.max_referral_earning_statement,
                Html.fromHtml(referredFriendsModel.referralAmount).toString()
            )
        }
        //tvTotalEarned.append(referredFriendsModel.getTotalEarning().toString());
        tvEarnedAmount.text = referredFriendsModel.totalEarning + ")"
    }

    private fun setCurrencyFrontForRTL(amount: String): String {
        println("amount $amount")
        val currency = amount[0].toString()
        println("currency $currency")
        return amount.replace(currency, " ") + currency
    }

    private fun showReferralsNotAvailable(show: Boolean) {
        if (show) {
            cvIncompleteFriends.visibility = View.VISIBLE
            cvCompleteFriends.visibility = View.VISIBLE
            tvNoReferralsYet.visibility = View.GONE
        } else {
            cvIncompleteFriends.visibility = View.GONE
            cvCompleteFriends.visibility = View.GONE
            tvNoReferralsYet.visibility = View.VISIBLE
        }

    }

    private fun proceedIncompleteReferralDetails() {
        if (referredFriendsModel.pendingReferrals.size != 0) {
            rvIncompletedReferrals.setHasFixedSize(true)
            val layoutManager = LinearLayoutManager(this)
            rvIncompletedReferrals.layoutManager = layoutManager
            rvIncompletedReferrals.adapter = ReferralFriendsListRecyclerViewAdapter(
                this,
                referredFriendsModel.pendingReferrals,
                IncompleteReferralArray
            )
        } else {
            cvIncompleteFriends.visibility = View.GONE
        }
    }

    private fun proceedCompleteReferralDetails() {
        if (referredFriendsModel.completedReferrals.size != 0) {
            rvCompletedReferrals.setHasFixedSize(true)
            val layoutManager = LinearLayoutManager(this)
            rvCompletedReferrals.layoutManager = layoutManager
            rvCompletedReferrals.adapter = ReferralFriendsListRecyclerViewAdapter(
                this,
                referredFriendsModel.completedReferrals,
                CompletedReferralArray
            )
        } else {
            cvCompleteFriends.visibility = View.GONE

        }
    }

    override fun onFailure(jsonResp: JsonResponse, data: String) {

    }
}
