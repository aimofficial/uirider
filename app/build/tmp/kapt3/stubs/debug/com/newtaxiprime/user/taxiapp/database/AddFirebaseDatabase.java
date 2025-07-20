package com.newtaxiprime.user.taxiapp.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0016\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010 \u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020\u001bJ\u001e\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0004\n\u0002\b\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006&"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/database/AddFirebaseDatabase;", "", "()V", "TAG", "", "commonMethods", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "getCommonMethods", "()Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "setCommonMethods", "(Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;)V", "firebaseReqListener", "Lcom/newtaxiprime/user/taxiapp/database/IFirebaseReqListener;", "mFirebaseDatabase", "Lcom/google/firebase/database/DatabaseReference;", "mSearchedDriverReferenceListener", "Lcom/google/firebase/database/ValueEventListener;", "query", "Lcom/google/firebase/database/Query;", "query$1", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager$app_debug", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager$app_debug", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "addRequestChangeListener", "", "createRequestTable", "context", "Landroid/content/Context;", "firebasePushLisener", "removeNodesAfterCompletedTrip", "removeRequestTable", "updatePaymentChangedNode", "isWalletAvail", "paymentType", "Companion", "app_debug"})
public final class AddFirebaseDatabase {
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.utils.CommonMethods commonMethods;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.DatabaseReference mFirebaseDatabase;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.ValueEventListener mSearchedDriverReferenceListener;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.Query query$1;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "Android_Debug";
    @org.jetbrains.annotations.Nullable()
    private com.newtaxiprime.user.taxiapp.database.IFirebaseReqListener firebaseReqListener;
    @org.jetbrains.annotations.Nullable()
    private static com.google.firebase.database.ValueEventListener firebaseDbPush;
    @org.jetbrains.annotations.Nullable()
    private static com.google.firebase.database.Query query;
    @org.jetbrains.annotations.Nullable()
    private static com.google.firebase.database.Query pushNotifQuery;
    @org.jetbrains.annotations.NotNull()
    public static final com.newtaxiprime.user.taxiapp.database.AddFirebaseDatabase.Companion Companion = null;
    
    public AddFirebaseDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.configs.SessionManager getSessionManager$app_debug() {
        return null;
    }
    
    public final void setSessionManager$app_debug(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.configs.SessionManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.utils.CommonMethods getCommonMethods() {
        return null;
    }
    
    public final void setCommonMethods(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.utils.CommonMethods p0) {
    }
    
    public final void createRequestTable(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.database.IFirebaseReqListener firebaseReqListener, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void removeRequestTable() {
    }
    
    public final void removeNodesAfterCompletedTrip(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void firebasePushLisener(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void addRequestChangeListener() {
    }
    
    public final void updatePaymentChangedNode(@org.jetbrains.annotations.NotNull()
    java.lang.String isWalletAvail, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentType, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/database/AddFirebaseDatabase$Companion;", "", "()V", "firebaseDbPush", "Lcom/google/firebase/database/ValueEventListener;", "pushNotifQuery", "Lcom/google/firebase/database/Query;", "query", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}