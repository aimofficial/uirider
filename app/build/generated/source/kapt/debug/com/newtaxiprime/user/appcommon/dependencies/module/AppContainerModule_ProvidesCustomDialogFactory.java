package com.newtaxiprime.user.appcommon.dependencies.module;

import com.newtaxiprime.user.taxiapp.views.customize.CustomDialog;
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
public final class AppContainerModule_ProvidesCustomDialogFactory implements Factory<CustomDialog> {
  private final AppContainerModule module;

  public AppContainerModule_ProvidesCustomDialogFactory(AppContainerModule module) {
    this.module = module;
  }

  @Override
  public CustomDialog get() {
    return providesCustomDialog(module);
  }

  public static AppContainerModule_ProvidesCustomDialogFactory create(AppContainerModule module) {
    return new AppContainerModule_ProvidesCustomDialogFactory(module);
  }

  public static CustomDialog providesCustomDialog(AppContainerModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesCustomDialog());
  }
}
