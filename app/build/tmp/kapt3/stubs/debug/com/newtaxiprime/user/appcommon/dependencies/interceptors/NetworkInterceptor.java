package com.newtaxiprime.user.appcommon.dependencies.interceptors;

/**
 * ***************************************************************
 * NetWork Interceptor
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/newtaxiprime/user/appcommon/dependencies/interceptors/NetworkInterceptor;", "Lokhttp3/Interceptor;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getNetworkFailResponse", "Lokhttp3/ResponseBody;", "response", "Lokhttp3/Response;", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "isOnline", "", "context", "app_debug"})
public final class NetworkInterceptor implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    
    public NetworkInterceptor(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @org.jetbrains.annotations.NotNull()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        return null;
    }
    
    private final boolean isOnline(android.content.Context context) {
        return false;
    }
    
    private final okhttp3.ResponseBody getNetworkFailResponse(okhttp3.Response response) {
        return null;
    }
}