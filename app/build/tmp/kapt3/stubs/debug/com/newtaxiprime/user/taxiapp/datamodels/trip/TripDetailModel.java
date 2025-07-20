package com.newtaxiprime.user.taxiapp.datamodels.trip;

/**
 * Created by Seen Technologies on 8/9/18.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010y\u001a\u00020z2\u0006\u0010Y\u001a\u00020\u0004R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001e\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001e\u0010\'\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001e\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001e\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001e\u00100\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001e\u00103\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR$\u00106\u001a\b\u0012\u0004\u0012\u000208078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010=\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010\bR\u001e\u0010@\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010\bR\u001e\u0010C\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0006\"\u0004\bE\u0010\bR\u001e\u0010F\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0006\"\u0004\bH\u0010\bR\u001e\u0010I\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0006\"\u0004\bK\u0010\bR\u001e\u0010L\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0006\"\u0004\bN\u0010\bR\u001e\u0010O\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0006\"\u0004\bQ\u0010\bR\u001e\u0010R\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0006\"\u0004\bT\u0010\bR\u001e\u0010U\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0006\"\u0004\bW\u0010\bR\u001e\u0010Y\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010\u0006R\u001e\u0010[\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0006\"\u0004\b]\u0010\bR\u001e\u0010^\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0006\"\u0004\b`\u0010\bR\u001e\u0010a\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0006\"\u0004\bc\u0010\bR\u001e\u0010d\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0006\"\u0004\bf\u0010\bR\u001e\u0010g\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0006\"\u0004\bi\u0010\bR\u001e\u0010j\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u0006\"\u0004\bl\u0010\bR\u001e\u0010m\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\u0006\"\u0004\bo\u0010\bR\u001e\u0010p\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u0006\"\u0004\br\u0010\bR\u001e\u0010s\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u0010\u0006\"\u0004\bu\u0010\bR\u001e\u0010v\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\u0006\"\u0004\bx\u0010\b\u00a8\u0006{"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/datamodels/trip/TripDetailModel;", "", "()V", "accessFee", "", "getAccessFee", "()Ljava/lang/String;", "setAccessFee", "(Ljava/lang/String;)V", "appliedOweAmount", "getAppliedOweAmount", "setAppliedOweAmount", "baseFare", "getBaseFare", "setBaseFare", "carId", "getCarId", "setCarId", "createdAt", "getCreatedAt", "setCreatedAt", "currencyCode", "getCurrencyCode", "setCurrencyCode", "deletedAt", "getDeletedAt", "setDeletedAt", "distanceFare", "getDistanceFare", "setDistanceFare", "driverId", "getDriverId", "setDriverId", "driverName", "getDriverName", "setDriverName", "driverPayout", "getDriverPayout", "setDriverPayout", "driverThumbImage", "getDriverThumbImage", "setDriverThumbImage", "dropLatitude", "getDropLatitude", "setDropLatitude", "dropLocation", "getDropLocation", "setDropLocation", "dropLongitude", "getDropLongitude", "setDropLongitude", "id", "getId", "setId", "invoice", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/taxiapp/datamodels/trip/InvoiceModel;", "getInvoice", "()Ljava/util/ArrayList;", "setInvoice", "(Ljava/util/ArrayList;)V", "mapImage", "getMapImage", "setMapImage", "oweAmount", "getOweAmount", "setOweAmount", "paymentMethod", "getPaymentMethod", "setPaymentMethod", "pickupLatitude", "getPickupLatitude", "setPickupLatitude", "pickupLocation", "getPickupLocation", "setPickupLocation", "pickupLongitude", "getPickupLongitude", "setPickupLongitude", "promoAmount", "getPromoAmount", "setPromoAmount", "remainingOweAmount", "getRemainingOweAmount", "setRemainingOweAmount", "requestId", "getRequestId", "setRequestId", "<set-?>", "staticMapURL", "getStaticMapURL", "status", "getStatus", "setStatus", "timeFare", "getTimeFare", "setTimeFare", "totalFare", "getTotalFare", "setTotalFare", "totalKm", "getTotalKm", "setTotalKm", "totalTime", "getTotalTime", "setTotalTime", "tripPath", "getTripPath", "setTripPath", "updatedAt", "getUpdatedAt", "setUpdatedAt", "userId", "getUserId", "setUserId", "vehicleName", "getVehicleName", "setVehicleName", "walletAmount", "getWalletAmount", "setWalletAmount", "setStaticMapUR", "", "app_debug"})
public final class TripDetailModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String staticMapURL = "";
    @com.google.gson.annotations.SerializedName(value = "id")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id = "";
    @com.google.gson.annotations.SerializedName(value = "user_id")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userId = "";
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
    @com.google.gson.annotations.SerializedName(value = "pickup_location")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pickupLocation = "";
    @com.google.gson.annotations.SerializedName(value = "drop_location")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String dropLocation = "";
    @com.google.gson.annotations.SerializedName(value = "car_id")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String carId = "";
    @com.google.gson.annotations.SerializedName(value = "request_id")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String requestId = "";
    @com.google.gson.annotations.SerializedName(value = "driver_id")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String driverId = "";
    @com.google.gson.annotations.SerializedName(value = "total_time")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String totalTime = "";
    @com.google.gson.annotations.SerializedName(value = "total_km")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String totalKm = "";
    @com.google.gson.annotations.SerializedName(value = "time_fare")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String timeFare = "";
    @com.google.gson.annotations.SerializedName(value = "distance_fare")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String distanceFare = "";
    @com.google.gson.annotations.SerializedName(value = "base_fare")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String baseFare = "";
    @com.google.gson.annotations.SerializedName(value = "total_fare")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String totalFare = "";
    @com.google.gson.annotations.SerializedName(value = "access_fee")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String accessFee = "";
    @com.google.gson.annotations.SerializedName(value = "status")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String status = "";
    @com.google.gson.annotations.SerializedName(value = "created_at")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String createdAt = "";
    @com.google.gson.annotations.SerializedName(value = "updated_at")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String updatedAt = "";
    @com.google.gson.annotations.SerializedName(value = "vehicle_name")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String vehicleName = "";
    @com.google.gson.annotations.SerializedName(value = "deleted_at")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String deletedAt = "";
    @com.google.gson.annotations.SerializedName(value = "driver_name")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String driverName = "";
    @com.google.gson.annotations.SerializedName(value = "driver_thumb_image")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String driverThumbImage = "";
    @com.google.gson.annotations.SerializedName(value = "trip_path")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String tripPath = "";
    @com.google.gson.annotations.SerializedName(value = "owe_amount")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String oweAmount = "";
    @com.google.gson.annotations.SerializedName(value = "applied_owe_amount")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String appliedOweAmount = "";
    @com.google.gson.annotations.SerializedName(value = "wallet_amount")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String walletAmount = "";
    @com.google.gson.annotations.SerializedName(value = "promo_amount")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String promoAmount = "";
    @com.google.gson.annotations.SerializedName(value = "driver_payout")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String driverPayout = "";
    @com.google.gson.annotations.SerializedName(value = "payment_method")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String paymentMethod = "";
    @com.google.gson.annotations.SerializedName(value = "remaining_owe_amount")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String remainingOweAmount = "";
    @com.google.gson.annotations.SerializedName(value = "currency_code")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currencyCode = "";
    @com.google.gson.annotations.SerializedName(value = "map_image")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mapImage = "";
    @com.google.gson.annotations.SerializedName(value = "invoice")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.trip.InvoiceModel> invoice;
    
    public TripDetailModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStaticMapURL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getCarId() {
        return null;
    }
    
    public final void setCarId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRequestId() {
        return null;
    }
    
    public final void setRequestId(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getTotalTime() {
        return null;
    }
    
    public final void setTotalTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotalKm() {
        return null;
    }
    
    public final void setTotalKm(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeFare() {
        return null;
    }
    
    public final void setTimeFare(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistanceFare() {
        return null;
    }
    
    public final void setDistanceFare(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getTotalFare() {
        return null;
    }
    
    public final void setTotalFare(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccessFee() {
        return null;
    }
    
    public final void setAccessFee(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    public final void setCreatedAt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    public final void setUpdatedAt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVehicleName() {
        return null;
    }
    
    public final void setVehicleName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeletedAt() {
        return null;
    }
    
    public final void setDeletedAt(@org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTripPath() {
        return null;
    }
    
    public final void setTripPath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOweAmount() {
        return null;
    }
    
    public final void setOweAmount(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getWalletAmount() {
        return null;
    }
    
    public final void setWalletAmount(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getDriverPayout() {
        return null;
    }
    
    public final void setDriverPayout(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPaymentMethod() {
        return null;
    }
    
    public final void setPaymentMethod(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getCurrencyCode() {
        return null;
    }
    
    public final void setCurrencyCode(@org.jetbrains.annotations.NotNull()
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
    public final java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.trip.InvoiceModel> getInvoice() {
        return null;
    }
    
    public final void setInvoice(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.trip.InvoiceModel> p0) {
    }
    
    public final void setStaticMapUR(@org.jetbrains.annotations.NotNull()
    java.lang.String staticMapURL) {
    }
}