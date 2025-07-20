package com.newtaxiprime.user.taxiapp.views.splash;

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
public final class SplashActivity_MembersInjector implements MembersInjector<SplashActivity> {
  private final Provider<SessionManager> localProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  private final Provider<Gson> gsonProvider;

  public SplashActivity_MembersInjector(Provider<SessionManager> localProvider,
      Provider<SessionManager> sessionManagerProvider, Provider<ApiService> apiServiceProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<Gson> gsonProvider) {
    this.localProvider = localProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.commonMethodsProvider = commonMethodsProvider;
    this.gsonProvider = gsonProvider;
  }

  public static MembersInjector<SplashActivity> create(Provider<SessionManager> localProvider,
      Provider<SessionManager> sessionManagerProvider, Provider<ApiService> apiServiceProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<Gson> gsonProvider) {
    return new SplashActivity_MembersInjector(localProvider, sessionManagerProvider, apiServiceProvider, commonMethodsProvider, gsonProvider);
  }

  public static MembersInjector<SplashActivity> create(
      javax.inject.Provider<SessionManager> localProvider,
      javax.inject.Provider<SessionManager> sessionManagerProvider,
      javax.inject.Provider<ApiService> apiServiceProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider,
      javax.inject.Provider<Gson> gsonProvider) {
    return new SplashActivity_MembersInjector(Providers.asDaggerProvider(localProvider), Providers.asDaggerProvider(sessionManagerProvider), Providers.asDaggerProvider(apiServiceProvider), Providers.asDaggerProvider(commonMethodsProvider), Providers.asDaggerProvider(gsonProvider));
  }

  @Override
  public void injectMembers(SplashActivity instance) {
    CommonActivity_MembersInjector.injectLocal(instance, localProvider.get());
    injectSessionManager(instance, sessionManagerProvider.get());
    injectApiService(instance, apiServiceProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
    injectGson(instance, gsonProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.splash.SplashActivity.sessionManager")
  public static void injectSessionManager(SplashActivity instance, SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.splash.SplashActivity.apiService")
  public static void injectApiService(SplashActivity instance, ApiService apiService) {
    instance.apiService = apiService;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.splash.SplashActivity.commonMethods")
  public static void injectCommonMethods(SplashActivity instance, CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.splash.SplashActivity.gson")
  public static void injectGson(SplashActivity instance, Gson gson) {
    instance.gson = gson;
  }
}
