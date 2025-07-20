package com.newtaxiprime.user.taxiapp.database;

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
public final class AddFirebaseDatabase_MembersInjector implements MembersInjector<AddFirebaseDatabase> {
  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<CommonMethods> commonMethodsProvider;

  public AddFirebaseDatabase_MembersInjector(Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider) {
    this.sessionManagerProvider = sessionManagerProvider;
    this.commonMethodsProvider = commonMethodsProvider;
  }

  public static MembersInjector<AddFirebaseDatabase> create(
      Provider<SessionManager> sessionManagerProvider,
      Provider<CommonMethods> commonMethodsProvider) {
    return new AddFirebaseDatabase_MembersInjector(sessionManagerProvider, commonMethodsProvider);
  }

  public static MembersInjector<AddFirebaseDatabase> create(
      javax.inject.Provider<SessionManager> sessionManagerProvider,
      javax.inject.Provider<CommonMethods> commonMethodsProvider) {
    return new AddFirebaseDatabase_MembersInjector(Providers.asDaggerProvider(sessionManagerProvider), Providers.asDaggerProvider(commonMethodsProvider));
  }

  @Override
  public void injectMembers(AddFirebaseDatabase instance) {
    injectSessionManager(instance, sessionManagerProvider.get());
    injectCommonMethods(instance, commonMethodsProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.database.AddFirebaseDatabase.sessionManager")
  public static void injectSessionManager(AddFirebaseDatabase instance,
      SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.taxiapp.database.AddFirebaseDatabase.commonMethods")
  public static void injectCommonMethods(AddFirebaseDatabase instance,
      CommonMethods commonMethods) {
    instance.commonMethods = commonMethods;
  }
}
