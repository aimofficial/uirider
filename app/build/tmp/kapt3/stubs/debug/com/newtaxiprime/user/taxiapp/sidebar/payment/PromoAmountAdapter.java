package com.newtaxiprime.user.taxiapp.sidebar.payment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001 B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u001c\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006!"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/sidebar/payment/PromoAmountAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/newtaxiprime/user/taxiapp/sidebar/payment/PromoAmountAdapter$ViewHolder;", "promodetailarraylist", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/taxiapp/sidebar/payment/PromoAmountModel;", "context", "Landroid/content/Context;", "(Ljava/util/ArrayList;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getPromodetailarraylist", "()Ljava/util/ArrayList;", "setPromodetailarraylist", "(Ljava/util/ArrayList;)V", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "getItemCount", "", "onBindViewHolder", "", "viewHolder", "i", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "ViewHolder", "app_debug"})
public final class PromoAmountAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.newtaxiprime.user.taxiapp.sidebar.payment.PromoAmountAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.newtaxiprime.user.taxiapp.sidebar.payment.PromoAmountModel> promodetailarraylist;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager;
    
    public PromoAmountAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.sidebar.payment.PromoAmountModel> promodetailarraylist, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.newtaxiprime.user.taxiapp.sidebar.payment.PromoAmountModel> getPromodetailarraylist() {
        return null;
    }
    
    public final void setPromodetailarraylist(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.sidebar.payment.PromoAmountModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
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
    public com.newtaxiprime.user.taxiapp.sidebar.payment.PromoAmountAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int i) {
        return null;
    }
    
    /**
     * Bind Promocode and amount details
     */
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.payment.PromoAmountAdapter.ViewHolder viewHolder, int i) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/sidebar/payment/PromoAmountAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/newtaxiprime/user/taxiapp/sidebar/payment/PromoAmountAdapter;Landroid/view/View;)V", "promoAmount", "Landroid/widget/TextView;", "getPromoAmount", "()Landroid/widget/TextView;", "promoAmtTxt", "getPromoAmtTxt", "promoExp", "getPromoExp", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView promoAmount = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView promoAmtTxt = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView promoExp = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPromoAmount() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPromoAmtTxt() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPromoExp() {
            return null;
        }
    }
}