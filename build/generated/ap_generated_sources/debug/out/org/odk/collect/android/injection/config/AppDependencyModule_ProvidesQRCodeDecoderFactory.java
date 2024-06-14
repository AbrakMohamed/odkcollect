package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.odk.collect.qrcode.QRCodeDecoder;

@ScopeMetadata
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
public final class AppDependencyModule_ProvidesQRCodeDecoderFactory implements Factory<QRCodeDecoder> {
  private final AppDependencyModule module;

  public AppDependencyModule_ProvidesQRCodeDecoderFactory(AppDependencyModule module) {
    this.module = module;
  }

  @Override
  public QRCodeDecoder get() {
    return providesQRCodeDecoder(module);
  }

  public static AppDependencyModule_ProvidesQRCodeDecoderFactory create(
      AppDependencyModule module) {
    return new AppDependencyModule_ProvidesQRCodeDecoderFactory(module);
  }

  public static QRCodeDecoder providesQRCodeDecoder(AppDependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesQRCodeDecoder());
  }
}
