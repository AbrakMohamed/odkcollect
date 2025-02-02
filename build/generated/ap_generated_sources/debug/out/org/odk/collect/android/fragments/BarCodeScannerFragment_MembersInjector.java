package org.odk.collect.android.fragments;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.utilities.CodeCaptureManagerFactory;
import org.odk.collect.android.views.BarcodeViewDecoder;

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
public final class BarCodeScannerFragment_MembersInjector implements MembersInjector<BarCodeScannerFragment> {
  private final Provider<CodeCaptureManagerFactory> codeCaptureManagerFactoryProvider;

  private final Provider<BarcodeViewDecoder> barcodeViewDecoderProvider;

  public BarCodeScannerFragment_MembersInjector(
      Provider<CodeCaptureManagerFactory> codeCaptureManagerFactoryProvider,
      Provider<BarcodeViewDecoder> barcodeViewDecoderProvider) {
    this.codeCaptureManagerFactoryProvider = codeCaptureManagerFactoryProvider;
    this.barcodeViewDecoderProvider = barcodeViewDecoderProvider;
  }

  public static MembersInjector<BarCodeScannerFragment> create(
      Provider<CodeCaptureManagerFactory> codeCaptureManagerFactoryProvider,
      Provider<BarcodeViewDecoder> barcodeViewDecoderProvider) {
    return new BarCodeScannerFragment_MembersInjector(codeCaptureManagerFactoryProvider, barcodeViewDecoderProvider);
  }

  @Override
  public void injectMembers(BarCodeScannerFragment instance) {
    injectCodeCaptureManagerFactory(instance, codeCaptureManagerFactoryProvider.get());
    injectBarcodeViewDecoder(instance, barcodeViewDecoderProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.fragments.BarCodeScannerFragment.codeCaptureManagerFactory")
  public static void injectCodeCaptureManagerFactory(BarCodeScannerFragment instance,
      CodeCaptureManagerFactory codeCaptureManagerFactory) {
    instance.codeCaptureManagerFactory = codeCaptureManagerFactory;
  }

  @InjectedFieldSignature("org.odk.collect.android.fragments.BarCodeScannerFragment.barcodeViewDecoder")
  public static void injectBarcodeViewDecoder(BarCodeScannerFragment instance,
      BarcodeViewDecoder barcodeViewDecoder) {
    instance.barcodeViewDecoder = barcodeViewDecoder;
  }
}
