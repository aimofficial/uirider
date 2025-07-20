package com.newtaxiprime.user.appcommon.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/newtaxiprime/user/appcommon/network/AppController;", "Landroid/app/Application;", "()V", "locale", "Ljava/util/Locale;", "appComponent", "Lcom/newtaxiprime/user/appcommon/dependencies/component/AppComponent;", "attachBaseContext", "", "base", "Landroid/content/Context;", "onCreate", "setLocale", "Companion", "app_debug"})
public final class AppController extends android.app.Application {
    @org.jetbrains.annotations.Nullable()
    private java.util.Locale locale;
    private static final java.lang.String TAG = null;
    public static com.newtaxiprime.user.appcommon.dependencies.component.AppComponent appComponent;
    @org.jetbrains.annotations.Nullable()
    private static com.newtaxiprime.user.appcommon.network.AppController instance;
    @org.jetbrains.annotations.NotNull()
    public static final com.newtaxiprime.user.appcommon.network.AppController.Companion Companion = null;
    
    public AppController() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void setLocale() {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context base) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.dependencies.component.AppComponent appComponent() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\t8FX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0016"}, d2 = {"Lcom/newtaxiprime/user/appcommon/network/AppController$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "appComponent", "Lcom/newtaxiprime/user/appcommon/dependencies/component/AppComponent;", "getAppComponent", "()Lcom/newtaxiprime/user/appcommon/dependencies/component/AppComponent;", "setAppComponent", "(Lcom/newtaxiprime/user/appcommon/dependencies/component/AppComponent;)V", "<set-?>", "Lcom/newtaxiprime/user/appcommon/network/AppController;", "instance", "getInstance", "()Lcom/newtaxiprime/user/appcommon/network/AppController;", "", "getContext", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final java.lang.String getTAG() {
            return null;
        }
        
        @kotlin.jvm.Synchronized()
        @org.jetbrains.annotations.NotNull()
        public final synchronized com.newtaxiprime.user.appcommon.dependencies.component.AppComponent getAppComponent() {
            return null;
        }
        
        public final void setAppComponent(@org.jetbrains.annotations.NotNull()
        com.newtaxiprime.user.appcommon.dependencies.component.AppComponent p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.newtaxiprime.user.appcommon.network.AppController getInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        public final void getAppComponent() {
        }
    }
}