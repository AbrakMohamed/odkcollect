package org.odk.collect.android.external;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.itemsets.FastExternalItemsetsRepository;
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
public final class FormsProvider_MembersInjector implements MembersInjector<FormsProvider> {
  private final Provider<FormsRepositoryProvider> formsRepositoryProvider;

  private final Provider<InstancesRepositoryProvider> instancesRepositoryProvider;

  private final Provider<FastExternalItemsetsRepository> fastExternalItemsetsRepositoryProvider;

  private final Provider<StoragePathProvider> storagePathProvider;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  public FormsProvider_MembersInjector(Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<FastExternalItemsetsRepository> fastExternalItemsetsRepositoryProvider,
      Provider<StoragePathProvider> storagePathProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider) {
    this.formsRepositoryProvider = formsRepositoryProvider;
    this.instancesRepositoryProvider = instancesRepositoryProvider;
    this.fastExternalItemsetsRepositoryProvider = fastExternalItemsetsRepositoryProvider;
    this.storagePathProvider = storagePathProvider;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.settingsProvider = settingsProvider;
  }

  public static MembersInjector<FormsProvider> create(
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<FastExternalItemsetsRepository> fastExternalItemsetsRepositoryProvider,
      Provider<StoragePathProvider> storagePathProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider) {
    return new FormsProvider_MembersInjector(formsRepositoryProvider, instancesRepositoryProvider, fastExternalItemsetsRepositoryProvider, storagePathProvider, projectsRepositoryProvider, settingsProvider);
  }

  @Override
  public void injectMembers(FormsProvider instance) {
    injectFormsRepositoryProvider(instance, formsRepositoryProvider.get());
    injectInstancesRepositoryProvider(instance, instancesRepositoryProvider.get());
    injectFastExternalItemsetsRepository(instance, fastExternalItemsetsRepositoryProvider.get());
    injectStoragePathProvider(instance, storagePathProvider.get());
    injectProjectsRepository(instance, projectsRepositoryProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.external.FormsProvider.formsRepositoryProvider")
  public static void injectFormsRepositoryProvider(FormsProvider instance,
      FormsRepositoryProvider formsRepositoryProvider) {
    instance.formsRepositoryProvider = formsRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.external.FormsProvider.instancesRepositoryProvider")
  public static void injectInstancesRepositoryProvider(FormsProvider instance,
      InstancesRepositoryProvider instancesRepositoryProvider) {
    instance.instancesRepositoryProvider = instancesRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.external.FormsProvider.fastExternalItemsetsRepository")
  public static void injectFastExternalItemsetsRepository(FormsProvider instance,
      FastExternalItemsetsRepository fastExternalItemsetsRepository) {
    instance.fastExternalItemsetsRepository = fastExternalItemsetsRepository;
  }

  @InjectedFieldSignature("org.odk.collect.android.external.FormsProvider.storagePathProvider")
  public static void injectStoragePathProvider(FormsProvider instance,
      StoragePathProvider storagePathProvider) {
    instance.storagePathProvider = storagePathProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.external.FormsProvider.projectsRepository")
  public static void injectProjectsRepository(FormsProvider instance,
      ProjectsRepository projectsRepository) {
    instance.projectsRepository = projectsRepository;
  }

  @InjectedFieldSignature("org.odk.collect.android.external.FormsProvider.settingsProvider")
  public static void injectSettingsProvider(FormsProvider instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }
}
