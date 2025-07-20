package com.newtaxiprime.user.appcommon.views;

import com.newtaxiprime.user.appcommon.configs.SessionManager;
import com.newtaxiprime.user.appcommon.utils.CommonMethods;
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
public final class BannerAdapter_MembersInjector implements MembersInjector<BannerAdapter> {
  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  public BannerAdapter_MembersInjector(Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider) {
    this.sessionManagerProvider = sessionManagerProvider;
    this.commonMethodsProvider = commonMethodsProvider;
  }

  public static MembersInjector<BannerAdapter> create(
      Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider) {
    return new BannerAdapter_MembersInjector(sessionManagerProvider, commonMethodsProvider);
  }

  public static MembersInjector<BannerAdapter> create(
      javax.inject.Provider<SessionManager> sessionManagerProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider) {
    return new BannerAdapter_MembersInjector(Providers.asDaggerProvider(sessionManagerProvider), Providers.asDaggerProvider(commonMethodsProvider));
  }

  @Override
  public void injectMembers(BannerAdapter instance) {
    injectSessionManager(instance, sessionManagerProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.views.BannerAdapter.sessionManager")
  public static void injectSessionManager(BannerAdapter instance, SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.views.BannerAdapter.commonMethods")
  public static void injectCommonMethods(BannerAdapter instance, CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }
}
