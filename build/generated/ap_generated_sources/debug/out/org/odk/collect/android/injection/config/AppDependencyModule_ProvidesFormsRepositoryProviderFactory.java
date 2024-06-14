package org.odk.collect.android.injection.config;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.utilities.FormsRepositoryProvider;

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
public final class AppDependencyModule_ProvidesFormsRepositoryProviderFactory implements Factory<FormsRepositoryProvider> {
  private final AppDependencyModule module;

  private final Provider<Application> applicationProvider;

  public AppDependencyModule_ProvidesFormsRepositoryProviderFactory(AppDependencyModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public FormsRepositoryProvider get() {
    return providesFormsRepositoryProvider(module, applicationProvider.get());
  }

  public static AppDependencyModule_ProvidesFormsRepositoryProviderFactory create(
      AppDependencyModule module, Provider<Application> applicationProvider) {
    return new AppDependencyModule_ProvidesFormsRepositoryProviderFactory(module, applicationProvider);
  }

  public static FormsRepositoryProvider providesFormsRepositoryProvider(
      AppDependencyModule instance, Application application) {
    return Preconditions.checkNotNullFromProvides(instance.providesFormsRepositoryProvider(application));
  }
}
