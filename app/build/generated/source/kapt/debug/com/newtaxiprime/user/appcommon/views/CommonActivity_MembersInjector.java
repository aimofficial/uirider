package com.newtaxiprime.user.appcommon.views;

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
public final class CommonActivity_MembersInjector implements MembersInjector<CommonActivity> {
  private final Provider<SessionManager> localProvider;

  public CommonActivity_MembersInjector(Provider<SessionManager> localProvider) {
    this.localProvider = localProvider;
  }

  public static MembersInjector<CommonActivity> create(Provider<SessionManager> localProvider) {
    return new CommonActivity_MembersInjector(localProvider);
  }

  public static MembersInjector<CommonActivity> create(
      javax.inject.Provider<SessionManager> localProvider) {
    return new CommonActivity_MembersInjector(Providers.asDaggerProvider(localProvider));
  }

  @Override
  public void injectMembers(CommonActivity instance) {
    injectLocal(instance, localProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.views.CommonActivity.local")
  public static void injectLocal(CommonActivity instance, SessionManager local) {
    instance.local = local;
  }
}
