package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.settings.ODKAppSettingsMigrator;
import org.odk.collect.settings.SettingsProvider;

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
public final class AppDependencyModule_ProvidesPreferenceMigratorFactory implements Factory<ODKAppSettingsMigrator> {
  private final AppDependencyModule module;

  private final Provider<SettingsProvider> settingsProvider;

  public AppDependencyModule_ProvidesPreferenceMigratorFactory(AppDependencyModule module,
      Provider<SettingsProvider> settingsProvider) {
    this.module = module;
    this.settingsProvider = settingsProvider;
  }

  @Override
  public ODKAppSettingsMigrator get() {
    return providesPreferenceMigrator(module, settingsProvider.get());
  }

  public static AppDependencyModule_ProvidesPreferenceMigratorFactory create(
      AppDependencyModule module, Provider<SettingsProvider> settingsProvider) {
    return new AppDependencyModule_ProvidesPreferenceMigratorFactory(module, settingsProvider);
  }

  public static ODKAppSettingsMigrator providesPreferenceMigrator(AppDependencyModule instance,
      SettingsProvider settingsProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesPreferenceMigrator(settingsProvider));
  }
}
