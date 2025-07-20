package com.newtaxiprime.user.appcommon.dependencies.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
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
public final class NetworkModule_Factory implements Factory<NetworkModule> {
  private final Provider<String> mBaseUrlProvider;

  public NetworkModule_Factory(Provider<String> mBaseUrlProvider) {
    this.mBaseUrlProvider = mBaseUrlProvider;
  }

  @Override
  public NetworkModule get() {
    return newInstance(mBaseUrlProvider.get());
  }

  public static NetworkModule_Factory create(javax.inject.Provider<String> mBaseUrlProvider) {
    return new NetworkModule_Factory(Providers.asDaggerProvider(mBaseUrlProvider));
  }

  public static NetworkModule_Factory create(Provider<String> mBaseUrlProvider) {
    return new NetworkModule_Factory(mBaseUrlProvider);
  }

  public static NetworkModule newInstance(String mBaseUrl) {
    return new NetworkModule(mBaseUrl);
  }
}
