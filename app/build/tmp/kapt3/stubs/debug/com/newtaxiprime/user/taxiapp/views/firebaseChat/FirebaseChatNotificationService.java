package com.newtaxiprime.user.taxiapp.views.firebaseChat;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/firebaseChat/FirebaseChatNotificationService;", "Landroid/app/Service;", "Lcom/newtaxiprime/user/taxiapp/views/firebaseChat/FirebaseChatHandler$FirebaseChatHandlerInterface;", "()V", "firebaseChatHandler", "Lcom/newtaxiprime/user/taxiapp/views/firebaseChat/FirebaseChatHandler;", "notificationUtils", "Lcom/newtaxiprime/user/appcommon/pushnotification/NotificationUtils;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "pushMessage", "firebaseChatModelClass", "Lcom/newtaxiprime/user/taxiapp/views/firebaseChat/FirebaseChatModelClass;", "app_debug"})
public final class FirebaseChatNotificationService extends android.app.Service implements com.newtaxiprime.user.taxiapp.views.firebaseChat.FirebaseChatHandler.FirebaseChatHandlerInterface {
    private com.newtaxiprime.user.taxiapp.views.firebaseChat.FirebaseChatHandler firebaseChatHandler;
    private com.newtaxiprime.user.appcommon.pushnotification.NotificationUtils notificationUtils;
    
    public FirebaseChatNotificationService() {
        super();
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
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void pushMessage(@org.jetbrains.annotations.Nullable()
    com.newtaxiprime.user.taxiapp.views.firebaseChat.FirebaseChatModelClass firebaseChatModelClass) {
    }
}