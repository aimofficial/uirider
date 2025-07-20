package com.newtaxiprime.user.appcommon.backgroundtask;

import com.newtaxiprime.user.appcommon.configs.SessionManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;

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
public final class ImageCompressAsyncTask_MembersInjector implements MembersInjector<ImageCompressAsyncTask> {
  private final Provider<SessionManager> sessionManagerProvider;

  public ImageCompressAsyncTask_MembersInjector(Provider<SessionManager> sessionManagerProvider) {
    this.sessionManagerProvider = sessionManagerProvider;
  }

  public static MembersInjector<ImageCompressAsyncTask> create(
      Provider<SessionManager> sessionManagerProvider) {
    return new ImageCompressAsyncTask_MembersInjector(sessionManagerProvider);
  }

  public static MembersInjector<ImageCompressAsyncTask> create(
      javax.inject.Provider<SessionManager> sessionManagerProvider) {
    return new ImageCompressAsyncTask_MembersInjector(Providers.asDaggerProvider(sessionManagerProvider));
  }

  @Override
  public void injectMembers(ImageCompressAsyncTask instance) {
    injectSessionManager(instance, sessionManagerProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.backgroundtask.ImageCompressAsyncTask.sessionManager")
  public static void injectSessionManager(ImageCompressAsyncTask instance,
      SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }
}
