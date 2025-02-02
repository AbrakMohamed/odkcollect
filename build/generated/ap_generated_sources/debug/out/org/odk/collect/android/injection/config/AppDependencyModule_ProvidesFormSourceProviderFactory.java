package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.formmanagement.FormSourceProvider;
import org.odk.collect.android.openrosa.OpenRosaHttpInterface;
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
public final class AppDependencyModule_ProvidesFormSourceProviderFactory implements Factory<FormSourceProvider> {
  private final AppDependencyModule module;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<OpenRosaHttpInterface> openRosaHttpInterfaceProvider;

  public AppDependencyModule_ProvidesFormSourceProviderFactory(AppDependencyModule module,
      Provider<SettingsProvider> settingsProvider,
      Provider<OpenRosaHttpInterface> openRosaHttpInterfaceProvider) {
    this.module = module;
    this.settingsProvider = settingsProvider;
    this.openRosaHttpInterfaceProvider = openRosaHttpInterfaceProvider;
  }

  @Override
  public FormSourceProvider get() {
    return providesFormSourceProvider(module, settingsProvider.get(), openRosaHttpInterfaceProvider.get());
  }

  public static AppDependencyModule_ProvidesFormSourceProviderFactory create(
      AppDependencyModule module, Provider<SettingsProvider> settingsProvider,
      Provider<OpenRosaHttpInterface> openRosaHttpInterfaceProvider) {
    return new AppDependencyModule_ProvidesFormSourceProviderFactory(module, settingsProvider, openRosaHttpInterfaceProvider);
  }

  public static FormSourceProvider providesFormSourceProvider(AppDependencyModule instance,
      SettingsProvider settingsProvider, OpenRosaHttpInterface openRosaHttpInterface) {
    return Preconditions.checkNotNullFromProvides(instance.providesFormSourceProvider(settingsProvider, openRosaHttpInterface));
  }
}
