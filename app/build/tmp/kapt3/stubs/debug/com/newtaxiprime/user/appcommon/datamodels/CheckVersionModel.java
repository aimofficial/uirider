package com.newtaxiprime.user.appcommon.datamodels;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001e\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR \u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001e\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001e\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR \u0010%\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b\'\u0010\u0015R \u0010(\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R$\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010\u000f\u00a8\u0006/"}, d2 = {"Lcom/newtaxiprime/user/appcommon/datamodels/CheckVersionModel;", "", "()V", "appleLogin", "", "getAppleLogin", "()Z", "setAppleLogin", "(Z)V", "banner", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/appcommon/datamodels/Banner;", "getBanner", "()Ljava/util/ArrayList;", "setBanner", "(Ljava/util/ArrayList;)V", "clientId", "", "getClientId", "()Ljava/lang/String;", "setClientId", "(Ljava/lang/String;)V", "enableReferral", "getEnableReferral", "setEnableReferral", "facebookLogin", "getFacebookLogin", "setFacebookLogin", "forceUpdate", "getForceUpdate", "setForceUpdate", "googleLogin", "getGoogleLogin", "setGoogleLogin", "otpEnabled", "getOtpEnabled", "setOtpEnabled", "statusCode", "getStatusCode", "setStatusCode", "statusMessage", "getStatusMessage", "setStatusMessage", "support", "Lcom/newtaxiprime/user/appcommon/datamodels/Support;", "getSupport", "setSupport", "app_debug"})
public final class CheckVersionModel {
    @com.google.gson.annotations.SerializedName(value = "status_code")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.Nullable()
    private java.lang.String statusCode;
    @com.google.gson.annotations.SerializedName(value = "status_message")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.Nullable()
    private java.lang.String statusMessage;
    @com.google.gson.annotations.SerializedName(value = "force_update")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.Nullable()
    private java.lang.String forceUpdate;
    @com.google.gson.annotations.SerializedName(value = "enable_referral")
    @com.google.gson.annotations.Expose()
    private boolean enableReferral = false;
    @com.google.gson.annotations.SerializedName(value = "client_id")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clientId;
    @com.google.gson.annotations.SerializedName(value = "apple_login")
    @com.google.gson.annotations.Expose()
    private boolean appleLogin = false;
    @com.google.gson.annotations.SerializedName(value = "facebook_login")
    @com.google.gson.annotations.Expose()
    private boolean facebookLogin = false;
    @com.google.gson.annotations.SerializedName(value = "google_login")
    @com.google.gson.annotations.Expose()
    private boolean googleLogin = false;
    @com.google.gson.annotations.SerializedName(value = "otp_enabled")
    @com.google.gson.annotations.Expose()
    private boolean otpEnabled = false;
    @com.google.gson.annotations.SerializedName(value = "support")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.newtaxiprime.user.appcommon.datamodels.Support> support;
    @com.google.gson.annotations.SerializedName(value = "banner")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.newtaxiprime.user.appcommon.datamodels.Banner> banner;
    
    public CheckVersionModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatusCode() {
        return null;
    }
    
    public final void setStatusCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatusMessage() {
        return null;
    }
    
    public final void setStatusMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getForceUpdate() {
        return null;
    }
    
    public final void setForceUpdate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getEnableReferral() {
        return false;
    }
    
    public final void setEnableReferral(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClientId() {
        return null;
    }
    
    public final void setClientId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getAppleLogin() {
        return false;
    }
    
    public final void setAppleLogin(boolean p0) {
    }
    
    public final boolean getFacebookLogin() {
        return false;
    }
    
    public final void setFacebookLogin(boolean p0) {
    }
    
    public final boolean getGoogleLogin() {
        return false;
    }
    
    public final void setGoogleLogin(boolean p0) {
    }
    
    public final boolean getOtpEnabled() {
        return false;
    }
    
    public final void setOtpEnabled(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.newtaxiprime.user.appcommon.datamodels.Support> getSupport() {
        return null;
    }
    
    public final void setSupport(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.appcommon.datamodels.Support> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.newtaxiprime.user.appcommon.datamodels.Banner> getBanner() {
        return null;
    }
    
    public final void setBanner(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.appcommon.datamodels.Banner> p0) {
    }
}