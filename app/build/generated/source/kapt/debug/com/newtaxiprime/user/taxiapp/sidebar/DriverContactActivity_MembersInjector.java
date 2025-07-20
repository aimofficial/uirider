package com.newtaxiprime.user.taxiapp.sidebar;

import com.newtaxiprime.user.appcommon.configs.SessionManager;
import com.newtaxiprime.user.appcommon.utils.CommonMethods;
import com.newtaxiprime.user.appcommon.views.CommonActivity_MembersInjector;
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
public final class DriverContactActivity_MembersInjector implements MembersInjector<DriverContactActivity> {
  private final Provider<SessionManager> localProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  public DriverContactActivity_MembersInjector(Provider<SessionManager> localProvider,
      Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider) {
    this.localProvider = localProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.commonMethodsProvider = commonMethodsProvider;
  }

  public static MembersInjector<DriverContactActivity> create(
      Provider<SessionManager> localProvider, Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider) {
    return new DriverContactActivity_MembersInjector(localProvider, sessionManagerProvider, commonMethodsProvider);
  }

  public static MembersInjector<DriverContactActivity> create(
      javax.inject.Provider<SessionManager> localProvider,
      javax.inject.Provider<SessionManager> sessionManagerProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider) {
    return new DriverContactActivity_MembersInjector(Providers.asDaggerProvider(localProvider), Providers.asDaggerProvider(sessionManagerProvider), Providers.asDaggerProvider(commonMethodsProvider));
  }

  @Override
  public void injectMembers(DriverContactActivity instance) {
    CommonActivity_MembersInjector.injectLocal(instance, localProvider.get());
    injectSessionManager(instance, sessionManagerProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.DriverContactActivity.sessionManager")
  public static void injectSessionManager(DriverContactActivity instance,
      SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.DriverContactActivity.commonMethods")
  public static void injectCommonMethods(DriverContactActivity instance,
      CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }
}
