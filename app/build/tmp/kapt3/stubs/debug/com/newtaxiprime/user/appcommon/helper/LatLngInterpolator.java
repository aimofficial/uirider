package com.newtaxiprime.user.appcommon.helper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\bJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lcom/newtaxiprime/user/appcommon/helper/LatLngInterpolator;", "", "interpolate", "Lcom/google/android/gms/maps/model/LatLng;", "fraction", "", "a", "b", "LinearFixed", "app_debug"})
public abstract interface LatLngInterpolator {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.android.gms.maps.model.LatLng interpolate(float fraction, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng a, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng b);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/newtaxiprime/user/appcommon/helper/LatLngInterpolator$LinearFixed;", "Lcom/newtaxiprime/user/appcommon/helper/LatLngInterpolator;", "()V", "interpolate", "Lcom/google/android/gms/maps/model/LatLng;", "fraction", "", "a", "b", "app_debug"})
    public static final class LinearFixed implements com.newtaxiprime.user.appcommon.helper.LatLngInterpolator {
        
        public LinearFixed() {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.google.android.gms.maps.model.LatLng interpolate(float fraction, @org.jetbrains.annotations.NotNull()
        com.google.android.gms.maps.model.LatLng a, @org.jetbrains.annotations.NotNull()
        com.google.android.gms.maps.model.LatLng b) {
            return null;
        }
    }
}