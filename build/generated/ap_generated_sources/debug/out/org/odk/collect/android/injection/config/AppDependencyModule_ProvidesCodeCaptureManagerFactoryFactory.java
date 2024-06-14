package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.odk.collect.android.utilities.CodeCaptureManagerFactory;

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
public final class AppDependencyModule_ProvidesCodeCaptureManagerFactoryFactory implements Factory<CodeCaptureManagerFactory> {
  private final AppDependencyModule module;

  public AppDependencyModule_ProvidesCodeCaptureManagerFactoryFactory(AppDependencyModule module) {
    this.module = module;
  }

  @Override
  public CodeCaptureManagerFactory get() {
    return providesCodeCaptureManagerFactory(module);
  }

  public static AppDependencyModule_ProvidesCodeCaptureManagerFactoryFactory create(
      AppDependencyModule module) {
    return new AppDependencyModule_ProvidesCodeCaptureManagerFactoryFactory(module);
  }

  public static CodeCaptureManagerFactory providesCodeCaptureManagerFactory(
      AppDependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesCodeCaptureManagerFactory());
  }
}
