package com.newtaxiprime.user.taxiapp.views.facebookAccountKit;

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
public final class FacebookAccountKitActivity_MembersInjector implements MembersInjector<FacebookAccountKitActivity> {
  private final Provider<SessionManager> localProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<Gson> gsonProvider;

  private final Provider<CustomDialog> customDialogProvider;

  public FacebookAccountKitActivity_MembersInjector(Provider<SessionManager> localProvider,
      Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<ApiService> apiServiceProvider,
      Provider<Gson> gsonProvider, Provider<CustomDialog> customDialogProvider) {
    this.localProvider = localProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.commonMethodsProvider = commonMethodsProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.gsonProvider = gsonProvider;
    this.customDialogProvider = customDialogProvider;
  }

  public static MembersInjector<FacebookAccountKitActivity> create(
      Provider<SessionManager> localProvider, Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<ApiService> apiServiceProvider,
      Provider<Gson> gsonProvider, Provider<CustomDialog> customDialogProvider) {
    return new FacebookAccountKitActivity_MembersInjector(localProvider, sessionManagerProvider, commonMethodsProvider, apiServiceProvider, gsonProvider, customDialogProvider);
  }

  public static MembersInjector<FacebookAccountKitActivity> create(
      javax.inject.Provider<SessionManager> localProvider,
      javax.inject.Provider<SessionManager> sessionManagerProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider,
      javax.inject.Provider<ApiService> apiServiceProvider,
      javax.inject.Provider<Gson> gsonProvider,
      javax.inject.Provider<CustomDialog> customDialogProvider) {
    return new FacebookAccountKitActivity_MembersInjector(Providers.asDaggerProvider(localProvider), Providers.asDaggerProvider(sessionManagerProvider), Providers.asDaggerProvider(commonMethodsProvider), Providers.asDaggerProvider(apiServiceProvider), Providers.asDaggerProvider(gsonProvider), Providers.asDaggerProvider(customDialogProvider));
  }

  @Override
  public void injectMembers(FacebookAccountKitActivity instance) {
    CommonActivity_MembersInjector.injectLocal(instance, localProvider.get());
    injectSessionManager(instance, sessionManagerProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
    injectApiService(instance, apiServiceProvider.get());
    injectGson(instance, gsonProvider.get());
    injectCustomDialog(instance, customDialogProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.facebookAccountKit.FacebookAccountKitActivity.sessionManager")
  public static void injectSessionManager(FacebookAccountKitActivity instance,
      SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.facebookAccountKit.FacebookAccountKitActivity.commonMethods")
  public static void injectCommonMethods(FacebookAccountKitActivity instance,
      CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.facebookAccountKit.FacebookAccountKitActivity.apiService")
  public static void injectApiService(FacebookAccountKitActivity instance, ApiService apiService) {
    instance.apiService = apiService;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.facebookAccountKit.FacebookAccountKitActivity.gson")
  public static void injectGson(FacebookAccountKitActivity instance, Gson gson) {
    instance.gson = gson;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.facebookAccountKit.FacebookAccountKitActivity.customDialog")
  public static void injectCustomDialog(FacebookAccountKitActivity instance,
      CustomDialog customDialog) {
    instance.customDialog = customDialog;
  }
}
