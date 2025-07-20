package com.newtaxiprime.user.appcommon.views;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010(\u001a\u00020)H\u0016J\u0012\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010,H\u0015J\u0010\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020\u0012H\u0002J\b\u0010/\u001a\u00020)H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0014\"\u0004\b\'\u0010\u0016\u00a8\u00061"}, d2 = {"Lcom/newtaxiprime/user/appcommon/views/PaystackWebViewActivity;", "Lcom/newtaxiprime/user/appcommon/views/CommonActivity;", "()V", "binding", "Lcom/newtaxiprime/user/databinding/ActivityPaymentWebViewBinding;", "commonMethods", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "getCommonMethods", "()Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "setCommonMethods", "(Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;)V", "customDialog", "Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;", "getCustomDialog", "()Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;", "setCustomDialog", "(Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;)V", "payFor", "", "getPayFor", "()Ljava/lang/String;", "setPayFor", "(Ljava/lang/String;)V", "payment_wv", "Landroid/webkit/WebView;", "progressDialog", "Landroid/app/ProgressDialog;", "getProgressDialog", "()Landroid/app/ProgressDialog;", "setProgressDialog", "(Landroid/app/ProgressDialog;)V", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "type", "getType", "setType", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "redirect", "htmlResponse", "setProgress", "MyJavaScriptInterface", "app_debug"})
public final class PaystackWebViewActivity extends com.newtaxiprime.user.appcommon.views.CommonActivity {
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.utils.CommonMethods commonMethods;
    @javax.inject.Inject()
    public com.newtaxiprime.user.taxiapp.views.customize.CustomDialog customDialog;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String type;
    public android.app.ProgressDialog progressDialog;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String payFor;
    private com.newtaxiprime.user.databinding.ActivityPaymentWebViewBinding binding;
    private android.webkit.WebView payment_wv;
    
    public PaystackWebViewActivity() {
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
    public final com.newtaxiprime.user.appcommon.utils.CommonMethods getCommonMethods() {
        return null;
    }
    
    public final void setCommonMethods(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.utils.CommonMethods p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.taxiapp.views.customize.CustomDialog getCustomDialog() {
        return null;
    }
    
    public final void setCustomDialog(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.customize.CustomDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.ProgressDialog getProgressDialog() {
        return null;
    }
    
    public final void setProgressDialog(@org.jetbrains.annotations.NotNull()
    android.app.ProgressDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPayFor() {
        return null;
    }
    
    public final void setPayFor(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setProgress() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void redirect(java.lang.String htmlResponse) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/newtaxiprime/user/appcommon/views/PaystackWebViewActivity$MyJavaScriptInterface;", "", "ctx", "Landroid/content/Context;", "(Lcom/newtaxiprime/user/appcommon/views/PaystackWebViewActivity;Landroid/content/Context;)V", "showHTML", "", "html", "", "app_debug"})
    public final class MyJavaScriptInterface {
        @org.jetbrains.annotations.NotNull()
        private android.content.Context ctx;
        
        public MyJavaScriptInterface(@org.jetbrains.annotations.NotNull()
        android.content.Context ctx) {
            super();
        }
        
        @android.webkit.JavascriptInterface()
        public final void showHTML(@org.jetbrains.annotations.NotNull()
        java.lang.String html) {
        }
    }
}