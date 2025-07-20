package com.newtaxiprime.user.appcommon.dependencies.module;

import android.app.Application;
import android.content.Context;
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
public final class AppContainerModule_ProvidesContextFactory implements Factory<Context> {
  private final AppContainerModule module;

  private final Provider<Application> applicationProvider;

  public AppContainerModule_ProvidesContextFactory(AppContainerModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Context get() {
    return providesContext(module, applicationProvider.get());
  }

  public static AppContainerModule_ProvidesContextFactory create(AppContainerModule module,
      javax.inject.Provider<Application> applicationProvider) {
    return new AppContainerModule_ProvidesContextFactory(module, Providers.asDaggerProvider(applicationProvider));
  }

  public static AppContainerModule_ProvidesContextFactory create(AppContainerModule module,
      Provider<Application> applicationProvider) {
    return new AppContainerModule_ProvidesContextFactory(module, applicationProvider);
  }

  public static Context providesContext(AppContainerModule instance, Application application) {
    return Preconditions.checkNotNullFromProvides(instance.providesContext(application));
  }
}
