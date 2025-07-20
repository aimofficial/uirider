package com.newtaxiprime.user.taxiapp.views.firebaseChat;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0000\u00a2\u0006\u0002\b\u001aJ\r\u0010\u001b\u001a\u00020\u0017H\u0000\u00a2\u0006\u0002\b\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/firebaseChat/FirebaseChatHandler;", "", "callbackListener", "Lcom/newtaxiprime/user/taxiapp/views/firebaseChat/FirebaseChatHandler$FirebaseChatHandlerInterface;", "firebaseChatserviceTriggeredFrom", "", "(Lcom/newtaxiprime/user/taxiapp/views/firebaseChat/FirebaseChatHandler$FirebaseChatHandlerInterface;I)V", "childEventListener", "Lcom/google/firebase/database/ChildEventListener;", "isChatTriggerable", "", "Ljava/lang/Boolean;", "root", "Lcom/google/firebase/database/DatabaseReference;", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "valueEventListener", "Lcom/google/firebase/database/ValueEventListener;", "addMessage", "", "message", "", "addMessage$app_debug", "unRegister", "unRegister$app_debug", "FirebaseChatHandlerInterface", "app_debug"})
public final class FirebaseChatHandler {
    @org.jetbrains.annotations.NotNull()
    private final com.newtaxiprime.user.taxiapp.views.firebaseChat.FirebaseChatHandler.FirebaseChatHandlerInterface callbackListener = null;
    @com.newtaxiprime.user.appcommon.utils.CommonKeys.FirebaseChatserviceTriggeredFrom()
    private int firebaseChatserviceTriggeredFrom;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.database.DatabaseReference root = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isChatTriggerable = false;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.database.ChildEventListener childEventListener = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.database.ValueEventListener valueEventListener = null;
    
    public FirebaseChatHandler(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.firebaseChat.FirebaseChatHandler.FirebaseChatHandlerInterface callbackListener, @com.newtaxiprime.user.appcommon.utils.CommonKeys.FirebaseChatserviceTriggeredFrom()
    int firebaseChatserviceTriggeredFrom) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.configs.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.configs.SessionManager p0) {
    }
    
    public final void addMessage$app_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void unRegister$app_debug() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/firebaseChat/FirebaseChatHandler$FirebaseChatHandlerInterface;", "", "pushMessage", "", "firebaseChatModelClass", "Lcom/newtaxiprime/user/taxiapp/views/firebaseChat/FirebaseChatModelClass;", "app_debug"})
    public static abstract interface FirebaseChatHandlerInterface {
        
        public abstract void pushMessage(@org.jetbrains.annotations.Nullable()
        com.newtaxiprime.user.taxiapp.views.firebaseChat.FirebaseChatModelClass firebaseChatModelClass);
    }
}