package com.newtaxiprime.user.taxiapp.sendrequest;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010N\u001a\u00020OH\u0002J\b\u0010P\u001a\u00020OH\u0007J\b\u0010Q\u001a\u00020OH\u0016J\u0012\u0010R\u001a\u00020O2\b\u0010S\u001a\u0004\u0018\u00010TH\u0014J\u0018\u0010U\u001a\u00020O2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020)H\u0016J\b\u0010Y\u001a\u00020OH\u0014J\u0018\u0010Z\u001a\u00020O2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020)H\u0016J\b\u0010[\u001a\u00020OH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R&\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010/\u001a\b\u0012\u0004\u0012\u00020100X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R\u001e\u00109\u001a\u00020:8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010?\u001a\u00020@8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001e\u0010E\u001a\u00020F8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001e\u0010K\u001a\u00020F8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010H\"\u0004\bM\u0010J\u00a8\u0006\\"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/sendrequest/DriverNotAcceptActivity;", "Lcom/newtaxiprime/user/appcommon/views/CommonActivity;", "Lcom/newtaxiprime/user/appcommon/interfaces/ServiceListener;", "()V", "apiService", "Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;", "getApiService", "()Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;", "setApiService", "(Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;)V", "commonMethods", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "getCommonMethods", "()Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "setCommonMethods", "(Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;)V", "dialog", "Landroidx/appcompat/app/AlertDialog;", "getDialog", "()Landroidx/appcompat/app/AlertDialog;", "setDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "drivernotaccept_back", "Landroid/widget/ImageView;", "getDrivernotaccept_back", "()Landroid/widget/ImageView;", "setDrivernotaccept_back", "(Landroid/widget/ImageView;)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "isInternetAvailable", "", "()Z", "setInternetAvailable", "(Z)V", "locationHashMap", "Ljava/util/HashMap;", "", "getLocationHashMap", "()Ljava/util/HashMap;", "setLocationHashMap", "(Ljava/util/HashMap;)V", "overviewPolylines", "polylinepoints", "Ljava/util/ArrayList;", "Lcom/google/android/gms/maps/model/LatLng;", "getPolylinepoints", "()Ljava/util/ArrayList;", "setPolylinepoints", "(Ljava/util/ArrayList;)V", "requestSend", "getRequestSend", "setRequestSend", "rlt_contact_admin", "Landroid/widget/RelativeLayout;", "getRlt_contact_admin", "()Landroid/widget/RelativeLayout;", "setRlt_contact_admin", "(Landroid/widget/RelativeLayout;)V", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "try_again", "Landroid/widget/TextView;", "getTry_again", "()Landroid/widget/TextView;", "setTry_again", "(Landroid/widget/TextView;)V", "tv_call", "getTv_call", "setTv_call", "activityBackPressHandler", "", "callAdmin", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFailure", "jsonResp", "Lcom/newtaxiprime/user/appcommon/datamodels/JsonResponse;", "data", "onResume", "onSuccess", "sendRequest", "app_debug"})
public final class DriverNotAcceptActivity extends com.newtaxiprime.user.appcommon.views.CommonActivity implements com.newtaxiprime.user.appcommon.interfaces.ServiceListener {
    public androidx.appcompat.app.AlertDialog dialog;
    private boolean requestSend = false;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.utils.CommonMethods commonMethods;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.interfaces.ApiService apiService;
    @javax.inject.Inject()
    public com.google.gson.Gson gson;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.try_again)
    public android.widget.TextView try_again;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.drivernotaccept_back)
    public android.widget.ImageView drivernotaccept_back;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String overviewPolylines = "";
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.tv_call)
    public android.widget.TextView tv_call;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.google.android.gms.maps.model.LatLng> polylinepoints;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.rlt_contact_admin)
    public android.widget.RelativeLayout rlt_contact_admin;
    public java.util.HashMap<java.lang.String, java.lang.String> locationHashMap;
    private boolean isInternetAvailable = false;
    
    public DriverNotAcceptActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.app.AlertDialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    public final boolean getRequestSend() {
        return false;
    }
    
    public final void setRequestSend(boolean p0) {
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
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    public final void setGson(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTry_again() {
        return null;
    }
    
    public final void setTry_again(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getDrivernotaccept_back() {
        return null;
    }
    
    public final void setDrivernotaccept_back(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTv_call() {
        return null;
    }
    
    public final void setTv_call(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.google.android.gms.maps.model.LatLng> getPolylinepoints() {
        return null;
    }
    
    public final void setPolylinepoints(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.google.android.gms.maps.model.LatLng> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getRlt_contact_admin() {
        return null;
    }
    
    public final void setRlt_contact_admin(@org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, java.lang.String> getLocationHashMap() {
        return null;
    }
    
    public final void setLocationHashMap(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> p0) {
    }
    
    protected final boolean isInternetAvailable() {
        return false;
    }
    
    protected final void setInternetAvailable(boolean p0) {
    }
    
    @butterknife.OnClick(value = {com.newtaxiprime.user.R.id.rlt_contact_admin})
    public final void callAdmin() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Send car request to rider again
     */
    private final void sendRequest() {
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
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void activityBackPressHandler() {
    }
}