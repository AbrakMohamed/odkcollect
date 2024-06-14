package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.odk.collect.android.utilities.ExternalAppIntentProvider;

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
public final class AppDependencyModule_ProvidesExternalAppIntentProviderFactory implements Factory<ExternalAppIntentProvider> {
  private final AppDependencyModule module;

  public AppDependencyModule_ProvidesExternalAppIntentProviderFactory(AppDependencyModule module) {
    this.module = module;
  }

  @Override
  public ExternalAppIntentProvider get() {
    return providesExternalAppIntentProvider(module);
  }

  public static AppDependencyModule_ProvidesExternalAppIntentProviderFactory create(
      AppDependencyModule module) {
    return new AppDependencyModule_ProvidesExternalAppIntentProviderFactory(module);
  }

  public static ExternalAppIntentProvider providesExternalAppIntentProvider(
      AppDependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesExternalAppIntentProvider());
  }
}
