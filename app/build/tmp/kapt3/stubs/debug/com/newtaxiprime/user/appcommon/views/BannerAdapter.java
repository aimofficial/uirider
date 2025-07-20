package com.newtaxiprime.user.appcommon.views;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002-.B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010\'\u001a\u00020#H\u0016J\u001c\u0010(\u001a\u00060)R\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020#H\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006/"}, d2 = {"Lcom/newtaxiprime/user/appcommon/views/BannerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "bannerList", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/appcommon/datamodels/Banner;", "Lkotlin/collections/ArrayList;", "onClickListener", "Lcom/newtaxiprime/user/appcommon/views/BannerAdapter$OnClickListener;", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/newtaxiprime/user/appcommon/views/BannerAdapter$OnClickListener;)V", "commonMethods", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "getCommonMethods", "()Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "setCommonMethods", "(Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;)V", "dialog", "Landroidx/appcompat/app/AlertDialog;", "getDialog", "()Landroidx/appcompat/app/AlertDialog;", "setDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "getOnClickListener", "()Lcom/newtaxiprime/user/appcommon/views/BannerAdapter$OnClickListener;", "setOnClickListener", "(Lcom/newtaxiprime/user/appcommon/views/BannerAdapter$OnClickListener;)V", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "Lcom/newtaxiprime/user/appcommon/views/BannerAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "OnClickListener", "ViewHolder", "app_debug"})
public final class BannerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.newtaxiprime.user.appcommon.datamodels.Banner> bannerList = null;
    @org.jetbrains.annotations.NotNull()
    private com.newtaxiprime.user.appcommon.views.BannerAdapter.OnClickListener onClickListener;
    public androidx.appcompat.app.AlertDialog dialog;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.utils.CommonMethods commonMethods;
    
    public BannerAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.appcommon.datamodels.Banner> bannerList, @org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.views.BannerAdapter.OnClickListener onClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.views.BannerAdapter.OnClickListener getOnClickListener() {
        return null;
    }
    
    public final void setOnClickListener(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.views.BannerAdapter.OnClickListener p0) {
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
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.newtaxiprime.user.appcommon.views.BannerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/newtaxiprime/user/appcommon/views/BannerAdapter$OnClickListener;", "", "onClick", "", "pos", "", "app_debug"})
    public static abstract interface OnClickListener {
        
        public abstract void onClick(int pos);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001d"}, d2 = {"Lcom/newtaxiprime/user/appcommon/views/BannerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/newtaxiprime/user/appcommon/views/BannerAdapter;Landroid/view/View;)V", "ivBanner", "Landroid/widget/ImageView;", "getIvBanner", "()Landroid/widget/ImageView;", "setIvBanner", "(Landroid/widget/ImageView;)V", "rltBanner", "Landroid/widget/RelativeLayout;", "getRltBanner", "()Landroid/widget/RelativeLayout;", "setRltBanner", "(Landroid/widget/RelativeLayout;)V", "tvBannerName", "Landroid/widget/TextView;", "getTvBannerName", "()Landroid/widget/TextView;", "setTvBannerName", "(Landroid/widget/TextView;)V", "bindData", "", "banner", "Lcom/newtaxiprime/user/appcommon/datamodels/Banner;", "position", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvBannerName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.RelativeLayout rltBanner;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView ivBanner;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindData(@org.jetbrains.annotations.NotNull()
        com.newtaxiprime.user.appcommon.datamodels.Banner banner, int position) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvBannerName() {
            return null;
        }
        
        public final void setTvBannerName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RelativeLayout getRltBanner() {
            return null;
        }
        
        public final void setRltBanner(@org.jetbrains.annotations.NotNull()
        android.widget.RelativeLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvBanner() {
            return null;
        }
        
        public final void setIvBanner(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
    }
}