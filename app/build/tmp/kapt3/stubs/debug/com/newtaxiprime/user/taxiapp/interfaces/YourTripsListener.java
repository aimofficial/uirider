package com.newtaxiprime.user.taxiapp.interfaces;

/**
 * ***************************************************************
 * YourTripsListener
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/interfaces/YourTripsListener;", "", "instance", "Lcom/newtaxiprime/user/taxiapp/sidebar/trips/YourTrips;", "getInstance", "()Lcom/newtaxiprime/user/taxiapp/sidebar/trips/YourTrips;", "res", "Landroid/content/res/Resources;", "getRes", "()Landroid/content/res/Resources;", "app_debug"})
public abstract interface YourTripsListener {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.res.Resources getRes();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.newtaxiprime.user.taxiapp.sidebar.trips.YourTrips getInstance();
}