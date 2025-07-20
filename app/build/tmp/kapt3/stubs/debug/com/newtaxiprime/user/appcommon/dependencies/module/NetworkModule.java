package com.newtaxiprime.user.appcommon.dependencies.module;

/**
 * ***************************************************************
 * NetWork Module
 */
@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\nH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/newtaxiprime/user/appcommon/dependencies/module/NetworkModule;", "", "mBaseUrl", "", "(Ljava/lang/String;)V", "providesApiService", "Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "providesGson", "Lcom/google/gson/Gson;", "providesHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "providesOkHttpClient", "Lokhttp3/OkHttpClient$Builder;", "context", "Landroid/content/Context;", "httpLoggingInterceptor", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "providesRetrofitService", "okHttpClient", "gson", "app_debug"})
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mBaseUrl = null;
    
    @javax.inject.Inject()
    public NetworkModule(@org.jetbrains.annotations.NotNull()
    java.lang.String mBaseUrl) {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.logging.HttpLoggingInterceptor providesHttpLoggingInterceptor() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson providesGson() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient.Builder providesOkHttpClient(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor, @org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit providesRetrofitService(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient.Builder okHttpClient, @org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.interfaces.ApiService providesApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}