package com.newtaxiprime.user.taxiapp.datamodels.main;

/**
 * Created by Seen Technologies on 7/9/18.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010]\u001a\u00020,J\u000e\u0010^\u001a\u00020_2\u0006\u00100\u001a\u00020,R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR$\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010-\"\u0004\b1\u0010/R$\u00102\u001a\b\u0012\u0004\u0012\u0002030%8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010(\"\u0004\b5\u0010*R\u001e\u00106\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001e\u00109\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001e\u0010<\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001e\u0010?\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001e\u0010B\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001e\u0010E\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001e\u0010H\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001e\u0010K\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u001e\u0010N\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u001e\u0010Q\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR\u001e\u0010T\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001e\u0010W\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR\u001e\u0010Z\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0006\"\u0004\b\\\u0010\b\u00a8\u0006`"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/datamodels/main/NearestCar;", "Ljava/io/Serializable;", "()V", "applyFare", "", "getApplyFare", "()Ljava/lang/String;", "setApplyFare", "(Ljava/lang/String;)V", "applyPeak", "getApplyPeak", "setApplyPeak", "baseFare", "getBaseFare", "setBaseFare", "capacity", "getCapacity", "setCapacity", "carActiveImage", "getCarActiveImage", "setCarActiveImage", "carId", "getCarId", "setCarId", "carImage", "getCarImage", "setCarImage", "carName", "getCarName", "setCarName", "driverId", "getDriverId", "setDriverId", "fareEstimation", "getFareEstimation", "setFareEstimation", "id", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/taxiapp/datamodels/main/drivers;", "getId", "()Ljava/util/ArrayList;", "setId", "(Ljava/util/ArrayList;)V", "isPool", "", "()Z", "setPool", "(Z)V", "isSelected", "setSelected", "location", "Lcom/newtaxiprime/user/taxiapp/datamodels/main/LocationModel;", "getLocation", "setLocation", "locationID", "getLocationID", "setLocationID", "minFare", "getMinFare", "setMinFare", "minTime", "getMinTime", "setMinTime", "peakId", "getPeakId", "setPeakId", "peakPrice", "getPeakPrice", "setPeakPrice", "peakPricePercentage", "getPeakPricePercentage", "setPeakPricePercentage", "peak_id", "getPeak_id", "setPeak_id", "perKm", "getPerKm", "setPerKm", "perMin", "getPerMin", "setPerMin", "scheduleCancelFare", "getScheduleCancelFare", "setScheduleCancelFare", "scheduleFare", "getScheduleFare", "setScheduleFare", "waitingCharge", "getWaitingCharge", "setWaitingCharge", "waitingTime", "getWaitingTime", "setWaitingTime", "getCarIsSelected", "setCarIsSelected", "", "app_debug"})
public final class NearestCar implements java.io.Serializable {
    private boolean isSelected = false;
    @com.google.gson.annotations.SerializedName(value = "min_time")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String minTime = "";
    @com.google.gson.annotations.SerializedName(value = "driver_id")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String driverId = "";
    @com.google.gson.annotations.SerializedName(value = "car_id")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String carId = "";
    @com.google.gson.annotations.SerializedName(value = "car_name")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String carName = "";
    @com.google.gson.annotations.SerializedName(value = "base_fare")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String baseFare = "";
    @com.google.gson.annotations.SerializedName(value = "waiting_time")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String waitingTime = "";
    @com.google.gson.annotations.SerializedName(value = "is_pool")
    @com.google.gson.annotations.Expose()
    private boolean isPool = false;
    @com.google.gson.annotations.SerializedName(value = "waiting_charge")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String waitingCharge = "";
    @com.google.gson.annotations.SerializedName(value = "min_fare")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String minFare = "";
    @com.google.gson.annotations.SerializedName(value = "per_min")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String perMin = "";
    @com.google.gson.annotations.SerializedName(value = "per_km")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String perKm = "";
    @com.google.gson.annotations.SerializedName(value = "schedule_fare")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String scheduleFare = "";
    @com.google.gson.annotations.SerializedName(value = "schedule_cancel_fare")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String scheduleCancelFare = "";
    @com.google.gson.annotations.SerializedName(value = "capacity")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String capacity = "";
    @com.google.gson.annotations.SerializedName(value = "fare_estimation")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fareEstimation = "";
    @com.google.gson.annotations.SerializedName(value = "apply_fare")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String applyFare = "";
    @com.google.gson.annotations.SerializedName(value = "location")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.main.LocationModel> location;
    @com.google.gson.annotations.SerializedName(value = "apply_peak")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String applyPeak = "";
    @com.google.gson.annotations.SerializedName(value = "peak_price")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String peakPrice = "";
    @com.google.gson.annotations.SerializedName(value = "additional_rider_percentage")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String peakPricePercentage = "";
    @com.google.gson.annotations.SerializedName(value = "peak_id")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String peakId = "";
    @com.google.gson.annotations.SerializedName(value = "car_image")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String carImage = "";
    @com.google.gson.annotations.SerializedName(value = "car_active_image")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String carActiveImage = "";
    @com.google.gson.annotations.SerializedName(value = "location_id")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String locationID = "";
    @com.google.gson.annotations.SerializedName(value = "peak_id")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String peak_id = "";
    @com.google.gson.annotations.SerializedName(value = "drivers")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.main.drivers> id;
    
    public NearestCar() {
        super();
    }
    
    public final boolean isSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMinTime() {
        return null;
    }
    
    public final void setMinTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDriverId() {
        return null;
    }
    
    public final void setDriverId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCarId() {
        return null;
    }
    
    public final void setCarId(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getBaseFare() {
        return null;
    }
    
    public final void setBaseFare(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWaitingTime() {
        return null;
    }
    
    public final void setWaitingTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isPool() {
        return false;
    }
    
    public final void setPool(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWaitingCharge() {
        return null;
    }
    
    public final void setWaitingCharge(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMinFare() {
        return null;
    }
    
    public final void setMinFare(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPerMin() {
        return null;
    }
    
    public final void setPerMin(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPerKm() {
        return null;
    }
    
    public final void setPerKm(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getScheduleFare() {
        return null;
    }
    
    public final void setScheduleFare(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getScheduleCancelFare() {
        return null;
    }
    
    public final void setScheduleCancelFare(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCapacity() {
        return null;
    }
    
    public final void setCapacity(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFareEstimation() {
        return null;
    }
    
    public final void setFareEstimation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApplyFare() {
        return null;
    }
    
    public final void setApplyFare(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.main.LocationModel> getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.main.LocationModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApplyPeak() {
        return null;
    }
    
    public final void setApplyPeak(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPeakPrice() {
        return null;
    }
    
    public final void setPeakPrice(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPeakPricePercentage() {
        return null;
    }
    
    public final void setPeakPricePercentage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPeakId() {
        return null;
    }
    
    public final void setPeakId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCarImage() {
        return null;
    }
    
    public final void setCarImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCarActiveImage() {
        return null;
    }
    
    public final void setCarActiveImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocationID() {
        return null;
    }
    
    public final void setLocationID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPeak_id() {
        return null;
    }
    
    public final void setPeak_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.main.drivers> getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.main.drivers> p0) {
    }
    
    public final boolean getCarIsSelected() {
        return false;
    }
    
    public final void setCarIsSelected(boolean isSelected) {
    }
}