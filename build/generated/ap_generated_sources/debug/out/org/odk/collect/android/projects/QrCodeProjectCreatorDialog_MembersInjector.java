package org.odk.collect.android.projects;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.utilities.CodeCaptureManagerFactory;
import org.odk.collect.android.views.BarcodeViewDecoder;
import org.odk.collect.androidshared.system.IntentLauncher;
import org.odk.collect.permissions.PermissionsProvider;
import org.odk.collect.projects.ProjectsRepository;
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
public final class QrCodeProjectCreatorDialog_MembersInjector implements MembersInjector<QrCodeProjectCreatorDialog> {
  private final Provider<CodeCaptureManagerFactory> codeCaptureManagerFactoryProvider;

  private final Provider<BarcodeViewDecoder> barcodeViewDecoderProvider;

  private final Provider<PermissionsProvider> permissionsProvider;

  private final Provider<ProjectCreator> projectCreatorProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<QRCodeDecoder> qrCodeDecoderProvider;

  private final Provider<ODKAppSettingsImporter> settingsImporterProvider;

  private final Provider<IntentLauncher> intentLauncherProvider;

  public QrCodeProjectCreatorDialog_MembersInjector(
      Provider<CodeCaptureManagerFactory> codeCaptureManagerFactoryProvider,
      Provider<BarcodeViewDecoder> barcodeViewDecoderProvider,
      Provider<PermissionsProvider> permissionsProvider,
      Provider<ProjectCreator> projectCreatorProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider, Provider<QRCodeDecoder> qrCodeDecoderProvider,
      Provider<ODKAppSettingsImporter> settingsImporterProvider,
      Provider<IntentLauncher> intentLauncherProvider) {
    this.codeCaptureManagerFactoryProvider = codeCaptureManagerFactoryProvider;
    this.barcodeViewDecoderProvider = barcodeViewDecoderProvider;
    this.permissionsProvider = permissionsProvider;
    this.projectCreatorProvider = projectCreatorProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.settingsProvider = settingsProvider;
    this.qrCodeDecoderProvider = qrCodeDecoderProvider;
    this.settingsImporterProvider = settingsImporterProvider;
    this.intentLauncherProvider = intentLauncherProvider;
  }

  public static MembersInjector<QrCodeProjectCreatorDialog> create(
      Provider<CodeCaptureManagerFactory> codeCaptureManagerFactoryProvider,
      Provider<BarcodeViewDecoder> barcodeViewDecoderProvider,
      Provider<PermissionsProvider> permissionsProvider,
      Provider<ProjectCreator> projectCreatorProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider, Provider<QRCodeDecoder> qrCodeDecoderProvider,
      Provider<ODKAppSettingsImporter> settingsImporterProvider,
      Provider<IntentLauncher> intentLauncherProvider) {
    return new QrCodeProjectCreatorDialog_MembersInjector(codeCaptureManagerFactoryProvider, barcodeViewDecoderProvider, permissionsProvider, projectCreatorProvider, projectsDataServiceProvider, projectsRepositoryProvider, settingsProvider, qrCodeDecoderProvider, settingsImporterProvider, intentLauncherProvider);
  }

  @Override
  public void injectMembers(QrCodeProjectCreatorDialog instance) {
    injectCodeCaptureManagerFactory(instance, codeCaptureManagerFactoryProvider.get());
    injectBarcodeViewDecoder(instance, barcodeViewDecoderProvider.get());
    injectPermissionsProvider(instance, permissionsProvider.get());
    injectProjectCreator(instance, projectCreatorProvider.get());
    injectProjectsDataService(instance, projectsDataServiceProvider.get());
    injectProjectsRepository(instance, projectsRepositoryProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
    injectQrCodeDecoder(instance, qrCodeDecoderProvider.get());
    injectSettingsImporter(instance, settingsImporterProvider.get());
    injectIntentLauncher(instance, intentLauncherProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.QrCodeProjectCreatorDialog.codeCaptureManagerFactory")
  public static void injectCodeCaptureManagerFactory(QrCodeProjectCreatorDialog instance,
      CodeCaptureManagerFactory codeCaptureManagerFactory) {
    instance.codeCaptureManagerFactory = codeCaptureManagerFactory;
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.QrCodeProjectCreatorDialog.barcodeViewDecoder")
  public static void injectBarcodeViewDecoder(QrCodeProjectCreatorDialog instance,
      BarcodeViewDecoder barcodeViewDecoder) {
    instance.barcodeViewDecoder = barcodeViewDecoder;
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.QrCodeProjectCreatorDialog.permissionsProvider")
  public static void injectPermissionsProvider(QrCodeProjectCreatorDialog instance,
      PermissionsProvider permissionsProvider) {
    instance.permissionsProvider = permissionsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.QrCodeProjectCreatorDialog.projectCreator")
  public static void injectProjectCreator(QrCodeProjectCreatorDialog instance,
      ProjectCreator projectCreator) {
    instance.projectCreator = projectCreator;
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.QrCodeProjectCreatorDialog.projectsDataService")
  public static void injectProjectsDataService(QrCodeProjectCreatorDialog instance,
      ProjectsDataService projectsDataService) {
    instance.projectsDataService = projectsDataService;
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.QrCodeProjectCreatorDialog.projectsRepository")
  public static void injectProjectsRepository(QrCodeProjectCreatorDialog instance,
      ProjectsRepository projectsRepository) {
    instance.projectsRepository = projectsRepository;
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.QrCodeProjectCreatorDialog.settingsProvider")
  public static void injectSettingsProvider(QrCodeProjectCreatorDialog instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.QrCodeProjectCreatorDialog.qrCodeDecoder")
  public static void injectQrCodeDecoder(QrCodeProjectCreatorDialog instance,
      QRCodeDecoder qrCodeDecoder) {
    instance.qrCodeDecoder = qrCodeDecoder;
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.QrCodeProjectCreatorDialog.settingsImporter")
  public static void injectSettingsImporter(QrCodeProjectCreatorDialog instance,
      ODKAppSettingsImporter settingsImporter) {
    instance.settingsImporter = settingsImporter;
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.QrCodeProjectCreatorDialog.intentLauncher")
  public static void injectIntentLauncher(QrCodeProjectCreatorDialog instance,
      IntentLauncher intentLauncher) {
    instance.intentLauncher = intentLauncher;
  }
}
