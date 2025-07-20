package com.newtaxiprime.user.appcommon.pushnotification;

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
public final class MyFirebaseMessagingService_MembersInjector implements MembersInjector<MyFirebaseMessagingService> {
  private final Provider<CommonMethods> commonMethodsProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public MyFirebaseMessagingService_MembersInjector(Provider<CommonMethods> commonMethodsProvider,
      Provider<SessionManager> sessionManagerProvider) {
    this.commonMethodsProvider = commonMethodsProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  public static MembersInjector<MyFirebaseMessagingService> create(
      Provider<CommonMethods> commonMethodsProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return new MyFirebaseMessagingService_MembersInjector(commonMethodsProvider, sessionManagerProvider);
  }

  public static MembersInjector<MyFirebaseMessagingService> create(
      javax.inject.Provider<CommonMethods> commonMethodsProvider,
      javax.inject.Provider<SessionManager> sessionManagerProvider) {
    return new MyFirebaseMessagingService_MembersInjector(Providers.asDaggerProvider(commonMethodsProvider), Providers.asDaggerProvider(sessionManagerProvider));
  }

  @Override
  public void injectMembers(MyFirebaseMessagingService instance) {
    injectCommonMethods(instance, commonMethodsProvider.get());
    injectSessionManager(instance, sessionManagerProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.pushnotification.MyFirebaseMessagingService.commonMethods")
  public static void injectCommonMethods(MyFirebaseMessagingService instance,
      CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.pushnotification.MyFirebaseMessagingService.sessionManager")
  public static void injectSessionManager(MyFirebaseMessagingService instance,
      SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }
}
