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
public final class AdapterFirebaseRecylcerview_MembersInjector implements MembersInjector<AdapterFirebaseRecylcerview> {
  private final Provider<SessionManager> sessionManagerProvider;

  public AdapterFirebaseRecylcerview_MembersInjector(
      Provider<SessionManager> sessionManagerProvider) {
    this.sessionManagerProvider = sessionManagerProvider;
  }

  public static MembersInjector<AdapterFirebaseRecylcerview> create(
      Provider<SessionManager> sessionManagerProvider) {
    return new AdapterFirebaseRecylcerview_MembersInjector(sessionManagerProvider);
  }

  public static MembersInjector<AdapterFirebaseRecylcerview> create(
      javax.inject.Provider<SessionManager> sessionManagerProvider) {
    return new AdapterFirebaseRecylcerview_MembersInjector(Providers.asDaggerProvider(sessionManagerProvider));
  }

  @Override
  public void injectMembers(AdapterFirebaseRecylcerview instance) {
    injectSessionManager(instance, sessionManagerProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.firebaseChat.AdapterFirebaseRecylcerview.sessionManager")
  public static void injectSessionManager(AdapterFirebaseRecylcerview instance,
      SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }
}
