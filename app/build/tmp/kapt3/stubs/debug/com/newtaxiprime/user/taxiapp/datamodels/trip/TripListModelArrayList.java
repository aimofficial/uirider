package com.newtaxiprime.user.taxiapp.datamodels.trip;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR \u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR \u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\"\u0010$\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R \u0010+\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR \u0010.\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\"\u00101\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\b2\u0010\'\"\u0004\b3\u0010)\u00a8\u00064"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/datamodels/trip/TripListModelArrayList;", "", "()V", "bookingType", "", "getBookingType", "()Ljava/lang/String;", "setBookingType", "(Ljava/lang/String;)V", "carType", "getCarType", "setCarType", "driverEarnings", "getDriverEarnings", "setDriverEarnings", "driverImage", "getDriverImage", "setDriverImage", "drop", "getDrop", "setDrop", "isPool", "", "()Ljava/lang/Boolean;", "setPool", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "mapImage", "getMapImage", "setMapImage", "pickup", "getPickup", "setPickup", "scheduleDisplayDate", "getScheduleDisplayDate", "setScheduleDisplayDate", "seats", "", "getSeats", "()Ljava/lang/Integer;", "setSeats", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "status", "getStatus", "setStatus", "totalFare", "getTotalFare", "setTotalFare", "tripId", "getTripId", "setTripId", "app_debug"})
public final class TripListModelArrayList {
    @com.google.gson.annotations.SerializedName(value = "is_pool")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isPool;
    @com.google.gson.annotations.SerializedName(value = "seats")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer seats;
    @com.google.gson.annotations.SerializedName(value = "status")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.Nullable()
    private java.lang.String status;
    @com.google.gson.annotations.SerializedName(value = "trip_id")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer tripId;
    @com.google.gson.annotations.SerializedName(value = "pickup")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pickup;
    @com.google.gson.annotations.SerializedName(value = "drop")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.Nullable()
    private java.lang.String drop;
    @com.google.gson.annotations.SerializedName(value = "schedule_display_date")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.Nullable()
    private java.lang.String scheduleDisplayDate;
    @com.google.gson.annotations.SerializedName(value = "map_image")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mapImage;
    @com.google.gson.annotations.SerializedName(value = "car_type")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.Nullable()
    private java.lang.String carType;
    @com.google.gson.annotations.SerializedName(value = "total_fare")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.Nullable()
    private java.lang.String totalFare;
    @com.google.gson.annotations.SerializedName(value = "driver_earnings")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.Nullable()
    private java.lang.String driverEarnings;
    @com.google.gson.annotations.SerializedName(value = "booking_type")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.Nullable()
    private java.lang.String bookingType;
    @com.google.gson.annotations.SerializedName(value = "driver_image")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.Nullable()
    private java.lang.String driverImage;
    
    public TripListModelArrayList() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isPool() {
        return null;
    }
    
    public final void setPool(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSeats() {
        return null;
    }
    
    public final void setSeats(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTripId() {
        return null;
    }
    
    public final void setTripId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPickup() {
        return null;
    }
    
    public final void setPickup(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDrop() {
        return null;
    }
    
    public final void setDrop(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getScheduleDisplayDate() {
        return null;
    }
    
    public final void setScheduleDisplayDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMapImage() {
        return null;
    }
    
    public final void setMapImage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCarType() {
        return null;
    }
    
    public final void setCarType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotalFare() {
        return null;
    }
    
    public final void setTotalFare(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDriverEarnings() {
        return null;
    }
    
    public final void setDriverEarnings(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBookingType() {
        return null;
    }
    
    public final void setBookingType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDriverImage() {
        return null;
    }
    
    public final void setDriverImage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}