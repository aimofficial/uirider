package com.newtaxiprime.user.appcommon.views;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fJ\u0012\u0010 \u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0018\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u001fH\u0002J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020\u001fH\u0002R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006("}, d2 = {"Lcom/newtaxiprime/user/appcommon/views/BannerActivityCommon;", "Lcom/newtaxiprime/user/appcommon/views/CommonActivity;", "Lcom/newtaxiprime/user/appcommon/views/BannerAdapter$OnClickListener;", "()V", "bannertList", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/appcommon/datamodels/Banner;", "getBannertList", "()Ljava/util/ArrayList;", "setBannertList", "(Ljava/util/ArrayList;)V", "binding", "Lcom/newtaxiprime/user/databinding/AppActivityBannerCommonBinding;", "commonMethods", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "getCommonMethods", "()Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "setCommonMethods", "(Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;)V", "goToMarket", "", "myContext", "Landroid/content/Context;", "initViews", "isSkypeClientInstalled", "", "onClick", "pos", "", "onClickWhatsApp", "phoneNumberWithCountryCode", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openSkype", "context", "skypeId", "redirectWeb", "link", "app_debug"})
public final class BannerActivityCommon extends com.newtaxiprime.user.appcommon.views.CommonActivity implements com.newtaxiprime.user.appcommon.views.BannerAdapter.OnClickListener {
    private com.newtaxiprime.user.databinding.AppActivityBannerCommonBinding binding;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.newtaxiprime.user.appcommon.datamodels.Banner> bannertList;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.utils.CommonMethods commonMethods;
    
    public BannerActivityCommon() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.newtaxiprime.user.appcommon.datamodels.Banner> getBannertList() {
        return null;
    }
    
    public final void setBannertList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.appcommon.datamodels.Banner> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.utils.CommonMethods getCommonMethods() {
        return null;
    }
    
    public final void setCommonMethods(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.utils.CommonMethods p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews() {
    }
    
    @java.lang.Override()
    public void onClick(int pos) {
    }
    
    private final void redirectWeb(java.lang.String link) {
    }
    
    private final void openSkype(android.content.Context context, java.lang.String skypeId) {
    }
    
    /**
     * Determine whether the Skype for Android client is installed on this device.
     */
    public final boolean isSkypeClientInstalled(@org.jetbrains.annotations.NotNull()
    android.content.Context myContext) {
        return false;
    }
    
    /**
     * Install the Skype client through the market: URI scheme.
     */
    public final void goToMarket(@org.jetbrains.annotations.NotNull()
    android.content.Context myContext) {
    }
    
    public final void onClickWhatsApp(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumberWithCountryCode) {
    }
}