package com.newtaxiprime.user.appcommon.dependencies.module;

import com.newtaxiprime.user.appcommon.database.SqLiteDb;
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
public final class AppContainerModule_ProvidesSqlite$app_debugFactory implements Factory<SqLiteDb> {
  private final AppContainerModule module;

  public AppContainerModule_ProvidesSqlite$app_debugFactory(AppContainerModule module) {
    this.module = module;
  }

  @Override
  public SqLiteDb get() {
    return providesSqlite$app_debug(module);
  }

  public static AppContainerModule_ProvidesSqlite$app_debugFactory create(
      AppContainerModule module) {
    return new AppContainerModule_ProvidesSqlite$app_debugFactory(module);
  }

  public static SqLiteDb providesSqlite$app_debug(AppContainerModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesSqlite$app_debug());
  }
}
