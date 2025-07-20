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
public final class CarDetailsListAdapter_MembersInjector implements MembersInjector<CarDetailsListAdapter> {
  private final Provider<SessionManager> sessionManagerProvider;

  public CarDetailsListAdapter_MembersInjector(Provider<SessionManager> sessionManagerProvider) {
    this.sessionManagerProvider = sessionManagerProvider;
  }

  public static MembersInjector<CarDetailsListAdapter> create(
      Provider<SessionManager> sessionManagerProvider) {
    return new CarDetailsListAdapter_MembersInjector(sessionManagerProvider);
  }

  public static MembersInjector<CarDetailsListAdapter> create(
      javax.inject.Provider<SessionManager> sessionManagerProvider) {
    return new CarDetailsListAdapter_MembersInjector(Providers.asDaggerProvider(sessionManagerProvider));
  }

  @Override
  public void injectMembers(CarDetailsListAdapter instance) {
    injectSessionManager(instance, sessionManagerProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.adapters.CarDetailsListAdapter.sessionManager")
  public static void injectSessionManager(CarDetailsListAdapter instance,
      SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }
}
