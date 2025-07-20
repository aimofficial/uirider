package com.newtaxiprime.user.taxiapp.views.firebaseChat;

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
public final class ActivityChat_MembersInjector implements MembersInjector<ActivityChat> {
  private final Provider<SessionManager> localProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<CustomDialog> customDialogProvider;

  private final Provider<Gson> gsonProvider;

  public ActivityChat_MembersInjector(Provider<SessionManager> localProvider,
      Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<ApiService> apiServiceProvider,
      Provider<CustomDialog> customDialogProvider, Provider<Gson> gsonProvider) {
    this.localProvider = localProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.commonMethodsProvider = commonMethodsProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.customDialogProvider = customDialogProvider;
    this.gsonProvider = gsonProvider;
  }

  public static MembersInjector<ActivityChat> create(Provider<SessionManager> localProvider,
      Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<ApiService> apiServiceProvider,
      Provider<CustomDialog> customDialogProvider, Provider<Gson> gsonProvider) {
    return new ActivityChat_MembersInjector(localProvider, sessionManagerProvider, commonMethodsProvider, apiServiceProvider, customDialogProvider, gsonProvider);
  }

  public static MembersInjector<ActivityChat> create(
      javax.inject.Provider<SessionManager> localProvider,
      javax.inject.Provider<SessionManager> sessionManagerProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider,
      javax.inject.Provider<ApiService> apiServiceProvider,
      javax.inject.Provider<CustomDialog> customDialogProvider,
      javax.inject.Provider<Gson> gsonProvider) {
    return new ActivityChat_MembersInjector(Providers.asDaggerProvider(localProvider), Providers.asDaggerProvider(sessionManagerProvider), Providers.asDaggerProvider(commonMethodsProvider), Providers.asDaggerProvider(apiServiceProvider), Providers.asDaggerProvider(customDialogProvider), Providers.asDaggerProvider(gsonProvider));
  }

  @Override
  public void injectMembers(ActivityChat instance) {
    CommonActivity_MembersInjector.injectLocal(instance, localProvider.get());
    injectSessionManager(instance, sessionManagerProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
    injectApiService(instance, apiServiceProvider.get());
    injectCustomDialog(instance, customDialogProvider.get());
    injectGson(instance, gsonProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.firebaseChat.ActivityChat.sessionManager")
  public static void injectSessionManager(ActivityChat instance, SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.firebaseChat.ActivityChat.commonMethods")
  public static void injectCommonMethods(ActivityChat instance, CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.firebaseChat.ActivityChat.apiService")
  public static void injectApiService(ActivityChat instance, ApiService apiService) {
    instance.apiService = apiService;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.firebaseChat.ActivityChat.customDialog")
  public static void injectCustomDialog(ActivityChat instance, CustomDialog customDialog) {
    instance.customDialog = customDialog;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.firebaseChat.ActivityChat.gson")
  public static void injectGson(ActivityChat instance, Gson gson) {
    instance.gson = gson;
  }
}
