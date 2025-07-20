package com.newtaxiprime.user.taxiapp.sendrequest;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00f2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u00aa\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u00aa\u0001B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u008d\u0001\u001a\u00020\bH\u0016J\n\u0010\u008e\u0001\u001a\u00030\u008c\u0001H\u0016J\b\u0010\u008f\u0001\u001a\u00030\u008c\u0001J\b\u0010\u0090\u0001\u001a\u00030\u008c\u0001J\n\u0010\u0091\u0001\u001a\u00030\u008c\u0001H\u0002J\u0011\u0010\u0092\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u0093\u0001\u001a\u00020\bJ\b\u0010\u0094\u0001\u001a\u00030\u008c\u0001J\n\u0010\u0095\u0001\u001a\u00030\u008c\u0001H\u0016J\u0016\u0010\u0096\u0001\u001a\u00030\u008c\u00012\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u0001H\u0014J\n\u0010\u0099\u0001\u001a\u00030\u008c\u0001H\u0014J\u001d\u0010\u009a\u0001\u001a\u00030\u008c\u00012\b\u0010\u009b\u0001\u001a\u00030\u009c\u00012\u0007\u0010\u009d\u0001\u001a\u00020\bH\u0016J\u0013\u0010\u009e\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u009f\u0001\u001a\u00020RH\u0016J\n\u0010\u00a0\u0001\u001a\u00030\u008c\u0001H\u0016J\n\u0010\u00a1\u0001\u001a\u00030\u008c\u0001H\u0016J\u0014\u0010\u00a2\u0001\u001a\u00030\u008c\u00012\b\u0010\u00a3\u0001\u001a\u00030\u0098\u0001H\u0014J\u001d\u0010\u00a4\u0001\u001a\u00030\u008c\u00012\b\u0010\u009b\u0001\u001a\u00030\u009c\u00012\u0007\u0010\u009d\u0001\u001a\u00020\bH\u0016J\u0012\u0010\u00a5\u0001\u001a\u00030\u008c\u00012\b\u0010\u009b\u0001\u001a\u00030\u009c\u0001J\n\u0010\u00a6\u0001\u001a\u00030\u008c\u0001H\u0016J\b\u0010\u00a7\u0001\u001a\u00030\u008c\u0001J\u0013\u0010\u00a8\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u00a9\u0001\u001a\u000203H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\fR\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020\'8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u000e\u00102\u001a\u000203X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u00104\u001a\u0002058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020;X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020@X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020FX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR(\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010LX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001a\u0010Q\u001a\u00020RX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0010\u0010W\u001a\u0004\u0018\u00010XX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010Y\u001a\u00020ZX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0010\u0010_\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010`\u001a\u00020aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR \u0010f\u001a\b\u0012\u0004\u0012\u00020h0gX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001a\u0010m\u001a\u00020nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u001a\u0010s\u001a\u00020tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u001a\u0010y\u001a\u00020zX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R#\u0010\u007f\u001a\u00030\u0080\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R \u0010\u0085\u0001\u001a\u00030\u0086\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001\u00a8\u0006\u00ab\u0001"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/sendrequest/SendingRequestActivity;", "Lcom/newtaxiprime/user/appcommon/views/CommonActivity;", "Lio/github/krtkush/lineartimer/LinearTimer$TimerListener;", "Lcom/newtaxiprime/user/appcommon/interfaces/ServiceListener;", "Lcom/newtaxiprime/user/taxiapp/database/IFirebaseReqListener;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "JSON_DATA", "", "getJSON_DATA", "()Ljava/lang/String;", "setJSON_DATA", "(Ljava/lang/String;)V", "addFirebaseDatabase", "Lcom/newtaxiprime/user/taxiapp/database/AddFirebaseDatabase;", "apiService", "Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;", "getApiService", "()Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;", "setApiService", "(Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;)V", "binding", "Lcom/newtaxiprime/user/databinding/AppActivitySendingRequestBinding;", "carname", "getCarname", "setCarname", "carname_request", "Landroid/widget/TextView;", "getCarname_request", "()Landroid/widget/TextView;", "setCarname_request", "(Landroid/widget/TextView;)V", "commonMethods", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "getCommonMethods", "()Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "setCommonMethods", "(Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;)V", "customDialog", "Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;", "getCustomDialog", "()Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;", "setCustomDialog", "(Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;)V", "dialog", "Landroidx/appcompat/app/AlertDialog;", "getDialog", "()Landroidx/appcompat/app/AlertDialog;", "setDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "duration", "", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "isInternetAvailable", "", "()Z", "setInternetAvailable", "(Z)V", "linearTimer", "Lio/github/krtkush/lineartimer/LinearTimer;", "getLinearTimer", "()Lio/github/krtkush/lineartimer/LinearTimer;", "setLinearTimer", "(Lio/github/krtkush/lineartimer/LinearTimer;)V", "linearTimerView", "Lio/github/krtkush/lineartimer/LinearTimerView;", "getLinearTimerView", "()Lio/github/krtkush/lineartimer/LinearTimerView;", "setLinearTimerView", "(Lio/github/krtkush/lineartimer/LinearTimerView;)V", "locationHashMap", "Ljava/util/HashMap;", "getLocationHashMap", "()Ljava/util/HashMap;", "setLocationHashMap", "(Ljava/util/HashMap;)V", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "getMMap", "()Lcom/google/android/gms/maps/GoogleMap;", "setMMap", "(Lcom/google/android/gms/maps/GoogleMap;)V", "mRegistrationBroadcastReceiver", "Landroid/content/BroadcastReceiver;", "mapFragment", "Lcom/google/android/gms/maps/SupportMapFragment;", "getMapFragment", "()Lcom/google/android/gms/maps/SupportMapFragment;", "setMapFragment", "(Lcom/google/android/gms/maps/SupportMapFragment;)V", "overviewPolylines", "polylineOptions", "Lcom/google/android/gms/maps/model/PolylineOptions;", "getPolylineOptions", "()Lcom/google/android/gms/maps/model/PolylineOptions;", "setPolylineOptions", "(Lcom/google/android/gms/maps/model/PolylineOptions;)V", "polylinepoints", "Ljava/util/ArrayList;", "Lcom/google/android/gms/maps/model/LatLng;", "getPolylinepoints", "()Ljava/util/ArrayList;", "setPolylinepoints", "(Ljava/util/ArrayList;)V", "progressBar", "Lcom/newtaxiprime/user/appcommon/helper/CircularMusicProgressBar;", "getProgressBar", "()Lcom/newtaxiprime/user/appcommon/helper/CircularMusicProgressBar;", "setProgressBar", "(Lcom/newtaxiprime/user/appcommon/helper/CircularMusicProgressBar;)V", "request_receive_dialog_layout", "Landroid/widget/RelativeLayout;", "getRequest_receive_dialog_layout", "()Landroid/widget/RelativeLayout;", "setRequest_receive_dialog_layout", "(Landroid/widget/RelativeLayout;)V", "rl", "Lcom/newtaxiprime/user/taxiapp/RoundedLayout;", "getRl", "()Lcom/newtaxiprime/user/taxiapp/RoundedLayout;", "setRl", "(Lcom/newtaxiprime/user/taxiapp/RoundedLayout;)V", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "waveDrawable", "Lcom/newtaxiprime/user/appcommon/helper/WaveDrawable;", "getWaveDrawable", "()Lcom/newtaxiprime/user/appcommon/helper/WaveDrawable;", "setWaveDrawable", "(Lcom/newtaxiprime/user/appcommon/helper/WaveDrawable;)V", "RequestListener", "", "Tripid", "animationComplete", "cancel", "circularProgressfunction", "circulatLayoutFile", "getTripDetails", "tripId", "loadJSONDATA", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onFailure", "jsonResp", "Lcom/newtaxiprime/user/appcommon/datamodels/JsonResponse;", "data", "onMapReady", "googleMap", "onPause", "onResume", "onSaveInstanceState", "outState", "onSuccess", "onSuccessDriver", "onTimerReset", "requestReceive", "timerTick", "tickUpdateInMillis", "Companion", "app_debug"})
public final class SendingRequestActivity extends com.newtaxiprime.user.appcommon.views.CommonActivity implements io.github.krtkush.lineartimer.LinearTimer.TimerListener, com.newtaxiprime.user.appcommon.interfaces.ServiceListener, com.newtaxiprime.user.taxiapp.database.IFirebaseReqListener, com.google.android.gms.maps.OnMapReadyCallback {
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
    public android.widget.TextView carname_request;
    public com.newtaxiprime.user.appcommon.helper.CircularMusicProgressBar progressBar;
    public com.newtaxiprime.user.taxiapp.RoundedLayout rl;
    public com.google.android.gms.maps.GoogleMap mMap;
    public com.google.android.gms.maps.SupportMapFragment mapFragment;
    @org.jetbrains.annotations.NotNull()
    private com.google.android.gms.maps.model.PolylineOptions polylineOptions;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.google.android.gms.maps.model.LatLng> polylinepoints;
    public com.newtaxiprime.user.appcommon.helper.WaveDrawable waveDrawable;
    @org.jetbrains.annotations.Nullable()
    private java.util.HashMap<java.lang.String, java.lang.String> locationHashMap;
    public android.widget.RelativeLayout request_receive_dialog_layout;
    public io.github.krtkush.lineartimer.LinearTimerView linearTimerView;
    public io.github.krtkush.lineartimer.LinearTimer linearTimer;
    private com.newtaxiprime.user.databinding.AppActivitySendingRequestBinding binding;
    public java.lang.String JSON_DATA;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String overviewPolylines;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String carname;
    private boolean isInternetAvailable = false;
    private long duration = 120000L;
    @org.jetbrains.annotations.Nullable()
    private android.content.BroadcastReceiver mRegistrationBroadcastReceiver;
    @org.jetbrains.annotations.NotNull()
    private final com.newtaxiprime.user.taxiapp.database.AddFirebaseDatabase addFirebaseDatabase = null;
    @org.jetbrains.annotations.NotNull()
    private static com.newtaxiprime.user.taxiapp.datamodels.trip.TripDetailsModel tripDetailsModel;
    private static boolean isSendingRequestisLive = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.newtaxiprime.user.taxiapp.sendrequest.SendingRequestActivity.Companion Companion = null;
    
    public SendingRequestActivity() {
        super();
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
    public final android.widget.TextView getCarname_request() {
        return null;
    }
    
    public final void setCarname_request(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.helper.CircularMusicProgressBar getProgressBar() {
        return null;
    }
    
    public final void setProgressBar(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.helper.CircularMusicProgressBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.taxiapp.RoundedLayout getRl() {
        return null;
    }
    
    public final void setRl(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.RoundedLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.GoogleMap getMMap() {
        return null;
    }
    
    public final void setMMap(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.SupportMapFragment getMapFragment() {
        return null;
    }
    
    public final void setMapFragment(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.SupportMapFragment p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.PolylineOptions getPolylineOptions() {
        return null;
    }
    
    public final void setPolylineOptions(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.PolylineOptions p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.google.android.gms.maps.model.LatLng> getPolylinepoints() {
        return null;
    }
    
    public final void setPolylinepoints(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.google.android.gms.maps.model.LatLng> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.helper.WaveDrawable getWaveDrawable() {
        return null;
    }
    
    public final void setWaveDrawable(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.helper.WaveDrawable p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.HashMap<java.lang.String, java.lang.String> getLocationHashMap() {
        return null;
    }
    
    public final void setLocationHashMap(@org.jetbrains.annotations.Nullable()
    java.util.HashMap<java.lang.String, java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getRequest_receive_dialog_layout() {
        return null;
    }
    
    public final void setRequest_receive_dialog_layout(@org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.github.krtkush.lineartimer.LinearTimerView getLinearTimerView() {
        return null;
    }
    
    public final void setLinearTimerView(@org.jetbrains.annotations.NotNull()
    io.github.krtkush.lineartimer.LinearTimerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.github.krtkush.lineartimer.LinearTimer getLinearTimer() {
        return null;
    }
    
    public final void setLinearTimer(@org.jetbrains.annotations.NotNull()
    io.github.krtkush.lineartimer.LinearTimer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getJSON_DATA() {
        return null;
    }
    
    public final void setJSON_DATA(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCarname() {
        return null;
    }
    
    public final void setCarname(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    protected final boolean isInternetAvailable() {
        return false;
    }
    
    protected final void setInternetAvailable(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    public final void cancel() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void circulatLayoutFile() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    /**
     * Waiting for driver response to show the circular image
     */
    public final void circularProgressfunction() {
    }
    
    /**
     * After completed time for reqeust to stop animation
     */
    @java.lang.Override()
    public void animationComplete() {
    }
    
    /**
     * Loader timer for request
     */
    @java.lang.Override()
    public void timerTick(long tickUpdateInMillis) {
    }
    
    @java.lang.Override()
    public void onTimerReset() {
    }
    
    /**
     * Receive push notification
     */
    public final void requestReceive() {
    }
    
    /**
     * Load Trip details
     */
    public final void loadJSONDATA() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
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
    
    public final void onSuccessDriver(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.datamodels.JsonResponse jsonResp) {
    }
    
    /**
     * After driver accept the request to get driver details from the API
     */
    public final void getTripDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String tripId) {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @java.lang.Override()
    public void RequestListener(@org.jetbrains.annotations.NotNull()
    java.lang.String Tripid) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/sendrequest/SendingRequestActivity$Companion;", "", "()V", "isSendingRequestisLive", "", "()Z", "setSendingRequestisLive", "(Z)V", "tripDetailsModel", "Lcom/newtaxiprime/user/taxiapp/datamodels/trip/TripDetailsModel;", "getTripDetailsModel", "()Lcom/newtaxiprime/user/taxiapp/datamodels/trip/TripDetailsModel;", "setTripDetailsModel", "(Lcom/newtaxiprime/user/taxiapp/datamodels/trip/TripDetailsModel;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.newtaxiprime.user.taxiapp.datamodels.trip.TripDetailsModel getTripDetailsModel() {
            return null;
        }
        
        public final void setTripDetailsModel(@org.jetbrains.annotations.NotNull()
        com.newtaxiprime.user.taxiapp.datamodels.trip.TripDetailsModel p0) {
        }
        
        public final boolean isSendingRequestisLive() {
            return false;
        }
        
        public final void setSendingRequestisLive(boolean p0) {
        }
    }
}