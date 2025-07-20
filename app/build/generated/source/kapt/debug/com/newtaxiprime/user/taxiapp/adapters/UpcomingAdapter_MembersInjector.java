package com.newtaxiprime.user.taxiapp.adapters;

import com.google.gson.Gson;
import com.newtaxiprime.user.appcommon.configs.SessionManager;
import com.newtaxiprime.user.appcommon.interfaces.ApiService;
import com.newtaxiprime.user.appcommon.utils.CommonMethods;
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
public final class UpcomingAdapter_MembersInjector implements MembersInjector<UpcomingAdapter> {
  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<CustomDialog> customDialogProvider;

  private final Provider<Gson> gsonProvider;

  public UpcomingAdapter_MembersInjector(Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<ApiService> apiServiceProvider,
      Provider<CustomDialog> customDialogProvider, Provider<Gson> gsonProvider) {
    this.sessionManagerProvider = sessionManagerProvider;
    this.commonMethodsProvider = commonMethodsProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.customDialogProvider = customDialogProvider;
    this.gsonProvider = gsonProvider;
  }

  public static MembersInjector<UpcomingAdapter> create(
      Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<ApiService> apiServiceProvider,
      Provider<CustomDialog> customDialogProvider, Provider<Gson> gsonProvider) {
    return new UpcomingAdapter_MembersInjector(sessionManagerProvider, commonMethodsProvider, apiServiceProvider, customDialogProvider, gsonProvider);
  }

  public static MembersInjector<UpcomingAdapter> create(
      javax.inject.Provider<SessionManager> sessionManagerProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider,
      javax.inject.Provider<ApiService> apiServiceProvider,
      javax.inject.Provider<CustomDialog> customDialogProvider,
      javax.inject.Provider<Gson> gsonProvider) {
    return new UpcomingAdapter_MembersInjector(Providers.asDaggerProvider(sessionManagerProvider), Providers.asDaggerProvider(commonMethodsProvider), Providers.asDaggerProvider(apiServiceProvider), Providers.asDaggerProvider(customDialogProvider), Providers.asDaggerProvider(gsonProvider));
  }

  @Override
  public void injectMembers(UpcomingAdapter instance) {
    injectSessionManager(instance, sessionManagerProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
    injectApiService(instance, apiServiceProvider.get());
    injectCustomDialog(instance, customDialogProvider.get());
    injectGson(instance, gsonProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.adapters.UpcomingAdapter.sessionManager")
  public static void injectSessionManager(UpcomingAdapter instance, SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.adapters.UpcomingAdapter.commonMethods")
  public static void injectCommonMethods(UpcomingAdapter instance, CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.adapters.UpcomingAdapter.apiService")
  public static void injectApiService(UpcomingAdapter instance, ApiService apiService) {
    instance.apiService = apiService;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.adapters.UpcomingAdapter.customDialog")
  public static void injectCustomDialog(UpcomingAdapter instance, CustomDialog customDialog) {
    instance.customDialog = customDialog;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.adapters.UpcomingAdapter.gson")
  public static void injectGson(UpcomingAdapter instance, Gson gson) {
    instance.gson = gson;
  }
}
