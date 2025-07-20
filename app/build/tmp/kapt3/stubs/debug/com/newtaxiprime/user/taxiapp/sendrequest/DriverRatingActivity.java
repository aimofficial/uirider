package com.newtaxiprime.user.taxiapp.sendrequest;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u0090\u00012\u00020\u00012\u00020\u0002:\u0002\u0090\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010}\u001a\u00020~H\u0007J\b\u0010\u007f\u001a\u00020~H\u0016J\u0015\u0010\u0080\u0001\u001a\u00020~2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001H\u0014J\u001c\u0010\u0083\u0001\u001a\u00020~2\b\u0010\u0084\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0086\u0001\u001a\u00020/H\u0016J\t\u0010\u0087\u0001\u001a\u00020~H\u0014J\u001c\u0010\u0088\u0001\u001a\u00020~2\b\u0010\u0084\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0086\u0001\u001a\u00020/H\u0016J\u0011\u0010\u0089\u0001\u001a\u00020~2\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001J\u0007\u0010\u008a\u0001\u001a\u00020~J\t\u0010\u008b\u0001\u001a\u00020~H\u0007J\t\u0010\u008c\u0001\u001a\u00020~H\u0007J\u0019\u0010\u008d\u0001\u001a\u00020~2\u0007\u0010\u008e\u0001\u001a\u00020P2\u0007\u0010\u008f\u0001\u001a\u00020/R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010(\u001a\u00020)X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0004\u0018\u000101X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u00106\u001a\u0002078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010<\u001a\u00020=8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020CX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010D\"\u0004\bE\u0010FR\u000e\u0010G\u001a\u00020HX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010I\u001a\u00020=8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010?\"\u0004\bK\u0010AR\u001a\u0010L\u001a\u00020=X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010?\"\u0004\bN\u0010AR\u000e\u0010O\u001a\u00020PX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010Q\u001a\u00020R8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001e\u0010W\u001a\u00020X8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001e\u0010]\u001a\u00020^8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001e\u0010c\u001a\u00020d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001c\u0010i\u001a\u0004\u0018\u00010\u0011X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0013\"\u0004\bk\u0010\u0015R\u001c\u0010l\u001a\u0004\u0018\u00010=X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010?\"\u0004\bn\u0010AR\u001e\u0010o\u001a\u00020R8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010T\"\u0004\bq\u0010VR\u001e\u0010r\u001a\u00020R8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010T\"\u0004\bt\u0010VR\u001c\u0010u\u001a\u0004\u0018\u00010RX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010T\"\u0004\bw\u0010VR\u001a\u0010x\u001a\u00020/X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|\u00a8\u0006\u0091\u0001"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/sendrequest/DriverRatingActivity;", "Lcom/newtaxiprime/user/appcommon/views/CommonActivity;", "Lcom/newtaxiprime/user/appcommon/interfaces/ServiceListener;", "()V", "apiService", "Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;", "getApiService", "()Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;", "setApiService", "(Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;)V", "bottomSheetDialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "getBottomSheetDialog", "()Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "setBottomSheetDialog", "(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V", "button", "Landroid/widget/Button;", "getButton", "()Landroid/widget/Button;", "setButton", "(Landroid/widget/Button;)V", "commonMethods", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "getCommonMethods", "()Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "setCommonMethods", "(Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;)V", "commonprofile", "Landroid/view/View;", "getCommonprofile", "()Landroid/view/View;", "setCommonprofile", "(Landroid/view/View;)V", "customDialog", "Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;", "getCustomDialog", "()Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;", "setCustomDialog", "(Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;)V", "dialog", "Landroidx/appcompat/app/AlertDialog;", "getDialog", "()Landroidx/appcompat/app/AlertDialog;", "setDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "driverTipsAmount", "", "ed_trip_amount", "Landroid/widget/EditText;", "getEd_trip_amount$app_debug", "()Landroid/widget/EditText;", "setEd_trip_amount$app_debug", "(Landroid/widget/EditText;)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "imgv_tip", "Landroid/widget/ImageView;", "getImgv_tip", "()Landroid/widget/ImageView;", "setImgv_tip", "(Landroid/widget/ImageView;)V", "isInternetAvailable", "", "()Z", "setInternetAvailable", "(Z)V", "mLastClickTime", "", "profileImage", "getProfileImage", "setProfileImage", "profile_image1", "getProfile_image1", "setProfile_image1", "ratingRate", "", "ridercomments", "Landroid/widget/TextView;", "getRidercomments", "()Landroid/widget/TextView;", "setRidercomments", "(Landroid/widget/TextView;)V", "riderrate", "Landroid/widget/RatingBar;", "getRiderrate", "()Landroid/widget/RatingBar;", "setRiderrate", "(Landroid/widget/RatingBar;)V", "rl_driver_tip", "Landroid/widget/RelativeLayout;", "getRl_driver_tip", "()Landroid/widget/RelativeLayout;", "setRl_driver_tip", "(Landroid/widget/RelativeLayout;)V", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "setTripAmount", "getSetTripAmount$app_debug", "setSetTripAmount$app_debug", "trip_layout_close", "getTrip_layout_close$app_debug", "setTrip_layout_close$app_debug", "tvCovidFeature", "getTvCovidFeature", "setTvCovidFeature", "tv_tip_text", "getTv_tip_text", "setTv_tip_text", "tv_tripAmountsymbol", "getTv_tripAmountsymbol$app_debug", "setTv_tripAmountsymbol$app_debug", "user_thumb_image", "getUser_thumb_image$app_debug", "()Ljava/lang/String;", "setUser_thumb_image$app_debug", "(Ljava/lang/String;)V", "img_close", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFailure", "jsonResp", "Lcom/newtaxiprime/user/appcommon/datamodels/JsonResponse;", "data", "onResume", "onSuccess", "onSuccessRating", "openBottomSheetToEnterTipsAmount", "skip", "submit", "submitRating", "rating", "ridercomment", "Companion", "app_debug"})
public final class DriverRatingActivity extends com.newtaxiprime.user.appcommon.views.CommonActivity implements com.newtaxiprime.user.appcommon.interfaces.ServiceListener {
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
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.rider_rating)
    public android.widget.RatingBar riderrate;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.rider_comments)
    public android.widget.TextView ridercomments;
    private boolean isInternetAvailable = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String driverTipsAmount = "";
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.tv_tip_text)
    public android.widget.TextView tv_tip_text;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.imgv_tip)
    public android.widget.ImageView imgv_tip;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.rl_driver_tip)
    public android.widget.RelativeLayout rl_driver_tip;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.common_profile)
    public android.view.View commonprofile;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.profile_image1)
    public android.widget.ImageView profileImage;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.tv_covid_feature)
    public android.widget.TextView tvCovidFeature;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView tv_tripAmountsymbol;
    @org.jetbrains.annotations.Nullable()
    private android.widget.EditText ed_trip_amount;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button setTripAmount;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageView trip_layout_close;
    private float ratingRate = 0.0F;
    public android.widget.ImageView profile_image1;
    public com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog;
    public java.lang.String user_thumb_image;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.rate_submit)
    public android.widget.Button button;
    private long mLastClickTime = 0L;
    private static boolean istripamount = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.newtaxiprime.user.taxiapp.sendrequest.DriverRatingActivity.Companion Companion = null;
    
    public DriverRatingActivity() {
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
    public final android.widget.RatingBar getRiderrate() {
        return null;
    }
    
    public final void setRiderrate(@org.jetbrains.annotations.NotNull()
    android.widget.RatingBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getRidercomments() {
        return null;
    }
    
    public final void setRidercomments(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    protected final boolean isInternetAvailable() {
        return false;
    }
    
    protected final void setInternetAvailable(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTv_tip_text() {
        return null;
    }
    
    public final void setTv_tip_text(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getImgv_tip() {
        return null;
    }
    
    public final void setImgv_tip(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getRl_driver_tip() {
        return null;
    }
    
    public final void setRl_driver_tip(@org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getCommonprofile() {
        return null;
    }
    
    public final void setCommonprofile(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getProfileImage() {
        return null;
    }
    
    public final void setProfileImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvCovidFeature() {
        return null;
    }
    
    public final void setTvCovidFeature(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getTv_tripAmountsymbol$app_debug() {
        return null;
    }
    
    public final void setTv_tripAmountsymbol$app_debug(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.EditText getEd_trip_amount$app_debug() {
        return null;
    }
    
    public final void setEd_trip_amount$app_debug(@org.jetbrains.annotations.Nullable()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getSetTripAmount$app_debug() {
        return null;
    }
    
    public final void setSetTripAmount$app_debug(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageView getTrip_layout_close$app_debug() {
        return null;
    }
    
    public final void setTrip_layout_close$app_debug(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getProfile_image1() {
        return null;
    }
    
    public final void setProfile_image1(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.bottomsheet.BottomSheetDialog getBottomSheetDialog() {
        return null;
    }
    
    public final void setBottomSheetDialog(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomsheet.BottomSheetDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUser_thumb_image$app_debug() {
        return null;
    }
    
    public final void setUser_thumb_image$app_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @butterknife.OnClick(value = {com.newtaxiprime.user.R.id.rl_driver_tip})
    public final void img_close() {
    }
    
    @butterknife.OnClick(value = {com.newtaxiprime.user.R.id.rate_submit})
    public final void submit() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getButton() {
        return null;
    }
    
    public final void setButton(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @butterknife.OnClick(value = {com.newtaxiprime.user.R.id.rl_driver_tip})
    public final void skip() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Submit rating API called
     */
    public final void submitRating(float rating, @org.jetbrains.annotations.NotNull()
    java.lang.String ridercomment) {
    }
    
    @java.lang.Override()
    protected void onResume() {
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
    
    public final void onSuccessRating(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.datamodels.JsonResponse jsonResp) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public final void openBottomSheetToEnterTipsAmount() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/sendrequest/DriverRatingActivity$Companion;", "", "()V", "istripamount", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}