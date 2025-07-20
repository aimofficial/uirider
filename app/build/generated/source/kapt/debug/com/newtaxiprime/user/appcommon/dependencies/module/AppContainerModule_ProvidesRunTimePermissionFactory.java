package com.newtaxiprime.user.appcommon.dependencies.module;

import com.newtaxiprime.user.appcommon.configs.RunTimePermission;
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
public final class AppContainerModule_ProvidesRunTimePermissionFactory implements Factory<RunTimePermission> {
  private final AppContainerModule module;

  public AppContainerModule_ProvidesRunTimePermissionFactory(AppContainerModule module) {
    this.module = module;
  }

  @Override
  public RunTimePermission get() {
    return providesRunTimePermission(module);
  }

  public static AppContainerModule_ProvidesRunTimePermissionFactory create(
      AppContainerModule module) {
    return new AppContainerModule_ProvidesRunTimePermissionFactory(module);
  }

  public static RunTimePermission providesRunTimePermission(AppContainerModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesRunTimePermission());
  }
}
