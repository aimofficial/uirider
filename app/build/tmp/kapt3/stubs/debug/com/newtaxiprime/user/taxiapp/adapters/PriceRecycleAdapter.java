package com.newtaxiprime.user.taxiapp.adapters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001 B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u001c\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/adapters/PriceRecycleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/newtaxiprime/user/taxiapp/adapters/PriceRecycleAdapter$ViewHolder;", "context", "Landroid/content/Context;", "pricelist", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/taxiapp/datamodels/trip/InvoiceModel;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "Other_reason", "", "commonMethods", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "getCommonMethods", "()Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "setCommonMethods", "(Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;)V", "dialog", "Landroidx/appcompat/app/AlertDialog;", "getDialog", "()Landroidx/appcompat/app/AlertDialog;", "setDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "getItemCount", "", "onBindViewHolder", "", "viewHolder", "i", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "ViewHolder", "app_debug"})
public final class PriceRecycleAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.newtaxiprime.user.taxiapp.adapters.PriceRecycleAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.trip.InvoiceModel> pricelist = null;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.utils.CommonMethods commonMethods;
    public androidx.appcompat.app.AlertDialog dialog;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String Other_reason = null;
    
    public PriceRecycleAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.trip.InvoiceModel> pricelist) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.utils.CommonMethods getCommonMethods() {
        return null;
    }
    
    public final void setCommonMethods(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.utils.CommonMethods p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.app.AlertDialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.newtaxiprime.user.taxiapp.adapters.PriceRecycleAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int i) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.adapters.PriceRecycleAdapter.ViewHolder viewHolder, int i) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0011\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/adapters/PriceRecycleAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/newtaxiprime/user/taxiapp/adapters/PriceRecycleAdapter;Landroid/view/View;)V", "basrFareLayout", "Landroid/widget/LinearLayout;", "getBasrFareLayout", "()Landroid/widget/LinearLayout;", "fareAmt", "Landroid/widget/TextView;", "getFareAmt", "()Landroid/widget/TextView;", "fareInfo", "Landroid/widget/ImageView;", "getFareInfo", "()Landroid/widget/ImageView;", "fareTxt", "getFareTxt", "isBase", "rltPrice", "getRltPrice", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView fareTxt = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView fareAmt = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView isBase = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView fareInfo = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout rltPrice = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout basrFareLayout = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getFareTxt() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getFareAmt() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView isBase() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getFareInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getRltPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getBasrFareLayout() {
            return null;
        }
    }
}