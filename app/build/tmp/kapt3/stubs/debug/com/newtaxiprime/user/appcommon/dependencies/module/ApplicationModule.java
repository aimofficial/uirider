package com.newtaxiprime.user.appcommon.dependencies.module;

/**
 * ***************************************************************
 * Application Module
 */
@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0002\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/newtaxiprime/user/appcommon/dependencies/module/ApplicationModule;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "app_debug"})
public final class ApplicationModule {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application application = null;
    
    public ApplicationModule(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application application() {
        return null;
    }
}