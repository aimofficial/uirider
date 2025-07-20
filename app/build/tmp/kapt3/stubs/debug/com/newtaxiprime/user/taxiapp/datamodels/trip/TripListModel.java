package com.newtaxiprime.user.taxiapp.datamodels.trip;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR.\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001e\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\b\u00a8\u0006\u001d"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/datamodels/trip/TripListModel;", "", "()V", "currentPage", "", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "data", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/taxiapp/datamodels/trip/TripListModelArrayList;", "Lkotlin/collections/ArrayList;", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "statusCode", "", "getStatusCode", "()Ljava/lang/String;", "setStatusCode", "(Ljava/lang/String;)V", "statusMessage", "getStatusMessage", "setStatusMessage", "totalPages", "getTotalPages", "setTotalPages", "app_debug"})
public final class TripListModel {
    @com.google.gson.annotations.SerializedName(value = "status_code")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusCode = "";
    @com.google.gson.annotations.SerializedName(value = "status_message")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusMessage = "";
    @com.google.gson.annotations.SerializedName(value = "current_page")
    @com.google.gson.annotations.Expose()
    private int currentPage = 0;
    @com.google.gson.annotations.SerializedName(value = "total_pages")
    @com.google.gson.annotations.Expose()
    private int totalPages = 0;
    @com.google.gson.annotations.SerializedName(value = "data")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.trip.TripListModelArrayList> data;
    
    public TripListModel() {
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
    
    public final int getCurrentPage() {
        return 0;
    }
    
    public final void setCurrentPage(int p0) {
    }
    
    public final int getTotalPages() {
        return 0;
    }
    
    public final void setTotalPages(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.trip.TripListModelArrayList> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.trip.TripListModelArrayList> p0) {
    }
}