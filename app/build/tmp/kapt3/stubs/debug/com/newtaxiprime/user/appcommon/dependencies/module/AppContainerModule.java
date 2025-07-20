package com.newtaxiprime.user.appcommon.dependencies.module;

/**
 * ***************************************************************
 * App Container Module
 */
@dagger.Module(includes = {com.newtaxiprime.user.appcommon.dependencies.module.ApplicationModule.class})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0007J\r\u0010\u0013\u001a\u00020\u0014H\u0001\u00a2\u0006\u0002\b\u0015J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0007\u00a8\u0006\u001b"}, d2 = {"Lcom/newtaxiprime/user/appcommon/dependencies/module/AppContainerModule;", "", "()V", "providesCommonMethods", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "providesContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "providesCustomDialog", "Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;", "providesJsonResponse", "Lcom/newtaxiprime/user/appcommon/datamodels/JsonResponse;", "providesRunTimePermission", "Lcom/newtaxiprime/user/appcommon/configs/RunTimePermission;", "providesSessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "providesSharedPreferences", "Landroid/content/SharedPreferences;", "providesSqlite", "Lcom/newtaxiprime/user/appcommon/database/SqLiteDb;", "providesSqlite$app_debug", "providesStringArrayList", "Ljava/util/ArrayList;", "", "providesUserChoice", "Lcom/newtaxiprime/user/appcommon/utils/userchoice/UserChoice;", "app_debug"})
public final class AppContainerModule {
    
    public AppContainerModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences providesSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.utils.CommonMethods providesCommonMethods() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.configs.SessionManager providesSessionManager() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.configs.RunTimePermission providesRunTimePermission() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context providesContext(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> providesStringArrayList() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.datamodels.JsonResponse providesJsonResponse() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.taxiapp.views.customize.CustomDialog providesCustomDialog() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.database.SqLiteDb providesSqlite$app_debug() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.utils.userchoice.UserChoice providesUserChoice() {
        return null;
    }
}