package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.odk.collect.imageloader.ImageLoader;

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
public final class AppDependencyModule_ProvidesImageLoaderFactory implements Factory<ImageLoader> {
  private final AppDependencyModule module;

  public AppDependencyModule_ProvidesImageLoaderFactory(AppDependencyModule module) {
    this.module = module;
  }

  @Override
  public ImageLoader get() {
    return providesImageLoader(module);
  }

  public static AppDependencyModule_ProvidesImageLoaderFactory create(AppDependencyModule module) {
    return new AppDependencyModule_ProvidesImageLoaderFactory(module);
  }

  public static ImageLoader providesImageLoader(AppDependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesImageLoader());
  }
}
