package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.odk.collect.android.configure.qr.QRCodeGenerator;

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
public final class AppDependencyModule_ProvidesQRCodeGeneratorFactory implements Factory<QRCodeGenerator> {
  private final AppDependencyModule module;

  public AppDependencyModule_ProvidesQRCodeGeneratorFactory(AppDependencyModule module) {
    this.module = module;
  }

  @Override
  public QRCodeGenerator get() {
    return providesQRCodeGenerator(module);
  }

  public static AppDependencyModule_ProvidesQRCodeGeneratorFactory create(
      AppDependencyModule module) {
    return new AppDependencyModule_ProvidesQRCodeGeneratorFactory(module);
  }

  public static QRCodeGenerator providesQRCodeGenerator(AppDependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesQRCodeGenerator());
  }
}
