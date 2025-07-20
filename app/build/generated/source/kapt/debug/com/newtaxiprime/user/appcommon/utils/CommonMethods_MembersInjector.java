package com.newtaxiprime.user.appcommon.utils;

import com.newtaxiprime.user.appcommon.configs.SessionManager;
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
public final class CommonMethods_MembersInjector implements MembersInjector<CommonMethods> {
  private final Provider<SessionManager> sessionManagerProvider;

  public CommonMethods_MembersInjector(Provider<SessionManager> sessionManagerProvider) {
    this.sessionManagerProvider = sessionManagerProvider;
  }

  public static MembersInjector<CommonMethods> create(
      Provider<SessionManager> sessionManagerProvider) {
    return new CommonMethods_MembersInjector(sessionManagerProvider);
  }

  public static MembersInjector<CommonMethods> create(
      javax.inject.Provider<SessionManager> sessionManagerProvider) {
    return new CommonMethods_MembersInjector(Providers.asDaggerProvider(sessionManagerProvider));
  }

  @Override
  public void injectMembers(CommonMethods instance) {
    injectSessionManager(instance, sessionManagerProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.utils.CommonMethods.sessionManager")
  public static void injectSessionManager(CommonMethods instance, SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }
}
