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
public final class BannerActivityCommon_MembersInjector implements MembersInjector<BannerActivityCommon> {
  private final Provider<SessionManager> localProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  public BannerActivityCommon_MembersInjector(Provider<SessionManager> localProvider,
      Provider<CommonMethods> commonMethodsProvider) {
    this.localProvider = localProvider;
    this.commonMethodsProvider = commonMethodsProvider;
  }

  public static MembersInjector<BannerActivityCommon> create(Provider<SessionManager> localProvider,
      Provider<CommonMethods> commonMethodsProvider) {
    return new BannerActivityCommon_MembersInjector(localProvider, commonMethodsProvider);
  }

  public static MembersInjector<BannerActivityCommon> create(
      javax.inject.Provider<SessionManager> localProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider) {
    return new BannerActivityCommon_MembersInjector(Providers.asDaggerProvider(localProvider), Providers.asDaggerProvider(commonMethodsProvider));
  }

  @Override
  public void injectMembers(BannerActivityCommon instance) {
    CommonActivity_MembersInjector.injectLocal(instance, localProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.views.BannerActivityCommon.commonMethods")
  public static void injectCommonMethods(BannerActivityCommon instance,
      CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }
}
