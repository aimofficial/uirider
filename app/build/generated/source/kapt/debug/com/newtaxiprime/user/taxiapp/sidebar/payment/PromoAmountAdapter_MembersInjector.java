package com.newtaxiprime.user.taxiapp.sidebar.payment;

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
public final class PromoAmountAdapter_MembersInjector implements MembersInjector<PromoAmountAdapter> {
  private final Provider<SessionManager> sessionManagerProvider;

  public PromoAmountAdapter_MembersInjector(Provider<SessionManager> sessionManagerProvider) {
    this.sessionManagerProvider = sessionManagerProvider;
  }

  public static MembersInjector<PromoAmountAdapter> create(
      Provider<SessionManager> sessionManagerProvider) {
    return new PromoAmountAdapter_MembersInjector(sessionManagerProvider);
  }

  public static MembersInjector<PromoAmountAdapter> create(
      javax.inject.Provider<SessionManager> sessionManagerProvider) {
    return new PromoAmountAdapter_MembersInjector(Providers.asDaggerProvider(sessionManagerProvider));
  }

  @Override
  public void injectMembers(PromoAmountAdapter instance) {
    injectSessionManager(instance, sessionManagerProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.payment.PromoAmountAdapter.sessionManager")
  public static void injectSessionManager(PromoAmountAdapter instance,
      SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }
}
