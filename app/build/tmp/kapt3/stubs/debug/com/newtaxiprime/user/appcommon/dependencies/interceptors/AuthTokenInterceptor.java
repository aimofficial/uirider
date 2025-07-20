package com.newtaxiprime.user.appcommon.dependencies.interceptors;

/**
 * ***************************************************************
 * Auth Token Interceptor
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/newtaxiprime/user/appcommon/dependencies/interceptors/AuthTokenInterceptor;", "Lokhttp3/Interceptor;", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "requestBuilder", "Lokhttp3/Request$Builder;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_debug"})
public final class AuthTokenInterceptor implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull()
    private final com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager = null;
    @org.jetbrains.annotations.Nullable()
    private okhttp3.Request.Builder requestBuilder;
    
    public AuthTokenInterceptor(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager) {
        super();
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @org.jetbrains.annotations.NotNull()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        return null;
    }
}