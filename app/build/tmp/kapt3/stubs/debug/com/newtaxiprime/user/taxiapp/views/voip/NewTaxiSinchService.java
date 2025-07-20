package com.newtaxiprime.user.taxiapp.views.voip;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 42\u00020\u00012\u00020\u0002:\u0003456B\u0005\u00a2\u0006\u0002\u0010\u0003J&\u0010!\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u0007J\b\u0010&\u001a\u0004\u0018\u00010\'J\u0014\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\"H\u0016J\b\u0010-\u001a\u00020\"H\u0016J\u0012\u0010.\u001a\u00020\"2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0006\u00101\u001a\u00020\"J\u000e\u00102\u001a\u00020\"2\u0006\u00103\u001a\u000200R\u0012\u0010\u0004\u001a\u00060\u0005R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u00067"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/voip/NewTaxiSinchService;", "Landroid/app/Service;", "Lcom/sinch/android/rtc/PushTokenRegistrationCallback;", "()V", "mBinder", "Lcom/newtaxiprime/user/taxiapp/views/voip/NewTaxiSinchService$MyBinder;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mPushTokenIsRegistered", "", "getMPushTokenIsRegistered$app_debug", "()Z", "setMPushTokenIsRegistered$app_debug", "(Z)V", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "sinchService", "getSinchService", "()Lcom/newtaxiprime/user/taxiapp/views/voip/NewTaxiSinchService;", "userCallId", "", "getUserCallId$app_debug", "()Ljava/lang/String;", "setUserCallId$app_debug", "(Ljava/lang/String;)V", "createSinchClient", "", "sinchKey", "sinchSecret", "context", "getSinchClient", "Lcom/sinch/android/rtc/SinchClient;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onPushTokenRegistered", "onPushTokenRegistrationFailed", "p0", "Lcom/sinch/android/rtc/SinchError;", "tokenRegistered", "tokenRegistrationFailed", "sinchError", "Companion", "MyBinder", "SinchCallClientListener", "app_debug"})
public final class NewTaxiSinchService extends android.app.Service implements com.sinch.android.rtc.PushTokenRegistrationCallback {
    public android.content.Context mContext;
    private boolean mPushTokenIsRegistered = true;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userCallId = "";
    @org.jetbrains.annotations.NotNull()
    private com.newtaxiprime.user.taxiapp.views.voip.NewTaxiSinchService.MyBinder mBinder;
    @org.jetbrains.annotations.Nullable()
    private static com.sinch.android.rtc.SinchClient sinchClient;
    @org.jetbrains.annotations.Nullable()
    private static com.sinch.android.rtc.calling.Call call;
    @org.jetbrains.annotations.NotNull()
    public static final com.newtaxiprime.user.taxiapp.views.voip.NewTaxiSinchService.Companion Companion = null;
    
    public NewTaxiSinchService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public final boolean getMPushTokenIsRegistered$app_debug() {
        return false;
    }
    
    public final void setMPushTokenIsRegistered$app_debug(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.configs.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.configs.SessionManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserCallId$app_debug() {
        return null;
    }
    
    public final void setUserCallId$app_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.taxiapp.views.voip.NewTaxiSinchService getSinchService() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public final void createSinchClient(@org.jetbrains.annotations.NotNull()
    java.lang.String userCallId, @org.jetbrains.annotations.NotNull()
    java.lang.String sinchKey, @org.jetbrains.annotations.NotNull()
    java.lang.String sinchSecret, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void tokenRegistered() {
    }
    
    public final void tokenRegistrationFailed(@org.jetbrains.annotations.NotNull()
    com.sinch.android.rtc.SinchError sinchError) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sinch.android.rtc.SinchClient getSinchClient() {
        return null;
    }
    
    @java.lang.Override()
    public void onPushTokenRegistered() {
    }
    
    @java.lang.Override()
    public void onPushTokenRegistrationFailed(@org.jetbrains.annotations.Nullable()
    com.sinch.android.rtc.SinchError p0) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/voip/NewTaxiSinchService$Companion;", "", "()V", "call", "Lcom/sinch/android/rtc/calling/Call;", "getCall", "()Lcom/sinch/android/rtc/calling/Call;", "setCall", "(Lcom/sinch/android/rtc/calling/Call;)V", "sinchClient", "Lcom/sinch/android/rtc/SinchClient;", "getSinchClient", "()Lcom/sinch/android/rtc/SinchClient;", "setSinchClient", "(Lcom/sinch/android/rtc/SinchClient;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.sinch.android.rtc.SinchClient getSinchClient() {
            return null;
        }
        
        public final void setSinchClient(@org.jetbrains.annotations.Nullable()
        com.sinch.android.rtc.SinchClient p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.sinch.android.rtc.calling.Call getCall() {
            return null;
        }
        
        public final void setCall(@org.jetbrains.annotations.Nullable()
        com.sinch.android.rtc.calling.Call p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/voip/NewTaxiSinchService$MyBinder;", "Landroid/os/Binder;", "(Lcom/newtaxiprime/user/taxiapp/views/voip/NewTaxiSinchService;)V", "sinchClient", "Lcom/newtaxiprime/user/taxiapp/views/voip/NewTaxiSinchService;", "getSinchClient", "()Lcom/newtaxiprime/user/taxiapp/views/voip/NewTaxiSinchService;", "app_debug"})
    public final class MyBinder extends android.os.Binder {
        
        public MyBinder() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.newtaxiprime.user.taxiapp.views.voip.NewTaxiSinchService getSinchClient() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/voip/NewTaxiSinchService$SinchCallClientListener;", "Lcom/sinch/android/rtc/calling/CallClientListener;", "(Lcom/newtaxiprime/user/taxiapp/views/voip/NewTaxiSinchService;)V", "onIncomingCall", "", "callClient", "Lcom/sinch/android/rtc/calling/CallClient;", "incomingCall", "Lcom/sinch/android/rtc/calling/Call;", "app_debug"})
    final class SinchCallClientListener implements com.sinch.android.rtc.calling.CallClientListener {
        
        public SinchCallClientListener() {
            super();
        }
        
        @java.lang.Override()
        public void onIncomingCall(@org.jetbrains.annotations.NotNull()
        com.sinch.android.rtc.calling.CallClient callClient, @org.jetbrains.annotations.NotNull()
        com.sinch.android.rtc.calling.Call incomingCall) {
        }
    }
}