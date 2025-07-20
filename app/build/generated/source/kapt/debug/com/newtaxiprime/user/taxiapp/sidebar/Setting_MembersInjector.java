package com.newtaxiprime.user.taxiapp.sidebar;

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
public final class Setting_MembersInjector implements MembersInjector<Setting> {
  private final Provider<SessionManager> localProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<CustomDialog> customDialogProvider;

  private final Provider<Gson> gsonProvider;

  private final Provider<UserChoice> userChoiceProvider;

  public Setting_MembersInjector(Provider<SessionManager> localProvider,
      Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<ApiService> apiServiceProvider,
      Provider<CustomDialog> customDialogProvider, Provider<Gson> gsonProvider,
      Provider<UserChoice> userChoiceProvider) {
    this.localProvider = localProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.commonMethodsProvider = commonMethodsProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.customDialogProvider = customDialogProvider;
    this.gsonProvider = gsonProvider;
    this.userChoiceProvider = userChoiceProvider;
  }

  public static MembersInjector<Setting> create(Provider<SessionManager> localProvider,
      Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<ApiService> apiServiceProvider,
      Provider<CustomDialog> customDialogProvider, Provider<Gson> gsonProvider,
      Provider<UserChoice> userChoiceProvider) {
    return new Setting_MembersInjector(localProvider, sessionManagerProvider, commonMethodsProvider, apiServiceProvider, customDialogProvider, gsonProvider, userChoiceProvider);
  }

  public static MembersInjector<Setting> create(javax.inject.Provider<SessionManager> localProvider,
      javax.inject.Provider<SessionManager> sessionManagerProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider,
      javax.inject.Provider<ApiService> apiServiceProvider,
      javax.inject.Provider<CustomDialog> customDialogProvider,
      javax.inject.Provider<Gson> gsonProvider,
      javax.inject.Provider<UserChoice> userChoiceProvider) {
    return new Setting_MembersInjector(Providers.asDaggerProvider(localProvider), Providers.asDaggerProvider(sessionManagerProvider), Providers.asDaggerProvider(commonMethodsProvider), Providers.asDaggerProvider(apiServiceProvider), Providers.asDaggerProvider(customDialogProvider), Providers.asDaggerProvider(gsonProvider), Providers.asDaggerProvider(userChoiceProvider));
  }

  @Override
  public void injectMembers(Setting instance) {
    CommonActivity_MembersInjector.injectLocal(instance, localProvider.get());
    injectSessionManager(instance, sessionManagerProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
    injectApiService(instance, apiServiceProvider.get());
    injectCustomDialog(instance, customDialogProvider.get());
    injectGson(instance, gsonProvider.get());
    injectUserChoice(instance, userChoiceProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.Setting.sessionManager")
  public static void injectSessionManager(Setting instance, SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.Setting.commonMethods")
  public static void injectCommonMethods(Setting instance, CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.Setting.apiService")
  public static void injectApiService(Setting instance, ApiService apiService) {
    instance.apiService = apiService;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.Setting.customDialog")
  public static void injectCustomDialog(Setting instance, CustomDialog customDialog) {
    instance.customDialog = customDialog;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.Setting.gson")
  public static void injectGson(Setting instance, Gson gson) {
    instance.gson = gson;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.Setting.userChoice")
  public static void injectUserChoice(Setting instance, UserChoice userChoice) {
    instance.userChoice = userChoice;
  }
}
