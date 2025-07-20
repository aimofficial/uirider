package com.newtaxiprime.user.appcommon.dependencies.module;

import com.newtaxiprime.user.appcommon.utils.userchoice.UserChoice;
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
public final class AppContainerModule_ProvidesUserChoiceFactory implements Factory<UserChoice> {
  private final AppContainerModule module;

  public AppContainerModule_ProvidesUserChoiceFactory(AppContainerModule module) {
    this.module = module;
  }

  @Override
  public UserChoice get() {
    return providesUserChoice(module);
  }

  public static AppContainerModule_ProvidesUserChoiceFactory create(AppContainerModule module) {
    return new AppContainerModule_ProvidesUserChoiceFactory(module);
  }

  public static UserChoice providesUserChoice(AppContainerModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesUserChoice());
  }
}
