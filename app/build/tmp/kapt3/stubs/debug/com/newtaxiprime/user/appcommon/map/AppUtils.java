package com.newtaxiprime.user.appcommon.map;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/newtaxiprime/user/appcommon/map/AppUtils;", "", "()V", "Companion", "LocationConstants", "app_debug"})
public final class AppUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.newtaxiprime.user.appcommon.map.AppUtils.Companion Companion = null;
    
    public AppUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, d2 = {"Lcom/newtaxiprime/user/appcommon/map/AppUtils$Companion;", "", "()V", "hasLollipop", "", "isLocationEnabled", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean hasLollipop() {
            return false;
        }
        
        /**
         * Check is Location is enable or not
         */
        public final boolean isLocationEnabled(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006\u00a8\u0006\u0019"}, d2 = {"Lcom/newtaxiprime/user/appcommon/map/AppUtils$LocationConstants;", "", "()V", "FAILURE_RESULT", "", "getFAILURE_RESULT", "()I", "LOCATION_DATA_AREA", "", "getLOCATION_DATA_AREA", "()Ljava/lang/String;", "LOCATION_DATA_CITY", "getLOCATION_DATA_CITY", "LOCATION_DATA_EXTRA", "getLOCATION_DATA_EXTRA", "LOCATION_DATA_STREET", "getLOCATION_DATA_STREET", "PACKAGE_NAME", "getPACKAGE_NAME", "RECEIVER", "getRECEIVER", "RESULT_DATA_KEY", "getRESULT_DATA_KEY", "SUCCESS_RESULT", "getSUCCESS_RESULT", "app_debug"})
    public static final class LocationConstants {
        private static final int SUCCESS_RESULT = 0;
        private static final int FAILURE_RESULT = 1;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String PACKAGE_NAME = "com.newtaxiprime.user.map";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String RECEIVER = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String RESULT_DATA_KEY = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String LOCATION_DATA_EXTRA = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String LOCATION_DATA_AREA = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String LOCATION_DATA_CITY = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String LOCATION_DATA_STREET = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.newtaxiprime.user.appcommon.map.AppUtils.LocationConstants INSTANCE = null;
        
        private LocationConstants() {
            super();
        }
        
        public final int getSUCCESS_RESULT() {
            return 0;
        }
        
        public final int getFAILURE_RESULT() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPACKAGE_NAME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRECEIVER() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRESULT_DATA_KEY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLOCATION_DATA_EXTRA() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLOCATION_DATA_AREA() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLOCATION_DATA_CITY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLOCATION_DATA_STREET() {
            return null;
        }
    }
}