package com.newtaxiprime.user.appcommon.dependencies.module;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class NetworkModule_ProvidesGsonFactory implements Factory<Gson> {
  private final NetworkModule module;

  public NetworkModule_ProvidesGsonFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public Gson get() {
    return providesGson(module);
  }

  public static NetworkModule_ProvidesGsonFactory create(NetworkModule module) {
    return new NetworkModule_ProvidesGsonFactory(module);
  }

  public static Gson providesGson(NetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesGson());
  }
}
