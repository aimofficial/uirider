package com.newtaxiprime.user.appcommon.backgroundtask;

/**
 * ***************************************************************
 * Compress image while upload in background
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ#\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u001d\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\u001eJ\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\"\u001a\u00020 H\u0014J\u000e\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0006R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006%"}, d2 = {"Lcom/newtaxiprime/user/appcommon/backgroundtask/ImageCompressAsyncTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "filePath", "", "imageListener", "Lcom/newtaxiprime/user/appcommon/interfaces/ImageListener;", "(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Lcom/newtaxiprime/user/appcommon/interfaces/ImageListener;)V", "compressImgWeakRef", "Ljava/lang/ref/WeakReference;", "compressPath", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "requestBody", "Lokhttp3/RequestBody;", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/lang/Void;", "onPostExecute", "", "value", "onPreExecute", "uploadImgParam", "imagePath", "app_debug"})
public final class ImageCompressAsyncTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
    @org.jetbrains.annotations.Nullable()
    private final com.newtaxiprime.user.appcommon.interfaces.ImageListener imageListener = null;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String filePath = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String compressPath = "";
    @org.jetbrains.annotations.Nullable()
    private final java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatActivity> compressImgWeakRef = null;
    @org.jetbrains.annotations.Nullable()
    private okhttp3.RequestBody requestBody;
    public android.content.Context context;
    
    public ImageCompressAsyncTask(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.Nullable()
    java.lang.String filePath, @org.jetbrains.annotations.Nullable()
    com.newtaxiprime.user.appcommon.interfaces.ImageListener imageListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.configs.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.configs.SessionManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    /**
     * Call when before call the WS.
     */
    @java.lang.Override()
    protected void onPreExecute() {
    }
    
    /**
     * action to be performed in background
     */
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    protected java.lang.Void doInBackground(@org.jetbrains.annotations.NotNull()
    java.lang.Void... params) {
        return null;
    }
    
    /**
     * called after the WS return the response.
     */
    @java.lang.Override()
    protected void onPostExecute(@org.jetbrains.annotations.Nullable()
    java.lang.Void value) {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.RequestBody uploadImgParam(@org.jetbrains.annotations.NotNull()
    java.lang.String imagePath) throws java.io.IOException {
        return null;
    }
}