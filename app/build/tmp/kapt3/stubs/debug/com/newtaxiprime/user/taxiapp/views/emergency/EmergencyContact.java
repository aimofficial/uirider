package com.newtaxiprime.user.taxiapp.views.emergency;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00d8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000 \u008a\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u008a\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010i\u001a\u00020jJ.\u0010k\u001a\u00020j2\u0006\u0010]\u001a\u00020*2\u0006\u0010Z\u001a\u00020*2\u0006\u0010l\u001a\u00020*2\u0006\u0010m\u001a\u00020*2\u0006\u0010n\u001a\u00020*J\u0006\u0010o\u001a\u00020jJ\b\u0010p\u001a\u00020jH\u0002J\"\u0010q\u001a\u00020j2\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020s2\b\u0010u\u001a\u0004\u0018\u00010vH\u0014J\u0012\u0010w\u001a\u00020j2\b\u0010x\u001a\u0004\u0018\u00010yH\u0014J\u0018\u0010z\u001a\u00020j2\u0006\u0010{\u001a\u00020|2\u0006\u0010u\u001a\u00020*H\u0016J\u0018\u0010}\u001a\u00020j2\u0006\u0010{\u001a\u00020|2\u0006\u0010u\u001a\u00020*H\u0016J\u0010\u0010~\u001a\u00020j2\u0006\u0010{\u001a\u00020*H\u0002J\u001a\u0010\u007f\u001a\u00020j2\u0007\u0010\u0080\u0001\u001a\u00020s2\u0007\u0010\u0081\u0001\u001a\u00020sH\u0016J\u001b\u0010\u0082\u0001\u001a\u00020j2\u0007\u0010\u0080\u0001\u001a\u00020s2\u0007\u0010\u0081\u0001\u001a\u00020sH\u0016J\u0019\u0010\u0083\u0001\u001a\u00020j2\u0006\u0010]\u001a\u00020*2\u0006\u0010t\u001a\u00020sH\u0002J\t\u0010\u0084\u0001\u001a\u00020jH\u0002J\t\u0010\u0085\u0001\u001a\u00020jH\u0002J1\u0010\u0086\u0001\u001a\u00020j2\u000e\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020*0\u0088\u00012\u0007\u0010\u0080\u0001\u001a\u00020s2\u0007\u0010\u0081\u0001\u001a\u00020sH\u0002\u00a2\u0006\u0003\u0010\u0089\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\'\u001a\u00020(X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010/\u001a\u0002008\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00105\u001a\u0002068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020<X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020EX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010F\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0016\"\u0004\bH\u0010\u0018R\u001e\u0010I\u001a\u00020J8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020PX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u000e\u0010U\u001a\u00020VX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020VX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020YX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010Z\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010,\"\u0004\b\\\u0010.R\u001a\u0010]\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010,\"\u0004\b_\u0010.R\u001a\u0010`\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0016\"\u0004\bb\u0010\u0018R\u001e\u0010c\u001a\u00020d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010h\u00a8\u0006\u008b\u0001"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/emergency/EmergencyContact;", "Lcom/newtaxiprime/user/appcommon/views/CommonActivity;", "Lcom/newtaxiprime/user/appcommon/interfaces/ServiceListener;", "Lcom/newtaxiprime/user/appcommon/utils/RuntimePermissionDialogFragment$RuntimePermissionRequestedCallback;", "()V", "adapter", "Lcom/newtaxiprime/user/taxiapp/adapters/EmergencyContactAdapter;", "addcontact", "Landroid/widget/Button;", "getAddcontact", "()Landroid/widget/Button;", "setAddcontact", "(Landroid/widget/Button;)V", "addcontactlayout", "Landroid/widget/LinearLayout;", "getAddcontactlayout", "()Landroid/widget/LinearLayout;", "setAddcontactlayout", "(Landroid/widget/LinearLayout;)V", "alertMessage", "Landroid/widget/TextView;", "getAlertMessage", "()Landroid/widget/TextView;", "setAlertMessage", "(Landroid/widget/TextView;)V", "apiService", "Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;", "getApiService", "()Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;", "setApiService", "(Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;)V", "binding", "Lcom/newtaxiprime/user/databinding/AppActivityEmergencyContactBinding;", "commonMethods", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "getCommonMethods", "()Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "setCommonMethods", "(Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;)V", "contactViews", "Landroidx/recyclerview/widget/RecyclerView;", "countrycode", "", "getCountrycode", "()Ljava/lang/String;", "setCountrycode", "(Ljava/lang/String;)V", "customDialog", "Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;", "getCustomDialog", "()Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;", "setCustomDialog", "(Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;)V", "dbHelper", "Lcom/newtaxiprime/user/appcommon/database/SqLiteDb;", "getDbHelper", "()Lcom/newtaxiprime/user/appcommon/database/SqLiteDb;", "setDbHelper", "(Lcom/newtaxiprime/user/appcommon/database/SqLiteDb;)V", "dialog", "Landroidx/appcompat/app/AlertDialog;", "getDialog", "()Landroidx/appcompat/app/AlertDialog;", "setDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "emergencyContactModels", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/taxiapp/datamodels/EmergencyContactModel;", "emergencyContactResult", "Lcom/newtaxiprime/user/taxiapp/datamodels/main/EmergencyContactResult;", "fiveContacts", "getFiveContacts", "setFiveContacts", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "imageLayout", "Landroid/widget/RelativeLayout;", "getImageLayout", "()Landroid/widget/RelativeLayout;", "setImageLayout", "(Landroid/widget/RelativeLayout;)V", "isInternetAvailable", "", "isViewUpdatedWithLocalDB", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "name", "getName", "setName", "number", "getNumber", "setNumber", "remove", "getRemove", "setRemove", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "backpress", "", "emergencyDetails", "action", "id", "countryNameCode", "followProcedureForNoDataPresentInDB", "getUserEmergencyContact", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFailure", "jsonResp", "Lcom/newtaxiprime/user/appcommon/datamodels/JsonResponse;", "onSuccess", "onSuccessSOS", "permissionDenied", "requestCodeForCallbackIdentificationCode", "requestCodeForCallbackIdentificationCodeSubDivision", "permissionGranted", "showBottomSheetDialog", "startReadContactIntent", "updateEmergency", "verifyAccessPermission", "requestPermissionFor", "", "([Ljava/lang/String;II)V", "Companion", "app_debug"})
public final class EmergencyContact extends com.newtaxiprime.user.appcommon.views.CommonActivity implements com.newtaxiprime.user.appcommon.interfaces.ServiceListener, com.newtaxiprime.user.appcommon.utils.RuntimePermissionDialogFragment.RuntimePermissionRequestedCallback {
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.database.SqLiteDb dbHelper;
    private boolean isViewUpdatedWithLocalDB = false;
    public androidx.appcompat.app.AlertDialog dialog;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.utils.CommonMethods commonMethods;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.interfaces.ApiService apiService;
    @javax.inject.Inject()
    public com.newtaxiprime.user.taxiapp.views.customize.CustomDialog customDialog;
    @javax.inject.Inject()
    public com.google.gson.Gson gson;
    public android.widget.TextView alertMessage;
    public android.widget.TextView fiveContacts;
    public android.widget.TextView remove;
    public android.widget.RelativeLayout imageLayout;
    public android.widget.LinearLayout addcontactlayout;
    public android.widget.Button addcontact;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String number = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String countrycode = "";
    private androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
    private com.newtaxiprime.user.taxiapp.datamodels.main.EmergencyContactResult emergencyContactResult;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.EmergencyContactModel> emergencyContactModels;
    private androidx.recyclerview.widget.RecyclerView contactViews;
    private com.newtaxiprime.user.taxiapp.adapters.EmergencyContactAdapter adapter;
    private boolean isInternetAvailable = false;
    private com.newtaxiprime.user.databinding.AppActivityEmergencyContactBinding binding;
    public static final int PICKCONTACT = 1;
    @org.jetbrains.annotations.NotNull()
    public static final com.newtaxiprime.user.taxiapp.views.emergency.EmergencyContact.Companion Companion = null;
    
    public EmergencyContact() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.database.SqLiteDb getDbHelper() {
        return null;
    }
    
    public final void setDbHelper(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.database.SqLiteDb p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.app.AlertDialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.configs.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.configs.SessionManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.utils.CommonMethods getCommonMethods() {
        return null;
    }
    
    public final void setCommonMethods(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.utils.CommonMethods p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.interfaces.ApiService getApiService() {
        return null;
    }
    
    public final void setApiService(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.interfaces.ApiService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.taxiapp.views.customize.CustomDialog getCustomDialog() {
        return null;
    }
    
    public final void setCustomDialog(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.customize.CustomDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    public final void setGson(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getAlertMessage() {
        return null;
    }
    
    public final void setAlertMessage(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getFiveContacts() {
        return null;
    }
    
    public final void setFiveContacts(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getRemove() {
        return null;
    }
    
    public final void setRemove(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getImageLayout() {
        return null;
    }
    
    public final void setImageLayout(@org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getAddcontactlayout() {
        return null;
    }
    
    public final void setAddcontactlayout(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getAddcontact() {
        return null;
    }
    
    public final void setAddcontact(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumber() {
        return null;
    }
    
    public final void setNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountrycode() {
        return null;
    }
    
    public final void setCountrycode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void backpress() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void verifyAccessPermission(java.lang.String[] requestPermissionFor, int requestCodeForCallbackIdentificationCode, int requestCodeForCallbackIdentificationCodeSubDivision) {
    }
    
    private final void startReadContactIntent() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void showBottomSheetDialog(java.lang.String number, int resultCode) {
    }
    
    /**
     * View Emergency Contacts details
     */
    private final void updateEmergency() {
    }
    
    private final void getUserEmergencyContact() {
    }
    
    public final void followProcedureForNoDataPresentInDB() {
    }
    
    @java.lang.Override()
    public void onSuccess(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.datamodels.JsonResponse jsonResp, @org.jetbrains.annotations.NotNull()
    java.lang.String data) {
    }
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.datamodels.JsonResponse jsonResp, @org.jetbrains.annotations.NotNull()
    java.lang.String data) {
    }
    
    /**
     * To add , update and delete emergency contacts using type
     */
    public final void emergencyDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String number, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String countryNameCode) {
    }
    
    private final void onSuccessSOS(java.lang.String jsonResp) {
    }
    
    @java.lang.Override()
    public void permissionGranted(int requestCodeForCallbackIdentificationCode, int requestCodeForCallbackIdentificationCodeSubDivision) {
    }
    
    @java.lang.Override()
    public void permissionDenied(int requestCodeForCallbackIdentificationCode, int requestCodeForCallbackIdentificationCodeSubDivision) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/emergency/EmergencyContact$Companion;", "", "()V", "PICKCONTACT", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}