package com.newtaxiprime.user.taxiapp.sidebar.referral.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b\u00a8\u0006\u001b"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/sidebar/referral/model/CompletedOrPendingReferrals;", "", "()V", "earnableAmount", "", "getEarnableAmount", "()Ljava/lang/String;", "setEarnableAmount", "(Ljava/lang/String;)V", "name", "getName", "setName", "profileImage", "getProfileImage", "setProfileImage", "remainingDays", "", "getRemainingDays", "()J", "setRemainingDays", "(J)V", "remainingTrips", "getRemainingTrips", "setRemainingTrips", "status", "getStatus", "setStatus", "app_debug"})
public final class CompletedOrPendingReferrals {
    @com.google.gson.annotations.SerializedName(value = "name")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name = "";
    @com.google.gson.annotations.SerializedName(value = "profile_image")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String profileImage = "";
    @com.google.gson.annotations.SerializedName(value = "remaining_days")
    @com.google.gson.annotations.Expose()
    private long remainingDays = 0L;
    @com.google.gson.annotations.SerializedName(value = "remaining_trips")
    @com.google.gson.annotations.Expose()
    private long remainingTrips = 0L;
    @com.google.gson.annotations.SerializedName(value = "earnable_amounts")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String earnableAmount = "";
    @com.google.gson.annotations.SerializedName(value = "payment_status")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String status = "";
    
    public CompletedOrPendingReferrals() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProfileImage() {
        return null;
    }
    
    public final void setProfileImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getRemainingDays() {
        return 0L;
    }
    
    public final void setRemainingDays(long p0) {
    }
    
    public final long getRemainingTrips() {
        return 0L;
    }
    
    public final void setRemainingTrips(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEarnableAmount() {
        return null;
    }
    
    public final void setEarnableAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}