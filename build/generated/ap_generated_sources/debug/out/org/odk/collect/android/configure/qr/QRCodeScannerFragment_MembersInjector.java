package org.odk.collect.android.configure.qr;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.fragments.BarCodeScannerFragment_MembersInjector;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.storage.StoragePathProvider;
import org.odk.collect.android.utilities.CodeCaptureManagerFactory;
import org.odk.collect.android.views.BarcodeViewDecoder;
import org.odk.collect.settings.ODKAppSettingsImporter;

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
public final class QRCodeScannerFragment_MembersInjector implements MembersInjector<QRCodeScannerFragment> {
  private final Provider<CodeCaptureManagerFactory> codeCaptureManagerFactoryProvider;

  private final Provider<BarcodeViewDecoder> barcodeViewDecoderProvider;

  private final Provider<ODKAppSettingsImporter> settingsImporterProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<StoragePathProvider> storagePathProvider;

  public QRCodeScannerFragment_MembersInjector(
      Provider<CodeCaptureManagerFactory> codeCaptureManagerFactoryProvider,
      Provider<BarcodeViewDecoder> barcodeViewDecoderProvider,
      Provider<ODKAppSettingsImporter> settingsImporterProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<StoragePathProvider> storagePathProvider) {
    this.codeCaptureManagerFactoryProvider = codeCaptureManagerFactoryProvider;
    this.barcodeViewDecoderProvider = barcodeViewDecoderProvider;
    this.settingsImporterProvider = settingsImporterProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.storagePathProvider = storagePathProvider;
  }

  public static MembersInjector<QRCodeScannerFragment> create(
      Provider<CodeCaptureManagerFactory> codeCaptureManagerFactoryProvider,
      Provider<BarcodeViewDecoder> barcodeViewDecoderProvider,
      Provider<ODKAppSettingsImporter> settingsImporterProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<StoragePathProvider> storagePathProvider) {
    return new QRCodeScannerFragment_MembersInjector(codeCaptureManagerFactoryProvider, barcodeViewDecoderProvider, settingsImporterProvider, projectsDataServiceProvider, storagePathProvider);
  }

  @Override
  public void injectMembers(QRCodeScannerFragment instance) {
    BarCodeScannerFragment_MembersInjector.injectCodeCaptureManagerFactory(instance, codeCaptureManagerFactoryProvider.get());
    BarCodeScannerFragment_MembersInjector.injectBarcodeViewDecoder(instance, barcodeViewDecoderProvider.get());
    injectSettingsImporter(instance, settingsImporterProvider.get());
    injectProjectsDataService(instance, projectsDataServiceProvider.get());
    injectStoragePathProvider(instance, storagePathProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.configure.qr.QRCodeScannerFragment.settingsImporter")
  public static void injectSettingsImporter(QRCodeScannerFragment instance,
      ODKAppSettingsImporter settingsImporter) {
    instance.settingsImporter = settingsImporter;
  }

  @InjectedFieldSignature("org.odk.collect.android.configure.qr.QRCodeScannerFragment.projectsDataService")
  public static void injectProjectsDataService(QRCodeScannerFragment instance,
      ProjectsDataService projectsDataService) {
    instance.projectsDataService = projectsDataService;
  }

  @InjectedFieldSignature("org.odk.collect.android.configure.qr.QRCodeScannerFragment.storagePathProvider")
  public static void injectStoragePathProvider(QRCodeScannerFragment instance,
      StoragePathProvider storagePathProvider) {
    instance.storagePathProvider = storagePathProvider;
  }
}
