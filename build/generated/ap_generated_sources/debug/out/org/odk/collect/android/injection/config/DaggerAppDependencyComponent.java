package org.odk.collect.android.injection.config;

import android.app.Application;
import android.content.Context;
import android.webkit.MimeTypeMap;
import androidx.work.WorkManager;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import javax.annotation.processing.Generated;
import org.javarosa.core.reference.ReferenceManager;
import org.odk.collect.analytics.Analytics;
import org.odk.collect.android.activities.AboutActivity;
import org.odk.collect.android.activities.AboutActivity_MembersInjector;
import org.odk.collect.android.activities.AppListActivity;
import org.odk.collect.android.activities.AppListActivity_MembersInjector;
import org.odk.collect.android.activities.DeleteFormsActivity;
import org.odk.collect.android.activities.DeleteFormsActivity_MembersInjector;
import org.odk.collect.android.activities.FirstLaunchActivity;
import org.odk.collect.android.activities.FirstLaunchActivity_MembersInjector;
import org.odk.collect.android.activities.FormDownloadListActivity;
import org.odk.collect.android.activities.FormDownloadListActivity_MembersInjector;
import org.odk.collect.android.activities.FormFillingActivity;
import org.odk.collect.android.activities.FormFillingActivity_MembersInjector;
import org.odk.collect.android.activities.FormMapActivity;
import org.odk.collect.android.activities.FormMapActivity_MembersInjector;
import org.odk.collect.android.activities.InstanceChooserList;
import org.odk.collect.android.activities.InstanceChooserList_MembersInjector;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.application.initialization.AnalyticsInitializer;
import org.odk.collect.android.application.initialization.ApplicationInitializer;
import org.odk.collect.android.application.initialization.ExistingProjectMigrator;
import org.odk.collect.android.application.initialization.ExistingSettingsMigrator;
import org.odk.collect.android.application.initialization.FormUpdatesUpgrade;
import org.odk.collect.android.application.initialization.GoogleDriveProjectsDeleter;
import org.odk.collect.android.application.initialization.MapsInitializer;
import org.odk.collect.android.application.initialization.MapsInitializer_Factory;
import org.odk.collect.android.application.initialization.upgrade.UpgradeInitializer;
import org.odk.collect.android.audio.AudioRecordingControllerFragment;
import org.odk.collect.android.audio.AudioRecordingControllerFragment_MembersInjector;
import org.odk.collect.android.audio.AudioRecordingErrorDialogFragment;
import org.odk.collect.android.audio.AudioRecordingErrorDialogFragment_MembersInjector;
import org.odk.collect.android.backgroundwork.AutoSendTaskSpec;
import org.odk.collect.android.backgroundwork.AutoSendTaskSpec_MembersInjector;
import org.odk.collect.android.backgroundwork.AutoUpdateTaskSpec;
import org.odk.collect.android.backgroundwork.AutoUpdateTaskSpec_MembersInjector;
import org.odk.collect.android.backgroundwork.FormUpdateScheduler;
import org.odk.collect.android.backgroundwork.InstanceSubmitScheduler;
import org.odk.collect.android.backgroundwork.SyncFormsTaskSpec;
import org.odk.collect.android.backgroundwork.SyncFormsTaskSpec_MembersInjector;
import org.odk.collect.android.configure.qr.AppConfigurationGenerator;
import org.odk.collect.android.configure.qr.QRCodeScannerFragment;
import org.odk.collect.android.configure.qr.QRCodeScannerFragment_MembersInjector;
import org.odk.collect.android.configure.qr.QRCodeTabsActivity;
import org.odk.collect.android.configure.qr.QRCodeTabsActivity_MembersInjector;
import org.odk.collect.android.configure.qr.ShowQRCodeFragment;
import org.odk.collect.android.configure.qr.ShowQRCodeFragment_MembersInjector;
import org.odk.collect.android.entities.EntitiesRepositoryProvider;
import org.odk.collect.android.external.AndroidShortcutsActivity;
import org.odk.collect.android.external.AndroidShortcutsActivity_MembersInjector;
import org.odk.collect.android.external.FormUriActivity;
import org.odk.collect.android.external.FormUriActivity_MembersInjector;
import org.odk.collect.android.external.FormsProvider;
import org.odk.collect.android.external.FormsProvider_MembersInjector;
import org.odk.collect.android.external.InstanceProvider;
import org.odk.collect.android.external.InstanceProvider_MembersInjector;
import org.odk.collect.android.formentry.BackgroundAudioPermissionDialogFragment;
import org.odk.collect.android.formentry.BackgroundAudioPermissionDialogFragment_MembersInjector;
import org.odk.collect.android.formentry.FormSessionRepository;
import org.odk.collect.android.formentry.ODKView;
import org.odk.collect.android.formentry.ODKView_MembersInjector;
import org.odk.collect.android.formentry.media.AudioHelperFactory;
import org.odk.collect.android.formentry.repeats.DeleteRepeatDialogFragment;
import org.odk.collect.android.formentry.saving.SaveAnswerFileErrorDialogFragment;
import org.odk.collect.android.formentry.saving.SaveFormProgressDialogFragment;
import org.odk.collect.android.formhierarchy.FormHierarchyActivity;
import org.odk.collect.android.formhierarchy.FormHierarchyActivity_MembersInjector;
import org.odk.collect.android.formlists.blankformlist.BlankFormListActivity;
import org.odk.collect.android.formlists.blankformlist.BlankFormListActivity_MembersInjector;
import org.odk.collect.android.formlists.blankformlist.BlankFormListViewModel;
import org.odk.collect.android.formmanagement.FormSourceProvider;
import org.odk.collect.android.formmanagement.FormsDataService;
import org.odk.collect.android.formmanagement.ServerFormsDetailsFetcher;
import org.odk.collect.android.fragments.BarCodeScannerFragment;
import org.odk.collect.android.fragments.BarCodeScannerFragment_MembersInjector;
import org.odk.collect.android.fragments.dialogs.FormsDownloadResultDialog;
import org.odk.collect.android.fragments.dialogs.SelectMinimalDialog;
import org.odk.collect.android.fragments.dialogs.SelectMinimalDialog_MembersInjector;
import org.odk.collect.android.instancemanagement.InstancesDataService;
import org.odk.collect.android.instancemanagement.autosend.AutoSendSettingsProvider;
import org.odk.collect.android.instancemanagement.send.InstanceUploaderActivity;
import org.odk.collect.android.instancemanagement.send.InstanceUploaderActivity_MembersInjector;
import org.odk.collect.android.instancemanagement.send.InstanceUploaderListActivity;
import org.odk.collect.android.instancemanagement.send.InstanceUploaderListActivity_MembersInjector;
import org.odk.collect.android.instancemanagement.send.ReadyToSendViewModel;
import org.odk.collect.android.mainmenu.MainMenuActivity;
import org.odk.collect.android.mainmenu.MainMenuActivity_MembersInjector;
import org.odk.collect.android.mainmenu.MainMenuViewModelFactory;
import org.odk.collect.android.notifications.Notifier;
import org.odk.collect.android.openrosa.OpenRosaHttpInterface;
import org.odk.collect.android.preferences.CaptionedListPreference;
import org.odk.collect.android.preferences.CaptionedListPreference_MembersInjector;
import org.odk.collect.android.preferences.PreferenceVisibilityHandler;
import org.odk.collect.android.preferences.ProjectPreferencesViewModel;
import org.odk.collect.android.preferences.dialogs.AdminPasswordDialogFragment;
import org.odk.collect.android.preferences.dialogs.AdminPasswordDialogFragment_MembersInjector;
import org.odk.collect.android.preferences.dialogs.ChangeAdminPasswordDialog;
import org.odk.collect.android.preferences.dialogs.ChangeAdminPasswordDialog_MembersInjector;
import org.odk.collect.android.preferences.dialogs.ResetDialogPreferenceFragmentCompat;
import org.odk.collect.android.preferences.dialogs.ResetDialogPreferenceFragmentCompat_MembersInjector;
import org.odk.collect.android.preferences.dialogs.ServerAuthDialogFragment;
import org.odk.collect.android.preferences.dialogs.ServerAuthDialogFragment_MembersInjector;
import org.odk.collect.android.preferences.screens.BaseAdminPreferencesFragment;
import org.odk.collect.android.preferences.screens.BaseAdminPreferencesFragment_MembersInjector;
import org.odk.collect.android.preferences.screens.BasePreferencesFragment;
import org.odk.collect.android.preferences.screens.BasePreferencesFragment_MembersInjector;
import org.odk.collect.android.preferences.screens.BaseProjectPreferencesFragment;
import org.odk.collect.android.preferences.screens.BaseProjectPreferencesFragment_MembersInjector;
import org.odk.collect.android.preferences.screens.ExperimentalPreferencesFragment;
import org.odk.collect.android.preferences.screens.FormManagementPreferencesFragment;
import org.odk.collect.android.preferences.screens.FormManagementPreferencesFragment_MembersInjector;
import org.odk.collect.android.preferences.screens.FormMetadataPreferencesFragment;
import org.odk.collect.android.preferences.screens.FormMetadataPreferencesFragment_MembersInjector;
import org.odk.collect.android.preferences.screens.IdentityPreferencesFragment;
import org.odk.collect.android.preferences.screens.IdentityPreferencesFragment_MembersInjector;
import org.odk.collect.android.preferences.screens.MapsPreferencesFragment;
import org.odk.collect.android.preferences.screens.MapsPreferencesFragment_MembersInjector;
import org.odk.collect.android.preferences.screens.ProjectDisplayPreferencesFragment;
import org.odk.collect.android.preferences.screens.ProjectDisplayPreferencesFragment_MembersInjector;
import org.odk.collect.android.preferences.screens.ProjectManagementPreferencesFragment;
import org.odk.collect.android.preferences.screens.ProjectManagementPreferencesFragment_MembersInjector;
import org.odk.collect.android.preferences.screens.ProjectPreferencesActivity;
import org.odk.collect.android.preferences.screens.ProjectPreferencesActivity_MembersInjector;
import org.odk.collect.android.preferences.screens.ProjectPreferencesFragment;
import org.odk.collect.android.preferences.screens.ServerPreferencesFragment;
import org.odk.collect.android.preferences.screens.ServerPreferencesFragment_MembersInjector;
import org.odk.collect.android.preferences.screens.UserInterfacePreferencesFragment;
import org.odk.collect.android.preferences.screens.UserInterfacePreferencesFragment_MembersInjector;
import org.odk.collect.android.preferences.source.SettingsStore;
import org.odk.collect.android.projects.ManualProjectCreatorDialog;
import org.odk.collect.android.projects.ManualProjectCreatorDialog_MembersInjector;
import org.odk.collect.android.projects.ProjectCreator;
import org.odk.collect.android.projects.ProjectDeleter;
import org.odk.collect.android.projects.ProjectDependencyProviderFactory;
import org.odk.collect.android.projects.ProjectResetter;
import org.odk.collect.android.projects.ProjectSettingsDialog;
import org.odk.collect.android.projects.ProjectSettingsDialog_MembersInjector;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.projects.QrCodeProjectCreatorDialog;
import org.odk.collect.android.projects.QrCodeProjectCreatorDialog_MembersInjector;
import org.odk.collect.android.storage.StoragePathProvider;
import org.odk.collect.android.tasks.DownloadFormListTask;
import org.odk.collect.android.tasks.DownloadFormListTask_MembersInjector;
import org.odk.collect.android.tasks.FormLoaderTask;
import org.odk.collect.android.tasks.InstanceUploaderTask;
import org.odk.collect.android.tasks.InstanceUploaderTask_MembersInjector;
import org.odk.collect.android.tasks.MediaLoadingTask;
import org.odk.collect.android.tasks.MediaLoadingTask_MembersInjector;
import org.odk.collect.android.utilities.AdminPasswordProvider;
import org.odk.collect.android.utilities.AuthDialogUtility;
import org.odk.collect.android.utilities.AuthDialogUtility_MembersInjector;
import org.odk.collect.android.utilities.ChangeLockProvider;
import org.odk.collect.android.utilities.ExternalAppIntentProvider;
import org.odk.collect.android.utilities.FileProvider;
import org.odk.collect.android.utilities.FormsRepositoryProvider;
import org.odk.collect.android.utilities.ImageCompressionController;
import org.odk.collect.android.utilities.InstancesRepositoryProvider;
import org.odk.collect.android.utilities.MediaUtils;
import org.odk.collect.android.utilities.SavepointsRepositoryProvider;
import org.odk.collect.android.utilities.ThemeUtils;
import org.odk.collect.android.utilities.ThemeUtils_MembersInjector;
import org.odk.collect.android.utilities.WebCredentialsUtils;
import org.odk.collect.android.version.VersionInformation;
import org.odk.collect.android.widgets.QuestionWidget;
import org.odk.collect.android.widgets.QuestionWidget_MembersInjector;
import org.odk.collect.android.widgets.items.SelectOneFromMapDialogFragment;
import org.odk.collect.android.widgets.items.SelectOneFromMapDialogFragment_MembersInjector;
import org.odk.collect.androidshared.network.NetworkStateProvider;
import org.odk.collect.androidshared.utils.ScreenUtils;
import org.odk.collect.async.Scheduler;
import org.odk.collect.audiorecorder.recording.AudioRecorder;
import org.odk.collect.draw.DrawActivity;
import org.odk.collect.draw.DrawActivity_MembersInjector;
import org.odk.collect.googlemaps.GoogleMapFragment;
import org.odk.collect.googlemaps.GoogleMapFragment_MembersInjector;
import org.odk.collect.location.LocationClient;
import org.odk.collect.maps.MapFragmentFactory;
import org.odk.collect.maps.layers.ReferenceLayerRepository;
import org.odk.collect.metadata.InstallIDProvider;
import org.odk.collect.metadata.PropertyManager;
import org.odk.collect.permissions.PermissionsChecker;
import org.odk.collect.permissions.PermissionsProvider;
import org.odk.collect.projects.ProjectsRepository;
import org.odk.collect.settings.ODKAppSettingsImporter;
import org.odk.collect.settings.ODKAppSettingsMigrator;
import org.odk.collect.settings.SettingsProvider;
import org.odk.collect.settings.importing.SettingsChangeHandler;
import org.odk.collect.shared.strings.UUIDGenerator;
import org.odk.collect.utilities.UserAgentProvider;

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
public final class DaggerAppDependencyComponent {
  private DaggerAppDependencyComponent() {
  }

  public static AppDependencyComponent.Builder builder() {
    return new Builder();
  }

  private static final class Builder implements AppDependencyComponent.Builder {
    private Application application;

    private AppDependencyModule appDependencyModule;

    @Override
    public Builder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }

    @Override
    public Builder appDependencyModule(AppDependencyModule testDependencyModule) {
      this.appDependencyModule = Preconditions.checkNotNull(testDependencyModule);
      return this;
    }

    @Override
    public AppDependencyComponent build() {
      Preconditions.checkBuilderRequirement(application, Application.class);
      if (appDependencyModule == null) {
        this.appDependencyModule = new AppDependencyModule();
      }
      return new AppDependencyComponentImpl(appDependencyModule, application);
    }
  }

  private static final class AppDependencyComponentImpl implements AppDependencyComponent {
    private final AppDependencyModule appDependencyModule;

    private final Application application;

    private final AppDependencyComponentImpl appDependencyComponentImpl = this;

    private Provider<Application> applicationProvider;

    private Provider<Context> contextProvider;

    private Provider<SettingsProvider> providesSettingsProvider;

    private Provider<InstallIDProvider> providesInstallIDProvider;

    private Provider<PropertyManager> providesPropertyManagerProvider;

    private Provider<PermissionsChecker> providesPermissionsCheckerProvider;

    private Provider<ExternalAppIntentProvider> providesExternalAppIntentProvider;

    private Provider<UUIDGenerator> providesUUIDGeneratorProvider;

    private Provider<Gson> providesGsonProvider;

    private Provider<ProjectsRepository> providesProjectsRepositoryProvider;

    private Provider<Analytics> providesAnalyticsProvider;

    private Provider<VersionInformation> providesVersionInformationProvider;

    private Provider<AnalyticsInitializer> providesAnalyticsInitializerProvider;

    private Provider<UserAgentProvider> providesUserAgentProvider;

    private Provider<MapsInitializer> mapsInitializerProvider;

    private Provider<ProjectsDataService> providesCurrentProjectProvider;

    private Provider<StoragePathProvider> providesStoragePathProvider;

    private Provider<EntitiesRepositoryProvider> provideEntitiesRepositoryProvider;

    private Provider<MimeTypeMap> provideMimeTypeMapProvider;

    private Provider<OpenRosaHttpInterface> provideHttpInterfaceProvider;

    private Provider<ChangeLockProvider> providesChangeLockProvider;

    private Provider<ImageCompressionController> providesImageCompressorManagerProvider;

    private AppDependencyComponentImpl(AppDependencyModule appDependencyModuleParam,
        Application applicationParam) {
      this.appDependencyModule = appDependencyModuleParam;
      this.application = applicationParam;
      initialize(appDependencyModuleParam, applicationParam);

    }

    private InstanceSubmitScheduler instanceSubmitScheduler() {
      return AppDependencyModule_ProvidesFormSubmitManagerFactory.providesFormSubmitManager(appDependencyModule, scheduler(), providesSettingsProvider.get(), application);
    }

    private AudioRecorder audioRecorder() {
      return AppDependencyModule_ProvidesAudioRecorderFactory.providesAudioRecorder(appDependencyModule, application);
    }

    private FormSessionRepository formSessionRepository() {
      return AppDependencyModule_ProvidesFormSessionStoreFactory.providesFormSessionStore(appDependencyModule, application);
    }

    private MediaUtils mediaUtils() {
      return AppDependencyModule_ProvidesMediaUtilsFactory.providesMediaUtils(appDependencyModule, AppDependencyModule_ProvidesIntentLauncherFactory.providesIntentLauncher(appDependencyModule));
    }

    private LocationClient namedLocationClient() {
      return AppDependencyModule_ProvidesFusedLocationClientFactory.providesFusedLocationClient(appDependencyModule, application);
    }

    private AudioHelperFactory audioHelperFactory() {
      return AppDependencyModule_ProvidesAudioHelperFactoryFactory.providesAudioHelperFactory(appDependencyModule, scheduler());
    }

    private FormLoaderTask.FormEntryControllerFactory formEntryControllerFactory() {
      return AppDependencyModule_FormEntryControllerFactoryFactory.formEntryControllerFactory(appDependencyModule, providesSettingsProvider.get());
    }

    private AutoSendSettingsProvider autoSendSettingsProvider() {
      return AppDependencyModule_ProvidesAutoSendSettingsProviderFactory.providesAutoSendSettingsProvider(appDependencyModule, application, providesSettingsProvider.get(), networkStateProvider());
    }

    private WebCredentialsUtils webCredentialsUtils() {
      return AppDependencyModule_ProvideWebCredentialsFactory.provideWebCredentials(appDependencyModule, providesSettingsProvider.get());
    }

    private Notifier notifier() {
      return AppDependencyModule_ProvidesNotifierFactory.providesNotifier(appDependencyModule, application, providesSettingsProvider.get(), providesProjectsRepositoryProvider.get());
    }

    private InstancesDataService instancesDataService() {
      return AppDependencyModule_ProvidesInstancesDataServiceFactory.providesInstancesDataService(appDependencyModule, application, currentProjectProvider(), instanceSubmitScheduler(), projectDependencyProviderFactory(), notifier(), providesPropertyManagerProvider.get(), provideHttpInterfaceProvider.get());
    }

    private FormUpdateScheduler formUpdateScheduler() {
      return AppDependencyModule_ProvidesFormUpdateMangerFactory.providesFormUpdateManger(appDependencyModule, scheduler(), providesSettingsProvider.get(), application);
    }

    private SettingsChangeHandler settingsChangeHandler() {
      return AppDependencyModule_ProvidesSettingsChangeHandlerFactory.providesSettingsChangeHandler(appDependencyModule, providesPropertyManagerProvider.get(), formUpdateScheduler(), formsDataService());
    }

    private SettingsStore namedSettingsStore() {
      return AppDependencyModule_ProvidesGeneralSettingsStoreFactory.providesGeneralSettingsStore(appDependencyModule, providesSettingsProvider.get());
    }

    private AdminPasswordProvider adminPasswordProvider() {
      return AppDependencyModule_ProvidesAdminPasswordProviderFactory.providesAdminPasswordProvider(appDependencyModule, providesSettingsProvider.get());
    }

    private ProjectPreferencesViewModel.Factory projectPreferencesViewModelFactory() {
      return AppDependencyModule_ProvidesProjectPreferencesViewModelFactory.providesProjectPreferencesViewModel(appDependencyModule, adminPasswordProvider());
    }

    private PreferenceVisibilityHandler preferenceVisibilityHandler() {
      return AppDependencyModule_ProvidesDisabledPreferencesRemoverFactory.providesDisabledPreferencesRemover(appDependencyModule, providesSettingsProvider.get(), AppDependencyModule_ProvidesVersionInformationFactory.providesVersionInformation(appDependencyModule));
    }

    private SettingsStore namedSettingsStore2() {
      return AppDependencyModule_ProvidesAdminSettingsStoreFactory.providesAdminSettingsStore(appDependencyModule, providesSettingsProvider.get());
    }

    private ProjectDeleter projectDeleter() {
      return AppDependencyModule_ProvidesProjectDeleterFactory.providesProjectDeleter(appDependencyModule, providesProjectsRepositoryProvider.get(), currentProjectProvider(), formUpdateScheduler(), instanceSubmitScheduler(), instancesRepositoryProvider(), storagePathProvider(), providesChangeLockProvider.get(), providesSettingsProvider.get());
    }

    private ServerFormsDetailsFetcher serverFormsDetailsFetcher() {
      return AppDependencyModule_ProvidesServerFormDetailsFetcherFactory.providesServerFormDetailsFetcher(appDependencyModule, formsRepositoryProvider(), formSourceProvider());
    }

    private ReadyToSendViewModel.Factory readyToSendViewModelFactory() {
      return AppDependencyModule_ProvidesReadyToSendViewModelFactory.providesReadyToSendViewModel(appDependencyModule, instancesRepositoryProvider(), scheduler());
    }

    private Context context() {
      return AppDependencyModule_ContextFactory.context(appDependencyModule, application);
    }

    private ScreenUtils screenUtils() {
      return AppDependencyModule_ProvidesScreenUtilsFactory.providesScreenUtils(appDependencyModule, context());
    }

    private AnalyticsInitializer analyticsInitializer() {
      return AppDependencyModule_ProvidesAnalyticsInitializerFactory.providesAnalyticsInitializer(appDependencyModule, providesAnalyticsProvider.get(), AppDependencyModule_ProvidesVersionInformationFactory.providesVersionInformation(appDependencyModule), providesSettingsProvider.get());
    }

    private MainMenuViewModelFactory mainMenuViewModelFactory() {
      return AppDependencyModule_ProvidesMainMenuViewModelFactoryFactory.providesMainMenuViewModelFactory(appDependencyModule, AppDependencyModule_ProvidesVersionInformationFactory.providesVersionInformation(appDependencyModule), application, providesSettingsProvider.get(), instancesDataService(), scheduler(), currentProjectProvider(), analyticsInitializer(), providesPermissionsCheckerProvider.get(), formsRepositoryProvider(), instancesRepositoryProvider(), autoSendSettingsProvider());
    }

    private FileProvider fileProvider() {
      return AppDependencyModule_ProvidesFileProviderFactory.providesFileProvider(appDependencyModule, context());
    }

    private AppConfigurationGenerator appConfigurationGenerator() {
      return AppDependencyModule_ProvidesJsonPreferencesGeneratorFactory.providesJsonPreferencesGenerator(appDependencyModule, providesSettingsProvider.get(), currentProjectProvider());
    }

    private BlankFormListViewModel.Factory blankFormListViewModelFactory() {
      return AppDependencyModule_ProvidesBlankFormListViewModelFactory.providesBlankFormListViewModel(appDependencyModule, formsRepositoryProvider(), instancesRepositoryProvider(), application, formsDataService(), scheduler(), providesSettingsProvider.get(), providesChangeLockProvider.get(), currentProjectProvider());
    }

    private ProjectCreator projectCreator() {
      return AppDependencyModule_ProvidesProjectCreatorFactory.providesProjectCreator(appDependencyModule, providesProjectsRepositoryProvider.get(), currentProjectProvider(), settingsImporter(), providesSettingsProvider.get());
    }

    private ODKAppSettingsMigrator oDKAppSettingsMigrator() {
      return AppDependencyModule_ProvidesPreferenceMigratorFactory.providesPreferenceMigrator(appDependencyModule, providesSettingsProvider.get());
    }

    private ExistingSettingsMigrator existingSettingsMigrator() {
      return AppDependencyModule_ProvidesExistingSettingsMigratorFactory.providesExistingSettingsMigrator(appDependencyModule, providesProjectsRepositoryProvider.get(), providesSettingsProvider.get(), oDKAppSettingsMigrator());
    }

    private FormUpdatesUpgrade formUpdatesUpgrade() {
      return AppDependencyModule_ProvidesFormUpdatesUpgraderFactory.providesFormUpdatesUpgrader(appDependencyModule, scheduler(), providesProjectsRepositoryProvider.get(), formUpdateScheduler());
    }

    private GoogleDriveProjectsDeleter googleDriveProjectsDeleter() {
      return AppDependencyModule_ProvidesGoogleDriveProjectsDeleterFactory.providesGoogleDriveProjectsDeleter(appDependencyModule, providesProjectsRepositoryProvider.get(), providesSettingsProvider.get(), projectDeleter());
    }

    private UpgradeInitializer upgradeInitializer() {
      return AppDependencyModule_ProvidesUpgradeInitializerFactory.providesUpgradeInitializer(appDependencyModule, context(), providesSettingsProvider.get(), existingProjectMigrator(), existingSettingsMigrator(), formUpdatesUpgrade(), googleDriveProjectsDeleter(), providesProjectsRepositoryProvider.get(), projectDependencyProviderFactory());
    }

    private MapsInitializer mapsInitializer() {
      return new MapsInitializer(context(), providesSettingsProvider.get(), providesUserAgentProvider.get());
    }

    private WorkManager workManager() {
      return AppDependencyModule_ProvidesWorkManagerFactory.providesWorkManager(appDependencyModule, context());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final AppDependencyModule appDependencyModuleParam,
        final Application applicationParam) {
      this.applicationProvider = InstanceFactory.create(applicationParam);
      this.contextProvider = AppDependencyModule_ContextFactory.create(appDependencyModuleParam, applicationProvider);
      this.providesSettingsProvider = DoubleCheck.provider(AppDependencyModule_ProvidesSettingsProviderFactory.create(appDependencyModuleParam, contextProvider));
      this.providesInstallIDProvider = AppDependencyModule_ProvidesInstallIDProviderFactory.create(appDependencyModuleParam, providesSettingsProvider);
      this.providesPropertyManagerProvider = DoubleCheck.provider(AppDependencyModule_ProvidesPropertyManagerFactory.create(appDependencyModuleParam, providesInstallIDProvider, providesSettingsProvider));
      this.providesPermissionsCheckerProvider = DoubleCheck.provider(AppDependencyModule_ProvidesPermissionsCheckerFactory.create(appDependencyModuleParam, contextProvider));
      this.providesExternalAppIntentProvider = DoubleCheck.provider(AppDependencyModule_ProvidesExternalAppIntentProviderFactory.create(appDependencyModuleParam));
      this.providesUUIDGeneratorProvider = DoubleCheck.provider(AppDependencyModule_ProvidesUUIDGeneratorFactory.create(appDependencyModuleParam));
      this.providesGsonProvider = AppDependencyModule_ProvidesGsonFactory.create(appDependencyModuleParam);
      this.providesProjectsRepositoryProvider = DoubleCheck.provider(AppDependencyModule_ProvidesProjectsRepositoryFactory.create(appDependencyModuleParam, providesUUIDGeneratorProvider, providesGsonProvider, providesSettingsProvider));
      this.providesAnalyticsProvider = DoubleCheck.provider(AppDependencyModule_ProvidesAnalyticsFactory.create(appDependencyModuleParam, applicationProvider));
      this.providesVersionInformationProvider = AppDependencyModule_ProvidesVersionInformationFactory.create(appDependencyModuleParam);
      this.providesAnalyticsInitializerProvider = AppDependencyModule_ProvidesAnalyticsInitializerFactory.create(appDependencyModuleParam, providesAnalyticsProvider, providesVersionInformationProvider, providesSettingsProvider);
      this.providesUserAgentProvider = DoubleCheck.provider(AppDependencyModule_ProvidesUserAgentFactory.create(appDependencyModuleParam));
      this.mapsInitializerProvider = MapsInitializer_Factory.create(contextProvider, providesSettingsProvider, providesUserAgentProvider);
      this.providesCurrentProjectProvider = AppDependencyModule_ProvidesCurrentProjectProviderFactory.create(appDependencyModuleParam, providesSettingsProvider, providesProjectsRepositoryProvider, providesAnalyticsInitializerProvider, contextProvider, mapsInitializerProvider);
      this.providesStoragePathProvider = AppDependencyModule_ProvidesStoragePathProviderFactory.create(appDependencyModuleParam, contextProvider, providesCurrentProjectProvider, providesProjectsRepositoryProvider);
      this.provideEntitiesRepositoryProvider = DoubleCheck.provider(AppDependencyModule_ProvideEntitiesRepositoryProviderFactory.create(appDependencyModuleParam, providesCurrentProjectProvider, providesStoragePathProvider));
      this.provideMimeTypeMapProvider = AppDependencyModule_ProvideMimeTypeMapFactory.create(appDependencyModuleParam);
      this.provideHttpInterfaceProvider = DoubleCheck.provider(AppDependencyModule_ProvideHttpInterfaceFactory.create(appDependencyModuleParam, provideMimeTypeMapProvider, providesUserAgentProvider, applicationProvider, providesVersionInformationProvider));
      this.providesChangeLockProvider = DoubleCheck.provider(AppDependencyModule_ProvidesChangeLockProviderFactory.create(appDependencyModuleParam));
      this.providesImageCompressorManagerProvider = DoubleCheck.provider(AppDependencyModule_ProvidesImageCompressorManagerFactory.create(appDependencyModuleParam));
    }

    @Override
    public void inject(Collect collect) {
    }

    @Override
    public void inject(AboutActivity aboutActivity) {
      injectAboutActivity(aboutActivity);
    }

    @Override
    public void inject(FormFillingActivity formFillingActivity) {
      injectFormFillingActivity(formFillingActivity);
    }

    @Override
    public void inject(InstanceUploaderTask uploader) {
      injectInstanceUploaderTask(uploader);
    }

    @Override
    public void inject(ServerPreferencesFragment serverPreferencesFragment) {
      injectServerPreferencesFragment(serverPreferencesFragment);
    }

    @Override
    public void inject(ProjectDisplayPreferencesFragment projectDisplayPreferencesFragment) {
      injectProjectDisplayPreferencesFragment(projectDisplayPreferencesFragment);
    }

    @Override
    public void inject(ProjectManagementPreferencesFragment projectManagementPreferencesFragment) {
      injectProjectManagementPreferencesFragment(projectManagementPreferencesFragment);
    }

    @Override
    public void inject(AuthDialogUtility authDialogUtility) {
      injectAuthDialogUtility(authDialogUtility);
    }

    @Override
    public void inject(FormDownloadListActivity formDownloadListActivity) {
      injectFormDownloadListActivity(formDownloadListActivity);
    }

    @Override
    public void inject(InstanceUploaderListActivity activity) {
      injectInstanceUploaderListActivity(activity);
    }

    @Override
    public void inject(QuestionWidget questionWidget) {
      injectQuestionWidget(questionWidget);
    }

    @Override
    public void inject(ODKView odkView) {
      injectODKView(odkView);
    }

    @Override
    public void inject(FormMetadataPreferencesFragment formMetadataPreferencesFragment) {
      injectFormMetadataPreferencesFragment(formMetadataPreferencesFragment);
    }

    @Override
    public void inject(FormMapActivity formMapActivity) {
      injectFormMapActivity(formMapActivity);
    }

    @Override
    public void inject(GoogleMapFragment mapFragment) {
      injectGoogleMapFragment(mapFragment);
    }

    @Override
    public void inject(MainMenuActivity mainMenuActivity) {
      injectMainMenuActivity(mainMenuActivity);
    }

    @Override
    public void inject(QRCodeTabsActivity qrCodeTabsActivity) {
      injectQRCodeTabsActivity(qrCodeTabsActivity);
    }

    @Override
    public void inject(ShowQRCodeFragment showQRCodeFragment) {
      injectShowQRCodeFragment(showQRCodeFragment);
    }

    @Override
    public void inject(AutoSendTaskSpec autoSendTaskSpec) {
      injectAutoSendTaskSpec(autoSendTaskSpec);
    }

    @Override
    public void inject(AdminPasswordDialogFragment adminPasswordDialogFragment) {
      injectAdminPasswordDialogFragment(adminPasswordDialogFragment);
    }

    @Override
    public void inject(FormHierarchyActivity formHierarchyActivity) {
      injectFormHierarchyActivity(formHierarchyActivity);
    }

    @Override
    public void inject(FormManagementPreferencesFragment formManagementPreferencesFragment) {
      injectFormManagementPreferencesFragment(formManagementPreferencesFragment);
    }

    @Override
    public void inject(IdentityPreferencesFragment identityPreferencesFragment) {
      injectIdentityPreferencesFragment(identityPreferencesFragment);
    }

    @Override
    public void inject(UserInterfacePreferencesFragment userInterfacePreferencesFragment) {
      injectUserInterfacePreferencesFragment(userInterfacePreferencesFragment);
    }

    @Override
    public void inject(SaveFormProgressDialogFragment saveFormProgressDialogFragment) {
    }

    @Override
    public void inject(BarCodeScannerFragment barCodeScannerFragment) {
      injectBarCodeScannerFragment(barCodeScannerFragment);
    }

    @Override
    public void inject(QRCodeScannerFragment qrCodeScannerFragment) {
      injectQRCodeScannerFragment(qrCodeScannerFragment);
    }

    @Override
    public void inject(ProjectPreferencesActivity projectPreferencesActivity) {
      injectProjectPreferencesActivity(projectPreferencesActivity);
    }

    @Override
    public void inject(ResetDialogPreferenceFragmentCompat resetDialogPreferenceFragmentCompat) {
      injectResetDialogPreferenceFragmentCompat(resetDialogPreferenceFragmentCompat);
    }

    @Override
    public void inject(SyncFormsTaskSpec syncWork) {
      injectSyncFormsTaskSpec(syncWork);
    }

    @Override
    public void inject(ExperimentalPreferencesFragment experimentalPreferencesFragment) {
      injectExperimentalPreferencesFragment(experimentalPreferencesFragment);
    }

    @Override
    public void inject(AutoUpdateTaskSpec autoUpdateTaskSpec) {
      injectAutoUpdateTaskSpec(autoUpdateTaskSpec);
    }

    @Override
    public void inject(ServerAuthDialogFragment serverAuthDialogFragment) {
      injectServerAuthDialogFragment(serverAuthDialogFragment);
    }

    @Override
    public void inject(BasePreferencesFragment basePreferencesFragment) {
      injectBasePreferencesFragment(basePreferencesFragment);
    }

    @Override
    public void inject(InstanceUploaderActivity instanceUploaderActivity) {
      injectInstanceUploaderActivity(instanceUploaderActivity);
    }

    @Override
    public void inject(ProjectPreferencesFragment projectPreferencesFragment) {
      injectProjectPreferencesFragment(projectPreferencesFragment);
    }

    @Override
    public void inject(DeleteFormsActivity deleteFormsActivity) {
      injectDeleteFormsActivity(deleteFormsActivity);
    }

    @Override
    public void inject(SelectMinimalDialog selectMinimalDialog) {
      injectSelectMinimalDialog(selectMinimalDialog);
    }

    @Override
    public void inject(AudioRecordingControllerFragment audioRecordingControllerFragment) {
      injectAudioRecordingControllerFragment(audioRecordingControllerFragment);
    }

    @Override
    public void inject(SaveAnswerFileErrorDialogFragment saveAnswerFileErrorDialogFragment) {
    }

    @Override
    public void inject(AudioRecordingErrorDialogFragment audioRecordingErrorDialogFragment) {
      injectAudioRecordingErrorDialogFragment(audioRecordingErrorDialogFragment);
    }

    @Override
    public void inject(InstanceChooserList instanceChooserList) {
      injectInstanceChooserList(instanceChooserList);
    }

    @Override
    public void inject(FormsProvider formsProvider) {
      injectFormsProvider(formsProvider);
    }

    @Override
    public void inject(InstanceProvider instanceProvider) {
      injectInstanceProvider(instanceProvider);
    }

    @Override
    public void inject(
        BackgroundAudioPermissionDialogFragment backgroundAudioPermissionDialogFragment) {
      injectBackgroundAudioPermissionDialogFragment(backgroundAudioPermissionDialogFragment);
    }

    @Override
    public void inject(ChangeAdminPasswordDialog changeAdminPasswordDialog) {
      injectChangeAdminPasswordDialog(changeAdminPasswordDialog);
    }

    @Override
    public void inject(MediaLoadingTask mediaLoadingTask) {
      injectMediaLoadingTask(mediaLoadingTask);
    }

    @Override
    public void inject(ThemeUtils themeUtils) {
      injectThemeUtils(themeUtils);
    }

    @Override
    public void inject(BaseProjectPreferencesFragment baseProjectPreferencesFragment) {
      injectBaseProjectPreferencesFragment(baseProjectPreferencesFragment);
    }

    @Override
    public void inject(BaseAdminPreferencesFragment baseAdminPreferencesFragment) {
      injectBaseAdminPreferencesFragment(baseAdminPreferencesFragment);
    }

    @Override
    public void inject(CaptionedListPreference captionedListPreference) {
      injectCaptionedListPreference(captionedListPreference);
    }

    @Override
    public void inject(AndroidShortcutsActivity androidShortcutsActivity) {
      injectAndroidShortcutsActivity(androidShortcutsActivity);
    }

    @Override
    public void inject(ProjectSettingsDialog projectSettingsDialog) {
      injectProjectSettingsDialog(projectSettingsDialog);
    }

    @Override
    public void inject(ManualProjectCreatorDialog manualProjectCreatorDialog) {
      injectManualProjectCreatorDialog(manualProjectCreatorDialog);
    }

    @Override
    public void inject(QrCodeProjectCreatorDialog qrCodeProjectCreatorDialog) {
      injectQrCodeProjectCreatorDialog(qrCodeProjectCreatorDialog);
    }

    @Override
    public void inject(FirstLaunchActivity firstLaunchActivity) {
      injectFirstLaunchActivity(firstLaunchActivity);
    }

    @Override
    public void inject(FormUriActivity formUriActivity) {
      injectFormUriActivity(formUriActivity);
    }

    @Override
    public void inject(MapsPreferencesFragment mapsPreferencesFragment) {
      injectMapsPreferencesFragment(mapsPreferencesFragment);
    }

    @Override
    public void inject(FormsDownloadResultDialog formsDownloadResultDialog) {
    }

    @Override
    public void inject(SelectOneFromMapDialogFragment selectOneFromMapDialogFragment) {
      injectSelectOneFromMapDialogFragment(selectOneFromMapDialogFragment);
    }

    @Override
    public void inject(DrawActivity drawActivity) {
      injectDrawActivity(drawActivity);
    }

    @Override
    public void inject(BlankFormListActivity blankFormListActivity) {
      injectBlankFormListActivity(blankFormListActivity);
    }

    @Override
    public void inject(DeleteRepeatDialogFragment deleteRepeatDialogFragment) {
    }

    @Override
    public void inject(AppListActivity appListActivity) {
      injectAppListActivity(appListActivity);
    }

    @Override
    public void inject(DownloadFormListTask downloadFormListTask) {
      injectDownloadFormListTask(downloadFormListTask);
    }

    @Override
    public OpenRosaHttpInterface openRosaHttpInterface() {
      return provideHttpInterfaceProvider.get();
    }

    @Override
    public ReferenceManager referenceManager() {
      return AppDependencyModule_ProvidesReferenceManagerFactory.providesReferenceManager(appDependencyModule);
    }

    @Override
    public SettingsProvider settingsProvider() {
      return providesSettingsProvider.get();
    }

    @Override
    public ApplicationInitializer applicationInitializer() {
      return AppDependencyModule_ProvidesApplicationInitializerFactory.providesApplicationInitializer(appDependencyModule, application, providesPropertyManagerProvider.get(), providesAnalyticsProvider.get(), upgradeInitializer(), analyticsInitializer(), providesProjectsRepositoryProvider.get(), providesSettingsProvider.get(), mapsInitializer(), provideEntitiesRepositoryProvider.get());
    }

    @Override
    public ODKAppSettingsImporter settingsImporter() {
      return AppDependencyModule_ProvidesODKAppSettingsImporterFactory.providesODKAppSettingsImporter(appDependencyModule, context(), providesProjectsRepositoryProvider.get(), providesSettingsProvider.get(), settingsChangeHandler());
    }

    @Override
    public ProjectsRepository projectsRepository() {
      return providesProjectsRepositoryProvider.get();
    }

    @Override
    public ProjectsDataService currentProjectProvider() {
      return AppDependencyModule_ProvidesCurrentProjectProviderFactory.providesCurrentProjectProvider(appDependencyModule, providesSettingsProvider.get(), providesProjectsRepositoryProvider.get(), analyticsInitializer(), context(), mapsInitializer());
    }

    @Override
    public StoragePathProvider storagePathProvider() {
      return AppDependencyModule_ProvidesStoragePathProviderFactory.providesStoragePathProvider(appDependencyModule, context(), currentProjectProvider(), providesProjectsRepositoryProvider.get());
    }

    @Override
    public FormsRepositoryProvider formsRepositoryProvider() {
      return AppDependencyModule_ProvidesFormsRepositoryProviderFactory.providesFormsRepositoryProvider(appDependencyModule, application);
    }

    @Override
    public InstancesRepositoryProvider instancesRepositoryProvider() {
      return AppDependencyModule_ProvidesInstancesRepositoryProviderFactory.providesInstancesRepositoryProvider(appDependencyModule, context(), storagePathProvider());
    }

    @Override
    public SavepointsRepositoryProvider savepointsRepositoryProvider() {
      return AppDependencyModule_ProvidesSavepointsRepositoryProviderFactory.providesSavepointsRepositoryProvider(appDependencyModule, context(), storagePathProvider());
    }

    @Override
    public FormSourceProvider formSourceProvider() {
      return AppDependencyModule_ProvidesFormSourceProviderFactory.providesFormSourceProvider(appDependencyModule, providesSettingsProvider.get(), provideHttpInterfaceProvider.get());
    }

    @Override
    public ExistingProjectMigrator existingProjectMigrator() {
      return AppDependencyModule_ProvidesExistingProjectMigratorFactory.providesExistingProjectMigrator(appDependencyModule, context(), storagePathProvider(), providesProjectsRepositoryProvider.get(), providesSettingsProvider.get(), currentProjectProvider());
    }

    @Override
    public ProjectResetter projectResetter() {
      return AppDependencyModule_ProvidesProjectResetterFactory.providesProjectResetter(appDependencyModule, storagePathProvider(), providesPropertyManagerProvider.get(), providesSettingsProvider.get(), formsRepositoryProvider(), savepointsRepositoryProvider(), instancesDataService(), currentProjectProvider());
    }

    @Override
    public MapFragmentFactory mapFragmentFactory() {
      return AppDependencyModule_ProvidesMapFragmentFactoryFactory.providesMapFragmentFactory(appDependencyModule, providesSettingsProvider.get());
    }

    @Override
    public Scheduler scheduler() {
      return AppDependencyModule_ProvidesSchedulerFactory.providesScheduler(appDependencyModule, workManager());
    }

    @Override
    public LocationClient locationClient() {
      return AppDependencyModule_ProvidesLocationClientFactory.providesLocationClient(appDependencyModule, application);
    }

    @Override
    public PermissionsProvider permissionsProvider() {
      return AppDependencyModule_ProvidesPermissionsProviderFactory.providesPermissionsProvider(appDependencyModule, providesPermissionsCheckerProvider.get());
    }

    @Override
    public PermissionsChecker permissionsChecker() {
      return providesPermissionsCheckerProvider.get();
    }

    @Override
    public ReferenceLayerRepository referenceLayerRepository() {
      return AppDependencyModule_ProvidesReferenceLayerRepositoryFactory.providesReferenceLayerRepository(appDependencyModule, storagePathProvider());
    }

    @Override
    public NetworkStateProvider networkStateProvider() {
      return AppDependencyModule_ProvidesNetworkStateProviderFactory.providesNetworkStateProvider(appDependencyModule, context());
    }

    @Override
    public EntitiesRepositoryProvider entitiesRepositoryProvider() {
      return provideEntitiesRepositoryProvider.get();
    }

    @Override
    public FormsDataService formsDataService() {
      return AppDependencyModule_ProvidesFormsUpdaterFactory.providesFormsUpdater(appDependencyModule, application, notifier(), projectDependencyProviderFactory());
    }

    @Override
    public ProjectDependencyProviderFactory projectDependencyProviderFactory() {
      return AppDependencyModule_ProvidesProjectDependencyProviderFactoryFactory.providesProjectDependencyProviderFactory(appDependencyModule, providesSettingsProvider.get(), formsRepositoryProvider(), instancesRepositoryProvider(), storagePathProvider(), providesChangeLockProvider.get(), formSourceProvider(), savepointsRepositoryProvider(), provideEntitiesRepositoryProvider.get());
    }

    @CanIgnoreReturnValue
    private AboutActivity injectAboutActivity(AboutActivity instance) {
      AboutActivity_MembersInjector.injectIntentLauncher(instance, AppDependencyModule_ProvidesIntentLauncherFactory.providesIntentLauncher(appDependencyModule));
      return instance;
    }

    @CanIgnoreReturnValue
    private FormFillingActivity injectFormFillingActivity(FormFillingActivity instance) {
      FormFillingActivity_MembersInjector.injectStoragePathProvider(instance, storagePathProvider());
      FormFillingActivity_MembersInjector.injectFormsRepositoryProvider(instance, formsRepositoryProvider());
      FormFillingActivity_MembersInjector.injectPropertyManager(instance, providesPropertyManagerProvider.get());
      FormFillingActivity_MembersInjector.injectInstanceSubmitScheduler(instance, instanceSubmitScheduler());
      FormFillingActivity_MembersInjector.injectScheduler(instance, scheduler());
      FormFillingActivity_MembersInjector.injectAudioRecorder(instance, audioRecorder());
      FormFillingActivity_MembersInjector.injectSoftKeyboardController(instance, AppDependencyModule_ProvideSoftKeyboardControllerFactory.provideSoftKeyboardController(appDependencyModule));
      FormFillingActivity_MembersInjector.injectPermissionsChecker(instance, providesPermissionsCheckerProvider.get());
      FormFillingActivity_MembersInjector.injectExternalAppIntentProvider(instance, providesExternalAppIntentProvider.get());
      FormFillingActivity_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      FormFillingActivity_MembersInjector.injectIntentLauncher(instance, AppDependencyModule_ProvidesIntentLauncherFactory.providesIntentLauncher(appDependencyModule));
      FormFillingActivity_MembersInjector.injectFormSessionRepository(instance, formSessionRepository());
      FormFillingActivity_MembersInjector.injectPermissionsProvider(instance, permissionsProvider());
      FormFillingActivity_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      FormFillingActivity_MembersInjector.injectMediaUtils(instance, mediaUtils());
      FormFillingActivity_MembersInjector.injectEntitiesRepositoryProvider(instance, provideEntitiesRepositoryProvider.get());
      FormFillingActivity_MembersInjector.injectFusedLocatonClient(instance, namedLocationClient());
      FormFillingActivity_MembersInjector.injectAudioHelperFactory(instance, audioHelperFactory());
      FormFillingActivity_MembersInjector.injectFormEntryControllerFactory(instance, formEntryControllerFactory());
      FormFillingActivity_MembersInjector.injectAutoSendSettingsProvider(instance, autoSendSettingsProvider());
      FormFillingActivity_MembersInjector.injectInstancesRepositoryProvider(instance, instancesRepositoryProvider());
      FormFillingActivity_MembersInjector.injectSavepointsRepositoryProvider(instance, savepointsRepositoryProvider());
      return instance;
    }

    @CanIgnoreReturnValue
    private InstanceUploaderTask injectInstanceUploaderTask(InstanceUploaderTask instance) {
      InstanceUploaderTask_MembersInjector.injectHttpInterface(instance, provideHttpInterfaceProvider.get());
      InstanceUploaderTask_MembersInjector.injectWebCredentialsUtils(instance, webCredentialsUtils());
      InstanceUploaderTask_MembersInjector.injectPropertyManager(instance, providesPropertyManagerProvider.get());
      InstanceUploaderTask_MembersInjector.injectInstancesDataService(instance, instancesDataService());
      InstanceUploaderTask_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      return instance;
    }

    @CanIgnoreReturnValue
    private ServerPreferencesFragment injectServerPreferencesFragment(
        ServerPreferencesFragment instance) {
      BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandler());
      BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      BasePreferencesFragment_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      BaseProjectPreferencesFragment_MembersInjector.injectGeneralSettingsStore(instance, namedSettingsStore());
      BaseProjectPreferencesFragment_MembersInjector.injectAdminPasswordProvider(instance, adminPasswordProvider());
      BaseProjectPreferencesFragment_MembersInjector.injectFactory(instance, projectPreferencesViewModelFactory());
      BaseProjectPreferencesFragment_MembersInjector.injectPreferenceVisibilityHandler(instance, preferenceVisibilityHandler());
      ServerPreferencesFragment_MembersInjector.injectFormUpdateScheduler(instance, formUpdateScheduler());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProjectDisplayPreferencesFragment injectProjectDisplayPreferencesFragment(
        ProjectDisplayPreferencesFragment instance) {
      BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandler());
      BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      BasePreferencesFragment_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      BaseAdminPreferencesFragment_MembersInjector.injectAdminSettingsStore(instance, namedSettingsStore2());
      ProjectDisplayPreferencesFragment_MembersInjector.injectProjectsRepository(instance, providesProjectsRepositoryProvider.get());
      ProjectDisplayPreferencesFragment_MembersInjector.injectStoragePathProvider(instance, storagePathProvider());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProjectManagementPreferencesFragment injectProjectManagementPreferencesFragment(
        ProjectManagementPreferencesFragment instance) {
      BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandler());
      BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      BasePreferencesFragment_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      BaseAdminPreferencesFragment_MembersInjector.injectAdminSettingsStore(instance, namedSettingsStore2());
      ProjectManagementPreferencesFragment_MembersInjector.injectProjectDeleter(instance, projectDeleter());
      return instance;
    }

    @CanIgnoreReturnValue
    private AuthDialogUtility injectAuthDialogUtility(AuthDialogUtility instance) {
      AuthDialogUtility_MembersInjector.injectWebCredentialsUtils(instance, webCredentialsUtils());
      AuthDialogUtility_MembersInjector.injectPropertyManager(instance, providesPropertyManagerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private FormDownloadListActivity injectFormDownloadListActivity(
        FormDownloadListActivity instance) {
      AppListActivity_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      FormDownloadListActivity_MembersInjector.injectWebCredentialsUtils(instance, webCredentialsUtils());
      FormDownloadListActivity_MembersInjector.injectServerFormsDetailsFetcher(instance, serverFormsDetailsFetcher());
      FormDownloadListActivity_MembersInjector.injectConnectivityProvider(instance, networkStateProvider());
      FormDownloadListActivity_MembersInjector.injectFormsDataService(instance, formsDataService());
      FormDownloadListActivity_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      return instance;
    }

    @CanIgnoreReturnValue
    private InstanceUploaderListActivity injectInstanceUploaderListActivity(
        InstanceUploaderListActivity instance) {
      InstanceUploaderListActivity_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      InstanceUploaderListActivity_MembersInjector.injectConnectivityProvider(instance, networkStateProvider());
      InstanceUploaderListActivity_MembersInjector.injectInstanceSubmitScheduler(instance, instanceSubmitScheduler());
      InstanceUploaderListActivity_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      InstanceUploaderListActivity_MembersInjector.injectFactory(instance, readyToSendViewModelFactory());
      return instance;
    }

    @CanIgnoreReturnValue
    private QuestionWidget injectQuestionWidget(QuestionWidget instance) {
      QuestionWidget_MembersInjector.injectReferenceManager(instance, AppDependencyModule_ProvidesReferenceManagerFactory.providesReferenceManager(appDependencyModule));
      QuestionWidget_MembersInjector.injectAudioHelperFactory(instance, audioHelperFactory());
      QuestionWidget_MembersInjector.injectScreenUtils(instance, screenUtils());
      QuestionWidget_MembersInjector.injectSoftKeyboardController(instance, AppDependencyModule_ProvideSoftKeyboardControllerFactory.provideSoftKeyboardController(appDependencyModule));
      QuestionWidget_MembersInjector.injectPermissionsProvider(instance, permissionsProvider());
      QuestionWidget_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      QuestionWidget_MembersInjector.injectMediaUtils(instance, mediaUtils());
      QuestionWidget_MembersInjector.injectImageLoader(instance, AppDependencyModule_ProvidesImageLoaderFactory.providesImageLoader(appDependencyModule));
      return instance;
    }

    @CanIgnoreReturnValue
    private ODKView injectODKView(ODKView instance) {
      ODKView_MembersInjector.injectPermissionsProvider(instance, permissionsProvider());
      ODKView_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      ODKView_MembersInjector.injectExternalAppIntentProvider(instance, providesExternalAppIntentProvider.get());
      ODKView_MembersInjector.injectIntentLauncher(instance, AppDependencyModule_ProvidesIntentLauncherFactory.providesIntentLauncher(appDependencyModule));
      return instance;
    }

    @CanIgnoreReturnValue
    private FormMetadataPreferencesFragment injectFormMetadataPreferencesFragment(
        FormMetadataPreferencesFragment instance) {
      BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandler());
      BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      BasePreferencesFragment_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      BaseProjectPreferencesFragment_MembersInjector.injectGeneralSettingsStore(instance, namedSettingsStore());
      BaseProjectPreferencesFragment_MembersInjector.injectAdminPasswordProvider(instance, adminPasswordProvider());
      BaseProjectPreferencesFragment_MembersInjector.injectFactory(instance, projectPreferencesViewModelFactory());
      BaseProjectPreferencesFragment_MembersInjector.injectPreferenceVisibilityHandler(instance, preferenceVisibilityHandler());
      FormMetadataPreferencesFragment_MembersInjector.injectPropertyManager(instance, providesPropertyManagerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private FormMapActivity injectFormMapActivity(FormMapActivity instance) {
      FormMapActivity_MembersInjector.injectFormsRepositoryProvider(instance, formsRepositoryProvider());
      FormMapActivity_MembersInjector.injectInstancesRepositoryProvider(instance, instancesRepositoryProvider());
      FormMapActivity_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      FormMapActivity_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      FormMapActivity_MembersInjector.injectScheduler(instance, scheduler());
      return instance;
    }

    @CanIgnoreReturnValue
    private GoogleMapFragment injectGoogleMapFragment(GoogleMapFragment instance) {
      GoogleMapFragment_MembersInjector.injectReferenceLayerRepository(instance, referenceLayerRepository());
      GoogleMapFragment_MembersInjector.injectLocationClient(instance, locationClient());
      GoogleMapFragment_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private MainMenuActivity injectMainMenuActivity(MainMenuActivity instance) {
      MainMenuActivity_MembersInjector.injectViewModelFactory(instance, mainMenuViewModelFactory());
      MainMenuActivity_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      MainMenuActivity_MembersInjector.injectPermissionsProvider(instance, permissionsProvider());
      return instance;
    }

    @CanIgnoreReturnValue
    private QRCodeTabsActivity injectQRCodeTabsActivity(QRCodeTabsActivity instance) {
      QRCodeTabsActivity_MembersInjector.injectQrCodeGenerator(instance, AppDependencyModule_ProvidesQRCodeGeneratorFactory.providesQRCodeGenerator(appDependencyModule));
      QRCodeTabsActivity_MembersInjector.injectIntentLauncher(instance, AppDependencyModule_ProvidesIntentLauncherFactory.providesIntentLauncher(appDependencyModule));
      QRCodeTabsActivity_MembersInjector.injectFileProvider(instance, fileProvider());
      QRCodeTabsActivity_MembersInjector.injectScheduler(instance, scheduler());
      QRCodeTabsActivity_MembersInjector.injectQrCodeDecoder(instance, AppDependencyModule_ProvidesQRCodeDecoderFactory.providesQRCodeDecoder(appDependencyModule));
      QRCodeTabsActivity_MembersInjector.injectSettingsImporter(instance, settingsImporter());
      QRCodeTabsActivity_MembersInjector.injectAppConfigurationGenerator(instance, appConfigurationGenerator());
      QRCodeTabsActivity_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      QRCodeTabsActivity_MembersInjector.injectPermissionsProvider(instance, permissionsProvider());
      QRCodeTabsActivity_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ShowQRCodeFragment injectShowQRCodeFragment(ShowQRCodeFragment instance) {
      ShowQRCodeFragment_MembersInjector.injectQrCodeGenerator(instance, AppDependencyModule_ProvidesQRCodeGeneratorFactory.providesQRCodeGenerator(appDependencyModule));
      ShowQRCodeFragment_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      ShowQRCodeFragment_MembersInjector.injectScheduler(instance, scheduler());
      ShowQRCodeFragment_MembersInjector.injectAppConfigurationGenerator(instance, appConfigurationGenerator());
      return instance;
    }

    @CanIgnoreReturnValue
    private AutoSendTaskSpec injectAutoSendTaskSpec(AutoSendTaskSpec instance) {
      AutoSendTaskSpec_MembersInjector.injectInstancesDataService(instance, instancesDataService());
      return instance;
    }

    @CanIgnoreReturnValue
    private AdminPasswordDialogFragment injectAdminPasswordDialogFragment(
        AdminPasswordDialogFragment instance) {
      AdminPasswordDialogFragment_MembersInjector.injectFactory(instance, projectPreferencesViewModelFactory());
      AdminPasswordDialogFragment_MembersInjector.injectAdminPasswordProvider(instance, adminPasswordProvider());
      AdminPasswordDialogFragment_MembersInjector.injectSoftKeyboardController(instance, AppDependencyModule_ProvideSoftKeyboardControllerFactory.provideSoftKeyboardController(appDependencyModule));
      return instance;
    }

    @CanIgnoreReturnValue
    private FormHierarchyActivity injectFormHierarchyActivity(FormHierarchyActivity instance) {
      FormHierarchyActivity_MembersInjector.injectScheduler(instance, scheduler());
      FormHierarchyActivity_MembersInjector.injectFormSessionRepository(instance, formSessionRepository());
      FormHierarchyActivity_MembersInjector.injectMediaUtils(instance, mediaUtils());
      FormHierarchyActivity_MembersInjector.injectAnalytics(instance, providesAnalyticsProvider.get());
      FormHierarchyActivity_MembersInjector.injectAudioRecorder(instance, audioRecorder());
      FormHierarchyActivity_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      FormHierarchyActivity_MembersInjector.injectEntitiesRepositoryProvider(instance, provideEntitiesRepositoryProvider.get());
      FormHierarchyActivity_MembersInjector.injectPermissionsChecker(instance, providesPermissionsCheckerProvider.get());
      FormHierarchyActivity_MembersInjector.injectFusedLocationClient(instance, locationClient());
      FormHierarchyActivity_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      FormHierarchyActivity_MembersInjector.injectPermissionsProvider(instance, permissionsProvider());
      FormHierarchyActivity_MembersInjector.injectAutoSendSettingsProvider(instance, autoSendSettingsProvider());
      FormHierarchyActivity_MembersInjector.injectInstancesRepositoryProvider(instance, instancesRepositoryProvider());
      FormHierarchyActivity_MembersInjector.injectFormsRepositoryProvider(instance, formsRepositoryProvider());
      FormHierarchyActivity_MembersInjector.injectStoragePathProvider(instance, storagePathProvider());
      return instance;
    }

    @CanIgnoreReturnValue
    private FormManagementPreferencesFragment injectFormManagementPreferencesFragment(
        FormManagementPreferencesFragment instance) {
      BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandler());
      BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      BasePreferencesFragment_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      BaseProjectPreferencesFragment_MembersInjector.injectGeneralSettingsStore(instance, namedSettingsStore());
      BaseProjectPreferencesFragment_MembersInjector.injectAdminPasswordProvider(instance, adminPasswordProvider());
      BaseProjectPreferencesFragment_MembersInjector.injectFactory(instance, projectPreferencesViewModelFactory());
      BaseProjectPreferencesFragment_MembersInjector.injectPreferenceVisibilityHandler(instance, preferenceVisibilityHandler());
      FormManagementPreferencesFragment_MembersInjector.injectFormUpdateScheduler(instance, formUpdateScheduler());
      FormManagementPreferencesFragment_MembersInjector.injectInstanceSubmitScheduler(instance, instanceSubmitScheduler());
      return instance;
    }

    @CanIgnoreReturnValue
    private IdentityPreferencesFragment injectIdentityPreferencesFragment(
        IdentityPreferencesFragment instance) {
      BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandler());
      BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      BasePreferencesFragment_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      BaseProjectPreferencesFragment_MembersInjector.injectGeneralSettingsStore(instance, namedSettingsStore());
      BaseProjectPreferencesFragment_MembersInjector.injectAdminPasswordProvider(instance, adminPasswordProvider());
      BaseProjectPreferencesFragment_MembersInjector.injectFactory(instance, projectPreferencesViewModelFactory());
      BaseProjectPreferencesFragment_MembersInjector.injectPreferenceVisibilityHandler(instance, preferenceVisibilityHandler());
      IdentityPreferencesFragment_MembersInjector.injectAnalytics(instance, providesAnalyticsProvider.get());
      IdentityPreferencesFragment_MembersInjector.injectVersionInformation(instance, AppDependencyModule_ProvidesVersionInformationFactory.providesVersionInformation(appDependencyModule));
      return instance;
    }

    @CanIgnoreReturnValue
    private UserInterfacePreferencesFragment injectUserInterfacePreferencesFragment(
        UserInterfacePreferencesFragment instance) {
      BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandler());
      BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      BasePreferencesFragment_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      BaseProjectPreferencesFragment_MembersInjector.injectGeneralSettingsStore(instance, namedSettingsStore());
      BaseProjectPreferencesFragment_MembersInjector.injectAdminPasswordProvider(instance, adminPasswordProvider());
      BaseProjectPreferencesFragment_MembersInjector.injectFactory(instance, projectPreferencesViewModelFactory());
      BaseProjectPreferencesFragment_MembersInjector.injectPreferenceVisibilityHandler(instance, preferenceVisibilityHandler());
      UserInterfacePreferencesFragment_MembersInjector.injectVersionInformation(instance, AppDependencyModule_ProvidesVersionInformationFactory.providesVersionInformation(appDependencyModule));
      return instance;
    }

    @CanIgnoreReturnValue
    private BarCodeScannerFragment injectBarCodeScannerFragment(BarCodeScannerFragment instance) {
      BarCodeScannerFragment_MembersInjector.injectCodeCaptureManagerFactory(instance, AppDependencyModule_ProvidesCodeCaptureManagerFactoryFactory.providesCodeCaptureManagerFactory(appDependencyModule));
      BarCodeScannerFragment_MembersInjector.injectBarcodeViewDecoder(instance, AppDependencyModule_ProvidesBarcodeViewDecoderFactory.providesBarcodeViewDecoder(appDependencyModule));
      return instance;
    }

    @CanIgnoreReturnValue
    private QRCodeScannerFragment injectQRCodeScannerFragment(QRCodeScannerFragment instance) {
      BarCodeScannerFragment_MembersInjector.injectCodeCaptureManagerFactory(instance, AppDependencyModule_ProvidesCodeCaptureManagerFactoryFactory.providesCodeCaptureManagerFactory(appDependencyModule));
      BarCodeScannerFragment_MembersInjector.injectBarcodeViewDecoder(instance, AppDependencyModule_ProvidesBarcodeViewDecoderFactory.providesBarcodeViewDecoder(appDependencyModule));
      QRCodeScannerFragment_MembersInjector.injectSettingsImporter(instance, settingsImporter());
      QRCodeScannerFragment_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      QRCodeScannerFragment_MembersInjector.injectStoragePathProvider(instance, storagePathProvider());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProjectPreferencesActivity injectProjectPreferencesActivity(
        ProjectPreferencesActivity instance) {
      ProjectPreferencesActivity_MembersInjector.injectPropertyManager(instance, providesPropertyManagerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ResetDialogPreferenceFragmentCompat injectResetDialogPreferenceFragmentCompat(
        ResetDialogPreferenceFragmentCompat instance) {
      ResetDialogPreferenceFragmentCompat_MembersInjector.injectProjectResetter(instance, projectResetter());
      return instance;
    }

    @CanIgnoreReturnValue
    private SyncFormsTaskSpec injectSyncFormsTaskSpec(SyncFormsTaskSpec instance) {
      SyncFormsTaskSpec_MembersInjector.injectFormsDataService(instance, formsDataService());
      return instance;
    }

    @CanIgnoreReturnValue
    private ExperimentalPreferencesFragment injectExperimentalPreferencesFragment(
        ExperimentalPreferencesFragment instance) {
      BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandler());
      BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      BasePreferencesFragment_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      BaseProjectPreferencesFragment_MembersInjector.injectGeneralSettingsStore(instance, namedSettingsStore());
      BaseProjectPreferencesFragment_MembersInjector.injectAdminPasswordProvider(instance, adminPasswordProvider());
      BaseProjectPreferencesFragment_MembersInjector.injectFactory(instance, projectPreferencesViewModelFactory());
      BaseProjectPreferencesFragment_MembersInjector.injectPreferenceVisibilityHandler(instance, preferenceVisibilityHandler());
      return instance;
    }

    @CanIgnoreReturnValue
    private AutoUpdateTaskSpec injectAutoUpdateTaskSpec(AutoUpdateTaskSpec instance) {
      AutoUpdateTaskSpec_MembersInjector.injectFormsDataService(instance, formsDataService());
      return instance;
    }

    @CanIgnoreReturnValue
    private ServerAuthDialogFragment injectServerAuthDialogFragment(
        ServerAuthDialogFragment instance) {
      ServerAuthDialogFragment_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private BasePreferencesFragment injectBasePreferencesFragment(
        BasePreferencesFragment instance) {
      BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandler());
      BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      BasePreferencesFragment_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      return instance;
    }

    @CanIgnoreReturnValue
    private InstanceUploaderActivity injectInstanceUploaderActivity(
        InstanceUploaderActivity instance) {
      InstanceUploaderActivity_MembersInjector.injectInstancesRepositoryProvider(instance, instancesRepositoryProvider());
      InstanceUploaderActivity_MembersInjector.injectFormsRepositoryProvider(instance, formsRepositoryProvider());
      InstanceUploaderActivity_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProjectPreferencesFragment injectProjectPreferencesFragment(
        ProjectPreferencesFragment instance) {
      BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandler());
      BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      BasePreferencesFragment_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      BaseProjectPreferencesFragment_MembersInjector.injectGeneralSettingsStore(instance, namedSettingsStore());
      BaseProjectPreferencesFragment_MembersInjector.injectAdminPasswordProvider(instance, adminPasswordProvider());
      BaseProjectPreferencesFragment_MembersInjector.injectFactory(instance, projectPreferencesViewModelFactory());
      BaseProjectPreferencesFragment_MembersInjector.injectPreferenceVisibilityHandler(instance, preferenceVisibilityHandler());
      return instance;
    }

    @CanIgnoreReturnValue
    private DeleteFormsActivity injectDeleteFormsActivity(DeleteFormsActivity instance) {
      DeleteFormsActivity_MembersInjector.injectProjectDependencyProviderFactory(instance, projectDependencyProviderFactory());
      DeleteFormsActivity_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      DeleteFormsActivity_MembersInjector.injectFormsDataService(instance, formsDataService());
      DeleteFormsActivity_MembersInjector.injectScheduler(instance, scheduler());
      DeleteFormsActivity_MembersInjector.injectInstanceDataService(instance, instancesDataService());
      return instance;
    }

    @CanIgnoreReturnValue
    private SelectMinimalDialog injectSelectMinimalDialog(SelectMinimalDialog instance) {
      SelectMinimalDialog_MembersInjector.injectAudioHelperFactory(instance, audioHelperFactory());
      return instance;
    }

    @CanIgnoreReturnValue
    private AudioRecordingControllerFragment injectAudioRecordingControllerFragment(
        AudioRecordingControllerFragment instance) {
      AudioRecordingControllerFragment_MembersInjector.injectAudioRecorder(instance, audioRecorder());
      return instance;
    }

    @CanIgnoreReturnValue
    private AudioRecordingErrorDialogFragment injectAudioRecordingErrorDialogFragment(
        AudioRecordingErrorDialogFragment instance) {
      AudioRecordingErrorDialogFragment_MembersInjector.injectAudioRecorder(instance, audioRecorder());
      return instance;
    }

    @CanIgnoreReturnValue
    private InstanceChooserList injectInstanceChooserList(InstanceChooserList instance) {
      AppListActivity_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      InstanceChooserList_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      InstanceChooserList_MembersInjector.injectFormsRepositoryProvider(instance, formsRepositoryProvider());
      InstanceChooserList_MembersInjector.injectScheduler(instance, scheduler());
      InstanceChooserList_MembersInjector.injectInstancesRepositoryProvider(instance, instancesRepositoryProvider());
      InstanceChooserList_MembersInjector.injectEntitiesRepositoryProvider(instance, provideEntitiesRepositoryProvider.get());
      InstanceChooserList_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      InstanceChooserList_MembersInjector.injectInstancesDataService(instance, instancesDataService());
      return instance;
    }

    @CanIgnoreReturnValue
    private FormsProvider injectFormsProvider(FormsProvider instance) {
      FormsProvider_MembersInjector.injectFormsRepositoryProvider(instance, formsRepositoryProvider());
      FormsProvider_MembersInjector.injectInstancesRepositoryProvider(instance, instancesRepositoryProvider());
      FormsProvider_MembersInjector.injectFastExternalItemsetsRepository(instance, AppDependencyModule_ProvidesItemsetsRepositoryFactory.providesItemsetsRepository(appDependencyModule));
      FormsProvider_MembersInjector.injectStoragePathProvider(instance, storagePathProvider());
      FormsProvider_MembersInjector.injectProjectsRepository(instance, providesProjectsRepositoryProvider.get());
      FormsProvider_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private InstanceProvider injectInstanceProvider(InstanceProvider instance) {
      InstanceProvider_MembersInjector.injectInstancesRepositoryProvider(instance, instancesRepositoryProvider());
      InstanceProvider_MembersInjector.injectFormsRepositoryProvider(instance, formsRepositoryProvider());
      InstanceProvider_MembersInjector.injectStoragePathProvider(instance, storagePathProvider());
      InstanceProvider_MembersInjector.injectProjectsRepository(instance, providesProjectsRepositoryProvider.get());
      InstanceProvider_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private BackgroundAudioPermissionDialogFragment injectBackgroundAudioPermissionDialogFragment(
        BackgroundAudioPermissionDialogFragment instance) {
      BackgroundAudioPermissionDialogFragment_MembersInjector.injectPermissionsProvider(instance, permissionsProvider());
      return instance;
    }

    @CanIgnoreReturnValue
    private ChangeAdminPasswordDialog injectChangeAdminPasswordDialog(
        ChangeAdminPasswordDialog instance) {
      ChangeAdminPasswordDialog_MembersInjector.injectFactory(instance, projectPreferencesViewModelFactory());
      ChangeAdminPasswordDialog_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      ChangeAdminPasswordDialog_MembersInjector.injectSoftKeyboardController(instance, AppDependencyModule_ProvideSoftKeyboardControllerFactory.provideSoftKeyboardController(appDependencyModule));
      return instance;
    }

    @CanIgnoreReturnValue
    private MediaLoadingTask injectMediaLoadingTask(MediaLoadingTask instance) {
      MediaLoadingTask_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      MediaLoadingTask_MembersInjector.injectImageCompressionController(instance, providesImageCompressorManagerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ThemeUtils injectThemeUtils(ThemeUtils instance) {
      ThemeUtils_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private BaseProjectPreferencesFragment injectBaseProjectPreferencesFragment(
        BaseProjectPreferencesFragment instance) {
      BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandler());
      BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      BasePreferencesFragment_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      BaseProjectPreferencesFragment_MembersInjector.injectGeneralSettingsStore(instance, namedSettingsStore());
      BaseProjectPreferencesFragment_MembersInjector.injectAdminPasswordProvider(instance, adminPasswordProvider());
      BaseProjectPreferencesFragment_MembersInjector.injectFactory(instance, projectPreferencesViewModelFactory());
      BaseProjectPreferencesFragment_MembersInjector.injectPreferenceVisibilityHandler(instance, preferenceVisibilityHandler());
      return instance;
    }

    @CanIgnoreReturnValue
    private BaseAdminPreferencesFragment injectBaseAdminPreferencesFragment(
        BaseAdminPreferencesFragment instance) {
      BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandler());
      BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      BasePreferencesFragment_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      BaseAdminPreferencesFragment_MembersInjector.injectAdminSettingsStore(instance, namedSettingsStore2());
      return instance;
    }

    @CanIgnoreReturnValue
    private CaptionedListPreference injectCaptionedListPreference(
        CaptionedListPreference instance) {
      CaptionedListPreference_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AndroidShortcutsActivity injectAndroidShortcutsActivity(
        AndroidShortcutsActivity instance) {
      AndroidShortcutsActivity_MembersInjector.injectViewModelFactory(instance, blankFormListViewModelFactory());
      AndroidShortcutsActivity_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProjectSettingsDialog injectProjectSettingsDialog(ProjectSettingsDialog instance) {
      ProjectSettingsDialog_MembersInjector.injectProjectsRepository(instance, providesProjectsRepositoryProvider.get());
      ProjectSettingsDialog_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ManualProjectCreatorDialog injectManualProjectCreatorDialog(
        ManualProjectCreatorDialog instance) {
      ManualProjectCreatorDialog_MembersInjector.injectProjectCreator(instance, projectCreator());
      ManualProjectCreatorDialog_MembersInjector.injectAppConfigurationGenerator(instance, appConfigurationGenerator());
      ManualProjectCreatorDialog_MembersInjector.injectSoftKeyboardController(instance, AppDependencyModule_ProvideSoftKeyboardControllerFactory.provideSoftKeyboardController(appDependencyModule));
      ManualProjectCreatorDialog_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      ManualProjectCreatorDialog_MembersInjector.injectProjectsRepository(instance, providesProjectsRepositoryProvider.get());
      ManualProjectCreatorDialog_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private QrCodeProjectCreatorDialog injectQrCodeProjectCreatorDialog(
        QrCodeProjectCreatorDialog instance) {
      QrCodeProjectCreatorDialog_MembersInjector.injectCodeCaptureManagerFactory(instance, AppDependencyModule_ProvidesCodeCaptureManagerFactoryFactory.providesCodeCaptureManagerFactory(appDependencyModule));
      QrCodeProjectCreatorDialog_MembersInjector.injectBarcodeViewDecoder(instance, AppDependencyModule_ProvidesBarcodeViewDecoderFactory.providesBarcodeViewDecoder(appDependencyModule));
      QrCodeProjectCreatorDialog_MembersInjector.injectPermissionsProvider(instance, permissionsProvider());
      QrCodeProjectCreatorDialog_MembersInjector.injectProjectCreator(instance, projectCreator());
      QrCodeProjectCreatorDialog_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      QrCodeProjectCreatorDialog_MembersInjector.injectProjectsRepository(instance, providesProjectsRepositoryProvider.get());
      QrCodeProjectCreatorDialog_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      QrCodeProjectCreatorDialog_MembersInjector.injectQrCodeDecoder(instance, AppDependencyModule_ProvidesQRCodeDecoderFactory.providesQRCodeDecoder(appDependencyModule));
      QrCodeProjectCreatorDialog_MembersInjector.injectSettingsImporter(instance, settingsImporter());
      QrCodeProjectCreatorDialog_MembersInjector.injectIntentLauncher(instance, AppDependencyModule_ProvidesIntentLauncherFactory.providesIntentLauncher(appDependencyModule));
      return instance;
    }

    @CanIgnoreReturnValue
    private FirstLaunchActivity injectFirstLaunchActivity(FirstLaunchActivity instance) {
      FirstLaunchActivity_MembersInjector.injectProjectsRepository(instance, providesProjectsRepositoryProvider.get());
      FirstLaunchActivity_MembersInjector.injectVersionInformation(instance, AppDependencyModule_ProvidesVersionInformationFactory.providesVersionInformation(appDependencyModule));
      FirstLaunchActivity_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      FirstLaunchActivity_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      FirstLaunchActivity_MembersInjector.injectScheduler(instance, scheduler());
      return instance;
    }

    @CanIgnoreReturnValue
    private FormUriActivity injectFormUriActivity(FormUriActivity instance) {
      FormUriActivity_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      FormUriActivity_MembersInjector.injectProjectsRepository(instance, providesProjectsRepositoryProvider.get());
      FormUriActivity_MembersInjector.injectFormsRepositoryProvider(instance, formsRepositoryProvider());
      FormUriActivity_MembersInjector.injectInstanceRepositoryProvider(instance, instancesRepositoryProvider());
      FormUriActivity_MembersInjector.injectSavepointsRepositoryProvider(instance, savepointsRepositoryProvider());
      FormUriActivity_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      FormUriActivity_MembersInjector.injectScheduler(instance, scheduler());
      return instance;
    }

    @CanIgnoreReturnValue
    private MapsPreferencesFragment injectMapsPreferencesFragment(
        MapsPreferencesFragment instance) {
      BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandler());
      BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      BasePreferencesFragment_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      BaseProjectPreferencesFragment_MembersInjector.injectGeneralSettingsStore(instance, namedSettingsStore());
      BaseProjectPreferencesFragment_MembersInjector.injectAdminPasswordProvider(instance, adminPasswordProvider());
      BaseProjectPreferencesFragment_MembersInjector.injectFactory(instance, projectPreferencesViewModelFactory());
      BaseProjectPreferencesFragment_MembersInjector.injectPreferenceVisibilityHandler(instance, preferenceVisibilityHandler());
      MapsPreferencesFragment_MembersInjector.injectReferenceLayerRepository(instance, referenceLayerRepository());
      return instance;
    }

    @CanIgnoreReturnValue
    private SelectOneFromMapDialogFragment injectSelectOneFromMapDialogFragment(
        SelectOneFromMapDialogFragment instance) {
      SelectOneFromMapDialogFragment_MembersInjector.injectScheduler(instance, scheduler());
      return instance;
    }

    @CanIgnoreReturnValue
    private DrawActivity injectDrawActivity(DrawActivity instance) {
      DrawActivity_MembersInjector.injectScheduler(instance, scheduler());
      DrawActivity_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private BlankFormListActivity injectBlankFormListActivity(BlankFormListActivity instance) {
      BlankFormListActivity_MembersInjector.injectViewModelFactory(instance, blankFormListViewModelFactory());
      BlankFormListActivity_MembersInjector.injectNetworkStateProvider(instance, networkStateProvider());
      BlankFormListActivity_MembersInjector.injectPermissionsProvider(instance, permissionsProvider());
      return instance;
    }

    @CanIgnoreReturnValue
    private AppListActivity injectAppListActivity(AppListActivity instance) {
      AppListActivity_MembersInjector.injectSettingsProvider(instance, providesSettingsProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private DownloadFormListTask injectDownloadFormListTask(DownloadFormListTask instance) {
      DownloadFormListTask_MembersInjector.injectFormsDataService(instance, formsDataService());
      DownloadFormListTask_MembersInjector.injectProjectsDataService(instance, currentProjectProvider());
      return instance;
    }
  }
}
