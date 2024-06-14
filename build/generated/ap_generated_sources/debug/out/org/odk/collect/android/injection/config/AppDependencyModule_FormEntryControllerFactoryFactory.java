package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.tasks.FormLoaderTask;
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
public final class AppDependencyModule_FormEntryControllerFactoryFactory implements Factory<FormLoaderTask.FormEntryControllerFactory> {
  private final AppDependencyModule module;

  private final Provider<SettingsProvider> settingsProvider;

  public AppDependencyModule_FormEntryControllerFactoryFactory(AppDependencyModule module,
      Provider<SettingsProvider> settingsProvider) {
    this.module = module;
    this.settingsProvider = settingsProvider;
  }

  @Override
  public FormLoaderTask.FormEntryControllerFactory get() {
    return formEntryControllerFactory(module, settingsProvider.get());
  }

  public static AppDependencyModule_FormEntryControllerFactoryFactory create(
      AppDependencyModule module, Provider<SettingsProvider> settingsProvider) {
    return new AppDependencyModule_FormEntryControllerFactoryFactory(module, settingsProvider);
  }

  public static FormLoaderTask.FormEntryControllerFactory formEntryControllerFactory(
      AppDependencyModule instance, SettingsProvider settingsProvider) {
    return Preconditions.checkNotNullFromProvides(instance.formEntryControllerFactory(settingsProvider));
  }
}
