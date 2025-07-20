package com.newtaxiprime.user.appcommon.drawpolyline;

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
public final class DownloadTask_MembersInjector implements MembersInjector<DownloadTask> {
  private final Provider<CommonMethods> commonMethodsProvider;

  public DownloadTask_MembersInjector(Provider<CommonMethods> commonMethodsProvider) {
    this.commonMethodsProvider = commonMethodsProvider;
  }

  public static MembersInjector<DownloadTask> create(
      Provider<CommonMethods> commonMethodsProvider) {
    return new DownloadTask_MembersInjector(commonMethodsProvider);
  }

  public static MembersInjector<DownloadTask> create(
      javax.inject.Provider<CommonMethods> commonMethodsProvider) {
    return new DownloadTask_MembersInjector(Providers.asDaggerProvider(commonMethodsProvider));
  }

  @Override
  public void injectMembers(DownloadTask instance) {
    injectCommonMethods(instance, commonMethodsProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.drawpolyline.DownloadTask.commonMethods")
  public static void injectCommonMethods(DownloadTask instance, CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }
}
