package com.newtaxiprime.user.appcommon.dependencies.module;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;
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
public final class NetworkModule_ProvidesRetrofitServiceFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  private final Provider<OkHttpClient.Builder> okHttpClientProvider;

  private final Provider<Gson> gsonProvider;

  public NetworkModule_ProvidesRetrofitServiceFactory(NetworkModule module,
      Provider<OkHttpClient.Builder> okHttpClientProvider, Provider<Gson> gsonProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public Retrofit get() {
    return providesRetrofitService(module, okHttpClientProvider.get(), gsonProvider.get());
  }

  public static NetworkModule_ProvidesRetrofitServiceFactory create(NetworkModule module,
      javax.inject.Provider<OkHttpClient.Builder> okHttpClientProvider,
      javax.inject.Provider<Gson> gsonProvider) {
    return new NetworkModule_ProvidesRetrofitServiceFactory(module, Providers.asDaggerProvider(okHttpClientProvider), Providers.asDaggerProvider(gsonProvider));
  }

  public static NetworkModule_ProvidesRetrofitServiceFactory create(NetworkModule module,
      Provider<OkHttpClient.Builder> okHttpClientProvider, Provider<Gson> gsonProvider) {
    return new NetworkModule_ProvidesRetrofitServiceFactory(module, okHttpClientProvider, gsonProvider);
  }

  public static Retrofit providesRetrofitService(NetworkModule instance,
      OkHttpClient.Builder okHttpClient, Gson gson) {
    return Preconditions.checkNotNullFromProvides(instance.providesRetrofitService(okHttpClient, gson));
  }
}
