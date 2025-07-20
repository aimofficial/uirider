package com.newtaxiprime.user.appcommon.drawpolyline;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J&\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b0\u00040\u00042\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u0013"}, d2 = {"Lcom/newtaxiprime/user/appcommon/drawpolyline/DirectionsJSONParser;", "", "()V", "decodePoly", "", "encoded", "", "parse", "Ljava/util/HashMap;", "jObject", "Lorg/json/JSONObject;", "parseDistance", "parseDuration", "", "parseOverviewPolyline", "parseStepPoints", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/taxiapp/datamodels/StepsClass;", "parseTime", "app_debug"})
public final class DirectionsJSONParser {
    
    public DirectionsJSONParser() {
        super();
    }
    
    /**
     * Receives a JSONObject and returns a list of lists containing latitude and longitude
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.List<java.util.HashMap<java.lang.String, java.lang.String>>> parse(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject jObject) {
        return null;
    }
    
    /**
     * Receives a JSONObject and returns a Distance
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String parseDistance(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject jObject) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String parseTime(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject jObject) {
        return null;
    }
    
    /**
     * To get step points for Eta calculation
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.StepsClass> parseStepPoints(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject jObject) {
        return null;
    }
    
    /**
     * To get overall duration
     */
    public final int parseDuration(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject jObject) {
        return 0;
    }
    
    /**
     * Receives a JSONObject and returns a OverviewPolyline for static map route
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String parseOverviewPolyline(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject jObject) {
        return null;
    }
    
    /**
     * Method to decode polyline points
     * Courtesy : http://jeffreysambells.com/2010/05/27/decoding-polylines-from-google-maps-direction-api-with-java
     */
    private final java.util.List<?> decodePoly(java.lang.String encoded) {
        return null;
    }
}