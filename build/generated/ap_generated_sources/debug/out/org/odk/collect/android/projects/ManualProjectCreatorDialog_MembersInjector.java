package org.odk.collect.android.projects;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.configure.qr.AppConfigurationGenerator;
import org.odk.collect.android.utilities.SoftKeyboardController;
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
public final class ManualProjectCreatorDialog_MembersInjector implements MembersInjector<ManualProjectCreatorDialog> {
  private final Provider<ProjectCreator> projectCreatorProvider;

  private final Provider<AppConfigurationGenerator> appConfigurationGeneratorProvider;

  private final Provider<SoftKeyboardController> softKeyboardControllerProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  public ManualProjectCreatorDialog_MembersInjector(Provider<ProjectCreator> projectCreatorProvider,
      Provider<AppConfigurationGenerator> appConfigurationGeneratorProvider,
      Provider<SoftKeyboardController> softKeyboardControllerProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider) {
    this.projectCreatorProvider = projectCreatorProvider;
    this.appConfigurationGeneratorProvider = appConfigurationGeneratorProvider;
    this.softKeyboardControllerProvider = softKeyboardControllerProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.settingsProvider = settingsProvider;
  }

  public static MembersInjector<ManualProjectCreatorDialog> create(
      Provider<ProjectCreator> projectCreatorProvider,
      Provider<AppConfigurationGenerator> appConfigurationGeneratorProvider,
      Provider<SoftKeyboardController> softKeyboardControllerProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider) {
    return new ManualProjectCreatorDialog_MembersInjector(projectCreatorProvider, appConfigurationGeneratorProvider, softKeyboardControllerProvider, projectsDataServiceProvider, projectsRepositoryProvider, settingsProvider);
  }

  @Override
  public void injectMembers(ManualProjectCreatorDialog instance) {
    injectProjectCreator(instance, projectCreatorProvider.get());
    injectAppConfigurationGenerator(instance, appConfigurationGeneratorProvider.get());
    injectSoftKeyboardController(instance, softKeyboardControllerProvider.get());
    injectProjectsDataService(instance, projectsDataServiceProvider.get());
    injectProjectsRepository(instance, projectsRepositoryProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.ManualProjectCreatorDialog.projectCreator")
  public static void injectProjectCreator(ManualProjectCreatorDialog instance,
      ProjectCreator projectCreator) {
    instance.projectCreator = projectCreator;
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.ManualProjectCreatorDialog.appConfigurationGenerator")
  public static void injectAppConfigurationGenerator(ManualProjectCreatorDialog instance,
      AppConfigurationGenerator appConfigurationGenerator) {
    instance.appConfigurationGenerator = appConfigurationGenerator;
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.ManualProjectCreatorDialog.softKeyboardController")
  public static void injectSoftKeyboardController(ManualProjectCreatorDialog instance,
      SoftKeyboardController softKeyboardController) {
    instance.softKeyboardController = softKeyboardController;
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.ManualProjectCreatorDialog.projectsDataService")
  public static void injectProjectsDataService(ManualProjectCreatorDialog instance,
      ProjectsDataService projectsDataService) {
    instance.projectsDataService = projectsDataService;
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.ManualProjectCreatorDialog.projectsRepository")
  public static void injectProjectsRepository(ManualProjectCreatorDialog instance,
      ProjectsRepository projectsRepository) {
    instance.projectsRepository = projectsRepository;
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.ManualProjectCreatorDialog.settingsProvider")
  public static void injectSettingsProvider(ManualProjectCreatorDialog instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }
}
