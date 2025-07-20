package com.newtaxiprime.user.appcommon.dependencies.module;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
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
public final class AppContainerModule_ProvidesSharedPreferencesFactory implements Factory<SharedPreferences> {
  private final AppContainerModule module;

  private final Provider<Application> applicationProvider;

  public AppContainerModule_ProvidesSharedPreferencesFactory(AppContainerModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public SharedPreferences get() {
    return providesSharedPreferences(module, applicationProvider.get());
  }

  public static AppContainerModule_ProvidesSharedPreferencesFactory create(
      AppContainerModule module, javax.inject.Provider<Application> applicationProvider) {
    return new AppContainerModule_ProvidesSharedPreferencesFactory(module, Providers.asDaggerProvider(applicationProvider));
  }

  public static AppContainerModule_ProvidesSharedPreferencesFactory create(
      AppContainerModule module, Provider<Application> applicationProvider) {
    return new AppContainerModule_ProvidesSharedPreferencesFactory(module, applicationProvider);
  }

  public static SharedPreferences providesSharedPreferences(AppContainerModule instance,
      Application application) {
    return Preconditions.checkNotNullFromProvides(instance.providesSharedPreferences(application));
  }
}
