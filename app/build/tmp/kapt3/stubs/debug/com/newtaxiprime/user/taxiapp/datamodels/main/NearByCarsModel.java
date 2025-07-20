package com.newtaxiprime.user.taxiapp.datamodels.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0005R\u00020\u00000\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/datamodels/main/NearByCarsModel;", "", "()V", "data", "", "Lcom/newtaxiprime/user/taxiapp/datamodels/main/NearByCarsModel$Datum;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "statusCode", "", "getStatusCode", "()Ljava/lang/String;", "setStatusCode", "(Ljava/lang/String;)V", "statusMessage", "getStatusMessage", "setStatusMessage", "Datum", "app_debug"})
public final class NearByCarsModel {
    @com.google.gson.annotations.SerializedName(value = "status_code")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusCode = "";
    @com.google.gson.annotations.SerializedName(value = "status_message")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusMessage = "";
    @com.google.gson.annotations.SerializedName(value = "data")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.newtaxiprime.user.taxiapp.datamodels.main.NearByCarsModel.Datum> data;
    
    public NearByCarsModel() {
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
    public final java.util.List<com.newtaxiprime.user.taxiapp.datamodels.main.NearByCarsModel.Datum> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.newtaxiprime.user.taxiapp.datamodels.main.NearByCarsModel.Datum> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/datamodels/main/NearByCarsModel$Datum;", "", "(Lcom/newtaxiprime/user/taxiapp/datamodels/main/NearByCarsModel;)V", "driverId", "", "getDriverId", "()I", "setDriverId", "(I)V", "latitude", "", "getLatitude", "()Ljava/lang/String;", "setLatitude", "(Ljava/lang/String;)V", "longitude", "getLongitude", "setLongitude", "vehicleId", "getVehicleId", "setVehicleId", "vehicleType", "getVehicleType", "setVehicleType", "app_debug"})
    public final class Datum {
        @com.google.gson.annotations.SerializedName(value = "driver_id")
        @com.google.gson.annotations.Expose()
        private int driverId = 0;
        @com.google.gson.annotations.SerializedName(value = "vehicle_id")
        @com.google.gson.annotations.Expose()
        private int vehicleId = 0;
        @com.google.gson.annotations.SerializedName(value = "vehicle_type")
        @com.google.gson.annotations.Expose()
        @org.jetbrains.annotations.NotNull()
        private java.lang.String vehicleType = "";
        @com.google.gson.annotations.SerializedName(value = "latitude")
        @com.google.gson.annotations.Expose()
        @org.jetbrains.annotations.NotNull()
        private java.lang.String latitude = "";
        @com.google.gson.annotations.SerializedName(value = "longitude")
        @com.google.gson.annotations.Expose()
        @org.jetbrains.annotations.NotNull()
        private java.lang.String longitude = "";
        
        public Datum() {
            super();
        }
        
        public final int getDriverId() {
            return 0;
        }
        
        public final void setDriverId(int p0) {
        }
        
        public final int getVehicleId() {
            return 0;
        }
        
        public final void setVehicleId(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getVehicleType() {
            return null;
        }
        
        public final void setVehicleType(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLatitude() {
            return null;
        }
        
        public final void setLatitude(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLongitude() {
            return null;
        }
        
        public final void setLongitude(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}