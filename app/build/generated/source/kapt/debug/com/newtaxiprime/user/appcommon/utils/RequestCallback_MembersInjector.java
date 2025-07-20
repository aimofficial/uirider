package com.newtaxiprime.user.appcommon.utils;

import android.content.Context;
import com.newtaxiprime.user.appcommon.configs.SessionManager;
import com.newtaxiprime.user.appcommon.datamodels.JsonResponse;
import com.newtaxiprime.user.appcommon.interfaces.ApiService;
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
public final class RequestCallback_MembersInjector implements MembersInjector<RequestCallback> {
  private final Provider<JsonResponse> jsonRespProvider;

  private final Provider<Context> contextProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  public RequestCallback_MembersInjector(Provider<JsonResponse> jsonRespProvider,
      Provider<Context> contextProvider, Provider<SessionManager> sessionManagerProvider,
      Provider<ApiService> apiServiceProvider, Provider<CommonMethods> commonMethodsProvider) {
    this.jsonRespProvider = jsonRespProvider;
    this.contextProvider = contextProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.commonMethodsProvider = commonMethodsProvider;
  }

  public static MembersInjector<RequestCallback> create(Provider<JsonResponse> jsonRespProvider,
      Provider<Context> contextProvider, Provider<SessionManager> sessionManagerProvider,
      Provider<ApiService> apiServiceProvider, Provider<CommonMethods> commonMethodsProvider) {
    return new RequestCallback_MembersInjector(jsonRespProvider, contextProvider, sessionManagerProvider, apiServiceProvider, commonMethodsProvider);
  }

  public static MembersInjector<RequestCallback> create(
      javax.inject.Provider<JsonResponse> jsonRespProvider,
      javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<SessionManager> sessionManagerProvider,
      javax.inject.Provider<ApiService> apiServiceProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider) {
    return new RequestCallback_MembersInjector(Providers.asDaggerProvider(jsonRespProvider), Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(sessionManagerProvider), Providers.asDaggerProvider(apiServiceProvider), Providers.asDaggerProvider(commonMethodsProvider));
  }

  @Override
  public void injectMembers(RequestCallback instance) {
    injectJsonResp(instance, jsonRespProvider.get());
    injectContext(instance, contextProvider.get());
    injectSessionManager(instance, sessionManagerProvider.get());
    injectApiService(instance, apiServiceProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.utils.RequestCallback.jsonResp")
  public static void injectJsonResp(RequestCallback instance, JsonResponse jsonResp) {
    instance.jsonResp = jsonResp;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.utils.RequestCallback.context")
  public static void injectContext(RequestCallback instance, Context context) {
    instance.context = context;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.utils.RequestCallback.sessionManager")
  public static void injectSessionManager(RequestCallback instance, SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.utils.RequestCallback.apiService")
  public static void injectApiService(RequestCallback instance, ApiService apiService) {
    instance.apiService = apiService;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.utils.RequestCallback.commonMethods")
  public static void injectCommonMethods(RequestCallback instance, CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }
}
