package com.newtaxiprime.user.taxiapp.sendrequest;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010Q\u001a\u00020RJ\u000e\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020\u001eJ\u000e\u0010U\u001a\u00020R2\u0006\u0010V\u001a\u00020\u001eJ\u000e\u0010W\u001a\u00020R2\u0006\u0010V\u001a\u00020\u001eJ\u0006\u0010X\u001a\u00020RJ\u0006\u0010Y\u001a\u00020RJ\u0012\u0010Z\u001a\u00020R2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0014J\u0018\u0010]\u001a\u00020R2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020\u001eH\u0016J\b\u0010a\u001a\u00020RH\u0016J\b\u0010b\u001a\u00020RH\u0016J\u0018\u0010c\u001a\u00020R2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020\u001eH\u0016J\u0010\u0010d\u001a\u00020R2\u0006\u0010^\u001a\u00020_H\u0002J\u0006\u0010e\u001a\u00020RR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u001e\u0010&\u001a\u00020\'8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u000203X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u0002098\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020?X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010@\"\u0004\bA\u0010BR\u0010\u0010C\u001a\u0004\u0018\u00010DX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010E\u001a\u00020F8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020LX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P\u00a8\u0006f"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/sendrequest/CancelYourTripActivity;", "Lcom/newtaxiprime/user/appcommon/views/CommonActivity;", "Lcom/newtaxiprime/user/appcommon/interfaces/ServiceListener;", "()V", "apiService", "Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;", "getApiService", "()Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;", "setApiService", "(Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;)V", "binding", "Lcom/newtaxiprime/user/databinding/AppActivityCancelYourTripBinding;", "getBinding", "()Lcom/newtaxiprime/user/databinding/AppActivityCancelYourTripBinding;", "setBinding", "(Lcom/newtaxiprime/user/databinding/AppActivityCancelYourTripBinding;)V", "cancelReasonModels", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/taxiapp/datamodels/trip/CancelReasonModel;", "getCancelReasonModels", "()Ljava/util/ArrayList;", "setCancelReasonModels", "(Ljava/util/ArrayList;)V", "cancel_reason", "Landroid/widget/EditText;", "getCancel_reason", "()Landroid/widget/EditText;", "setCancel_reason", "(Landroid/widget/EditText;)V", "cancelmessage", "", "getCancelmessage", "()Ljava/lang/String;", "setCancelmessage", "(Ljava/lang/String;)V", "cancelreason", "getCancelreason", "setCancelreason", "commonMethods", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "getCommonMethods", "()Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "setCommonMethods", "(Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;)V", "customDialog", "Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;", "getCustomDialog", "()Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;", "setCustomDialog", "(Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;)V", "dialog", "Landroidx/appcompat/app/AlertDialog;", "getDialog", "()Landroidx/appcompat/app/AlertDialog;", "setDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "isInternetAvailable", "", "()Z", "setInternetAvailable", "(Z)V", "mRegistrationBroadcastReceiver", "Landroid/content/BroadcastReceiver;", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "spinner", "Landroid/widget/Spinner;", "getSpinner", "()Landroid/widget/Spinner;", "setSpinner", "(Landroid/widget/Spinner;)V", "back", "", "cancelFunction", "statusMsg", "cancelScheduleTrip", "tripid", "cancelTrip", "cancelreservation", "getCancelReason", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFailure", "jsonResp", "Lcom/newtaxiprime/user/appcommon/datamodels/JsonResponse;", "data", "onPause", "onResume", "onSuccess", "onSuccessCancelReason", "receivePushNotification", "app_debug"})
public final class CancelYourTripActivity extends com.newtaxiprime.user.appcommon.views.CommonActivity implements com.newtaxiprime.user.appcommon.interfaces.ServiceListener {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.trip.CancelReasonModel> cancelReasonModels;
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
    public android.widget.Spinner spinner;
    public android.widget.EditText cancel_reason;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cancelreason;
    public java.lang.String cancelmessage;
    private boolean isInternetAvailable = false;
    @org.jetbrains.annotations.Nullable()
    private android.content.BroadcastReceiver mRegistrationBroadcastReceiver;
    public com.newtaxiprime.user.databinding.AppActivityCancelYourTripBinding binding;
    
    public CancelYourTripActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.trip.CancelReasonModel> getCancelReasonModels() {
        return null;
    }
    
    public final void setCancelReasonModels(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.trip.CancelReasonModel> p0) {
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
    public final android.widget.Spinner getSpinner() {
        return null;
    }
    
    public final void setSpinner(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getCancel_reason() {
        return null;
    }
    
    public final void setCancel_reason(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCancelreason() {
        return null;
    }
    
    public final void setCancelreason(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCancelmessage() {
        return null;
    }
    
    public final void setCancelmessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    protected final boolean isInternetAvailable() {
        return false;
    }
    
    protected final void setInternetAvailable(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.databinding.AppActivityCancelYourTripBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.databinding.AppActivityCancelYourTripBinding p0) {
    }
    
    public final void back() {
    }
    
    public final void cancelreservation() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void getCancelReason() {
    }
    
    /**
     * Cancel reason API called
     */
    public final void cancelTrip(@org.jetbrains.annotations.NotNull()
    java.lang.String tripid) {
    }
    
    /**
     * Cancel Scheduled ride API called
     */
    public final void cancelScheduleTrip(@org.jetbrains.annotations.NotNull()
    java.lang.String tripid) {
    }
    
    @java.lang.Override()
    public void onSuccess(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.datamodels.JsonResponse jsonResp, @org.jetbrains.annotations.NotNull()
    java.lang.String data) {
    }
    
    public final void cancelFunction(@org.jetbrains.annotations.NotNull()
    java.lang.String statusMsg) {
    }
    
    private final void onSuccessCancelReason(com.newtaxiprime.user.appcommon.datamodels.JsonResponse jsonResp) {
    }
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.datamodels.JsonResponse jsonResp, @org.jetbrains.annotations.NotNull()
    java.lang.String data) {
    }
    
    /**
     * Get notification from Firebase broadcast
     */
    public final void receivePushNotification() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
}