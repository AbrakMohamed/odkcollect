package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.odk.collect.shared.strings.UUIDGenerator;

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
public final class AppDependencyModule_ProvidesUUIDGeneratorFactory implements Factory<UUIDGenerator> {
  private final AppDependencyModule module;

  public AppDependencyModule_ProvidesUUIDGeneratorFactory(AppDependencyModule module) {
    this.module = module;
  }

  @Override
  public UUIDGenerator get() {
    return providesUUIDGenerator(module);
  }

  public static AppDependencyModule_ProvidesUUIDGeneratorFactory create(
      AppDependencyModule module) {
    return new AppDependencyModule_ProvidesUUIDGeneratorFactory(module);
  }

  public static UUIDGenerator providesUUIDGenerator(AppDependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesUUIDGenerator());
  }
}
