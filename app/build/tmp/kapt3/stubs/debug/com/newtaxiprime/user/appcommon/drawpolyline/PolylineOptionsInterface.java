package com.newtaxiprime.user.appcommon.drawpolyline;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001JL\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011"}, d2 = {"Lcom/newtaxiprime/user/appcommon/drawpolyline/PolylineOptionsInterface;", "", "getPolylineOptions", "", "output", "Lcom/google/android/gms/maps/model/PolylineOptions;", "points", "Ljava/util/ArrayList;", "Lcom/google/android/gms/maps/model/LatLng;", "distance", "", "overviewPolyline", "arrivalTime", "stepPoints", "Lcom/newtaxiprime/user/taxiapp/datamodels/StepsClass;", "totalDuration", "", "app_debug"})
public abstract interface PolylineOptionsInterface {
    
    public abstract void getPolylineOptions(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.PolylineOptions output, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.google.android.gms.maps.model.LatLng> points, @org.jetbrains.annotations.NotNull()
    java.lang.String distance, @org.jetbrains.annotations.NotNull()
    java.lang.String overviewPolyline, @org.jetbrains.annotations.NotNull()
    java.lang.String arrivalTime, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.StepsClass> stepPoints, int totalDuration);
}