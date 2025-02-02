package org.odk.collect.android.external;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.storage.StoragePathProvider;
import org.odk.collect.android.utilities.FormsRepositoryProvider;
import org.odk.collect.android.utilities.InstancesRepositoryProvider;
import org.odk.collect.projects.ProjectsRepository;
import org.odk.collect.settings.SettingsProvider;

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
public final class InstanceProvider_MembersInjector implements MembersInjector<InstanceProvider> {
  private final Provider<InstancesRepositoryProvider> instancesRepositoryProvider;

  private final Provider<FormsRepositoryProvider> formsRepositoryProvider;

  private final Provider<StoragePathProvider> storagePathProvider;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  public InstanceProvider_MembersInjector(
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<StoragePathProvider> storagePathProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider) {
    this.instancesRepositoryProvider = instancesRepositoryProvider;
    this.formsRepositoryProvider = formsRepositoryProvider;
    this.storagePathProvider = storagePathProvider;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.settingsProvider = settingsProvider;
  }

  public static MembersInjector<InstanceProvider> create(
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<StoragePathProvider> storagePathProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider) {
    return new InstanceProvider_MembersInjector(instancesRepositoryProvider, formsRepositoryProvider, storagePathProvider, projectsRepositoryProvider, settingsProvider);
  }

  @Override
  public void injectMembers(InstanceProvider instance) {
    injectInstancesRepositoryProvider(instance, instancesRepositoryProvider.get());
    injectFormsRepositoryProvider(instance, formsRepositoryProvider.get());
    injectStoragePathProvider(instance, storagePathProvider.get());
    injectProjectsRepository(instance, projectsRepositoryProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.external.InstanceProvider.instancesRepositoryProvider")
  public static void injectInstancesRepositoryProvider(InstanceProvider instance,
      InstancesRepositoryProvider instancesRepositoryProvider) {
    instance.instancesRepositoryProvider = instancesRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.external.InstanceProvider.formsRepositoryProvider")
  public static void injectFormsRepositoryProvider(InstanceProvider instance,
      FormsRepositoryProvider formsRepositoryProvider) {
    instance.formsRepositoryProvider = formsRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.external.InstanceProvider.storagePathProvider")
  public static void injectStoragePathProvider(InstanceProvider instance,
      StoragePathProvider storagePathProvider) {
    instance.storagePathProvider = storagePathProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.external.InstanceProvider.projectsRepository")
  public static void injectProjectsRepository(InstanceProvider instance,
      ProjectsRepository projectsRepository) {
    instance.projectsRepository = projectsRepository;
  }

  @InjectedFieldSignature("org.odk.collect.android.external.InstanceProvider.settingsProvider")
  public static void injectSettingsProvider(InstanceProvider instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }
}
