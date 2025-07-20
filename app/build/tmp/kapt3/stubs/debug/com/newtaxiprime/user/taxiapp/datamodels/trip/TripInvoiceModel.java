package com.newtaxiprime.user.taxiapp.datamodels.trip;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b \u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001e\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001e\u0010\'\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001e\u0010*\u001a\u00020+8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u00100\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001e\u00103\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR$\u00106\u001a\b\u0012\u0004\u0012\u00020\u0001078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010<\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001e\u0010?\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001e\u0010B\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001e\u0010E\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001e\u0010H\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001e\u0010K\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u001e\u0010N\u001a\u00020+8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010-\"\u0004\bP\u0010/R\u001e\u0010Q\u001a\u00020+8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010-\"\u0004\bS\u0010/R\u001e\u0010T\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\b\u00a8\u0006W"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/datamodels/trip/TripInvoiceModel;", "", "()V", "appliedOweAmount", "", "getAppliedOweAmount", "()Ljava/lang/String;", "setAppliedOweAmount", "(Ljava/lang/String;)V", "currency", "getCurrency", "setCurrency", "driverImage", "getDriverImage", "setDriverImage", "driverName", "getDriverName", "setDriverName", "driverPayout", "getDriverPayout", "setDriverPayout", "dropLocation", "getDropLocation", "setDropLocation", "invoice", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/taxiapp/datamodels/trip/InvoiceModel;", "getInvoice", "()Ljava/util/ArrayList;", "setInvoice", "(Ljava/util/ArrayList;)V", "isCalculation", "setCalculation", "paymentMode", "getPaymentMode", "setPaymentMode", "paymentStatus", "getPaymentStatus", "setPaymentStatus", "paypalAppId", "getPaypalAppId", "setPaypalAppId", "paypalMode", "", "getPaypalMode", "()I", "setPaypalMode", "(I)V", "pickupLocation", "getPickupLocation", "setPickupLocation", "promoAmount", "getPromoAmount", "setPromoAmount", "promoDetails", "", "getPromoDetails", "()Ljava/util/List;", "setPromoDetails", "(Ljava/util/List;)V", "remainingOweAmount", "getRemainingOweAmount", "setRemainingOweAmount", "riderImage", "getRiderImage", "setRiderImage", "riderName", "getRiderName", "setRiderName", "statusCode", "getStatusCode", "setStatusCode", "statusMessage", "getStatusMessage", "setStatusMessage", "totalFare", "getTotalFare", "setTotalFare", "totalTime", "getTotalTime", "setTotalTime", "tripId", "getTripId", "setTripId", "tripStatus", "getTripStatus", "setTripStatus", "app_debug"})
public final class TripInvoiceModel {
    @com.google.gson.annotations.SerializedName(value = "status_code")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusCode = "";
    @com.google.gson.annotations.SerializedName(value = "status_message")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusMessage = "";
    @com.google.gson.annotations.SerializedName(value = "total_time")
    @com.google.gson.annotations.Expose()
    private int totalTime = 0;
    @com.google.gson.annotations.SerializedName(value = "pickup_location")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pickupLocation = "";
    @com.google.gson.annotations.SerializedName(value = "drop_location")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String dropLocation = "";
    @com.google.gson.annotations.SerializedName(value = "payment_mode")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String paymentMode = "";
    @com.google.gson.annotations.SerializedName(value = "payment_status")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String paymentStatus = "";
    @com.google.gson.annotations.SerializedName(value = "applied_owe_amount")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String appliedOweAmount = "";
    @com.google.gson.annotations.SerializedName(value = "remaining_owe_amount")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String remainingOweAmount = "";
    @com.google.gson.annotations.SerializedName(value = "is_calculation")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String isCalculation = "";
    @com.google.gson.annotations.SerializedName(value = "invoice")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.trip.InvoiceModel> invoice;
    @com.google.gson.annotations.SerializedName(value = "total_fare")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String totalFare = "";
    @com.google.gson.annotations.SerializedName(value = "currency_code")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currency = "";
    @com.google.gson.annotations.SerializedName(value = "driver_payout")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String driverPayout = "";
    @com.google.gson.annotations.SerializedName(value = "promo_amount")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String promoAmount = "";
    @com.google.gson.annotations.SerializedName(value = "promo_details")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends java.lang.Object> promoDetails;
    @com.google.gson.annotations.SerializedName(value = "trip_status")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String tripStatus = "";
    @com.google.gson.annotations.SerializedName(value = "trip_id")
    @com.google.gson.annotations.Expose()
    private int tripId = 0;
    @com.google.gson.annotations.SerializedName(value = "driver_image")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String driverImage = "";
    @com.google.gson.annotations.SerializedName(value = "driver_name")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String driverName = "";
    @com.google.gson.annotations.SerializedName(value = "rider_image")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String riderImage = "";
    @com.google.gson.annotations.SerializedName(value = "rider_name")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String riderName = "";
    @com.google.gson.annotations.SerializedName(value = "paypal_app_id")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String paypalAppId = "";
    @com.google.gson.annotations.SerializedName(value = "paypal_mode")
    @com.google.gson.annotations.Expose()
    private int paypalMode = 0;
    
    public TripInvoiceModel() {
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
    
    public final int getTotalTime() {
        return 0;
    }
    
    public final void setTotalTime(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPickupLocation() {
        return null;
    }
    
    public final void setPickupLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDropLocation() {
        return null;
    }
    
    public final void setDropLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPaymentMode() {
        return null;
    }
    
    public final void setPaymentMode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPaymentStatus() {
        return null;
    }
    
    public final void setPaymentStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppliedOweAmount() {
        return null;
    }
    
    public final void setAppliedOweAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRemainingOweAmount() {
        return null;
    }
    
    public final void setRemainingOweAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String isCalculation() {
        return null;
    }
    
    public final void setCalculation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.trip.InvoiceModel> getInvoice() {
        return null;
    }
    
    public final void setInvoice(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.trip.InvoiceModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotalFare() {
        return null;
    }
    
    public final void setTotalFare(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    public final void setCurrency(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDriverPayout() {
        return null;
    }
    
    public final void setDriverPayout(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPromoAmount() {
        return null;
    }
    
    public final void setPromoAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getPromoDetails() {
        return null;
    }
    
    public final void setPromoDetails(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTripStatus() {
        return null;
    }
    
    public final void setTripStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getTripId() {
        return 0;
    }
    
    public final void setTripId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDriverImage() {
        return null;
    }
    
    public final void setDriverImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDriverName() {
        return null;
    }
    
    public final void setDriverName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRiderImage() {
        return null;
    }
    
    public final void setRiderImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRiderName() {
        return null;
    }
    
    public final void setRiderName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPaypalAppId() {
        return null;
    }
    
    public final void setPaypalAppId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPaypalMode() {
        return 0;
    }
    
    public final void setPaypalMode(int p0) {
    }
}