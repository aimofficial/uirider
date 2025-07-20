package com.newtaxiprime.user.taxiapp.datamodels.trip;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001e\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001e\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b\'\u0010\bR\u001e\u0010(\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001e\u0010+\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR\u001e\u0010.\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\u001e\u00101\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR\u001e\u00104\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\bR\"\u00107\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010=\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010>\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0006\"\u0004\b@\u0010\bR\u001e\u0010A\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0006\"\u0004\bC\u0010\b\u00a8\u0006D"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/datamodels/trip/Riders;", "Ljava/io/Serializable;", "()V", "bookingType", "", "getBookingType", "()Ljava/lang/String;", "setBookingType", "(Ljava/lang/String;)V", "carType", "getCarType", "setCarType", "creatdate", "getCreatdate", "setCreatdate", "drop", "getDrop", "setDrop", "dropLat", "getDropLat", "setDropLat", "dropLng", "getDropLng", "setDropLng", "invoice", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/taxiapp/datamodels/trip/InvoiceModel;", "getInvoice", "()Ljava/util/ArrayList;", "setInvoice", "(Ljava/util/ArrayList;)V", "mapImage", "getMapImage", "setMapImage", "otp", "getOtp", "setOtp", "pickup", "getPickup", "setPickup", "pickupLat", "getPickupLat", "setPickupLat", "pickupLng", "getPickupLng", "setPickupLng", "scheduleDisplayDate", "getScheduleDisplayDate", "setScheduleDisplayDate", "status", "getStatus", "setStatus", "totalFare", "getTotalFare", "setTotalFare", "tripId", "", "getTripId", "()Ljava/lang/Integer;", "setTripId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "waitingCharge", "getWaitingCharge", "setWaitingCharge", "waitingTime", "getWaitingTime", "setWaitingTime", "app_debug"})
public final class Riders implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "otp")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String otp = "";
    @com.google.gson.annotations.SerializedName(value = "status")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String status = "";
    @com.google.gson.annotations.SerializedName(value = "trip_id")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer tripId;
    @com.google.gson.annotations.SerializedName(value = "pickup")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pickup = "";
    @com.google.gson.annotations.SerializedName(value = "drop")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String drop = "";
    @com.google.gson.annotations.SerializedName(value = "pickup_lat")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pickupLat = "";
    @com.google.gson.annotations.SerializedName(value = "pickup_lng")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pickupLng = "";
    @com.google.gson.annotations.SerializedName(value = "drop_lat")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String dropLat = "";
    @com.google.gson.annotations.SerializedName(value = "drop_lng")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String dropLng = "";
    @com.google.gson.annotations.SerializedName(value = "map_image")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mapImage = "";
    @com.google.gson.annotations.SerializedName(value = "car_type")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String carType = "";
    @com.google.gson.annotations.SerializedName(value = "waiting_time")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String waitingTime = "";
    @com.google.gson.annotations.SerializedName(value = "waiting_charge")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String waitingCharge = "";
    @com.google.gson.annotations.SerializedName(value = "total_fare")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String totalFare = "";
    @com.google.gson.annotations.SerializedName(value = "booking_type")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String bookingType = "";
    @com.google.gson.annotations.SerializedName(value = "schedule_display_date")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String scheduleDisplayDate = "";
    @com.google.gson.annotations.SerializedName(value = "created_at")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String creatdate = "";
    @com.google.gson.annotations.SerializedName(value = "invoice")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.trip.InvoiceModel> invoice;
    
    public Riders() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOtp() {
        return null;
    }
    
    public final void setOtp(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTripId() {
        return null;
    }
    
    public final void setTripId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPickup() {
        return null;
    }
    
    public final void setPickup(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDrop() {
        return null;
    }
    
    public final void setDrop(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPickupLat() {
        return null;
    }
    
    public final void setPickupLat(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPickupLng() {
        return null;
    }
    
    public final void setPickupLng(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDropLat() {
        return null;
    }
    
    public final void setDropLat(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDropLng() {
        return null;
    }
    
    public final void setDropLng(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMapImage() {
        return null;
    }
    
    public final void setMapImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCarType() {
        return null;
    }
    
    public final void setCarType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWaitingTime() {
        return null;
    }
    
    public final void setWaitingTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWaitingCharge() {
        return null;
    }
    
    public final void setWaitingCharge(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotalFare() {
        return null;
    }
    
    public final void setTotalFare(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBookingType() {
        return null;
    }
    
    public final void setBookingType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getScheduleDisplayDate() {
        return null;
    }
    
    public final void setScheduleDisplayDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatdate() {
        return null;
    }
    
    public final void setCreatdate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.trip.InvoiceModel> getInvoice() {
        return null;
    }
    
    public final void setInvoice(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.trip.InvoiceModel> p0) {
    }
}