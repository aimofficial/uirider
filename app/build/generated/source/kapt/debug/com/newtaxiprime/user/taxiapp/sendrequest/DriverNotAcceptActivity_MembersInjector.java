package com.newtaxiprime.user.taxiapp.sendrequest;

import com.google.gson.Gson;
import com.newtaxiprime.user.appcommon.configs.SessionManager;
import com.newtaxiprime.user.appcommon.interfaces.ApiService;
import com.newtaxiprime.user.appcommon.utils.CommonMethods;
import com.newtaxiprime.user.appcommon.views.CommonActivity_MembersInjector;
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
public final class DriverNotAcceptActivity_MembersInjector implements MembersInjector<DriverNotAcceptActivity> {
  private final Provider<SessionManager> localProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<Gson> gsonProvider;

  public DriverNotAcceptActivity_MembersInjector(Provider<SessionManager> localProvider,
      Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<ApiService> apiServiceProvider,
      Provider<Gson> gsonProvider) {
    this.localProvider = localProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.commonMethodsProvider = commonMethodsProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.gsonProvider = gsonProvider;
  }

  public static MembersInjector<DriverNotAcceptActivity> create(
      Provider<SessionManager> localProvider, Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<ApiService> apiServiceProvider,
      Provider<Gson> gsonProvider) {
    return new DriverNotAcceptActivity_MembersInjector(localProvider, sessionManagerProvider, commonMethodsProvider, apiServiceProvider, gsonProvider);
  }

  public static MembersInjector<DriverNotAcceptActivity> create(
      javax.inject.Provider<SessionManager> localProvider,
      javax.inject.Provider<SessionManager> sessionManagerProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider,
      javax.inject.Provider<ApiService> apiServiceProvider,
      javax.inject.Provider<Gson> gsonProvider) {
    return new DriverNotAcceptActivity_MembersInjector(Providers.asDaggerProvider(localProvider), Providers.asDaggerProvider(sessionManagerProvider), Providers.asDaggerProvider(commonMethodsProvider), Providers.asDaggerProvider(apiServiceProvider), Providers.asDaggerProvider(gsonProvider));
  }

  @Override
  public void injectMembers(DriverNotAcceptActivity instance) {
    CommonActivity_MembersInjector.injectLocal(instance, localProvider.get());
    injectSessionManager(instance, sessionManagerProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
    injectApiService(instance, apiServiceProvider.get());
    injectGson(instance, gsonProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sendrequest.DriverNotAcceptActivity.sessionManager")
  public static void injectSessionManager(DriverNotAcceptActivity instance,
      SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sendrequest.DriverNotAcceptActivity.commonMethods")
  public static void injectCommonMethods(DriverNotAcceptActivity instance,
      CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sendrequest.DriverNotAcceptActivity.apiService")
  public static void injectApiService(DriverNotAcceptActivity instance, ApiService apiService) {
    instance.apiService = apiService;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sendrequest.DriverNotAcceptActivity.gson")
  public static void injectGson(DriverNotAcceptActivity instance, Gson gson) {
    instance.gson = gson;
  }
}
