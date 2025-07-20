package com.newtaxiprime.user.taxiapp.adapters;

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
public final class PastTripsPaginationAdapter_MembersInjector implements MembersInjector<PastTripsPaginationAdapter> {
  private final Provider<SessionManager> sessionManagerProvider;

  public PastTripsPaginationAdapter_MembersInjector(
      Provider<SessionManager> sessionManagerProvider) {
    this.sessionManagerProvider = sessionManagerProvider;
  }

  public static MembersInjector<PastTripsPaginationAdapter> create(
      Provider<SessionManager> sessionManagerProvider) {
    return new PastTripsPaginationAdapter_MembersInjector(sessionManagerProvider);
  }

  public static MembersInjector<PastTripsPaginationAdapter> create(
      javax.inject.Provider<SessionManager> sessionManagerProvider) {
    return new PastTripsPaginationAdapter_MembersInjector(Providers.asDaggerProvider(sessionManagerProvider));
  }

  @Override
  public void injectMembers(PastTripsPaginationAdapter instance) {
    injectSessionManager(instance, sessionManagerProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.adapters.PastTripsPaginationAdapter.sessionManager")
  public static void injectSessionManager(PastTripsPaginationAdapter instance,
      SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }
}
