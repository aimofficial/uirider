package com.newtaxiprime.user.appcommon.dependencies.module;

import com.newtaxiprime.user.appcommon.configs.SessionManager;
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
public final class AppContainerModule_ProvidesSessionManagerFactory implements Factory<SessionManager> {
  private final AppContainerModule module;

  public AppContainerModule_ProvidesSessionManagerFactory(AppContainerModule module) {
    this.module = module;
  }

  @Override
  public SessionManager get() {
    return providesSessionManager(module);
  }

  public static AppContainerModule_ProvidesSessionManagerFactory create(AppContainerModule module) {
    return new AppContainerModule_ProvidesSessionManagerFactory(module);
  }

  public static SessionManager providesSessionManager(AppContainerModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesSessionManager());
  }
}
