package com.newtaxiprime.user.taxiapp.views.firebaseChat;

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
public final class FirebaseChatHandler_MembersInjector implements MembersInjector<FirebaseChatHandler> {
  private final Provider<SessionManager> sessionManagerProvider;

  public FirebaseChatHandler_MembersInjector(Provider<SessionManager> sessionManagerProvider) {
    this.sessionManagerProvider = sessionManagerProvider;
  }

  public static MembersInjector<FirebaseChatHandler> create(
      Provider<SessionManager> sessionManagerProvider) {
    return new FirebaseChatHandler_MembersInjector(sessionManagerProvider);
  }

  public static MembersInjector<FirebaseChatHandler> create(
      javax.inject.Provider<SessionManager> sessionManagerProvider) {
    return new FirebaseChatHandler_MembersInjector(Providers.asDaggerProvider(sessionManagerProvider));
  }

  @Override
  public void injectMembers(FirebaseChatHandler instance) {
    injectSessionManager(instance, sessionManagerProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.firebaseChat.FirebaseChatHandler.sessionManager")
  public static void injectSessionManager(FirebaseChatHandler instance,
      SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }
}
