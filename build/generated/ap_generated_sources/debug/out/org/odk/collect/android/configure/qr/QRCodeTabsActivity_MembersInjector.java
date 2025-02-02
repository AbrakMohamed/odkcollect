package org.odk.collect.android.configure.qr;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.utilities.FileProvider;
import org.odk.collect.androidshared.system.IntentLauncher;
import org.odk.collect.async.Scheduler;
import org.odk.collect.permissions.PermissionsProvider;
import org.odk.collect.qrcode.QRCodeDecoder;
import org.odk.collect.settings.ODKAppSettingsImporter;
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
public final class QRCodeTabsActivity_MembersInjector implements MembersInjector<QRCodeTabsActivity> {
  private final Provider<QRCodeGenerator> qrCodeGeneratorProvider;

  private final Provider<IntentLauncher> intentLauncherProvider;

  private final Provider<FileProvider> fileProvider;

  private final Provider<Scheduler> schedulerProvider;

  private final Provider<QRCodeDecoder> qrCodeDecoderProvider;

  private final Provider<ODKAppSettingsImporter> settingsImporterProvider;

  private final Provider<AppConfigurationGenerator> appConfigurationGeneratorProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<PermissionsProvider> permissionsProvider;

  private final Provider<SettingsProvider> settingsProvider;

  public QRCodeTabsActivity_MembersInjector(Provider<QRCodeGenerator> qrCodeGeneratorProvider,
      Provider<IntentLauncher> intentLauncherProvider, Provider<FileProvider> fileProvider,
      Provider<Scheduler> schedulerProvider, Provider<QRCodeDecoder> qrCodeDecoderProvider,
      Provider<ODKAppSettingsImporter> settingsImporterProvider,
      Provider<AppConfigurationGenerator> appConfigurationGeneratorProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<PermissionsProvider> permissionsProvider,
      Provider<SettingsProvider> settingsProvider) {
    this.qrCodeGeneratorProvider = qrCodeGeneratorProvider;
    this.intentLauncherProvider = intentLauncherProvider;
    this.fileProvider = fileProvider;
    this.schedulerProvider = schedulerProvider;
    this.qrCodeDecoderProvider = qrCodeDecoderProvider;
    this.settingsImporterProvider = settingsImporterProvider;
    this.appConfigurationGeneratorProvider = appConfigurationGeneratorProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.permissionsProvider = permissionsProvider;
    this.settingsProvider = settingsProvider;
  }

  public static MembersInjector<QRCodeTabsActivity> create(
      Provider<QRCodeGenerator> qrCodeGeneratorProvider,
      Provider<IntentLauncher> intentLauncherProvider, Provider<FileProvider> fileProvider,
      Provider<Scheduler> schedulerProvider, Provider<QRCodeDecoder> qrCodeDecoderProvider,
      Provider<ODKAppSettingsImporter> settingsImporterProvider,
      Provider<AppConfigurationGenerator> appConfigurationGeneratorProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<PermissionsProvider> permissionsProvider,
      Provider<SettingsProvider> settingsProvider) {
    return new QRCodeTabsActivity_MembersInjector(qrCodeGeneratorProvider, intentLauncherProvider, fileProvider, schedulerProvider, qrCodeDecoderProvider, settingsImporterProvider, appConfigurationGeneratorProvider, projectsDataServiceProvider, permissionsProvider, settingsProvider);
  }

  @Override
  public void injectMembers(QRCodeTabsActivity instance) {
    injectQrCodeGenerator(instance, qrCodeGeneratorProvider.get());
    injectIntentLauncher(instance, intentLauncherProvider.get());
    injectFileProvider(instance, fileProvider.get());
    injectScheduler(instance, schedulerProvider.get());
    injectQrCodeDecoder(instance, qrCodeDecoderProvider.get());
    injectSettingsImporter(instance, settingsImporterProvider.get());
    injectAppConfigurationGenerator(instance, appConfigurationGeneratorProvider.get());
    injectProjectsDataService(instance, projectsDataServiceProvider.get());
    injectPermissionsProvider(instance, permissionsProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.configure.qr.QRCodeTabsActivity.qrCodeGenerator")
  public static void injectQrCodeGenerator(QRCodeTabsActivity instance,
      QRCodeGenerator qrCodeGenerator) {
    instance.qrCodeGenerator = qrCodeGenerator;
  }

  @InjectedFieldSignature("org.odk.collect.android.configure.qr.QRCodeTabsActivity.intentLauncher")
  public static void injectIntentLauncher(QRCodeTabsActivity instance,
      IntentLauncher intentLauncher) {
    instance.intentLauncher = intentLauncher;
  }

  @InjectedFieldSignature("org.odk.collect.android.configure.qr.QRCodeTabsActivity.fileProvider")
  public static void injectFileProvider(QRCodeTabsActivity instance, FileProvider fileProvider) {
    instance.fileProvider = fileProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.configure.qr.QRCodeTabsActivity.scheduler")
  public static void injectScheduler(QRCodeTabsActivity instance, Scheduler scheduler) {
    instance.scheduler = scheduler;
  }

  @InjectedFieldSignature("org.odk.collect.android.configure.qr.QRCodeTabsActivity.qrCodeDecoder")
  public static void injectQrCodeDecoder(QRCodeTabsActivity instance, QRCodeDecoder qrCodeDecoder) {
    instance.qrCodeDecoder = qrCodeDecoder;
  }

  @InjectedFieldSignature("org.odk.collect.android.configure.qr.QRCodeTabsActivity.settingsImporter")
  public static void injectSettingsImporter(QRCodeTabsActivity instance,
      ODKAppSettingsImporter settingsImporter) {
    instance.settingsImporter = settingsImporter;
  }

  @InjectedFieldSignature("org.odk.collect.android.configure.qr.QRCodeTabsActivity.appConfigurationGenerator")
  public static void injectAppConfigurationGenerator(QRCodeTabsActivity instance,
      AppConfigurationGenerator appConfigurationGenerator) {
    instance.appConfigurationGenerator = appConfigurationGenerator;
  }

  @InjectedFieldSignature("org.odk.collect.android.configure.qr.QRCodeTabsActivity.projectsDataService")
  public static void injectProjectsDataService(QRCodeTabsActivity instance,
      ProjectsDataService projectsDataService) {
    instance.projectsDataService = projectsDataService;
  }

  @InjectedFieldSignature("org.odk.collect.android.configure.qr.QRCodeTabsActivity.permissionsProvider")
  public static void injectPermissionsProvider(QRCodeTabsActivity instance,
      PermissionsProvider permissionsProvider) {
    instance.permissionsProvider = permissionsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.configure.qr.QRCodeTabsActivity.settingsProvider")
  public static void injectSettingsProvider(QRCodeTabsActivity instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }
}
