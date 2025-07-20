package com.newtaxiprime.user.appcommon.dependencies.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.ArrayList;
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
public final class AppContainerModule_ProvidesStringArrayListFactory implements Factory<ArrayList<String>> {
  private final AppContainerModule module;

  public AppContainerModule_ProvidesStringArrayListFactory(AppContainerModule module) {
    this.module = module;
  }

  @Override
  public ArrayList<String> get() {
    return providesStringArrayList(module);
  }

  public static AppContainerModule_ProvidesStringArrayListFactory create(
      AppContainerModule module) {
    return new AppContainerModule_ProvidesStringArrayListFactory(module);
  }

  public static ArrayList<String> providesStringArrayList(AppContainerModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesStringArrayList());
  }
}
