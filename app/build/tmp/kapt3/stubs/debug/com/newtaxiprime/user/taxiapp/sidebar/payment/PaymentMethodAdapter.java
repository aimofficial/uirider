package com.newtaxiprime.user.taxiapp.sidebar.payment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u001e\u0010\u0005\u001a\u001a\u0012\b\u0012\u00060\u0007R\u00020\b0\u0006j\f\u0012\b\u0012\u00060\u0007R\u00020\b`\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u001a\u0012\b\u0012\u00060\u0007R\u00020\b0\u0006j\f\u0012\b\u0012\u00060\u0007R\u00020\b`\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006 "}, d2 = {"Lcom/newtaxiprime/user/taxiapp/sidebar/payment/PaymentMethodAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/newtaxiprime/user/taxiapp/sidebar/payment/PaymentMethodAdapter$PaymentViewHolder;", "context", "Landroid/content/Context;", "paymentlist", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/taxiapp/datamodels/PaymentMethodsModel$PaymentMethods;", "Lcom/newtaxiprime/user/taxiapp/datamodels/PaymentMethodsModel;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/newtaxiprime/user/taxiapp/sidebar/payment/PaymentMethodAdapter$ItemClickListener;", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/newtaxiprime/user/taxiapp/sidebar/payment/PaymentMethodAdapter$ItemClickListener;)V", "paymentmethodlist", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemClickListener", "PaymentViewHolder", "app_debug"})
public final class PaymentMethodAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.newtaxiprime.user.taxiapp.sidebar.payment.PaymentMethodAdapter.PaymentViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.PaymentMethodsModel.PaymentMethods> paymentlist;
    @org.jetbrains.annotations.NotNull()
    private com.newtaxiprime.user.taxiapp.sidebar.payment.PaymentMethodAdapter.ItemClickListener listener;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.PaymentMethodsModel> paymentmethodlist;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager;
    
    public PaymentMethodAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.PaymentMethodsModel.PaymentMethods> paymentlist, @org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.payment.PaymentMethodAdapter.ItemClickListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.configs.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.configs.SessionManager p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.newtaxiprime.user.taxiapp.sidebar.payment.PaymentMethodAdapter.PaymentViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.payment.PaymentMethodAdapter.PaymentViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/sidebar/payment/PaymentMethodAdapter$ItemClickListener;", "", "onItemClick", "", "app_debug"})
    public static abstract interface ItemClickListener {
        
        public abstract void onItemClick();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001c"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/sidebar/payment/PaymentMethodAdapter$PaymentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rowview", "Landroid/view/View;", "(Landroid/view/View;)V", "iv_default", "Landroid/widget/ImageView;", "getIv_default$app_debug", "()Landroid/widget/ImageView;", "setIv_default$app_debug", "(Landroid/widget/ImageView;)V", "iv_paymentIcon", "getIv_paymentIcon$app_debug", "setIv_paymentIcon$app_debug", "ll_payment", "Landroid/widget/RelativeLayout;", "getLl_payment$app_debug", "()Landroid/widget/RelativeLayout;", "setLl_payment$app_debug", "(Landroid/widget/RelativeLayout;)V", "getRowview", "()Landroid/view/View;", "tv_paymentname", "Landroid/widget/TextView;", "getTv_paymentname$app_debug", "()Landroid/widget/TextView;", "setTv_paymentname$app_debug", "(Landroid/widget/TextView;)V", "app_debug"})
    public static final class PaymentViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View rowview = null;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tv_paymentname;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView iv_paymentIcon;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView iv_default;
        @org.jetbrains.annotations.NotNull()
        private android.widget.RelativeLayout ll_payment;
        
        public PaymentViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View rowview) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getRowview() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTv_paymentname$app_debug() {
            return null;
        }
        
        public final void setTv_paymentname$app_debug(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIv_paymentIcon$app_debug() {
            return null;
        }
        
        public final void setIv_paymentIcon$app_debug(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIv_default$app_debug() {
            return null;
        }
        
        public final void setIv_default$app_debug(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RelativeLayout getLl_payment$app_debug() {
            return null;
        }
        
        public final void setLl_payment$app_debug(@org.jetbrains.annotations.NotNull()
        android.widget.RelativeLayout p0) {
        }
    }
}