package com.newtaxiprime.user.appcommon.configs;

import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import java.util.ArrayList;
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
public final class RunTimePermission_MembersInjector implements MembersInjector<RunTimePermission> {
  private final Provider<Context> contextProvider;

  private final Provider<ArrayList<String>> permissionListProvider;

  public RunTimePermission_MembersInjector(Provider<Context> contextProvider,
      Provider<ArrayList<String>> permissionListProvider) {
    this.contextProvider = contextProvider;
    this.permissionListProvider = permissionListProvider;
  }

  public static MembersInjector<RunTimePermission> create(Provider<Context> contextProvider,
      Provider<ArrayList<String>> permissionListProvider) {
    return new RunTimePermission_MembersInjector(contextProvider, permissionListProvider);
  }

  public static MembersInjector<RunTimePermission> create(
      javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<ArrayList<String>> permissionListProvider) {
    return new RunTimePermission_MembersInjector(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(permissionListProvider));
  }

  @Override
  public void injectMembers(RunTimePermission instance) {
    injectContext(instance, contextProvider.get());
    injectPermissionList(instance, permissionListProvider.get());
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.configs.RunTimePermission.context")
  public static void injectContext(RunTimePermission instance, Context context) {
    instance.context = context;
  }

  @InjectedFieldSignature("com.newtaxiprime.user.appcommon.configs.RunTimePermission.permissionList")
  public static void injectPermissionList(RunTimePermission instance,
      ArrayList<String> permissionList) {
    instance.permissionList = permissionList;
  }
}
