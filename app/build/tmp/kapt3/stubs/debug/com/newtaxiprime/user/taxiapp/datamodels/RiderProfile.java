package com.newtaxiprime.user.taxiapp.datamodels;

/**
 * Created by Seen Technologies on 7/9/18.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR2\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\n\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001e\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\bR\u001e\u0010)\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR\u001e\u0010,\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001e\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\b\u00a8\u00062"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/datamodels/RiderProfile;", "Ljava/io/Serializable;", "()V", "currencyCode", "", "getCurrencyCode", "()Ljava/lang/String;", "setCurrencyCode", "(Ljava/lang/String;)V", "currencySymbol", "getCurrencySymbol", "setCurrencySymbol", "firstName", "getFirstName", "setFirstName", "home", "getHome", "setHome", "lastName", "getLastName", "setLastName", "mobileNumber", "getMobileNumber", "setMobileNumber", "profileImage", "getProfileImage", "setProfileImage", "requestOptions", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/taxiapp/views/main/filter/FeaturesInCarModel;", "Lkotlin/collections/ArrayList;", "getRequestOptions", "()Ljava/util/ArrayList;", "setRequestOptions", "(Ljava/util/ArrayList;)V", "statusCode", "getStatusCode", "setStatusCode", "statusMessage", "getStatusMessage", "setStatusMessage", "walletAccount", "getWalletAccount", "setWalletAccount", "walletAmount", "getWalletAmount", "setWalletAmount", "work", "getWork", "setWork", "app_debug"})
public final class RiderProfile implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "status_message")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusMessage = "";
    @com.google.gson.annotations.SerializedName(value = "status_code")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusCode = "";
    @com.google.gson.annotations.SerializedName(value = "first_name")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String firstName = "";
    @com.google.gson.annotations.SerializedName(value = "last_name")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lastName = "";
    @com.google.gson.annotations.SerializedName(value = "mobile_number")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mobileNumber = "";
    @com.google.gson.annotations.SerializedName(value = "profile_image")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String profileImage = "";
    @com.google.gson.annotations.SerializedName(value = "home")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String home = "";
    @com.google.gson.annotations.SerializedName(value = "work")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String work = "";
    @com.google.gson.annotations.SerializedName(value = "currency_symbol")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currencySymbol = "";
    @com.google.gson.annotations.SerializedName(value = "currency_code")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currencyCode = "";
    @com.google.gson.annotations.SerializedName(value = "wallet_amount")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String walletAmount = "";
    @com.google.gson.annotations.SerializedName(value = "wallet_account")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String walletAccount = "";
    @com.google.gson.annotations.SerializedName(value = "request_options")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.newtaxiprime.user.taxiapp.views.main.filter.FeaturesInCarModel> requestOptions;
    
    public RiderProfile() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatusMessage() {
        return null;
    }
    
    public final void setStatusMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatusCode() {
        return null;
    }
    
    public final void setStatusCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastName() {
        return null;
    }
    
    public final void setLastName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMobileNumber() {
        return null;
    }
    
    public final void setMobileNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProfileImage() {
        return null;
    }
    
    public final void setProfileImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHome() {
        return null;
    }
    
    public final void setHome(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWork() {
        return null;
    }
    
    public final void setWork(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrencySymbol() {
        return null;
    }
    
    public final void setCurrencySymbol(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrencyCode() {
        return null;
    }
    
    public final void setCurrencyCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWalletAmount() {
        return null;
    }
    
    public final void setWalletAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWalletAccount() {
        return null;
    }
    
    public final void setWalletAccount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.newtaxiprime.user.taxiapp.views.main.filter.FeaturesInCarModel> getRequestOptions() {
        return null;
    }
    
    public final void setRequestOptions(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.views.main.filter.FeaturesInCarModel> p0) {
    }
}