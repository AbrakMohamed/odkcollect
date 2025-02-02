package org.odk.collect.android.injection.config;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.permissions.PermissionsChecker;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppDependencyModule_ProvidesPermissionsCheckerFactory implements Factory<PermissionsChecker> {
  private final AppDependencyModule module;

  private final Provider<Context> contextProvider;

  public AppDependencyModule_ProvidesPermissionsCheckerFactory(AppDependencyModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public PermissionsChecker get() {
    return providesPermissionsChecker(module, contextProvider.get());
  }

  public static AppDependencyModule_ProvidesPermissionsCheckerFactory create(
      AppDependencyModule module, Provider<Context> contextProvider) {
    return new AppDependencyModule_ProvidesPermissionsCheckerFactory(module, contextProvider);
  }

  public static PermissionsChecker providesPermissionsChecker(AppDependencyModule instance,
      Context context) {
    return Preconditions.checkNotNullFromProvides(instance.providesPermissionsChecker(context));
  }
}
