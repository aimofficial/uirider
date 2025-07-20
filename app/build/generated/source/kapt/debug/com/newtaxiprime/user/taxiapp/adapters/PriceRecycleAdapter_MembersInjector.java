package com.newtaxiprime.user.taxiapp.adapters;

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
public final class PriceRecycleAdapter_MembersInjector implements MembersInjector<PriceRecycleAdapter> {
  private final Provider<CommonMethods> commonMethodsProvider;

  public PriceRecycleAdapter_MembersInjector(Provider<CommonMethods> commonMethodsProvider) {
    this.commonMethodsProvider = commonMethodsProvider;
  }

  public static MembersInjector<PriceRecycleAdapter> create(
      Provider<CommonMethods> commonMethodsProvider) {
    return new PriceRecycleAdapter_MembersInjector(commonMethodsProvider);
  }

  public static MembersInjector<PriceRecycleAdapter> create(
      javax.inject.Provider<CommonMethods> commonMethodsProvider) {
    return new PriceRecycleAdapter_MembersInjector(Providers.asDaggerProvider(commonMethodsProvider));
  }

  @Override
  public void injectMembers(PriceRecycleAdapter instance) {
    injectCommonMethods(instance, commonMethodsProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.adapters.PriceRecycleAdapter.commonMethods")
  public static void injectCommonMethods(PriceRecycleAdapter instance,
      CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }
}
