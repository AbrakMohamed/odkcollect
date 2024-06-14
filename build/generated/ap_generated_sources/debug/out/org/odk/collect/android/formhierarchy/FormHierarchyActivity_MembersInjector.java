package org.odk.collect.android.formhierarchy;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.analytics.Analytics;
import org.odk.collect.android.entities.EntitiesRepositoryProvider;
import org.odk.collect.android.formentry.FormSessionRepository;
import org.odk.collect.android.instancemanagement.autosend.AutoSendSettingsProvider;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.storage.StoragePathProvider;
import org.odk.collect.android.utilities.FormsRepositoryProvider;
import org.odk.collect.android.utilities.InstancesRepositoryProvider;
import org.odk.collect.android.utilities.MediaUtils;
import org.odk.collect.async.Scheduler;
import org.odk.collect.audiorecorder.recording.AudioRecorder;
import org.odk.collect.location.LocationClient;
import org.odk.collect.permissions.PermissionsChecker;
import org.odk.collect.permissions.PermissionsProvider;
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
public final class FormHierarchyActivity_MembersInjector implements MembersInjector<FormHierarchyActivity> {
  private final Provider<Scheduler> schedulerProvider;

  private final Provider<FormSessionRepository> formSessionRepositoryProvider;

  private final Provider<MediaUtils> mediaUtilsProvider;

  private final Provider<Analytics> analyticsProvider;

  private final Provider<AudioRecorder> audioRecorderProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<EntitiesRepositoryProvider> entitiesRepositoryProvider;

  private final Provider<PermissionsChecker> permissionsCheckerProvider;

  private final Provider<LocationClient> fusedLocationClientProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<PermissionsProvider> permissionsProvider;

  private final Provider<AutoSendSettingsProvider> autoSendSettingsProvider;

  private final Provider<InstancesRepositoryProvider> instancesRepositoryProvider;

  private final Provider<FormsRepositoryProvider> formsRepositoryProvider;

  private final Provider<StoragePathProvider> storagePathProvider;

  public FormHierarchyActivity_MembersInjector(Provider<Scheduler> schedulerProvider,
      Provider<FormSessionRepository> formSessionRepositoryProvider,
      Provider<MediaUtils> mediaUtilsProvider, Provider<Analytics> analyticsProvider,
      Provider<AudioRecorder> audioRecorderProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<EntitiesRepositoryProvider> entitiesRepositoryProvider,
      Provider<PermissionsChecker> permissionsCheckerProvider,
      Provider<LocationClient> fusedLocationClientProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<PermissionsProvider> permissionsProvider,
      Provider<AutoSendSettingsProvider> autoSendSettingsProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<StoragePathProvider> storagePathProvider) {
    this.schedulerProvider = schedulerProvider;
    this.formSessionRepositoryProvider = formSessionRepositoryProvider;
    this.mediaUtilsProvider = mediaUtilsProvider;
    this.analyticsProvider = analyticsProvider;
    this.audioRecorderProvider = audioRecorderProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.entitiesRepositoryProvider = entitiesRepositoryProvider;
    this.permissionsCheckerProvider = permissionsCheckerProvider;
    this.fusedLocationClientProvider = fusedLocationClientProvider;
    this.settingsProvider = settingsProvider;
    this.permissionsProvider = permissionsProvider;
    this.autoSendSettingsProvider = autoSendSettingsProvider;
    this.instancesRepositoryProvider = instancesRepositoryProvider;
    this.formsRepositoryProvider = formsRepositoryProvider;
    this.storagePathProvider = storagePathProvider;
  }

  public static MembersInjector<FormHierarchyActivity> create(Provider<Scheduler> schedulerProvider,
      Provider<FormSessionRepository> formSessionRepositoryProvider,
      Provider<MediaUtils> mediaUtilsProvider, Provider<Analytics> analyticsProvider,
      Provider<AudioRecorder> audioRecorderProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<EntitiesRepositoryProvider> entitiesRepositoryProvider,
      Provider<PermissionsChecker> permissionsCheckerProvider,
      Provider<LocationClient> fusedLocationClientProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<PermissionsProvider> permissionsProvider,
      Provider<AutoSendSettingsProvider> autoSendSettingsProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<StoragePathProvider> storagePathProvider) {
    return new FormHierarchyActivity_MembersInjector(schedulerProvider, formSessionRepositoryProvider, mediaUtilsProvider, analyticsProvider, audioRecorderProvider, projectsDataServiceProvider, entitiesRepositoryProvider, permissionsCheckerProvider, fusedLocationClientProvider, settingsProvider, permissionsProvider, autoSendSettingsProvider, instancesRepositoryProvider, formsRepositoryProvider, storagePathProvider);
  }

  @Override
  public void injectMembers(FormHierarchyActivity instance) {
    injectScheduler(instance, schedulerProvider.get());
    injectFormSessionRepository(instance, formSessionRepositoryProvider.get());
    injectMediaUtils(instance, mediaUtilsProvider.get());
    injectAnalytics(instance, analyticsProvider.get());
    injectAudioRecorder(instance, audioRecorderProvider.get());
    injectProjectsDataService(instance, projectsDataServiceProvider.get());
    injectEntitiesRepositoryProvider(instance, entitiesRepositoryProvider.get());
    injectPermissionsChecker(instance, permissionsCheckerProvider.get());
    injectFusedLocationClient(instance, fusedLocationClientProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
    injectPermissionsProvider(instance, permissionsProvider.get());
    injectAutoSendSettingsProvider(instance, autoSendSettingsProvider.get());
    injectInstancesRepositoryProvider(instance, instancesRepositoryProvider.get());
    injectFormsRepositoryProvider(instance, formsRepositoryProvider.get());
    injectStoragePathProvider(instance, storagePathProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.formhierarchy.FormHierarchyActivity.scheduler")
  public static void injectScheduler(FormHierarchyActivity instance, Scheduler scheduler) {
    instance.scheduler = scheduler;
  }

  @InjectedFieldSignature("org.odk.collect.android.formhierarchy.FormHierarchyActivity.formSessionRepository")
  public static void injectFormSessionRepository(FormHierarchyActivity instance,
      FormSessionRepository formSessionRepository) {
    instance.formSessionRepository = formSessionRepository;
  }

  @InjectedFieldSignature("org.odk.collect.android.formhierarchy.FormHierarchyActivity.mediaUtils")
  public static void injectMediaUtils(FormHierarchyActivity instance, MediaUtils mediaUtils) {
    instance.mediaUtils = mediaUtils;
  }

  @InjectedFieldSignature("org.odk.collect.android.formhierarchy.FormHierarchyActivity.analytics")
  public static void injectAnalytics(FormHierarchyActivity instance, Analytics analytics) {
    instance.analytics = analytics;
  }

  @InjectedFieldSignature("org.odk.collect.android.formhierarchy.FormHierarchyActivity.audioRecorder")
  public static void injectAudioRecorder(FormHierarchyActivity instance,
      AudioRecorder audioRecorder) {
    instance.audioRecorder = audioRecorder;
  }

  @InjectedFieldSignature("org.odk.collect.android.formhierarchy.FormHierarchyActivity.projectsDataService")
  public static void injectProjectsDataService(FormHierarchyActivity instance,
      ProjectsDataService projectsDataService) {
    instance.projectsDataService = projectsDataService;
  }

  @InjectedFieldSignature("org.odk.collect.android.formhierarchy.FormHierarchyActivity.entitiesRepositoryProvider")
  public static void injectEntitiesRepositoryProvider(FormHierarchyActivity instance,
      EntitiesRepositoryProvider entitiesRepositoryProvider) {
    instance.entitiesRepositoryProvider = entitiesRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.formhierarchy.FormHierarchyActivity.permissionsChecker")
  public static void injectPermissionsChecker(FormHierarchyActivity instance,
      PermissionsChecker permissionsChecker) {
    instance.permissionsChecker = permissionsChecker;
  }

  @InjectedFieldSignature("org.odk.collect.android.formhierarchy.FormHierarchyActivity.fusedLocationClient")
  public static void injectFusedLocationClient(FormHierarchyActivity instance,
      LocationClient fusedLocationClient) {
    instance.fusedLocationClient = fusedLocationClient;
  }

  @InjectedFieldSignature("org.odk.collect.android.formhierarchy.FormHierarchyActivity.settingsProvider")
  public static void injectSettingsProvider(FormHierarchyActivity instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.formhierarchy.FormHierarchyActivity.permissionsProvider")
  public static void injectPermissionsProvider(FormHierarchyActivity instance,
      PermissionsProvider permissionsProvider) {
    instance.permissionsProvider = permissionsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.formhierarchy.FormHierarchyActivity.autoSendSettingsProvider")
  public static void injectAutoSendSettingsProvider(FormHierarchyActivity instance,
      AutoSendSettingsProvider autoSendSettingsProvider) {
    instance.autoSendSettingsProvider = autoSendSettingsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.formhierarchy.FormHierarchyActivity.instancesRepositoryProvider")
  public static void injectInstancesRepositoryProvider(FormHierarchyActivity instance,
      InstancesRepositoryProvider instancesRepositoryProvider) {
    instance.instancesRepositoryProvider = instancesRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.formhierarchy.FormHierarchyActivity.formsRepositoryProvider")
  public static void injectFormsRepositoryProvider(FormHierarchyActivity instance,
      FormsRepositoryProvider formsRepositoryProvider) {
    instance.formsRepositoryProvider = formsRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.formhierarchy.FormHierarchyActivity.storagePathProvider")
  public static void injectStoragePathProvider(FormHierarchyActivity instance,
      StoragePathProvider storagePathProvider) {
    instance.storagePathProvider = storagePathProvider;
  }
}
