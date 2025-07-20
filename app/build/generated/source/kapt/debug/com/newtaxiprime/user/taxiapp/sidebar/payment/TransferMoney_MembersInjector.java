package com.newtaxiprime.user.taxiapp.sidebar.payment;

import com.google.gson.Gson;
import com.newtaxiprime.user.appcommon.configs.RunTimePermission;
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
public final class TransferMoney_MembersInjector implements MembersInjector<TransferMoney> {
  private final Provider<SessionManager> localProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<CustomDialog> customDialogProvider;

  private final Provider<RunTimePermission> runTimePermissionProvider;

  private final Provider<Gson> gsonProvider;

  public TransferMoney_MembersInjector(Provider<SessionManager> localProvider,
      Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<ApiService> apiServiceProvider,
      Provider<CustomDialog> customDialogProvider,
      Provider<RunTimePermission> runTimePermissionProvider, Provider<Gson> gsonProvider) {
    this.localProvider = localProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.commonMethodsProvider = commonMethodsProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.customDialogProvider = customDialogProvider;
    this.runTimePermissionProvider = runTimePermissionProvider;
    this.gsonProvider = gsonProvider;
  }

  public static MembersInjector<TransferMoney> create(Provider<SessionManager> localProvider,
      Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<ApiService> apiServiceProvider,
      Provider<CustomDialog> customDialogProvider,
      Provider<RunTimePermission> runTimePermissionProvider, Provider<Gson> gsonProvider) {
    return new TransferMoney_MembersInjector(localProvider, sessionManagerProvider, commonMethodsProvider, apiServiceProvider, customDialogProvider, runTimePermissionProvider, gsonProvider);
  }

  public static MembersInjector<TransferMoney> create(
      javax.inject.Provider<SessionManager> localProvider,
      javax.inject.Provider<SessionManager> sessionManagerProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider,
      javax.inject.Provider<ApiService> apiServiceProvider,
      javax.inject.Provider<CustomDialog> customDialogProvider,
      javax.inject.Provider<RunTimePermission> runTimePermissionProvider,
      javax.inject.Provider<Gson> gsonProvider) {
    return new TransferMoney_MembersInjector(Providers.asDaggerProvider(localProvider), Providers.asDaggerProvider(sessionManagerProvider), Providers.asDaggerProvider(commonMethodsProvider), Providers.asDaggerProvider(apiServiceProvider), Providers.asDaggerProvider(customDialogProvider), Providers.asDaggerProvider(runTimePermissionProvider), Providers.asDaggerProvider(gsonProvider));
  }

  @Override
  public void injectMembers(TransferMoney instance) {
    CommonActivity_MembersInjector.injectLocal(instance, localProvider.get());
    injectSessionManager(instance, sessionManagerProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
    injectApiService(instance, apiServiceProvider.get());
    injectCustomDialog(instance, customDialogProvider.get());
    injectRunTimePermission(instance, runTimePermissionProvider.get());
    injectGson(instance, gsonProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.payment.TransferMoney.sessionManager")
  public static void injectSessionManager(TransferMoney instance, SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.payment.TransferMoney.commonMethods")
  public static void injectCommonMethods(TransferMoney instance, CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.payment.TransferMoney.apiService")
  public static void injectApiService(TransferMoney instance, ApiService apiService) {
    instance.apiService = apiService;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.payment.TransferMoney.customDialog")
  public static void injectCustomDialog(TransferMoney instance, CustomDialog customDialog) {
    instance.customDialog = customDialog;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.payment.TransferMoney.runTimePermission")
  public static void injectRunTimePermission(TransferMoney instance,
      RunTimePermission runTimePermission) {
    instance.runTimePermission = runTimePermission;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.payment.TransferMoney.gson")
  public static void injectGson(TransferMoney instance, Gson gson) {
    instance.gson = gson;
  }
}
