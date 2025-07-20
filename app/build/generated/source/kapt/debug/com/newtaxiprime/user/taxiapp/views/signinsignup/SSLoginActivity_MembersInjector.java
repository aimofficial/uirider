package com.newtaxiprime.user.taxiapp.views.signinsignup;

import com.google.gson.Gson;
import com.newtaxiprime.user.appcommon.configs.SessionManager;
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
public final class SSLoginActivity_MembersInjector implements MembersInjector<SSLoginActivity> {
  private final Provider<SessionManager> localProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<Gson> gsonProvider;

  private final Provider<CustomDialog> customDialogProvider;

  public SSLoginActivity_MembersInjector(Provider<SessionManager> localProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<ApiService> apiServiceProvider,
      Provider<SessionManager> sessionManagerProvider, Provider<Gson> gsonProvider,
      Provider<CustomDialog> customDialogProvider) {
    this.localProvider = localProvider;
    this.commonMethodsProvider = commonMethodsProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.gsonProvider = gsonProvider;
    this.customDialogProvider = customDialogProvider;
  }

  public static MembersInjector<SSLoginActivity> create(Provider<SessionManager> localProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<ApiService> apiServiceProvider,
      Provider<SessionManager> sessionManagerProvider, Provider<Gson> gsonProvider,
      Provider<CustomDialog> customDialogProvider) {
    return new SSLoginActivity_MembersInjector(localProvider, commonMethodsProvider, apiServiceProvider, sessionManagerProvider, gsonProvider, customDialogProvider);
  }

  public static MembersInjector<SSLoginActivity> create(
      javax.inject.Provider<SessionManager> localProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider,
      javax.inject.Provider<ApiService> apiServiceProvider,
      javax.inject.Provider<SessionManager> sessionManagerProvider,
      javax.inject.Provider<Gson> gsonProvider,
      javax.inject.Provider<CustomDialog> customDialogProvider) {
    return new SSLoginActivity_MembersInjector(Providers.asDaggerProvider(localProvider), Providers.asDaggerProvider(commonMethodsProvider), Providers.asDaggerProvider(apiServiceProvider), Providers.asDaggerProvider(sessionManagerProvider), Providers.asDaggerProvider(gsonProvider), Providers.asDaggerProvider(customDialogProvider));
  }

  @Override
  public void injectMembers(SSLoginActivity instance) {
    CommonActivity_MembersInjector.injectLocal(instance, localProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
    injectApiService(instance, apiServiceProvider.get());
    injectSessionManager(instance, sessionManagerProvider.get());
    injectGson(instance, gsonProvider.get());
    injectCustomDialog(instance, customDialogProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.signinsignup.SSLoginActivity.commonMethods")
  public static void injectCommonMethods(SSLoginActivity instance, CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.signinsignup.SSLoginActivity.apiService")
  public static void injectApiService(SSLoginActivity instance, ApiService apiService) {
    instance.apiService = apiService;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.signinsignup.SSLoginActivity.sessionManager")
  public static void injectSessionManager(SSLoginActivity instance, SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.signinsignup.SSLoginActivity.gson")
  public static void injectGson(SSLoginActivity instance, Gson gson) {
    instance.gson = gson;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.signinsignup.SSLoginActivity.customDialog")
  public static void injectCustomDialog(SSLoginActivity instance, CustomDialog customDialog) {
    instance.customDialog = customDialog;
  }
}
