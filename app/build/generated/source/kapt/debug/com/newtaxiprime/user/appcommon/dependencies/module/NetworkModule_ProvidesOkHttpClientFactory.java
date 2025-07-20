package com.newtaxiprime.user.appcommon.dependencies.module;

import android.content.Context;
import com.newtaxiprime.user.appcommon.configs.SessionManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

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
public final class NetworkModule_ProvidesOkHttpClientFactory implements Factory<OkHttpClient.Builder> {
  private final NetworkModule module;

  private final Provider<Context> contextProvider;

  private final Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public NetworkModule_ProvidesOkHttpClientFactory(NetworkModule module,
      Provider<Context> contextProvider,
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider,
      Provider<SessionManager> sessionManagerProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.httpLoggingInterceptorProvider = httpLoggingInterceptorProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  @Override
  public OkHttpClient.Builder get() {
    return providesOkHttpClient(module, contextProvider.get(), httpLoggingInterceptorProvider.get(), sessionManagerProvider.get());
  }

  public static NetworkModule_ProvidesOkHttpClientFactory create(NetworkModule module,
      javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider,
      javax.inject.Provider<SessionManager> sessionManagerProvider) {
    return new NetworkModule_ProvidesOkHttpClientFactory(module, Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(httpLoggingInterceptorProvider), Providers.asDaggerProvider(sessionManagerProvider));
  }

  public static NetworkModule_ProvidesOkHttpClientFactory create(NetworkModule module,
      Provider<Context> contextProvider,
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return new NetworkModule_ProvidesOkHttpClientFactory(module, contextProvider, httpLoggingInterceptorProvider, sessionManagerProvider);
  }

  public static OkHttpClient.Builder providesOkHttpClient(NetworkModule instance, Context context,
      HttpLoggingInterceptor httpLoggingInterceptor, SessionManager sessionManager) {
    return Preconditions.checkNotNullFromProvides(instance.providesOkHttpClient(context, httpLoggingInterceptor, sessionManager));
  }
}
