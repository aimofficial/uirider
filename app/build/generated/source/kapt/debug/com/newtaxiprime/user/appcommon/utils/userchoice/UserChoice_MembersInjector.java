package com.newtaxiprime.user.appcommon.utils.userchoice;

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
public final class UserChoice_MembersInjector implements MembersInjector<UserChoice> {
  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  public UserChoice_MembersInjector(Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider) {
    this.sessionManagerProvider = sessionManagerProvider;
    this.commonMethodsProvider = commonMethodsProvider;
  }

  public static MembersInjector<UserChoice> create(Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider) {
    return new UserChoice_MembersInjector(sessionManagerProvider, commonMethodsProvider);
  }

  public static MembersInjector<UserChoice> create(
      javax.inject.Provider<SessionManager> sessionManagerProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider) {
    return new UserChoice_MembersInjector(Providers.asDaggerProvider(sessionManagerProvider), Providers.asDaggerProvider(commonMethodsProvider));
  }

  @Override
  public void injectMembers(UserChoice instance) {
    injectSessionManager(instance, sessionManagerProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.utils.userchoice.UserChoice.sessionManager")
  public static void injectSessionManager(UserChoice instance, SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.utils.userchoice.UserChoice.commonMethods")
  public static void injectCommonMethods(UserChoice instance, CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }
}
