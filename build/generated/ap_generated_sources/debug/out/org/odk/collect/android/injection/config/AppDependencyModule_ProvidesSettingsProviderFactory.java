package org.odk.collect.android.injection.config;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.settings.SettingsProvider;

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
public final class AppDependencyModule_ProvidesSettingsProviderFactory implements Factory<SettingsProvider> {
  private final AppDependencyModule module;

  private final Provider<Context> contextProvider;

  public AppDependencyModule_ProvidesSettingsProviderFactory(AppDependencyModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public SettingsProvider get() {
    return providesSettingsProvider(module, contextProvider.get());
  }

  public static AppDependencyModule_ProvidesSettingsProviderFactory create(
      AppDependencyModule module, Provider<Context> contextProvider) {
    return new AppDependencyModule_ProvidesSettingsProviderFactory(module, contextProvider);
  }

  public static SettingsProvider providesSettingsProvider(AppDependencyModule instance,
      Context context) {
    return Preconditions.checkNotNullFromProvides(instance.providesSettingsProvider(context));
  }
}
