package com.newtaxiprime.user.appcommon.views;

import com.newtaxiprime.user.appcommon.configs.SessionManager;
import com.newtaxiprime.user.appcommon.utils.CommonMethods;
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
public final class SupportActivityCommon_MembersInjector implements MembersInjector<SupportActivityCommon> {
  private final Provider<SessionManager> localProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  public SupportActivityCommon_MembersInjector(Provider<SessionManager> localProvider,
      Provider<CommonMethods> commonMethodsProvider) {
    this.localProvider = localProvider;
    this.commonMethodsProvider = commonMethodsProvider;
  }

  public static MembersInjector<SupportActivityCommon> create(
      Provider<SessionManager> localProvider, Provider<CommonMethods> commonMethodsProvider) {
    return new SupportActivityCommon_MembersInjector(localProvider, commonMethodsProvider);
  }

  public static MembersInjector<SupportActivityCommon> create(
      javax.inject.Provider<SessionManager> localProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider) {
    return new SupportActivityCommon_MembersInjector(Providers.asDaggerProvider(localProvider), Providers.asDaggerProvider(commonMethodsProvider));
  }

  @Override
  public void injectMembers(SupportActivityCommon instance) {
    CommonActivity_MembersInjector.injectLocal(instance, localProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.views.SupportActivityCommon.commonMethods")
  public static void injectCommonMethods(SupportActivityCommon instance,
      CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }
}
