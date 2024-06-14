package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.entities.EntitiesRepositoryProvider;
import org.odk.collect.android.formmanagement.FormSourceProvider;
import org.odk.collect.android.projects.ProjectDependencyProviderFactory;
import org.odk.collect.android.storage.StoragePathProvider;
import org.odk.collect.android.utilities.ChangeLockProvider;
import org.odk.collect.android.utilities.FormsRepositoryProvider;
import org.odk.collect.android.utilities.InstancesRepositoryProvider;
import org.odk.collect.android.utilities.SavepointsRepositoryProvider;
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
public final class AppDependencyModule_ProvidesProjectDependencyProviderFactoryFactory implements Factory<ProjectDependencyProviderFactory> {
  private final AppDependencyModule module;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<FormsRepositoryProvider> formsRepositoryProvider;

  private final Provider<InstancesRepositoryProvider> instancesRepositoryProvider;

  private final Provider<StoragePathProvider> storagePathProvider;

  private final Provider<ChangeLockProvider> changeLockProvider;

  private final Provider<FormSourceProvider> formSourceProvider;

  private final Provider<SavepointsRepositoryProvider> savepointsRepositoryProvider;

  private final Provider<EntitiesRepositoryProvider> entitiesRepositoryProvider;

  public AppDependencyModule_ProvidesProjectDependencyProviderFactoryFactory(
      AppDependencyModule module, Provider<SettingsProvider> settingsProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<StoragePathProvider> storagePathProvider,
      Provider<ChangeLockProvider> changeLockProvider,
      Provider<FormSourceProvider> formSourceProvider,
      Provider<SavepointsRepositoryProvider> savepointsRepositoryProvider,
      Provider<EntitiesRepositoryProvider> entitiesRepositoryProvider) {
    this.module = module;
    this.settingsProvider = settingsProvider;
    this.formsRepositoryProvider = formsRepositoryProvider;
    this.instancesRepositoryProvider = instancesRepositoryProvider;
    this.storagePathProvider = storagePathProvider;
    this.changeLockProvider = changeLockProvider;
    this.formSourceProvider = formSourceProvider;
    this.savepointsRepositoryProvider = savepointsRepositoryProvider;
    this.entitiesRepositoryProvider = entitiesRepositoryProvider;
  }

  @Override
  public ProjectDependencyProviderFactory get() {
    return providesProjectDependencyProviderFactory(module, settingsProvider.get(), formsRepositoryProvider.get(), instancesRepositoryProvider.get(), storagePathProvider.get(), changeLockProvider.get(), formSourceProvider.get(), savepointsRepositoryProvider.get(), entitiesRepositoryProvider.get());
  }

  public static AppDependencyModule_ProvidesProjectDependencyProviderFactoryFactory create(
      AppDependencyModule module, Provider<SettingsProvider> settingsProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<StoragePathProvider> storagePathProvider,
      Provider<ChangeLockProvider> changeLockProvider,
      Provider<FormSourceProvider> formSourceProvider,
      Provider<SavepointsRepositoryProvider> savepointsRepositoryProvider,
      Provider<EntitiesRepositoryProvider> entitiesRepositoryProvider) {
    return new AppDependencyModule_ProvidesProjectDependencyProviderFactoryFactory(module, settingsProvider, formsRepositoryProvider, instancesRepositoryProvider, storagePathProvider, changeLockProvider, formSourceProvider, savepointsRepositoryProvider, entitiesRepositoryProvider);
  }

  public static ProjectDependencyProviderFactory providesProjectDependencyProviderFactory(
      AppDependencyModule instance, SettingsProvider settingsProvider,
      FormsRepositoryProvider formsRepositoryProvider,
      InstancesRepositoryProvider instancesRepositoryProvider,
      StoragePathProvider storagePathProvider, ChangeLockProvider changeLockProvider,
      FormSourceProvider formSourceProvider,
      SavepointsRepositoryProvider savepointsRepositoryProvider,
      EntitiesRepositoryProvider entitiesRepositoryProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesProjectDependencyProviderFactory(settingsProvider, formsRepositoryProvider, instancesRepositoryProvider, storagePathProvider, changeLockProvider, formSourceProvider, savepointsRepositoryProvider, entitiesRepositoryProvider));
  }
}
