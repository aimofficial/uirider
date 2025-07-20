package com.newtaxiprime.user.taxiapp.sidebar.referral;

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
public final class ShowReferralOptions_MembersInjector implements MembersInjector<ShowReferralOptions> {
  private final Provider<SessionManager> localProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<Gson> gsonProvider;

  private final Provider<CustomDialog> customDialogProvider;

  public ShowReferralOptions_MembersInjector(Provider<SessionManager> localProvider,
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

  public static MembersInjector<ShowReferralOptions> create(Provider<SessionManager> localProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<ApiService> apiServiceProvider,
      Provider<SessionManager> sessionManagerProvider, Provider<Gson> gsonProvider,
      Provider<CustomDialog> customDialogProvider) {
    return new ShowReferralOptions_MembersInjector(localProvider, commonMethodsProvider, apiServiceProvider, sessionManagerProvider, gsonProvider, customDialogProvider);
  }

  public static MembersInjector<ShowReferralOptions> create(
      javax.inject.Provider<SessionManager> localProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider,
      javax.inject.Provider<ApiService> apiServiceProvider,
      javax.inject.Provider<SessionManager> sessionManagerProvider,
      javax.inject.Provider<Gson> gsonProvider,
      javax.inject.Provider<CustomDialog> customDialogProvider) {
    return new ShowReferralOptions_MembersInjector(Providers.asDaggerProvider(localProvider), Providers.asDaggerProvider(commonMethodsProvider), Providers.asDaggerProvider(apiServiceProvider), Providers.asDaggerProvider(sessionManagerProvider), Providers.asDaggerProvider(gsonProvider), Providers.asDaggerProvider(customDialogProvider));
  }

  @Override
  public void injectMembers(ShowReferralOptions instance) {
    CommonActivity_MembersInjector.injectLocal(instance, localProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
    injectApiService(instance, apiServiceProvider.get());
    injectSessionManager(instance, sessionManagerProvider.get());
    injectGson(instance, gsonProvider.get());
    injectCustomDialog(instance, customDialogProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.referral.ShowReferralOptions.commonMethods")
  public static void injectCommonMethods(ShowReferralOptions instance,
      CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.referral.ShowReferralOptions.apiService")
  public static void injectApiService(ShowReferralOptions instance, ApiService apiService) {
    instance.apiService = apiService;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.referral.ShowReferralOptions.sessionManager")
  public static void injectSessionManager(ShowReferralOptions instance,
      SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.referral.ShowReferralOptions.gson")
  public static void injectGson(ShowReferralOptions instance, Gson gson) {
    instance.gson = gson;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.referral.ShowReferralOptions.customDialog")
  public static void injectCustomDialog(ShowReferralOptions instance, CustomDialog customDialog) {
    instance.customDialog = customDialog;
  }
}
