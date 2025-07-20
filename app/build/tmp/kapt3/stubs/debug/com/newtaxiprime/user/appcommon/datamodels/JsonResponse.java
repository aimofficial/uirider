package com.newtaxiprime.user.appcommon.datamodels;

/**
 * ***************************************************************
 * Json Response Model
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010+\u001a\u00020,R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001a\u0010\u001c\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001a\u0010\"\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b\'\u0010\bR\u001a\u0010(\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\b\u00a8\u0006-"}, d2 = {"Lcom/newtaxiprime/user/appcommon/datamodels/JsonResponse;", "", "()V", "errorMsg", "", "getErrorMsg", "()Ljava/lang/String;", "setErrorMsg", "(Ljava/lang/String;)V", "isOnline", "", "()Z", "setOnline", "(Z)V", "isSuccess", "setSuccess", "method", "getMethod", "setMethod", "requestCode", "", "getRequestCode", "()I", "setRequestCode", "(I)V", "requestData", "getRequestData", "setRequestData", "responseCode", "getResponseCode", "setResponseCode", "statusCode", "getStatusCode", "setStatusCode", "statusMsg", "getStatusMsg", "setStatusMsg", "strResponse", "getStrResponse", "setStrResponse", "url", "getUrl", "setUrl", "clearAll", "", "app_debug"})
public final class JsonResponse {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String url = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String method = "";
    private int responseCode = 0;
    private int requestCode = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String errorMsg = "";
    private boolean isOnline = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusMsg = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusCode = "";
    private boolean isSuccess = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strResponse = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String requestData = "";
    
    public JsonResponse() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final void setUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMethod() {
        return null;
    }
    
    public final void setMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getResponseCode() {
        return 0;
    }
    
    public final void setResponseCode(int p0) {
    }
    
    public final int getRequestCode() {
        return 0;
    }
    
    public final void setRequestCode(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErrorMsg() {
        return null;
    }
    
    public final void setErrorMsg(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isOnline() {
        return false;
    }
    
    public final void setOnline(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatusMsg() {
        return null;
    }
    
    public final void setStatusMsg(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatusCode() {
        return null;
    }
    
    public final void setStatusCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrResponse() {
        return null;
    }
    
    public final void setStrResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRequestData() {
        return null;
    }
    
    public final void setRequestData(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void clearAll() {
    }
}