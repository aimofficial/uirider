package com.newtaxiprime.user.appcommon.drawpolyline;

/**
 * A class to parse the Google Places in JSON format
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002,\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00050\u00040\u00040\u0001B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ;\u0010/\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00050\u0004\u0018\u00010\u00042\u0012\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000201\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u00102J\u0010\u00103\u001a\u0002042\b\u0010\b\u001a\u0004\u0018\u00010\tJ*\u00105\u001a\u0002062 \u00107\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00050\u0004\u0018\u00010\u0004H\u0014R\u001a\u0010\u000b\u001a\u00020\u0002X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0002X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\u001a\u0010\u0017\u001a\u00020\u0002X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR4\u0010\u001e\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00050\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u00a8\u00068"}, d2 = {"Lcom/newtaxiprime/user/appcommon/drawpolyline/ParserTask;", "Landroid/os/AsyncTask;", "", "", "", "Ljava/util/HashMap;", "polylineOptionsInterface", "Lcom/newtaxiprime/user/appcommon/drawpolyline/PolylineOptionsInterface;", "context", "Landroid/content/Context;", "(Lcom/newtaxiprime/user/appcommon/drawpolyline/PolylineOptionsInterface;Landroid/content/Context;)V", "arrivalTime", "getArrivalTime$app_debug", "()Ljava/lang/String;", "setArrivalTime$app_debug", "(Ljava/lang/String;)V", "getContext$app_debug", "()Landroid/content/Context;", "setContext$app_debug", "(Landroid/content/Context;)V", "distances", "getDistances$app_debug", "setDistances$app_debug", "overview_polyline", "getOverview_polyline$app_debug", "setOverview_polyline$app_debug", "getPolylineOptionsInterface", "()Lcom/newtaxiprime/user/appcommon/drawpolyline/PolylineOptionsInterface;", "setPolylineOptionsInterface", "(Lcom/newtaxiprime/user/appcommon/drawpolyline/PolylineOptionsInterface;)V", "routes", "getRoutes$app_debug", "()Ljava/util/List;", "setRoutes$app_debug", "(Ljava/util/List;)V", "stepPoints", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/taxiapp/datamodels/StepsClass;", "getStepPoints", "()Ljava/util/ArrayList;", "setStepPoints", "(Ljava/util/ArrayList;)V", "totalDuration", "getTotalDuration", "()I", "setTotalDuration", "(I)V", "doInBackground", "jsonData", "", "([Ljava/lang/String;)Ljava/util/List;", "isOnline", "", "onPostExecute", "", "result", "app_debug"})
public final class ParserTask extends android.os.AsyncTask<java.lang.String, java.lang.Integer, java.util.List<? extends java.util.List<? extends java.util.HashMap<java.lang.String, java.lang.String>>>> {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends java.util.List<? extends java.util.HashMap<java.lang.String, java.lang.String>>> routes;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String distances = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String arrivalTime = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String overview_polyline = "";
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.StepsClass> stepPoints;
    private int totalDuration = 0;
    @org.jetbrains.annotations.Nullable()
    private com.newtaxiprime.user.appcommon.drawpolyline.PolylineOptionsInterface polylineOptionsInterface;
    
    public ParserTask(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.drawpolyline.PolylineOptionsInterface polylineOptionsInterface, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext$app_debug() {
        return null;
    }
    
    public final void setContext$app_debug(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.util.List<java.util.HashMap<java.lang.String, java.lang.String>>> getRoutes$app_debug() {
        return null;
    }
    
    public final void setRoutes$app_debug(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.util.List<? extends java.util.HashMap<java.lang.String, java.lang.String>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistances$app_debug() {
        return null;
    }
    
    public final void setDistances$app_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getArrivalTime$app_debug() {
        return null;
    }
    
    public final void setArrivalTime$app_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOverview_polyline$app_debug() {
        return null;
    }
    
    public final void setOverview_polyline$app_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.StepsClass> getStepPoints() {
        return null;
    }
    
    public final void setStepPoints(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.StepsClass> p0) {
    }
    
    public final int getTotalDuration() {
        return 0;
    }
    
    public final void setTotalDuration(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.newtaxiprime.user.appcommon.drawpolyline.PolylineOptionsInterface getPolylineOptionsInterface() {
        return null;
    }
    
    public final void setPolylineOptionsInterface(@org.jetbrains.annotations.Nullable()
    com.newtaxiprime.user.appcommon.drawpolyline.PolylineOptionsInterface p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    protected java.util.List<java.util.List<java.util.HashMap<java.lang.String, java.lang.String>>> doInBackground(@org.jetbrains.annotations.NotNull()
    java.lang.String... jsonData) {
        return null;
    }
    
    @java.lang.Override()
    protected void onPostExecute(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.util.List<? extends java.util.HashMap<java.lang.String, java.lang.String>>> result) {
    }
    
    public final boolean isOnline(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return false;
    }
}