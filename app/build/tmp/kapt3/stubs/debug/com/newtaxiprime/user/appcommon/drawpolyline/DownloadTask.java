package com.newtaxiprime.user.appcommon.drawpolyline;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ!\u0010\u0017\u001a\u00020\u00022\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0019\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0002H\u0014R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006 "}, d2 = {"Lcom/newtaxiprime/user/appcommon/drawpolyline/DownloadTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "polylineOptionsInterface", "Lcom/newtaxiprime/user/appcommon/drawpolyline/PolylineOptionsInterface;", "mContext", "Landroid/content/Context;", "(Lcom/newtaxiprime/user/appcommon/drawpolyline/PolylineOptionsInterface;Landroid/content/Context;)V", "commonMethods", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "getCommonMethods", "()Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "setCommonMethods", "(Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;)V", "getMContext$app_debug", "()Landroid/content/Context;", "setMContext$app_debug", "(Landroid/content/Context;)V", "getPolylineOptionsInterface$app_debug", "()Lcom/newtaxiprime/user/appcommon/drawpolyline/PolylineOptionsInterface;", "setPolylineOptionsInterface$app_debug", "(Lcom/newtaxiprime/user/appcommon/drawpolyline/PolylineOptionsInterface;)V", "doInBackground", "url", "", "([Ljava/lang/String;)Ljava/lang/String;", "downloadUrl", "strUrl", "onPostExecute", "", "result", "app_debug"})
public final class DownloadTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.String> {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull()
    private com.newtaxiprime.user.appcommon.drawpolyline.PolylineOptionsInterface polylineOptionsInterface;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.utils.CommonMethods commonMethods;
    
    public DownloadTask(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.drawpolyline.PolylineOptionsInterface polylineOptionsInterface, @org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext$app_debug() {
        return null;
    }
    
    public final void setMContext$app_debug(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.drawpolyline.PolylineOptionsInterface getPolylineOptionsInterface$app_debug() {
        return null;
    }
    
    public final void setPolylineOptionsInterface$app_debug(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.drawpolyline.PolylineOptionsInterface p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.utils.CommonMethods getCommonMethods() {
        return null;
    }
    
    public final void setCommonMethods(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.utils.CommonMethods p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected java.lang.String doInBackground(@org.jetbrains.annotations.NotNull()
    java.lang.String... url) {
        return null;
    }
    
    @java.lang.Override()
    protected void onPostExecute(@org.jetbrains.annotations.NotNull()
    java.lang.String result) {
    }
    
    /**
     * A method to download json data from url
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    private final java.lang.String downloadUrl(java.lang.String strUrl) throws java.io.IOException {
        return null;
    }
}