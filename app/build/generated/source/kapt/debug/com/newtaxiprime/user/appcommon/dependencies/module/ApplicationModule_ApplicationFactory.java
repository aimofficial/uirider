package com.newtaxiprime.user.appcommon.dependencies.module;

import android.app.Application;
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
public final class ApplicationModule_ApplicationFactory implements Factory<Application> {
  private final ApplicationModule module;

  public ApplicationModule_ApplicationFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public Application get() {
    return application(module);
  }

  public static ApplicationModule_ApplicationFactory create(ApplicationModule module) {
    return new ApplicationModule_ApplicationFactory(module);
  }

  public static Application application(ApplicationModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.application());
  }
}
