package com.newtaxiprime.user.taxiapp.views.peakPricing;

import com.newtaxiprime.user.appcommon.configs.SessionManager;
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
public final class PeakPricing_MembersInjector implements MembersInjector<PeakPricing> {
  private final Provider<SessionManager> localProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public PeakPricing_MembersInjector(Provider<SessionManager> localProvider,
      Provider<SessionManager> sessionManagerProvider) {
    this.localProvider = localProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  public static MembersInjector<PeakPricing> create(Provider<SessionManager> localProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return new PeakPricing_MembersInjector(localProvider, sessionManagerProvider);
  }

  public static MembersInjector<PeakPricing> create(
      javax.inject.Provider<SessionManager> localProvider,
      javax.inject.Provider<SessionManager> sessionManagerProvider) {
    return new PeakPricing_MembersInjector(Providers.asDaggerProvider(localProvider), Providers.asDaggerProvider(sessionManagerProvider));
  }

  @Override
  public void injectMembers(PeakPricing instance) {
    CommonActivity_MembersInjector.injectLocal(instance, localProvider.get());
    injectSessionManager(instance, sessionManagerProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.views.peakPricing.PeakPricing.sessionManager")
  public static void injectSessionManager(PeakPricing instance, SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }
}
