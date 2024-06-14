package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.odk.collect.android.version.VersionInformation;

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
public final class AppDependencyModule_ProvidesVersionInformationFactory implements Factory<VersionInformation> {
  private final AppDependencyModule module;

  public AppDependencyModule_ProvidesVersionInformationFactory(AppDependencyModule module) {
    this.module = module;
  }

  @Override
  public VersionInformation get() {
    return providesVersionInformation(module);
  }

  public static AppDependencyModule_ProvidesVersionInformationFactory create(
      AppDependencyModule module) {
    return new AppDependencyModule_ProvidesVersionInformationFactory(module);
  }

  public static VersionInformation providesVersionInformation(AppDependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesVersionInformation());
  }
}
