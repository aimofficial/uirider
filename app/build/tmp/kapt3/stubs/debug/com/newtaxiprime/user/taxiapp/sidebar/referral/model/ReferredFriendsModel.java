package com.newtaxiprime.user.taxiapp.sidebar.referral.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001e\u0010\u0016\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001e\u0010\u0019\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001e\u0010\u001c\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001e\u0010\u001f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012\u00a8\u0006\""}, d2 = {"Lcom/newtaxiprime/user/taxiapp/sidebar/referral/model/ReferredFriendsModel;", "", "()V", "completedReferrals", "", "Lcom/newtaxiprime/user/taxiapp/sidebar/referral/model/CompletedOrPendingReferrals;", "getCompletedReferrals", "()Ljava/util/List;", "setCompletedReferrals", "(Ljava/util/List;)V", "pendingReferrals", "getPendingReferrals", "setPendingReferrals", "referralAmount", "", "getReferralAmount", "()Ljava/lang/String;", "setReferralAmount", "(Ljava/lang/String;)V", "referralCode", "getReferralCode", "setReferralCode", "referralLink", "getReferralLink", "setReferralLink", "statusCode", "getStatusCode", "setStatusCode", "statusMessage", "getStatusMessage", "setStatusMessage", "totalEarning", "getTotalEarning", "setTotalEarning", "app_debug"})
public final class ReferredFriendsModel {
    @com.google.gson.annotations.SerializedName(value = "status_code")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusCode = "";
    @com.google.gson.annotations.SerializedName(value = "status_message")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusMessage = "";
    @com.google.gson.annotations.SerializedName(value = "referral_code")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String referralCode = "";
    @com.google.gson.annotations.SerializedName(value = "referral_link")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String referralLink = "";
    @com.google.gson.annotations.SerializedName(value = "total_earning")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String totalEarning = "";
    @com.google.gson.annotations.SerializedName(value = "pending_referrals")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.newtaxiprime.user.taxiapp.sidebar.referral.model.CompletedOrPendingReferrals> pendingReferrals;
    @com.google.gson.annotations.SerializedName(value = "completed_referrals")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.newtaxiprime.user.taxiapp.sidebar.referral.model.CompletedOrPendingReferrals> completedReferrals;
    @com.google.gson.annotations.SerializedName(value = "referral_amount")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String referralAmount = "";
    
    public ReferredFriendsModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatusCode() {
        return null;
    }
    
    public final void setStatusCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatusMessage() {
        return null;
    }
    
    public final void setStatusMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReferralCode() {
        return null;
    }
    
    public final void setReferralCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReferralLink() {
        return null;
    }
    
    public final void setReferralLink(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotalEarning() {
        return null;
    }
    
    public final void setTotalEarning(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.newtaxiprime.user.taxiapp.sidebar.referral.model.CompletedOrPendingReferrals> getPendingReferrals() {
        return null;
    }
    
    public final void setPendingReferrals(@org.jetbrains.annotations.NotNull()
    java.util.List<com.newtaxiprime.user.taxiapp.sidebar.referral.model.CompletedOrPendingReferrals> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.newtaxiprime.user.taxiapp.sidebar.referral.model.CompletedOrPendingReferrals> getCompletedReferrals() {
        return null;
    }
    
    public final void setCompletedReferrals(@org.jetbrains.annotations.NotNull()
    java.util.List<com.newtaxiprime.user.taxiapp.sidebar.referral.model.CompletedOrPendingReferrals> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReferralAmount() {
        return null;
    }
    
    public final void setReferralAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}