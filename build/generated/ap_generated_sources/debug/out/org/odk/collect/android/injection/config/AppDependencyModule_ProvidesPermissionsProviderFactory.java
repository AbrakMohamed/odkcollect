package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.permissions.PermissionsChecker;
import org.odk.collect.permissions.PermissionsProvider;

@ScopeMetadata
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
    "KotlinInternalInJava"
})
public final class AppDependencyModule_ProvidesPermissionsProviderFactory implements Factory<PermissionsProvider> {
  private final AppDependencyModule module;

  private final Provider<PermissionsChecker> permissionsCheckerProvider;

  public AppDependencyModule_ProvidesPermissionsProviderFactory(AppDependencyModule module,
      Provider<PermissionsChecker> permissionsCheckerProvider) {
    this.module = module;
    this.permissionsCheckerProvider = permissionsCheckerProvider;
  }

  @Override
  public PermissionsProvider get() {
    return providesPermissionsProvider(module, permissionsCheckerProvider.get());
  }

  public static AppDependencyModule_ProvidesPermissionsProviderFactory create(
      AppDependencyModule module, Provider<PermissionsChecker> permissionsCheckerProvider) {
    return new AppDependencyModule_ProvidesPermissionsProviderFactory(module, permissionsCheckerProvider);
  }

  public static PermissionsProvider providesPermissionsProvider(AppDependencyModule instance,
      PermissionsChecker permissionsChecker) {
    return Preconditions.checkNotNullFromProvides(instance.providesPermissionsProvider(permissionsChecker));
  }
}
