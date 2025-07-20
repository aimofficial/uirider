package com.newtaxiprime.user.taxiapp.datamodels.main;

/**
 * Created by Seen Technologies on 7/9/18.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/datamodels/main/SearchCarResult;", "Ljava/io/Serializable;", "()V", "nearestCar", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/taxiapp/datamodels/main/NearestCar;", "getNearestCar", "()Ljava/util/ArrayList;", "setNearestCar", "(Ljava/util/ArrayList;)V", "statusCode", "", "getStatusCode", "()Ljava/lang/String;", "setStatusCode", "(Ljava/lang/String;)V", "statusMessage", "getStatusMessage", "setStatusMessage", "app_debug"})
public final class SearchCarResult implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "status_message")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusMessage = "";
    @com.google.gson.annotations.SerializedName(value = "status_code")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusCode = "";
    @com.google.gson.annotations.SerializedName(value = "nearest_car")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.main.NearestCar> nearestCar;
    
    public SearchCarResult() {
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
    public final java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.main.NearestCar> getNearestCar() {
        return null;
    }
    
    public final void setNearestCar(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.main.NearestCar> p0) {
    }
}