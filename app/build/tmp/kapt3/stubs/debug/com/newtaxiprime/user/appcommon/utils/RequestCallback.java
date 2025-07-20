package com.newtaxiprime.user.appcommon.utils;

/**
 * ***************************************************************
 * RequestCallback
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tB\u001f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\"\u0010.\u001a\u0004\u0018\u00010#2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001002\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000bH\u0002J\u0010\u00105\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000bH\u0002J*\u00106\u001a\u0004\u0018\u00010#2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001002\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000108H\u0002J\u0010\u00109\u001a\u00020 2\u0006\u00104\u001a\u00020\u000bH\u0002J\u001e\u0010:\u001a\u00020;2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0002002\u0006\u00101\u001a\u000202H\u0016J$\u0010<\u001a\u00020;2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0002002\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000208H\u0016R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-\u00a8\u0006="}, d2 = {"Lcom/newtaxiprime/user/appcommon/utils/RequestCallback;", "Lretrofit2/Callback;", "Lokhttp3/ResponseBody;", "()V", "listener", "Lcom/newtaxiprime/user/appcommon/interfaces/ServiceListener;", "(Lcom/newtaxiprime/user/appcommon/interfaces/ServiceListener;)V", "requestCode", "", "(ILcom/newtaxiprime/user/appcommon/interfaces/ServiceListener;)V", "requestData", "", "(ILcom/newtaxiprime/user/appcommon/interfaces/ServiceListener;Ljava/lang/String;)V", "apiService", "Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;", "getApiService", "()Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;", "setApiService", "(Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;)V", "commonMethods", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "getCommonMethods", "()Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "setCommonMethods", "(Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "isOnline", "", "()Z", "jsonResp", "Lcom/newtaxiprime/user/appcommon/datamodels/JsonResponse;", "getJsonResp", "()Lcom/newtaxiprime/user/appcommon/datamodels/JsonResponse;", "setJsonResp", "(Lcom/newtaxiprime/user/appcommon/datamodels/JsonResponse;)V", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "getFailureResponse", "call", "Lretrofit2/Call;", "t", "", "getStatusCode", "jsonString", "getStatusMsg", "getSuccessResponse", "response", "Lretrofit2/Response;", "isSuccess", "onFailure", "", "onResponse", "app_debug"})
public final class RequestCallback implements retrofit2.Callback<okhttp3.ResponseBody> {
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.datamodels.JsonResponse jsonResp;
    @javax.inject.Inject()
    public android.content.Context context;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.interfaces.ApiService apiService;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.utils.CommonMethods commonMethods;
    private com.newtaxiprime.user.appcommon.interfaces.ServiceListener listener;
    private int requestCode = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String requestData = "";
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.datamodels.JsonResponse getJsonResp() {
        return null;
    }
    
    public final void setJsonResp(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.datamodels.JsonResponse p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.configs.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.configs.SessionManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.interfaces.ApiService getApiService() {
        return null;
    }
    
    public final void setApiService(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.interfaces.ApiService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.utils.CommonMethods getCommonMethods() {
        return null;
    }
    
    public final void setCommonMethods(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.utils.CommonMethods p0) {
    }
    
    private final boolean isOnline() {
        return false;
    }
    
    public RequestCallback() {
        super();
    }
    
    public RequestCallback(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.interfaces.ServiceListener listener) {
        super();
    }
    
    public RequestCallback(int requestCode, @org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.interfaces.ServiceListener listener) {
        super();
    }
    
    public RequestCallback(int requestCode, @org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.interfaces.ServiceListener listener, @org.jetbrains.annotations.NotNull()
    java.lang.String requestData) {
        super();
    }
    
    @java.lang.Override()
    public void onResponse(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<okhttp3.ResponseBody> call, @org.jetbrains.annotations.NotNull()
    retrofit2.Response<okhttp3.ResponseBody> response) {
    }
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<okhttp3.ResponseBody> call, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable t) {
    }
    
    private final com.newtaxiprime.user.appcommon.datamodels.JsonResponse getFailureResponse(retrofit2.Call<okhttp3.ResponseBody> call, java.lang.Throwable t) {
        return null;
    }
    
    private final com.newtaxiprime.user.appcommon.datamodels.JsonResponse getSuccessResponse(retrofit2.Call<okhttp3.ResponseBody> call, retrofit2.Response<okhttp3.ResponseBody> response) {
        return null;
    }
    
    private final boolean isSuccess(java.lang.String jsonString) {
        return false;
    }
    
    private final java.lang.String getStatusMsg(java.lang.String jsonString) {
        return null;
    }
    
    private final java.lang.String getStatusCode(java.lang.String jsonString) {
        return null;
    }
}