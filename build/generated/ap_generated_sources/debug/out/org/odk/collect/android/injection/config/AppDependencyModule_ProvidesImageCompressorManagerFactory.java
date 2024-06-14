package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.odk.collect.android.utilities.ImageCompressionController;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppDependencyModule_ProvidesImageCompressorManagerFactory implements Factory<ImageCompressionController> {
  private final AppDependencyModule module;

  public AppDependencyModule_ProvidesImageCompressorManagerFactory(AppDependencyModule module) {
    this.module = module;
  }

  @Override
  public ImageCompressionController get() {
    return providesImageCompressorManager(module);
  }

  public static AppDependencyModule_ProvidesImageCompressorManagerFactory create(
      AppDependencyModule module) {
    return new AppDependencyModule_ProvidesImageCompressorManagerFactory(module);
  }

  public static ImageCompressionController providesImageCompressorManager(
      AppDependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesImageCompressorManager());
  }
}
