package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.preferences.source.SettingsStore;
import org.odk.collect.settings.SettingsProvider;

@ScopeMetadata
@QualifierMetadata("javax.inject.Named")
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
public final class AppDependencyModule_ProvidesAdminSettingsStoreFactory implements Factory<SettingsStore> {
  private final AppDependencyModule module;

  private final Provider<SettingsProvider> settingsProvider;

  public AppDependencyModule_ProvidesAdminSettingsStoreFactory(AppDependencyModule module,
      Provider<SettingsProvider> settingsProvider) {
    this.module = module;
    this.settingsProvider = settingsProvider;
  }

  @Override
  public SettingsStore get() {
    return providesAdminSettingsStore(module, settingsProvider.get());
  }

  public static AppDependencyModule_ProvidesAdminSettingsStoreFactory create(
      AppDependencyModule module, Provider<SettingsProvider> settingsProvider) {
    return new AppDependencyModule_ProvidesAdminSettingsStoreFactory(module, settingsProvider);
  }

  public static SettingsStore providesAdminSettingsStore(AppDependencyModule instance,
      SettingsProvider settingsProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesAdminSettingsStore(settingsProvider));
  }
}
