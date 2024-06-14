package org.odk.collect.android.activities;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Named;
import javax.inject.Provider;
import org.odk.collect.android.backgroundwork.InstanceSubmitScheduler;
import org.odk.collect.android.entities.EntitiesRepositoryProvider;
import org.odk.collect.android.formentry.FormSessionRepository;
import org.odk.collect.android.formentry.media.AudioHelperFactory;
import org.odk.collect.android.instancemanagement.autosend.AutoSendSettingsProvider;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.storage.StoragePathProvider;
import org.odk.collect.android.tasks.FormLoaderTask;
import org.odk.collect.android.utilities.ExternalAppIntentProvider;
import org.odk.collect.android.utilities.FormsRepositoryProvider;
import org.odk.collect.android.utilities.InstancesRepositoryProvider;
import org.odk.collect.android.utilities.MediaUtils;
import org.odk.collect.android.utilities.SavepointsRepositoryProvider;
import org.odk.collect.android.utilities.SoftKeyboardController;
import org.odk.collect.androidshared.system.IntentLauncher;
import org.odk.collect.async.Scheduler;
import org.odk.collect.audiorecorder.recording.AudioRecorder;
import org.odk.collect.location.LocationClient;
import org.odk.collect.metadata.PropertyManager;
import org.odk.collect.permissions.PermissionsChecker;
import org.odk.collect.permissions.PermissionsProvider;
import org.odk.collect.settings.SettingsProvider;

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
public final class FormFillingActivity_MembersInjector implements MembersInjector<FormFillingActivity> {
  private final Provider<StoragePathProvider> storagePathProvider;

  private final Provider<FormsRepositoryProvider> formsRepositoryProvider;

  private final Provider<PropertyManager> propertyManagerProvider;

  private final Provider<InstanceSubmitScheduler> instanceSubmitSchedulerProvider;

  private final Provider<Scheduler> schedulerProvider;

  private final Provider<AudioRecorder> audioRecorderProvider;

  private final Provider<SoftKeyboardController> softKeyboardControllerProvider;

  private final Provider<PermissionsChecker> permissionsCheckerProvider;

  private final Provider<ExternalAppIntentProvider> externalAppIntentProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<IntentLauncher> intentLauncherProvider;

  private final Provider<FormSessionRepository> formSessionRepositoryProvider;

  private final Provider<PermissionsProvider> permissionsProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<MediaUtils> mediaUtilsProvider;

  private final Provider<EntitiesRepositoryProvider> entitiesRepositoryProvider;

  private final Provider<LocationClient> fusedLocatonClientProvider;

  private final Provider<AudioHelperFactory> audioHelperFactoryProvider;

  private final Provider<FormLoaderTask.FormEntryControllerFactory> formEntryControllerFactoryProvider;

  private final Provider<AutoSendSettingsProvider> autoSendSettingsProvider;

  private final Provider<InstancesRepositoryProvider> instancesRepositoryProvider;

  private final Provider<SavepointsRepositoryProvider> savepointsRepositoryProvider;

  public FormFillingActivity_MembersInjector(Provider<StoragePathProvider> storagePathProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<PropertyManager> propertyManagerProvider,
      Provider<InstanceSubmitScheduler> instanceSubmitSchedulerProvider,
      Provider<Scheduler> schedulerProvider, Provider<AudioRecorder> audioRecorderProvider,
      Provider<SoftKeyboardController> softKeyboardControllerProvider,
      Provider<PermissionsChecker> permissionsCheckerProvider,
      Provider<ExternalAppIntentProvider> externalAppIntentProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<IntentLauncher> intentLauncherProvider,
      Provider<FormSessionRepository> formSessionRepositoryProvider,
      Provider<PermissionsProvider> permissionsProvider,
      Provider<SettingsProvider> settingsProvider, Provider<MediaUtils> mediaUtilsProvider,
      Provider<EntitiesRepositoryProvider> entitiesRepositoryProvider,
      Provider<LocationClient> fusedLocatonClientProvider,
      Provider<AudioHelperFactory> audioHelperFactoryProvider,
      Provider<FormLoaderTask.FormEntryControllerFactory> formEntryControllerFactoryProvider,
      Provider<AutoSendSettingsProvider> autoSendSettingsProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<SavepointsRepositoryProvider> savepointsRepositoryProvider) {
    this.storagePathProvider = storagePathProvider;
    this.formsRepositoryProvider = formsRepositoryProvider;
    this.propertyManagerProvider = propertyManagerProvider;
    this.instanceSubmitSchedulerProvider = instanceSubmitSchedulerProvider;
    this.schedulerProvider = schedulerProvider;
    this.audioRecorderProvider = audioRecorderProvider;
    this.softKeyboardControllerProvider = softKeyboardControllerProvider;
    this.permissionsCheckerProvider = permissionsCheckerProvider;
    this.externalAppIntentProvider = externalAppIntentProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.intentLauncherProvider = intentLauncherProvider;
    this.formSessionRepositoryProvider = formSessionRepositoryProvider;
    this.permissionsProvider = permissionsProvider;
    this.settingsProvider = settingsProvider;
    this.mediaUtilsProvider = mediaUtilsProvider;
    this.entitiesRepositoryProvider = entitiesRepositoryProvider;
    this.fusedLocatonClientProvider = fusedLocatonClientProvider;
    this.audioHelperFactoryProvider = audioHelperFactoryProvider;
    this.formEntryControllerFactoryProvider = formEntryControllerFactoryProvider;
    this.autoSendSettingsProvider = autoSendSettingsProvider;
    this.instancesRepositoryProvider = instancesRepositoryProvider;
    this.savepointsRepositoryProvider = savepointsRepositoryProvider;
  }

  public static MembersInjector<FormFillingActivity> create(
      Provider<StoragePathProvider> storagePathProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<PropertyManager> propertyManagerProvider,
      Provider<InstanceSubmitScheduler> instanceSubmitSchedulerProvider,
      Provider<Scheduler> schedulerProvider, Provider<AudioRecorder> audioRecorderProvider,
      Provider<SoftKeyboardController> softKeyboardControllerProvider,
      Provider<PermissionsChecker> permissionsCheckerProvider,
      Provider<ExternalAppIntentProvider> externalAppIntentProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<IntentLauncher> intentLauncherProvider,
      Provider<FormSessionRepository> formSessionRepositoryProvider,
      Provider<PermissionsProvider> permissionsProvider,
      Provider<SettingsProvider> settingsProvider, Provider<MediaUtils> mediaUtilsProvider,
      Provider<EntitiesRepositoryProvider> entitiesRepositoryProvider,
      Provider<LocationClient> fusedLocatonClientProvider,
      Provider<AudioHelperFactory> audioHelperFactoryProvider,
      Provider<FormLoaderTask.FormEntryControllerFactory> formEntryControllerFactoryProvider,
      Provider<AutoSendSettingsProvider> autoSendSettingsProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<SavepointsRepositoryProvider> savepointsRepositoryProvider) {
    return new FormFillingActivity_MembersInjector(storagePathProvider, formsRepositoryProvider, propertyManagerProvider, instanceSubmitSchedulerProvider, schedulerProvider, audioRecorderProvider, softKeyboardControllerProvider, permissionsCheckerProvider, externalAppIntentProvider, projectsDataServiceProvider, intentLauncherProvider, formSessionRepositoryProvider, permissionsProvider, settingsProvider, mediaUtilsProvider, entitiesRepositoryProvider, fusedLocatonClientProvider, audioHelperFactoryProvider, formEntryControllerFactoryProvider, autoSendSettingsProvider, instancesRepositoryProvider, savepointsRepositoryProvider);
  }

  @Override
  public void injectMembers(FormFillingActivity instance) {
    injectStoragePathProvider(instance, storagePathProvider.get());
    injectFormsRepositoryProvider(instance, formsRepositoryProvider.get());
    injectPropertyManager(instance, propertyManagerProvider.get());
    injectInstanceSubmitScheduler(instance, instanceSubmitSchedulerProvider.get());
    injectScheduler(instance, schedulerProvider.get());
    injectAudioRecorder(instance, audioRecorderProvider.get());
    injectSoftKeyboardController(instance, softKeyboardControllerProvider.get());
    injectPermissionsChecker(instance, permissionsCheckerProvider.get());
    injectExternalAppIntentProvider(instance, externalAppIntentProvider.get());
    injectProjectsDataService(instance, projectsDataServiceProvider.get());
    injectIntentLauncher(instance, intentLauncherProvider.get());
    injectFormSessionRepository(instance, formSessionRepositoryProvider.get());
    injectPermissionsProvider(instance, permissionsProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
    injectMediaUtils(instance, mediaUtilsProvider.get());
    injectEntitiesRepositoryProvider(instance, entitiesRepositoryProvider.get());
    injectFusedLocatonClient(instance, fusedLocatonClientProvider.get());
    injectAudioHelperFactory(instance, audioHelperFactoryProvider.get());
    injectFormEntryControllerFactory(instance, formEntryControllerFactoryProvider.get());
    injectAutoSendSettingsProvider(instance, autoSendSettingsProvider.get());
    injectInstancesRepositoryProvider(instance, instancesRepositoryProvider.get());
    injectSavepointsRepositoryProvider(instance, savepointsRepositoryProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.storagePathProvider")
  public static void injectStoragePathProvider(FormFillingActivity instance,
      StoragePathProvider storagePathProvider) {
    instance.storagePathProvider = storagePathProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.formsRepositoryProvider")
  public static void injectFormsRepositoryProvider(FormFillingActivity instance,
      FormsRepositoryProvider formsRepositoryProvider) {
    instance.formsRepositoryProvider = formsRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.propertyManager")
  public static void injectPropertyManager(FormFillingActivity instance,
      PropertyManager propertyManager) {
    instance.propertyManager = propertyManager;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.instanceSubmitScheduler")
  public static void injectInstanceSubmitScheduler(FormFillingActivity instance,
      InstanceSubmitScheduler instanceSubmitScheduler) {
    instance.instanceSubmitScheduler = instanceSubmitScheduler;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.scheduler")
  public static void injectScheduler(FormFillingActivity instance, Scheduler scheduler) {
    instance.scheduler = scheduler;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.audioRecorder")
  public static void injectAudioRecorder(FormFillingActivity instance,
      AudioRecorder audioRecorder) {
    instance.audioRecorder = audioRecorder;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.softKeyboardController")
  public static void injectSoftKeyboardController(FormFillingActivity instance,
      SoftKeyboardController softKeyboardController) {
    instance.softKeyboardController = softKeyboardController;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.permissionsChecker")
  public static void injectPermissionsChecker(FormFillingActivity instance,
      PermissionsChecker permissionsChecker) {
    instance.permissionsChecker = permissionsChecker;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.externalAppIntentProvider")
  public static void injectExternalAppIntentProvider(FormFillingActivity instance,
      ExternalAppIntentProvider externalAppIntentProvider) {
    instance.externalAppIntentProvider = externalAppIntentProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.projectsDataService")
  public static void injectProjectsDataService(FormFillingActivity instance,
      ProjectsDataService projectsDataService) {
    instance.projectsDataService = projectsDataService;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.intentLauncher")
  public static void injectIntentLauncher(FormFillingActivity instance,
      IntentLauncher intentLauncher) {
    instance.intentLauncher = intentLauncher;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.formSessionRepository")
  public static void injectFormSessionRepository(FormFillingActivity instance,
      FormSessionRepository formSessionRepository) {
    instance.formSessionRepository = formSessionRepository;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.permissionsProvider")
  public static void injectPermissionsProvider(FormFillingActivity instance,
      PermissionsProvider permissionsProvider) {
    instance.permissionsProvider = permissionsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.settingsProvider")
  public static void injectSettingsProvider(FormFillingActivity instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.mediaUtils")
  public static void injectMediaUtils(FormFillingActivity instance, MediaUtils mediaUtils) {
    instance.mediaUtils = mediaUtils;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.entitiesRepositoryProvider")
  public static void injectEntitiesRepositoryProvider(FormFillingActivity instance,
      EntitiesRepositoryProvider entitiesRepositoryProvider) {
    instance.entitiesRepositoryProvider = entitiesRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.fusedLocatonClient")
  @Named("fused")
  public static void injectFusedLocatonClient(FormFillingActivity instance,
      LocationClient fusedLocatonClient) {
    instance.fusedLocatonClient = fusedLocatonClient;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.audioHelperFactory")
  public static void injectAudioHelperFactory(FormFillingActivity instance,
      AudioHelperFactory audioHelperFactory) {
    instance.audioHelperFactory = audioHelperFactory;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.formEntryControllerFactory")
  public static void injectFormEntryControllerFactory(FormFillingActivity instance,
      FormLoaderTask.FormEntryControllerFactory formEntryControllerFactory) {
    instance.formEntryControllerFactory = formEntryControllerFactory;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.autoSendSettingsProvider")
  public static void injectAutoSendSettingsProvider(FormFillingActivity instance,
      AutoSendSettingsProvider autoSendSettingsProvider) {
    instance.autoSendSettingsProvider = autoSendSettingsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.instancesRepositoryProvider")
  public static void injectInstancesRepositoryProvider(FormFillingActivity instance,
      InstancesRepositoryProvider instancesRepositoryProvider) {
    instance.instancesRepositoryProvider = instancesRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormFillingActivity.savepointsRepositoryProvider")
  public static void injectSavepointsRepositoryProvider(FormFillingActivity instance,
      SavepointsRepositoryProvider savepointsRepositoryProvider) {
    instance.savepointsRepositoryProvider = savepointsRepositoryProvider;
  }
}
