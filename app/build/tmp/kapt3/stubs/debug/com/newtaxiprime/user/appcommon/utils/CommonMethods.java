package com.newtaxiprime.user.appcommon.utils;

/**
 * ***************************************************************
 * CommonMethods
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 s2\u00020\u0001:\u0002stB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010&\u001a\u00020\u001f2\b\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0006\u0010.\u001a\u00020\u001fJ\u000e\u0010/\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"J\u000e\u00100\u001a\u0002012\u0006\u0010\u0006\u001a\u00020\u0007J\b\u00102\u001a\u0004\u0018\u00010\u0004J\u0006\u00103\u001a\u00020\u0004J\u0016\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u0002062\u0006\u0010!\u001a\u000207J\u000e\u00108\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u00109\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020<H\u0002J\u0006\u0010=\u001a\u00020\u0004J\u001e\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u0001J\u0018\u0010B\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\u00072\u0006\u0010C\u001a\u00020<H\u0002J:\u0010D\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040Ej\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`F2\u0006\u0010G\u001a\u00020H2\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010JJ\u0016\u0010K\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020M2\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010N\u001a\u00020\u001fJ\u0006\u0010O\u001a\u00020\u001fJ\u0010\u0010P\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010Q\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010R\u001a\u00020H2\b\u0010S\u001a\u0004\u0018\u00010\u0001J\u0010\u0010T\u001a\u00020H2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0006\u0010U\u001a\u00020HJ\u0016\u0010V\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\u001dJ\u0010\u0010X\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010Y\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010Z\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010[\u001a\u00020\u001f2\u0006\u0010\\\u001a\u00020\u00042\u0006\u0010]\u001a\u00020^J\"\u0010_\u001a\u00020\u001f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010`\u001a\u0004\u0018\u0001012\u0006\u0010a\u001a\u00020\u0004J\u000e\u0010b\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010b\u001a\u00020\u001f2\b\u0010c\u001a\u0004\u0018\u0001072\b\u0010d\u001a\u0004\u0018\u00010eJ$\u0010f\u001a\u00020\u001f2\b\u0010c\u001a\u0004\u0018\u0001072\b\u0010d\u001a\u0004\u0018\u00010e2\b\b\u0002\u0010g\u001a\u00020\u0004J\u0010\u0010h\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010i\u001a\u0004\u0018\u00010\u001bJ\u000e\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020\u0004J\u001a\u0010m\u001a\u0004\u0018\u00010\u00072\u0006\u0010n\u001a\u00020\u00042\b\u0010o\u001a\u0004\u0018\u00010\u0007J\u001a\u0010p\u001a\u0004\u0018\u00010q2\b\b\u0001\u0010r\u001a\u00020<2\u0006\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006u"}, d2 = {"Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "mFirebaseDatabase", "Lcom/google/firebase/database/DatabaseReference;", "mProgressDialog", "Landroid/app/Dialog;", "getMProgressDialog", "()Landroid/app/Dialog;", "setMProgressDialog", "(Landroid/app/Dialog;)V", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "stripe", "Lcom/stripe/android/Stripe;", "cameraFilePath", "Ljava/io/File;", "cameraIntent", "", "imageFile", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "clearFileCache", "path", "clearImageCacheWhenAppOpens", "copyStream", "input", "Ljava/io/InputStream;", "output", "Ljava/io/FileOutputStream;", "createPaymentIntentParams", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "clientSecret", "dismissDialog", "galleryIntent", "getAlertDialog", "Landroidx/appcompat/app/AlertDialog;", "getAuthId", "getAuthType", "getClientSecret", "jsonResponse", "Lcom/newtaxiprime/user/appcommon/datamodels/JsonResponse;", "Lcom/newtaxiprime/user/appcommon/views/CommonActivity;", "getDefaultFileName", "getDialog", "mContext", "mLayout", "", "getFireBaseToken", "getJsonValue", "jsonString", "key", "object", "getLoadingDialog", "mLay", "getRiderProfile", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "isFilterUpdate", "", "isUpdateFilter", "Ljava/util/LinkedHashSet;", "handleDataMessage", "json", "Lorg/json/JSONObject;", "hideProgressDialog", "hideProgressDialogPaypal", "initSinchService", "initStripeData", "isNotEmpty", "s", "isOnline", "isProgressDialogShowing", "refreshGallery", "file", "removeChatNodesAfterCompletedTrip", "removeLiveTrackingNodesAfterCompletedTrip", "removeTripNodesAfterCompletedTrip", "setheaderText", "string", "view", "Lcom/newtaxiprime/user/appcommon/custompalette/FontTextView;", "showMessage", "dialog", "msg", "showProgressDialog", "mActivity", "customDialog", "Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;", "showProgressDialogPaypal", "message", "stopSinchService", "stripeInstance", "threeDSecureRequest", "Lcom/braintreepayments/api/models/ThreeDSecureRequest;", "amount", "updateLocale", "languageCode", "newBase", "vectorToBitmap", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "id", "Companion", "INoInternetCustomAlertCallback", "app_debug"})
public final class CommonMethods {
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager;
    public android.content.Context context;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.DatabaseReference mFirebaseDatabase;
    private final java.lang.String TAG = null;
    public android.app.Dialog mProgressDialog;
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.Stripe stripe;
    @org.jetbrains.annotations.Nullable()
    private static android.widget.PopupWindow popupWindow;
    @org.jetbrains.annotations.Nullable()
    private static com.newtaxiprime.user.taxiapp.views.customize.CustomDialog progressDialog;
    @org.jetbrains.annotations.Nullable()
    private static com.newtaxiprime.user.taxiapp.views.customize.CustomDialog progressDialogPaypal;
    @org.jetbrains.annotations.NotNull()
    public static final com.newtaxiprime.user.appcommon.utils.CommonMethods.Companion Companion = null;
    
    public CommonMethods() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.configs.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.configs.SessionManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Dialog getMProgressDialog() {
        return null;
    }
    
    public final void setMProgressDialog(@org.jetbrains.annotations.NotNull()
    android.app.Dialog p0) {
    }
    
    public final void showProgressDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final android.app.Dialog getDialog(android.content.Context mContext, int mLayout) {
        return null;
    }
    
    public final void hideProgressDialog() {
    }
    
    public final void dismissDialog() {
    }
    
    private final android.app.Dialog getLoadingDialog(android.content.Context mContext, int mLay) {
        return null;
    }
    
    public final void showProgressDialog(@org.jetbrains.annotations.Nullable()
    com.newtaxiprime.user.appcommon.views.CommonActivity mActivity, @org.jetbrains.annotations.Nullable()
    com.newtaxiprime.user.taxiapp.views.customize.CustomDialog customDialog) {
    }
    
    public final void showProgressDialogPaypal(@org.jetbrains.annotations.Nullable()
    com.newtaxiprime.user.appcommon.views.CommonActivity mActivity, @org.jetbrains.annotations.Nullable()
    com.newtaxiprime.user.taxiapp.views.customize.CustomDialog customDialog, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void hideProgressDialogPaypal() {
    }
    
    public final boolean isProgressDialogShowing() {
        return false;
    }
    
    public final void showMessage(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog dialog, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.app.AlertDialog getAlertDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getDefaultFileName(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final boolean isNotEmpty(@org.jetbrains.annotations.Nullable()
    java.lang.Object s) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File cameraFilePath(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void refreshGallery(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.io.File file) {
    }
    
    public final void clearFileCache(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    public final boolean isOnline(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getJsonValue(@org.jetbrains.annotations.NotNull()
    java.lang.String jsonString, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.Object object) {
        return null;
    }
    
    /**
     * This ThreeDSecureRequest for Custom Ui
     * It may differ for Custom UI
     * @return ThreeDSecureRequest For 3D Secure
     */
    @org.jetbrains.annotations.NotNull()
    public final com.braintreepayments.api.models.ThreeDSecureRequest threeDSecureRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String amount) {
        return null;
    }
    
    private final void stopSinchService(android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFireBaseToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAuthType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAuthId() {
        return null;
    }
    
    public final void removeLiveTrackingNodesAfterCompletedTrip(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void removeChatNodesAfterCompletedTrip(android.content.Context context) {
    }
    
    public final void removeTripNodesAfterCompletedTrip(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * init Stripe
     */
    public final void initStripeData(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Stripe Instance
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.Stripe stripeInstance() {
        return null;
    }
    
    /**
     * Get Client Secret From Response
     */
    public final void getClientSecret(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.datamodels.JsonResponse jsonResponse, @org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.views.CommonActivity activity) {
    }
    
    public final void handleDataMessage(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject json, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void initSinchService(android.content.Context context) {
    }
    
    /**
     * Create a Payment to Start Payment Process
     */
    private final com.stripe.android.model.ConfirmPaymentIntentParams createPaymentIntentParams(java.lang.String clientSecret, android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, java.lang.String> getRiderProfile(boolean isFilterUpdate, @org.jetbrains.annotations.Nullable()
    java.util.LinkedHashSet<java.lang.Integer> isUpdateFilter) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context updateLocale(@org.jetbrains.annotations.NotNull()
    java.lang.String languageCode, @org.jetbrains.annotations.Nullable()
    android.content.Context newBase) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.BitmapDescriptor vectorToBitmap(@androidx.annotation.DrawableRes()
    int id, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void setheaderText(@org.jetbrains.annotations.NotNull()
    java.lang.String string, @org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.custompalette.FontTextView view) {
    }
    
    public final void cameraIntent(@org.jetbrains.annotations.NotNull()
    java.io.File imageFile, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity) {
    }
    
    public final void galleryIntent(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity) {
    }
    
    /**
     * Input output Stream
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public final void copyStream(@org.jetbrains.annotations.Nullable()
    java.io.InputStream input, @org.jetbrains.annotations.NotNull()
    java.io.FileOutputStream output) throws java.io.IOException {
    }
    
    public final void clearImageCacheWhenAppOpens(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004J\u0016\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004J\u001e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cJ\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004J\u0016\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u0004J\u0016\u0010\"\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!2\u0006\u0010#\u001a\u00020\u0004J\u0006\u0010$\u001a\u00020\u0004J\u0016\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,J\u001a\u0010.\u001a\u00020/2\n\u00100\u001a\u0006\u0012\u0002\b\u0003012\u0006\u0010 \u001a\u00020!J\u000e\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u00020!J\u0006\u00104\u001a\u00020\u0017J\u000e\u00105\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!J\u0016\u00106\u001a\u00020\u00172\u0006\u00103\u001a\u00020!2\u0006\u00107\u001a\u000208J\u000e\u00109\u001a\u00020\u00172\u0006\u00103\u001a\u00020!J\u0016\u0010:\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u0004J\u0016\u0010:\u001a\u00020\u00172\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0019\u001a\u00020\u0004J\u0010\u0010:\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004J\u000e\u0010=\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,J\u000e\u0010>\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,J\u000e\u0010?\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!J\u000e\u0010@\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!J\u000e\u0010A\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012\u00a8\u0006B"}, d2 = {"Lcom/newtaxiprime/user/appcommon/utils/CommonMethods$Companion;", "", "()V", "appPackageName", "", "getAppPackageName", "()Ljava/lang/String;", "popupWindow", "Landroid/widget/PopupWindow;", "getPopupWindow", "()Landroid/widget/PopupWindow;", "setPopupWindow", "(Landroid/widget/PopupWindow;)V", "progressDialog", "Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;", "getProgressDialog", "()Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;", "setProgressDialog", "(Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;)V", "progressDialogPaypal", "getProgressDialogPaypal", "setProgressDialogPaypal", "DebuggableLogD", "", "tag", "message", "DebuggableLogE", "tr", "", "DebuggableLogI", "DebuggableLogV", "DebuggableToast", "mContext", "Landroid/content/Context;", "copyContentToClipboard", "textToBeCopied", "getAppVersionNameFromGradle", "getCardImage", "Landroid/graphics/drawable/Drawable;", "brand", "getRes", "Landroid/content/res/Resources;", "gotoMainActivityFromChatActivity", "mActivity", "Landroid/app/Activity;", "gotoMainActivityWithoutHistory", "isMyBackgroundServiceRunning", "", "serviceClass", "Ljava/lang/Class;", "openPlayStore", "context", "playVibration", "showInternetNotAvailableForStoredDataViewer", "showNoInternetAlert", "iNoInternetCustomAlertCallBack", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods$INoInternetCustomAlertCallback;", "showServerInternalErrorMessage", "showUserMessage", "view", "Landroid/view/View;", "startChatActivityFrom", "startFirebaseChatListenerService", "startSinchService", "stopFirebaseChatListenerService", "stopSinchService", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.PopupWindow getPopupWindow() {
            return null;
        }
        
        public final void setPopupWindow(@org.jetbrains.annotations.Nullable()
        android.widget.PopupWindow p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.newtaxiprime.user.taxiapp.views.customize.CustomDialog getProgressDialog() {
            return null;
        }
        
        public final void setProgressDialog(@org.jetbrains.annotations.Nullable()
        com.newtaxiprime.user.taxiapp.views.customize.CustomDialog p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.newtaxiprime.user.taxiapp.views.customize.CustomDialog getProgressDialogPaypal() {
            return null;
        }
        
        public final void setProgressDialogPaypal(@org.jetbrains.annotations.Nullable()
        com.newtaxiprime.user.taxiapp.views.customize.CustomDialog p0) {
        }
        
        public final void gotoMainActivityWithoutHistory(@org.jetbrains.annotations.NotNull()
        android.app.Activity mActivity) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.drawable.Drawable getCardImage(@org.jetbrains.annotations.NotNull()
        java.lang.String brand, @org.jetbrains.annotations.NotNull()
        android.content.res.Resources getRes) {
            return null;
        }
        
        public final void startChatActivityFrom(@org.jetbrains.annotations.NotNull()
        android.app.Activity mActivity) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAppVersionNameFromGradle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAppPackageName() {
            return null;
        }
        
        public final void DebuggableLogE(@org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
        
        public final void DebuggableLogE(@org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable tr) {
        }
        
        public final void DebuggableLogI(@org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.Nullable()
        java.lang.String message) {
        }
        
        public final void DebuggableLogD(@org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
        
        public final void DebuggableLogV(@org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
        
        public final void DebuggableToast(@org.jetbrains.annotations.NotNull()
        android.content.Context mContext, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
        
        public final void showUserMessage(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
        
        public final void showUserMessage(@org.jetbrains.annotations.NotNull()
        android.content.Context mContext, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
        
        public final void gotoMainActivityFromChatActivity(@org.jetbrains.annotations.NotNull()
        android.app.Activity mActivity) {
        }
        
        public final void startFirebaseChatListenerService(@org.jetbrains.annotations.NotNull()
        android.app.Activity mActivity) {
        }
        
        public final void stopFirebaseChatListenerService(@org.jetbrains.annotations.NotNull()
        android.content.Context mContext) {
        }
        
        public final boolean isMyBackgroundServiceRunning(@org.jetbrains.annotations.NotNull()
        java.lang.Class<?> serviceClass, @org.jetbrains.annotations.NotNull()
        android.content.Context mContext) {
            return false;
        }
        
        public final void showUserMessage(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
        }
        
        public final void showServerInternalErrorMessage(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        public final void copyContentToClipboard(@org.jetbrains.annotations.NotNull()
        android.content.Context mContext, @org.jetbrains.annotations.NotNull()
        java.lang.String textToBeCopied) {
        }
        
        public final void openPlayStore(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        public final void playVibration() {
        }
        
        public final void startSinchService(@org.jetbrains.annotations.NotNull()
        android.content.Context mContext) {
        }
        
        public final void stopSinchService(@org.jetbrains.annotations.NotNull()
        android.content.Context mContext) {
        }
        
        public final void showInternetNotAvailableForStoredDataViewer(@org.jetbrains.annotations.NotNull()
        android.content.Context mContext) {
        }
        
        public final void showNoInternetAlert(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.newtaxiprime.user.appcommon.utils.CommonMethods.INoInternetCustomAlertCallback iNoInternetCustomAlertCallBack) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/newtaxiprime/user/appcommon/utils/CommonMethods$INoInternetCustomAlertCallback;", "", "onOkayClicked", "", "onRetryClicked", "app_debug"})
    public static abstract interface INoInternetCustomAlertCallback {
        
        public abstract void onOkayClicked();
        
        public abstract void onRetryClicked();
    }
}