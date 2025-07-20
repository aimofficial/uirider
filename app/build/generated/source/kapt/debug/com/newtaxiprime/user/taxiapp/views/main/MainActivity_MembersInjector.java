package com.newtaxiprime.user.taxiapp.views.main;

import com.google.gson.Gson;
import com.newtaxiprime.user.appcommon.configs.SessionManager;
import com.newtaxiprime.user.appcommon.database.SqLiteDb;
import com.newtaxiprime.user.appcommon.interfaces.ApiService;
import com.newtaxiprime.user.appcommon.utils.CommonMethods;
import com.newtaxiprime.user.appcommon.views.CommonActivity_MembersInjector;
import com.newtaxiprime.user.taxiapp.views.customize.CustomDialog;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;

@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<SessionManager> localProvider;

  private final Provider<SqLiteDb> dbHelperProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<CustomDialog> customDialogProvider;

  private final Provider<Gson> gsonProvider;

  public MainActivity_MembersInjector(Provider<SessionManager> localProvider,
      Provider<SqLiteDb> dbHelperProvider, Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<ApiService> apiServiceProvider,
      Provider<CustomDialog> customDialogProvider, Provider<Gson> gsonProvider) {
    this.localProvider = localProvider;
    this.dbHelperProvider = dbHelperProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.commonMethodsProvider = commonMethodsProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.customDialogProvider = customDialogProvider;
    this.gsonProvider = gsonProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<SessionManager> localProvider,
      Provider<SqLiteDb> dbHelperProvider, Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<ApiService> apiServiceProvider,
      Provider<CustomDialog> customDialogProvider, Provider<Gson> gsonProvider) {
    return new MainActivity_MembersInjector(localProvider, dbHelperProvider, sessionManagerProvider, commonMethodsProvider, apiServiceProvider, customDialogProvider, gsonProvider);
  }

  public static MembersInjector<MainActivity> create(
      javax.inject.Provider<SessionManager> localProvider,
      javax.inject.Provider<SqLiteDb> dbHelperProvider,
      javax.inject.Provider<SessionManager> sessionManagerProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider,
      javax.inject.Provider<ApiService> apiServiceProvider,
      javax.inject.Provider<CustomDialog> customDialogProvider,
      javax.inject.Provider<Gson> gsonProvider) {
    return new MainActivity_MembersInjector(Providers.asDaggerProvider(localProvider), Providers.asDaggerProvider(dbHelperProvider), Providers.asDaggerProvider(sessionManagerProvider), Providers.asDaggerProvider(commonMethodsProvider), Providers.asDaggerProvider(apiServiceProvider), Providers.asDaggerProvider(customDialogProvider), Providers.asDaggerProvider(gsonProvider));
  }

  @Override
  public void injectMembers(MainActivity instance) {
    CommonActivity_MembersInjector.injectLocal(instance, localProvider.get());
    injectDbHelper(instance, dbHelperProvider.get());
    injectSessionManager(instance, sessionManagerProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
    injectApiService(instance, apiServiceProvider.get());
    injectCustomDialog(instance, customDialogProvider.get());
    injectGson(instance, gsonProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.main.MainActivity.dbHelper")
  public static void injectDbHelper(MainActivity instance, SqLiteDb dbHelper) {
    instance.dbHelper = dbHelper;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.main.MainActivity.sessionManager")
  public static void injectSessionManager(MainActivity instance, SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.main.MainActivity.commonMethods")
  public static void injectCommonMethods(MainActivity instance, CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.main.MainActivity.apiService")
  public static void injectApiService(MainActivity instance, ApiService apiService) {
    instance.apiService = apiService;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.main.MainActivity.customDialog")
  public static void injectCustomDialog(MainActivity instance, CustomDialog customDialog) {
    instance.customDialog = customDialog;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.main.MainActivity.gson")
  public static void injectGson(MainActivity instance, Gson gson) {
    instance.gson = gson;
  }
}
