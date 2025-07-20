package com.newtaxiprime.user.taxiapp.adapters;

/**
 * Created by Seen Technologies on 7/11/18.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0001TB\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010>\u001a\u00020?H\u0002J\u0006\u0010@\u001a\u00020?J\b\u0010A\u001a\u00020BH\u0016J\u001c\u0010C\u001a\u00020?2\n\u0010D\u001a\u00060\u0002R\u00020\u00002\u0006\u0010E\u001a\u00020BH\u0016J\u001c\u0010F\u001a\u00060\u0002R\u00020\u00002\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020BH\u0016J\u0018\u0010J\u001a\u00020?2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u000bH\u0016J\u0018\u0010N\u001a\u00020?2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u000bH\u0016J\u0010\u0010O\u001a\u00020?2\u0006\u0010K\u001a\u00020LH\u0002J\u0006\u0010P\u001a\u00020?J\u0010\u0010P\u001a\u00020?2\u0006\u0010E\u001a\u00020BH\u0002J\u0010\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020RH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R\u000e\u0010/\u001a\u000200X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b03X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u00106\u001a\u0002078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006U"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/adapters/UpcomingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/newtaxiprime/user/taxiapp/adapters/UpcomingAdapter$ViewHolder;", "Lcom/newtaxiprime/user/appcommon/interfaces/ServiceListener;", "scheduleRideDetailsArrayList", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/taxiapp/datamodels/trip/ScheduleDetail;", "context", "Lcom/newtaxiprime/user/appcommon/views/CommonActivity;", "(Ljava/util/ArrayList;Lcom/newtaxiprime/user/appcommon/views/CommonActivity;)V", "ScheduleRidedate", "", "apiService", "Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;", "getApiService", "()Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;", "setApiService", "(Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;)V", "commonMethods", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "getCommonMethods", "()Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "setCommonMethods", "(Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;)V", "customDialog", "Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;", "getCustomDialog", "()Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;", "setCustomDialog", "(Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;)V", "dialog", "Landroidx/appcompat/app/AlertDialog;", "getDialog", "()Landroidx/appcompat/app/AlertDialog;", "setDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "isInternetAvailable", "", "()Z", "setInternetAvailable", "(Z)V", "mLastClickTime", "", "presenttime", "scheduleHashMap", "Ljava/util/HashMap;", "scheduleridetext", "Landroid/widget/TextView;", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "singleDateAndTimePicker", "Lcom/newtaxiprime/user/taxiapp/singledateandtimepicker/SingleDateAndTimePicker;", "ScheduleMethod", "", "dialogfunction", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "onFailure", "jsonResp", "Lcom/newtaxiprime/user/appcommon/datamodels/JsonResponse;", "data", "onSuccess", "onSuccessSchedule", "scheduleRide", "scheduleRideDate", "Ljava/util/Date;", "dateToSelect", "ViewHolder", "app_debug"})
public final class UpcomingAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.newtaxiprime.user.taxiapp.adapters.UpcomingAdapter.ViewHolder> implements com.newtaxiprime.user.appcommon.interfaces.ServiceListener {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.trip.ScheduleDetail> scheduleRideDetailsArrayList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.newtaxiprime.user.appcommon.views.CommonActivity context = null;
    private long mLastClickTime = 0L;
    @org.jetbrains.annotations.NotNull()
    private androidx.appcompat.app.AlertDialog dialog;
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
    private boolean isInternetAvailable = false;
    private java.util.HashMap<java.lang.String, java.lang.String> scheduleHashMap;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView scheduleridetext;
    @org.jetbrains.annotations.Nullable()
    private com.newtaxiprime.user.taxiapp.singledateandtimepicker.SingleDateAndTimePicker singleDateAndTimePicker;
    private java.lang.String presenttime;
    private java.lang.String ScheduleRidedate;
    
    public UpcomingAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.trip.ScheduleDetail> scheduleRideDetailsArrayList, @org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.views.CommonActivity context) {
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
    
    protected final boolean isInternetAvailable() {
        return false;
    }
    
    protected final void setInternetAvailable(boolean p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.newtaxiprime.user.taxiapp.adapters.UpcomingAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.adapters.UpcomingAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final void scheduleRide(int position) {
    }
    
    /**
     * To check wheather connected or not
     *
     * @return true connected false not connected
     */
    public final void dialogfunction() {
    }
    
    /**
     * Schedule a ride wheel picker
     */
    private final void ScheduleMethod() {
    }
    
    private final java.util.Date scheduleRideDate(java.util.Date dateToSelect) {
        return null;
    }
    
    /**
     * To call schedule ride edit api
     */
    public final void scheduleRide() {
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
    
    private final void onSuccessSchedule(com.newtaxiprime.user.appcommon.datamodels.JsonResponse jsonResp) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0017\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\b\u00a8\u0006\u0019"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/adapters/UpcomingAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/newtaxiprime/user/taxiapp/adapters/UpcomingAdapter;Landroid/view/View;)V", "amount", "Landroid/widget/TextView;", "getAmount", "()Landroid/widget/TextView;", "cancel", "getCancel", "cancel_lay", "Landroid/widget/LinearLayout;", "carType", "getCarType", "dateAndTime", "getDateAndTime", "destAdddress", "getDestAdddress", "edit", "getEdit", "pickUpAddress", "getPickUpAddress", "tripType", "getTripType", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView dateAndTime = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tripType = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView carType = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView amount = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView pickUpAddress = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView destAdddress = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView cancel = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView edit = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout cancel_lay = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDateAndTime() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTripType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCarType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getAmount() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPickUpAddress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDestAdddress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCancel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getEdit() {
            return null;
        }
    }
}