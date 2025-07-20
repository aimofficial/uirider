package com.newtaxiprime.user.appcommon.map;

/**
 * This constructor is required, and calls the super IntentService(String)
 * constructor with the name for a worker thread.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/newtaxiprime/user/appcommon/map/FetchAddressIntentService;", "Landroid/app/IntentService;", "()V", "mReceiver", "Landroid/os/ResultReceiver;", "getMReceiver", "()Landroid/os/ResultReceiver;", "setMReceiver", "(Landroid/os/ResultReceiver;)V", "deliverResultToReceiver", "", "resultCode", "", "message", "", "address", "Landroid/location/Address;", "onHandleIntent", "intent", "Landroid/content/Intent;", "Companion", "app_debug"})
public final class FetchAddressIntentService extends android.app.IntentService {
    
    /**
     * The receiver where results are forwarded from this service.
     */
    @org.jetbrains.annotations.Nullable()
    private android.os.ResultReceiver mReceiver;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "FetchAddressIS";
    @org.jetbrains.annotations.NotNull()
    public static final com.newtaxiprime.user.appcommon.map.FetchAddressIntentService.Companion Companion = null;
    
    public FetchAddressIntentService() {
        super(null);
    }
    
    /**
     * The receiver where results are forwarded from this service.
     */
    @org.jetbrains.annotations.Nullable()
    protected final android.os.ResultReceiver getMReceiver() {
        return null;
    }
    
    /**
     * The receiver where results are forwarded from this service.
     */
    protected final void setMReceiver(@org.jetbrains.annotations.Nullable()
    android.os.ResultReceiver p0) {
    }
    
    /**
     * Tries to get the location address using a Geocoder. If successful, sends an address to a
     * result receiver. If unsuccessful, sends an error message instead.
     * Note: We define a [ResultReceiver] in * MainActivity to process content
     * sent from this service.
     *
     *
     * This service calls this method from the default worker thread with the intent that started
     * the service. When this method returns, the service automatically stops.
     */
    @java.lang.Override()
    protected void onHandleIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    /**
     * Sends a resultCode and message to the receiver.
     */
    private final void deliverResultToReceiver(int resultCode, java.lang.String message, android.location.Address address) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/newtaxiprime/user/appcommon/map/FetchAddressIntentService$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}