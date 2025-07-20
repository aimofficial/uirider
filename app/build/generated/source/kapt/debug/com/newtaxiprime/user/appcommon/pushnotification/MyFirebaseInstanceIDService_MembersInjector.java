package com.newtaxiprime.user.appcommon.pushnotification;

import com.google.gson.Gson;
import com.newtaxiprime.user.appcommon.configs.SessionManager;
import com.newtaxiprime.user.appcommon.interfaces.ApiService;
import com.newtaxiprime.user.appcommon.utils.CommonMethods;
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
public final class MyFirebaseInstanceIDService_MembersInjector implements MembersInjector<MyFirebaseInstanceIDService> {
  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<Gson> gsonProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  public MyFirebaseInstanceIDService_MembersInjector(
      Provider<SessionManager> sessionManagerProvider, Provider<ApiService> apiServiceProvider,
      Provider<Gson> gsonProvider, Provider<CommonMethods> commonMethodsProvider) {
    this.sessionManagerProvider = sessionManagerProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.gsonProvider = gsonProvider;
    this.commonMethodsProvider = commonMethodsProvider;
  }

  public static MembersInjector<MyFirebaseInstanceIDService> create(
      Provider<SessionManager> sessionManagerProvider, Provider<ApiService> apiServiceProvider,
      Provider<Gson> gsonProvider, Provider<CommonMethods> commonMethodsProvider) {
    return new MyFirebaseInstanceIDService_MembersInjector(sessionManagerProvider, apiServiceProvider, gsonProvider, commonMethodsProvider);
  }

  public static MembersInjector<MyFirebaseInstanceIDService> create(
      javax.inject.Provider<SessionManager> sessionManagerProvider,
      javax.inject.Provider<ApiService> apiServiceProvider,
      javax.inject.Provider<Gson> gsonProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider) {
    return new MyFirebaseInstanceIDService_MembersInjector(Providers.asDaggerProvider(sessionManagerProvider), Providers.asDaggerProvider(apiServiceProvider), Providers.asDaggerProvider(gsonProvider), Providers.asDaggerProvider(commonMethodsProvider));
  }

  @Override
  public void injectMembers(MyFirebaseInstanceIDService instance) {
    injectSessionManager(instance, sessionManagerProvider.get());
    injectApiService(instance, apiServiceProvider.get());
    injectGson(instance, gsonProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.pushnotification.MyFirebaseInstanceIDService.sessionManager")
  public static void injectSessionManager(MyFirebaseInstanceIDService instance,
      SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.pushnotification.MyFirebaseInstanceIDService.apiService")
  public static void injectApiService(MyFirebaseInstanceIDService instance, ApiService apiService) {
    instance.apiService = apiService;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.pushnotification.MyFirebaseInstanceIDService.gson")
  public static void injectGson(MyFirebaseInstanceIDService instance, Gson gson) {
    instance.gson = gson;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.pushnotification.MyFirebaseInstanceIDService.commonMethods")
  public static void injectCommonMethods(MyFirebaseInstanceIDService instance,
      CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }
}
