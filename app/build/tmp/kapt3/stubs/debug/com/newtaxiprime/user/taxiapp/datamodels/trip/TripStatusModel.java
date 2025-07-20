package com.newtaxiprime.user.taxiapp.datamodels.trip;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\bA\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001e\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001e\u0010\'\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001e\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001e\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001e\u00100\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001e\u00103\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001e\u00106\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001e\u00109\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001e\u0010<\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001e\u0010?\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001e\u0010B\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001e\u0010E\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\f\"\u0004\bG\u0010\u000eR\u001e\u0010H\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\b\u00a8\u0006K"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/datamodels/trip/TripStatusModel;", "", "()V", "bookingType", "", "getBookingType", "()Ljava/lang/String;", "setBookingType", "(Ljava/lang/String;)V", "carId", "", "getCarId", "()I", "setCarId", "(I)V", "carName", "getCarName", "setCarName", "currencySymbol", "getCurrencySymbol", "setCurrencySymbol", "driverName", "getDriverName", "setDriverName", "driverPayout", "getDriverPayout", "setDriverPayout", "driverThumbImage", "getDriverThumbImage", "setDriverThumbImage", "dropLatitude", "getDropLatitude", "setDropLatitude", "dropLocation", "getDropLocation", "setDropLocation", "dropLongitude", "getDropLongitude", "setDropLongitude", "mapImage", "getMapImage", "setMapImage", "pickupLatitude", "getPickupLatitude", "setPickupLatitude", "pickupLocation", "getPickupLocation", "setPickupLocation", "pickupLongitude", "getPickupLongitude", "setPickupLongitude", "scheduleDate", "getScheduleDate", "setScheduleDate", "scheduleDisplayDate", "getScheduleDisplayDate", "setScheduleDisplayDate", "scheduleTime", "getScheduleTime", "setScheduleTime", "status", "getStatus", "setStatus", "subtotalFare", "getSubtotalFare", "setSubtotalFare", "totalFare", "getTotalFare", "setTotalFare", "tripId", "getTripId", "setTripId", "tripPath", "getTripPath", "setTripPath", "app_debug"})
public final class TripStatusModel {
    @com.google.gson.annotations.SerializedName(value = "trip_id")
    @com.google.gson.annotations.Expose()
    private int tripId = 0;
    @com.google.gson.annotations.SerializedName(value = "car_id")
    @com.google.gson.annotations.Expose()
    private int carId = 0;
    @com.google.gson.annotations.SerializedName(value = "trip_path")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String tripPath = "";
    @com.google.gson.annotations.SerializedName(value = "total_fare")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String totalFare = "";
    @com.google.gson.annotations.SerializedName(value = "subtotal_fare")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String subtotalFare = "";
    @com.google.gson.annotations.SerializedName(value = "driver_payout")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String driverPayout = "";
    @com.google.gson.annotations.SerializedName(value = "car_name")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String carName = "";
    @com.google.gson.annotations.SerializedName(value = "map_image")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mapImage = "";
    @com.google.gson.annotations.SerializedName(value = "pickup_latitude")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pickupLatitude = "";
    @com.google.gson.annotations.SerializedName(value = "pickup_longitude")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pickupLongitude = "";
    @com.google.gson.annotations.SerializedName(value = "drop_latitude")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String dropLatitude = "";
    @com.google.gson.annotations.SerializedName(value = "drop_longitude")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String dropLongitude = "";
    @com.google.gson.annotations.SerializedName(value = "booking_type")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String bookingType = "";
    @com.google.gson.annotations.SerializedName(value = "currency_symbol")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currencySymbol = "";
    @com.google.gson.annotations.SerializedName(value = "status")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String status = "";
    @com.google.gson.annotations.SerializedName(value = "driver_name")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String driverName = "";
    @com.google.gson.annotations.SerializedName(value = "driver_thumb_image")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String driverThumbImage = "";
    
    /**
     * Schedule Date and Time only for Upcoming Trips
     */
    @com.google.gson.annotations.SerializedName(value = "schedule_time")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String scheduleTime = "";
    @com.google.gson.annotations.SerializedName(value = "schedule_date")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String scheduleDate = "";
    @com.google.gson.annotations.SerializedName(value = "pickup_location")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pickupLocation = "";
    @com.google.gson.annotations.SerializedName(value = "drop_location")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String dropLocation = "";
    @com.google.gson.annotations.SerializedName(value = "schedule_display_date")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String scheduleDisplayDate = "";
    
    public TripStatusModel() {
        super();
    }
    
    public final int getTripId() {
        return 0;
    }
    
    public final void setTripId(int p0) {
    }
    
    public final int getCarId() {
        return 0;
    }
    
    public final void setCarId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTripPath() {
        return null;
    }
    
    public final void setTripPath(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getSubtotalFare() {
        return null;
    }
    
    public final void setSubtotalFare(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getCarName() {
        return null;
    }
    
    public final void setCarName(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getPickupLatitude() {
        return null;
    }
    
    public final void setPickupLatitude(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPickupLongitude() {
        return null;
    }
    
    public final void setPickupLongitude(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDropLatitude() {
        return null;
    }
    
    public final void setDropLatitude(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDropLongitude() {
        return null;
    }
    
    public final void setDropLongitude(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getCurrencySymbol() {
        return null;
    }
    
    public final void setCurrencySymbol(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getDriverThumbImage() {
        return null;
    }
    
    public final void setDriverThumbImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * Schedule Date and Time only for Upcoming Trips
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getScheduleTime() {
        return null;
    }
    
    /**
     * Schedule Date and Time only for Upcoming Trips
     */
    public final void setScheduleTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getScheduleDate() {
        return null;
    }
    
    public final void setScheduleDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
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
    public final java.lang.String getScheduleDisplayDate() {
        return null;
    }
    
    public final void setScheduleDisplayDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}