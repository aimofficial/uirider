package com.newtaxiprime.user.appcommon.dependencies.module;

import com.newtaxiprime.user.appcommon.utils.CommonMethods;
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
public final class AppContainerModule_ProvidesCommonMethodsFactory implements Factory<CommonMethods> {
  private final AppContainerModule module;

  public AppContainerModule_ProvidesCommonMethodsFactory(AppContainerModule module) {
    this.module = module;
  }

  @Override
  public CommonMethods get() {
    return providesCommonMethods(module);
  }

  public static AppContainerModule_ProvidesCommonMethodsFactory create(AppContainerModule module) {
    return new AppContainerModule_ProvidesCommonMethodsFactory(module);
  }

  public static CommonMethods providesCommonMethods(AppContainerModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesCommonMethods());
  }
}
