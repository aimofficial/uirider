package com.newtaxiprime.user.appcommon.configs;

/**
 * ***************************************************************
 * Get Global runtime permission
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u001f2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010!\u00a2\u0006\u0002\u0010\"J%\u0010#\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u001f2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010!\u00a2\u0006\u0002\u0010$J)\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0!2\b\u0010&\u001a\u0004\u0018\u00010\'\u00a2\u0006\u0002\u0010(R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/newtaxiprime/user/appcommon/configs/RunTimePermission;", "", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "fcmToken", "", "getFcmToken", "()Ljava/lang/String;", "setFcmToken", "(Ljava/lang/String;)V", "isFirstTime", "", "isFirstTimePermission", "()Z", "setFirstTimePermission", "(Z)V", "isMarshmallow", "permissionList", "Ljava/util/ArrayList;", "getPermissionList", "()Ljava/util/ArrayList;", "setPermissionList", "(Ljava/util/ArrayList;)V", "preferences", "Landroid/content/SharedPreferences;", "checkHasPermission", "Landroid/app/Activity;", "permissions", "", "(Landroid/app/Activity;[Ljava/lang/String;)Ljava/util/ArrayList;", "isPermissionBlocked", "(Landroid/app/Activity;[Ljava/lang/String;)Z", "onRequestPermissionsResult", "grantResults", "", "([Ljava/lang/String;[I)Ljava/util/ArrayList;", "app_debug"})
public final class RunTimePermission {
    @javax.inject.Inject()
    public android.content.Context context;
    @javax.inject.Inject()
    public java.util.ArrayList<java.lang.String> permissionList;
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences preferences = null;
    
    public RunTimePermission() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getPermissionList() {
        return null;
    }
    
    public final void setPermissionList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    public final boolean isFirstTimePermission() {
        return false;
    }
    
    public final void setFirstTimePermission(boolean isFirstTime) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFcmToken() {
        return null;
    }
    
    public final void setFcmToken(@org.jetbrains.annotations.Nullable()
    java.lang.String fcmToken) {
    }
    
    private final boolean isMarshmallow() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> checkHasPermission(@org.jetbrains.annotations.Nullable()
    android.app.Activity context, @org.jetbrains.annotations.Nullable()
    java.lang.String[] permissions) {
        return null;
    }
    
    public final boolean isPermissionBlocked(@org.jetbrains.annotations.Nullable()
    android.app.Activity context, @org.jetbrains.annotations.Nullable()
    java.lang.String[] permissions) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> onRequestPermissionsResult(@org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.Nullable()
    int[] grantResults) {
        return null;
    }
}