package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.metadata.InstallIDProvider;
import org.odk.collect.metadata.PropertyManager;
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
public final class AppDependencyModule_ProvidesPropertyManagerFactory implements Factory<PropertyManager> {
  private final AppDependencyModule module;

  private final Provider<InstallIDProvider> installIDProvider;

  private final Provider<SettingsProvider> settingsProvider;

  public AppDependencyModule_ProvidesPropertyManagerFactory(AppDependencyModule module,
      Provider<InstallIDProvider> installIDProvider, Provider<SettingsProvider> settingsProvider) {
    this.module = module;
    this.installIDProvider = installIDProvider;
    this.settingsProvider = settingsProvider;
  }

  @Override
  public PropertyManager get() {
    return providesPropertyManager(module, installIDProvider.get(), settingsProvider.get());
  }

  public static AppDependencyModule_ProvidesPropertyManagerFactory create(
      AppDependencyModule module, Provider<InstallIDProvider> installIDProvider,
      Provider<SettingsProvider> settingsProvider) {
    return new AppDependencyModule_ProvidesPropertyManagerFactory(module, installIDProvider, settingsProvider);
  }

  public static PropertyManager providesPropertyManager(AppDependencyModule instance,
      InstallIDProvider installIDProvider, SettingsProvider settingsProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesPropertyManager(installIDProvider, settingsProvider));
  }
}
