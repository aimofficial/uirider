package com.newtaxiprime.user.taxiapp.sidebar.trips;

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
public final class Receipt_MembersInjector implements MembersInjector<Receipt> {
  private final Provider<SessionManager> sessionManagerProvider;

  public Receipt_MembersInjector(Provider<SessionManager> sessionManagerProvider) {
    this.sessionManagerProvider = sessionManagerProvider;
  }

  public static MembersInjector<Receipt> create(Provider<SessionManager> sessionManagerProvider) {
    return new Receipt_MembersInjector(sessionManagerProvider);
  }

  public static MembersInjector<Receipt> create(
      javax.inject.Provider<SessionManager> sessionManagerProvider) {
    return new Receipt_MembersInjector(Providers.asDaggerProvider(sessionManagerProvider));
  }

  @Override
  public void injectMembers(Receipt instance) {
    injectSessionManager(instance, sessionManagerProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.trips.Receipt.sessionManager")
  public static void injectSessionManager(Receipt instance, SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }
}
