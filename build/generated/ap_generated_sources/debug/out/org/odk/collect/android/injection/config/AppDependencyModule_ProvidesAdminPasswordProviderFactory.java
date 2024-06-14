package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.utilities.AdminPasswordProvider;
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
public final class AppDependencyModule_ProvidesAdminPasswordProviderFactory implements Factory<AdminPasswordProvider> {
  private final AppDependencyModule module;

  private final Provider<SettingsProvider> settingsProvider;

  public AppDependencyModule_ProvidesAdminPasswordProviderFactory(AppDependencyModule module,
      Provider<SettingsProvider> settingsProvider) {
    this.module = module;
    this.settingsProvider = settingsProvider;
  }

  @Override
  public AdminPasswordProvider get() {
    return providesAdminPasswordProvider(module, settingsProvider.get());
  }

  public static AppDependencyModule_ProvidesAdminPasswordProviderFactory create(
      AppDependencyModule module, Provider<SettingsProvider> settingsProvider) {
    return new AppDependencyModule_ProvidesAdminPasswordProviderFactory(module, settingsProvider);
  }

  public static AdminPasswordProvider providesAdminPasswordProvider(AppDependencyModule instance,
      SettingsProvider settingsProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesAdminPasswordProvider(settingsProvider));
  }
}
