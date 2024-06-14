package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.odk.collect.android.views.BarcodeViewDecoder;

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
public final class AppDependencyModule_ProvidesBarcodeViewDecoderFactory implements Factory<BarcodeViewDecoder> {
  private final AppDependencyModule module;

  public AppDependencyModule_ProvidesBarcodeViewDecoderFactory(AppDependencyModule module) {
    this.module = module;
  }

  @Override
  public BarcodeViewDecoder get() {
    return providesBarcodeViewDecoder(module);
  }

  public static AppDependencyModule_ProvidesBarcodeViewDecoderFactory create(
      AppDependencyModule module) {
    return new AppDependencyModule_ProvidesBarcodeViewDecoderFactory(module);
  }

  public static BarcodeViewDecoder providesBarcodeViewDecoder(AppDependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesBarcodeViewDecoder());
  }
}
