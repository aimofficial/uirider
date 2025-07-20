package com.newtaxiprime.user.appcommon.dependencies.module;

import com.newtaxiprime.user.appcommon.interfaces.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
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
public final class NetworkModule_ProvidesApiServiceFactory implements Factory<ApiService> {
  private final NetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvidesApiServiceFactory(NetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiService get() {
    return providesApiService(module, retrofitProvider.get());
  }

  public static NetworkModule_ProvidesApiServiceFactory create(NetworkModule module,
      javax.inject.Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvidesApiServiceFactory(module, Providers.asDaggerProvider(retrofitProvider));
  }

  public static NetworkModule_ProvidesApiServiceFactory create(NetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvidesApiServiceFactory(module, retrofitProvider);
  }

  public static ApiService providesApiService(NetworkModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.providesApiService(retrofit));
  }
}
