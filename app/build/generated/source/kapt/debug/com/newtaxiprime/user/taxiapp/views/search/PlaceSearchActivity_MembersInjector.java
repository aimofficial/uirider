package com.newtaxiprime.user.taxiapp.views.search;

import com.newtaxiprime.user.appcommon.configs.SessionManager;
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
public final class PlaceSearchActivity_MembersInjector implements MembersInjector<PlaceSearchActivity> {
  private final Provider<SessionManager> localProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  private final Provider<CustomDialog> customDialogProvider;

  public PlaceSearchActivity_MembersInjector(Provider<SessionManager> localProvider,
      Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<CustomDialog> customDialogProvider) {
    this.localProvider = localProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.commonMethodsProvider = commonMethodsProvider;
    this.customDialogProvider = customDialogProvider;
  }

  public static MembersInjector<PlaceSearchActivity> create(Provider<SessionManager> localProvider,
      Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider, Provider<CustomDialog> customDialogProvider) {
    return new PlaceSearchActivity_MembersInjector(localProvider, sessionManagerProvider, commonMethodsProvider, customDialogProvider);
  }

  public static MembersInjector<PlaceSearchActivity> create(
      javax.inject.Provider<SessionManager> localProvider,
      javax.inject.Provider<SessionManager> sessionManagerProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider,
      javax.inject.Provider<CustomDialog> customDialogProvider) {
    return new PlaceSearchActivity_MembersInjector(Providers.asDaggerProvider(localProvider), Providers.asDaggerProvider(sessionManagerProvider), Providers.asDaggerProvider(commonMethodsProvider), Providers.asDaggerProvider(customDialogProvider));
  }

  @Override
  public void injectMembers(PlaceSearchActivity instance) {
    CommonActivity_MembersInjector.injectLocal(instance, localProvider.get());
    injectSessionManager(instance, sessionManagerProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
    injectCustomDialog(instance, customDialogProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.search.PlaceSearchActivity.sessionManager")
  public static void injectSessionManager(PlaceSearchActivity instance,
      SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.search.PlaceSearchActivity.commonMethods")
  public static void injectCommonMethods(PlaceSearchActivity instance,
      CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.search.PlaceSearchActivity.customDialog")
  public static void injectCustomDialog(PlaceSearchActivity instance, CustomDialog customDialog) {
    instance.customDialog = customDialog;
  }
}
