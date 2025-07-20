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
public final class PaymentMethodAdapter_MembersInjector implements MembersInjector<PaymentMethodAdapter> {
  private final Provider<SessionManager> sessionManagerProvider;

  public PaymentMethodAdapter_MembersInjector(Provider<SessionManager> sessionManagerProvider) {
    this.sessionManagerProvider = sessionManagerProvider;
  }

  public static MembersInjector<PaymentMethodAdapter> create(
      Provider<SessionManager> sessionManagerProvider) {
    return new PaymentMethodAdapter_MembersInjector(sessionManagerProvider);
  }

  public static MembersInjector<PaymentMethodAdapter> create(
      javax.inject.Provider<SessionManager> sessionManagerProvider) {
    return new PaymentMethodAdapter_MembersInjector(Providers.asDaggerProvider(sessionManagerProvider));
  }

  @Override
  public void injectMembers(PaymentMethodAdapter instance) {
    injectSessionManager(instance, sessionManagerProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.sidebar.payment.PaymentMethodAdapter.sessionManager")
  public static void injectSessionManager(PaymentMethodAdapter instance,
      SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }
}
