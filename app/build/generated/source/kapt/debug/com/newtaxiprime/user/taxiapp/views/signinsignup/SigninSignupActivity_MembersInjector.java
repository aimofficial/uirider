package com.newtaxiprime.user.taxiapp.views.signinsignup;

import com.google.gson.Gson;
import com.newtaxiprime.user.appcommon.configs.SessionManager;
import com.newtaxiprime.user.appcommon.interfaces.ApiService;
import com.newtaxiprime.user.appcommon.utils.CommonMethods;
import com.newtaxiprime.user.appcommon.utils.userchoice.UserChoice;
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
public final class SigninSignupActivity_MembersInjector implements MembersInjector<SigninSignupActivity> {
  private final Provider<SessionManager> localProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  private final Provider<CustomDialog> customDialogProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<Gson> gsonProvider;

  private final Provider<UserChoice> userChoiceProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public SigninSignupActivity_MembersInjector(Provider<SessionManager> localProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<CustomDialog> customDialogProvider,
      Provider<ApiService> apiServiceProvider, Provider<Gson> gsonProvider,
      Provider<UserChoice> userChoiceProvider, Provider<SessionManager> sessionManagerProvider) {
    this.localProvider = localProvider;
    this.commonMethodsProvider = commonMethodsProvider;
    this.customDialogProvider = customDialogProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.gsonProvider = gsonProvider;
    this.userChoiceProvider = userChoiceProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  public static MembersInjector<SigninSignupActivity> create(Provider<SessionManager> localProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<CustomDialog> customDialogProvider,
      Provider<ApiService> apiServiceProvider, Provider<Gson> gsonProvider,
      Provider<UserChoice> userChoiceProvider, Provider<SessionManager> sessionManagerProvider) {
    return new SigninSignupActivity_MembersInjector(localProvider, commonMethodsProvider, customDialogProvider, apiServiceProvider, gsonProvider, userChoiceProvider, sessionManagerProvider);
  }

  public static MembersInjector<SigninSignupActivity> create(
      javax.inject.Provider<SessionManager> localProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider,
      javax.inject.Provider<CustomDialog> customDialogProvider,
      javax.inject.Provider<ApiService> apiServiceProvider,
      javax.inject.Provider<Gson> gsonProvider,
      javax.inject.Provider<UserChoice> userChoiceProvider,
      javax.inject.Provider<SessionManager> sessionManagerProvider) {
    return new SigninSignupActivity_MembersInjector(Providers.asDaggerProvider(localProvider), Providers.asDaggerProvider(commonMethodsProvider), Providers.asDaggerProvider(customDialogProvider), Providers.asDaggerProvider(apiServiceProvider), Providers.asDaggerProvider(gsonProvider), Providers.asDaggerProvider(userChoiceProvider), Providers.asDaggerProvider(sessionManagerProvider));
  }

  @Override
  public void injectMembers(SigninSignupActivity instance) {
    CommonActivity_MembersInjector.injectLocal(instance, localProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
    injectCustomDialog(instance, customDialogProvider.get());
    injectApiService(instance, apiServiceProvider.get());
    injectGson(instance, gsonProvider.get());
    injectUserChoice(instance, userChoiceProvider.get());
    injectSessionManager(instance, sessionManagerProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.signinsignup.SigninSignupActivity.commonMethods")
  public static void injectCommonMethods(SigninSignupActivity instance,
      CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.signinsignup.SigninSignupActivity.customDialog")
  public static void injectCustomDialog(SigninSignupActivity instance, CustomDialog customDialog) {
    instance.customDialog = customDialog;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.signinsignup.SigninSignupActivity.apiService")
  public static void injectApiService(SigninSignupActivity instance, ApiService apiService) {
    instance.apiService = apiService;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.signinsignup.SigninSignupActivity.gson")
  public static void injectGson(SigninSignupActivity instance, Gson gson) {
    instance.gson = gson;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.signinsignup.SigninSignupActivity.userChoice")
  public static void injectUserChoice(SigninSignupActivity instance, UserChoice userChoice) {
    instance.userChoice = userChoice;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.signinsignup.SigninSignupActivity.sessionManager")
  public static void injectSessionManager(SigninSignupActivity instance,
      SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }
}
