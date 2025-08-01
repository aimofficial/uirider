package com.newtaxiprime.user.taxiapp.views.emergency


/**
 * @package com.newtaxiprime.user
 * @subpackage emergency
 * @category Emergency contact
 * @author Seen Technologies
 *
 */


import android.content.Intent
import android.database.Cursor
import android.os.Bundle
import android.provider.ContactsContract
import android.text.TextUtils
import android.view.View
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import butterknife.ButterKnife
import butterknife.OnClick
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.gson.Gson
import com.hbb20.CountryCodePicker
import com.newtaxiprime.user.R
import com.newtaxiprime.user.appcommon.configs.SessionManager
import com.newtaxiprime.user.appcommon.database.SqLiteDb
import com.newtaxiprime.user.appcommon.datamodels.JsonResponse
import com.newtaxiprime.user.appcommon.helper.Constants
import com.newtaxiprime.user.appcommon.interfaces.ApiService
import com.newtaxiprime.user.appcommon.interfaces.ServiceListener
import com.newtaxiprime.user.appcommon.network.AppController
import com.newtaxiprime.user.appcommon.utils.CommonMethods
import com.newtaxiprime.user.appcommon.utils.CommonMethods.Companion.DebuggableLogV
import com.newtaxiprime.user.appcommon.utils.CommonMethods.Companion.showUserMessage
import com.newtaxiprime.user.appcommon.utils.RequestCallback
import com.newtaxiprime.user.appcommon.utils.RuntimePermissionDialogFragment
import com.newtaxiprime.user.appcommon.views.CommonActivity
import com.newtaxiprime.user.databinding.AppActivityEmergencyContactBinding
import com.newtaxiprime.user.taxiapp.adapters.EmergencyContactAdapter
import com.newtaxiprime.user.taxiapp.datamodels.EmergencyContactModel
import com.newtaxiprime.user.taxiapp.datamodels.main.EmergencyContactResult
import com.newtaxiprime.user.taxiapp.views.customize.CustomDialog
import org.json.JSONException
import java.util.*
import javax.inject.Inject

/* ************************************************************************
                To add Emergency contacts that are to be send during
                while sos click
*************************************************************************** */

class EmergencyContact : CommonActivity(), ServiceListener,
    RuntimePermissionDialogFragment.RuntimePermissionRequestedCallback {
    @Inject
    lateinit var dbHelper: SqLiteDb
    private var isViewUpdatedWithLocalDB: Boolean = false

    lateinit var dialog: androidx.appcompat.app.AlertDialog

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


    lateinit var alertMessage: TextView


    lateinit var fiveContacts: TextView


    lateinit var remove: TextView

    lateinit var imageLayout: RelativeLayout

    lateinit var addcontactlayout: LinearLayout

    lateinit var addcontact: Button

    var number = ""
    var name = ""
    var countrycode = ""

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var emergencyContactResult: EmergencyContactResult
    private var emergencyContactModels = ArrayList<EmergencyContactModel>()
    private lateinit var contactViews: RecyclerView
    private lateinit var adapter: EmergencyContactAdapter
    private var isInternetAvailable: Boolean = false

    private lateinit var binding: AppActivityEmergencyContactBinding


    fun backpress() {
        onBackPressed()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = AppActivityEmergencyContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ButterKnife.bind(this)
        AppController.appComponent.inject(this)

        /**Commmon Header Text View */
        commonMethods.setheaderText(
            resources.getString(R.string.emergency_contacts),
            binding.commonHeader.tvHeadertext
        )
        binding.commonHeader.back.setOnClickListener {
            backpress()
        }
        alertMessage = binding.alertmsg

        fiveContacts = binding.fivecontacts

        remove = binding.remove

        imageLayout = binding.imagelayout

        addcontactlayout = binding.addcontactlayout

        addcontact = binding.addcontact
        dialog = commonMethods.getAlertDialog(this)
        contactViews = findViewById<View>(R.id.contactlist) as RecyclerView
        contactViews.setHasFixedSize(true)
        contactViews.isNestedScrollingEnabled = true
        linearLayoutManager = LinearLayoutManager(this)
        contactViews.layoutManager = linearLayoutManager

        isInternetAvailable = commonMethods.isOnline(applicationContext)
        /* commonMethods.imageChangeforLocality(this,back)*/
        updateEmergency()
        //Action for add contact button
        addcontact.setOnClickListener { v ->
            verifyAccessPermission(
                arrayOf(
                    RuntimePermissionDialogFragment.CONTACT_PERMISSION
                ), RuntimePermissionDialogFragment.contactCallbackCode, 3
            )
        }
    }

    private fun verifyAccessPermission(
        requestPermissionFor: Array<String>,
        requestCodeForCallbackIdentificationCode: Int,
        requestCodeForCallbackIdentificationCodeSubDivision: Int
    ) {
        RuntimePermissionDialogFragment.checkPermissionStatus(
            this,
            supportFragmentManager,
            this,
            requestPermissionFor,
            requestCodeForCallbackIdentificationCode,
            requestCodeForCallbackIdentificationCodeSubDivision
        )
    }

    private fun startReadContactIntent() {
        val intent1 = Intent(Intent.ACTION_PICK)
        intent1.type = ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE
        startActivityForResult(intent1, PICKCONTACT)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data)

        val resolver = contentResolver
        val contacts: Cursor
        try {
            contacts =
                resolver.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null)!!
            if (contacts.moveToFirst()) {

                val contactUri = data!!.data
                val projection = arrayOf(
                    ContactsContract.CommonDataKinds.Phone.NUMBER,
                    ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME
                )

                val cursor = contentResolver.query(contactUri!!, projection, null, null, null)
                cursor?.moveToFirst()
                val numberColumn =
                    cursor?.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)
                val nameColumn =
                    cursor?.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME)
                number = cursor!!.getString(numberColumn!!)
                name = cursor.getString(nameColumn!!)
                cursor.close()
                contacts.close()

            } else {
                showUserMessage(this, getString(R.string.no_contacts_selected))
            }
        } catch (e: NullPointerException) {
            number = ""
        } catch (e: Exception) {
            e.printStackTrace()
        }

        number = number.replace("-".toRegex(), "")
        if (number.startsWith("+")) {
            number = number.replace("\\D".toRegex(), "")
            number = number.replace(" ".toRegex(), "")
        } else {
            number = /*sessionManager.dialCode +*/ number
        }

        if ("" != number) {
            if ("*".contains(number) || "#".contains(number)) {
                Toast.makeText(applicationContext, "Invalid Number", Toast.LENGTH_LONG).show()
            } else {
                showBottomSheetDialog(number, resultCode)

            }
        }

    }


    private fun showBottomSheetDialog(number: String, resultCode: Int) {
        val phoneedittext: EditText
        val nameedittext: EditText
        val button_confirm: Button
        val button_cancel: Button
        val countryCodePicker: CountryCodePicker
        val view = layoutInflater.inflate(R.layout.app_bottomsheet_emergency_contact, null)
        val bottomdialog = BottomSheetDialog(this, R.style.BottomSheetDialogTheme)
        bottomdialog.setContentView(view)
        phoneedittext = view.findViewById(R.id.numberofcontact)
        countryCodePicker = view.findViewById(R.id.mobile_code)
        nameedittext = view.findViewById(R.id.nameofcontact)
        button_cancel = view.findViewById(R.id.btn_cancel)
        button_confirm = view.findViewById(R.id.btn_confirm)
        phoneedittext.setText(number)
        nameedittext.setText(name)
        button_cancel.setOnClickListener(View.OnClickListener {
            bottomdialog.dismiss()
        })
        button_confirm.setOnClickListener(View.OnClickListener {
            if (isInternetAvailable) {
                this@EmergencyContact.number = number.replace(" ".toRegex(), "")

                if (resultCode != 0) {
                    emergencyDetails(
                        phoneedittext.text.toString(),
                        nameedittext.text.toString(),
                        "update",
                        "",
                        countryCodePicker.selectedCountryNameCode
                    )
                }
                this@EmergencyContact.number = ""
                name = ""
            } else {
                commonMethods.showMessage(this, dialog, getString(R.string.no_connection))

            }
            bottomdialog.dismiss()
        })
        if (!bottomdialog.isShowing) {
            bottomdialog.show()
        }
    }

    /**
     * View Emergency Contacts details
     */
    private fun updateEmergency() {
        if (isInternetAvailable) {
            number = number.replace(" ".toRegex(), "")
            val allHomeDataCursor: Cursor =
                dbHelper.getDocument(Constants.DB_KEY_USER_EMERGENCY.toString())
            if (allHomeDataCursor.moveToFirst()) {
                isViewUpdatedWithLocalDB = true
                //tvOfflineAnnouncement.setVisibility(View.VISIBLE)
                try {
                    onSuccessSOS(allHomeDataCursor.getString(0))
                } catch (e: JSONException) {
                    e.printStackTrace()
                }
            } else {
                followProcedureForNoDataPresentInDB()
            }

        } else {
            commonMethods.showMessage(this, dialog, getString(R.string.no_connection))
        }
    }

    private fun getUserEmergencyContact() {
        if (commonMethods.isOnline(this)) {
            emergencyDetails(number, name, "view", "", "")
        } else {
            CommonMethods.showInternetNotAvailableForStoredDataViewer(this)
        }
    }

    fun followProcedureForNoDataPresentInDB() {
        if (commonMethods.isOnline(this)) {
            commonMethods.showProgressDialog(this)
            getUserEmergencyContact()
        } else {
            CommonMethods.showNoInternetAlert(
                this,
                object : CommonMethods.INoInternetCustomAlertCallback {
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
        if (jsonResp.isSuccess) {
            commonMethods.hideProgressDialog()
            dbHelper.insertWithUpdate(
                Constants.DB_KEY_USER_EMERGENCY.toString(),
                jsonResp.strResponse
            )
            onSuccessSOS(jsonResp.strResponse)
        } else if (!TextUtils.isEmpty(jsonResp.statusMsg)) {
            commonMethods.hideProgressDialog()
            commonMethods.showMessage(this, dialog, jsonResp.statusMsg)
        }
    }

    override fun onFailure(jsonResp: JsonResponse, data: String) {
        DebuggableLogV("SOS", "onFailure")
    }

    /**
     * To add , update and delete emergency contacts using type
     */
    fun emergencyDetails(
        number: String,
        name: String,
        action: String,
        id: String,
        countryNameCode: String
    ) {
        commonMethods.showProgressDialog(this)
        apiService.sos(sessionManager.accessToken!!, number, action, name, countryNameCode, id)
            .enqueue(RequestCallback(this))
    }

    private fun onSuccessSOS(jsonResp: String) {
        emergencyContactResult = gson.fromJson(jsonResp, EmergencyContactResult::class.java)
        when (emergencyContactResult.contactCount) {
            0 -> {
                imageLayout.visibility = View.VISIBLE
                alertMessage.visibility = View.VISIBLE
                fiveContacts.visibility = View.VISIBLE
                addcontact.visibility = View.VISIBLE
                remove.visibility = View.GONE
                contactViews.visibility = View.GONE

            }

            5 -> {
                imageLayout.visibility = View.GONE
                alertMessage.visibility = View.GONE
                fiveContacts.visibility = View.VISIBLE
                remove.visibility = View.VISIBLE
                addcontact.visibility = View.GONE
                contactViews.visibility = View.VISIBLE
            }

            else -> {
                imageLayout.visibility = View.GONE
                alertMessage.visibility = View.GONE
                fiveContacts.visibility = View.VISIBLE
                addcontact.visibility = View.VISIBLE
                contactViews.visibility = View.VISIBLE
                remove.visibility = View.GONE
            }
        }
        emergencyContactModels.clear()
        val contactArray = emergencyContactResult.contactDetails
        emergencyContactModels.addAll(contactArray)

        adapter = EmergencyContactAdapter(emergencyContactModels, this@EmergencyContact)
        contactViews.adapter = adapter
        adapter.notifyDataSetChanged()
        adapter.setOnItemClickListener(object : EmergencyContactAdapter.OnItemClickListener {
            override fun onItemClickListener(
                number: String,
                name: String,
                id: String,
                positionz: String
            ) {
                emergencyDetails(number, name, "delete", id, "")
            }
        })

        if (isViewUpdatedWithLocalDB) {
            isViewUpdatedWithLocalDB = false
            getUserEmergencyContact()
        }
    }

    override fun permissionGranted(
        requestCodeForCallbackIdentificationCode: Int,
        requestCodeForCallbackIdentificationCodeSubDivision: Int
    ) {
        if (requestCodeForCallbackIdentificationCode == RuntimePermissionDialogFragment.contactCallbackCode) {
            startReadContactIntent()
        }
    }

    override fun permissionDenied(
        requestCodeForCallbackIdentificationCode: Int,
        requestCodeForCallbackIdentificationCodeSubDivision: Int
    ) {
    }

    companion object {
        const val PICKCONTACT = 1
    }
}