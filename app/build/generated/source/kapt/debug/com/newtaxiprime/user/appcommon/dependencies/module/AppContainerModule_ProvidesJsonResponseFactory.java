package com.newtaxiprime.user.appcommon.dependencies.module;

import com.newtaxiprime.user.appcommon.datamodels.JsonResponse;
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
public final class AppContainerModule_ProvidesJsonResponseFactory implements Factory<JsonResponse> {
  private final AppContainerModule module;

  public AppContainerModule_ProvidesJsonResponseFactory(AppContainerModule module) {
    this.module = module;
  }

  @Override
  public JsonResponse get() {
    return providesJsonResponse(module);
  }

  public static AppContainerModule_ProvidesJsonResponseFactory create(AppContainerModule module) {
    return new AppContainerModule_ProvidesJsonResponseFactory(module);
  }

  public static JsonResponse providesJsonResponse(AppContainerModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesJsonResponse());
  }
}
