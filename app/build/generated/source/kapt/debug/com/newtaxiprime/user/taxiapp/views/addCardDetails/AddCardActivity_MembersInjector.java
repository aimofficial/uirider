package com.newtaxiprime.user.taxiapp.views.addCardDetails;

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
public final class AddCardActivity_MembersInjector implements MembersInjector<AddCardActivity> {
  private final Provider<SessionManager> localProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  private final Provider<CustomDialog> customDialogProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public AddCardActivity_MembersInjector(Provider<SessionManager> localProvider,
      Provider<ApiService> apiServiceProvider, Provider<CommonMethods> commonMethodsProvider,
      Provider<CustomDialog> customDialogProvider,
      Provider<SessionManager> sessionManagerProvider) {
    this.localProvider = localProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.commonMethodsProvider = commonMethodsProvider;
    this.customDialogProvider = customDialogProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  public static MembersInjector<AddCardActivity> create(Provider<SessionManager> localProvider,
      Provider<ApiService> apiServiceProvider, Provider<CommonMethods> commonMethodsProvider,
      Provider<CustomDialog> customDialogProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return new AddCardActivity_MembersInjector(localProvider, apiServiceProvider, commonMethodsProvider, customDialogProvider, sessionManagerProvider);
  }

  public static MembersInjector<AddCardActivity> create(
      javax.inject.Provider<SessionManager> localProvider,
      javax.inject.Provider<ApiService> apiServiceProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider,
      javax.inject.Provider<CustomDialog> customDialogProvider,
      javax.inject.Provider<SessionManager> sessionManagerProvider) {
    return new AddCardActivity_MembersInjector(Providers.asDaggerProvider(localProvider), Providers.asDaggerProvider(apiServiceProvider), Providers.asDaggerProvider(commonMethodsProvider), Providers.asDaggerProvider(customDialogProvider), Providers.asDaggerProvider(sessionManagerProvider));
  }

  @Override
  public void injectMembers(AddCardActivity instance) {
    CommonActivity_MembersInjector.injectLocal(instance, localProvider.get());
    injectApiService(instance, apiServiceProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
    injectCustomDialog(instance, customDialogProvider.get());
    injectSessionManager(instance, sessionManagerProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.addCardDetails.AddCardActivity.apiService")
  public static void injectApiService(AddCardActivity instance, ApiService apiService) {
    instance.apiService = apiService;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.addCardDetails.AddCardActivity.commonMethods")
  public static void injectCommonMethods(AddCardActivity instance, CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.addCardDetails.AddCardActivity.customDialog")
  public static void injectCustomDialog(AddCardActivity instance, CustomDialog customDialog) {
    instance.customDialog = customDialog;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.addCardDetails.AddCardActivity.sessionManager")
  public static void injectSessionManager(AddCardActivity instance, SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }
}
