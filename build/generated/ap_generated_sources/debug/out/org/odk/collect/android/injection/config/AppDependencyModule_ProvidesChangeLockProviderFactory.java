package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.odk.collect.android.utilities.ChangeLockProvider;

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
public final class AppDependencyModule_ProvidesChangeLockProviderFactory implements Factory<ChangeLockProvider> {
  private final AppDependencyModule module;

  public AppDependencyModule_ProvidesChangeLockProviderFactory(AppDependencyModule module) {
    this.module = module;
  }

  @Override
  public ChangeLockProvider get() {
    return providesChangeLockProvider(module);
  }

  public static AppDependencyModule_ProvidesChangeLockProviderFactory create(
      AppDependencyModule module) {
    return new AppDependencyModule_ProvidesChangeLockProviderFactory(module);
  }

  public static ChangeLockProvider providesChangeLockProvider(AppDependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesChangeLockProvider());
  }
}
