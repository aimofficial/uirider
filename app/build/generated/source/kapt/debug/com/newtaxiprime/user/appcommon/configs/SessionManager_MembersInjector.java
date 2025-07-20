package com.newtaxiprime.user.appcommon.configs;

import android.content.SharedPreferences;
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
public final class SessionManager_MembersInjector implements MembersInjector<SessionManager> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public SessionManager_MembersInjector(Provider<SharedPreferences> sharedPreferencesProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  public static MembersInjector<SessionManager> create(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new SessionManager_MembersInjector(sharedPreferencesProvider);
  }

  public static MembersInjector<SessionManager> create(
      javax.inject.Provider<SharedPreferences> sharedPreferencesProvider) {
    return new SessionManager_MembersInjector(Providers.asDaggerProvider(sharedPreferencesProvider));
  }

  @Override
  public void injectMembers(SessionManager instance) {
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.configs.SessionManager.sharedPreferences")
  public static void injectSharedPreferences(SessionManager instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }
}
