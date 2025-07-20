package com.newtaxiprime.user.appcommon.views;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u001aH\u0002J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0016J\u000e\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%J\u0012\u0010&\u001a\u00020\u001a2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u0018\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020%H\u0002J\u0010\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006."}, d2 = {"Lcom/newtaxiprime/user/appcommon/views/SupportActivityCommon;", "Lcom/newtaxiprime/user/appcommon/views/CommonActivity;", "Lcom/newtaxiprime/user/appcommon/views/SupportAdapter$OnClickListener;", "()V", "binding", "Lcom/newtaxiprime/user/databinding/AppActivitySupportCommonBinding;", "commonMethods", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "getCommonMethods", "()Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "setCommonMethods", "(Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;)V", "rvSupportList", "Landroidx/recyclerview/widget/RecyclerView;", "getRvSupportList", "()Landroidx/recyclerview/widget/RecyclerView;", "setRvSupportList", "(Landroidx/recyclerview/widget/RecyclerView;)V", "supportList", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/appcommon/datamodels/Support;", "getSupportList", "()Ljava/util/ArrayList;", "setSupportList", "(Ljava/util/ArrayList;)V", "goToMarket", "", "myContext", "Landroid/content/Context;", "initViews", "isSkypeClientInstalled", "", "onClick", "pos", "", "onClickWhatsApp", "phoneNumberWithCountryCode", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openSkype", "context", "skypeId", "redirectWeb", "link", "app_debug"})
public final class SupportActivityCommon extends com.newtaxiprime.user.appcommon.views.CommonActivity implements com.newtaxiprime.user.appcommon.views.SupportAdapter.OnClickListener {
    public androidx.recyclerview.widget.RecyclerView rvSupportList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.newtaxiprime.user.appcommon.datamodels.Support> supportList;
    private com.newtaxiprime.user.databinding.AppActivitySupportCommonBinding binding;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.utils.CommonMethods commonMethods;
    
    public SupportActivityCommon() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRvSupportList() {
        return null;
    }
    
    public final void setRvSupportList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.newtaxiprime.user.appcommon.datamodels.Support> getSupportList() {
        return null;
    }
    
    public final void setSupportList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.appcommon.datamodels.Support> p0) {
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