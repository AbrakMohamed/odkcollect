package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.preferences.ProjectPreferencesViewModel;
import org.odk.collect.android.utilities.AdminPasswordProvider;

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
public final class AppDependencyModule_ProvidesProjectPreferencesViewModelFactory implements Factory<ProjectPreferencesViewModel.Factory> {
  private final AppDependencyModule module;

  private final Provider<AdminPasswordProvider> adminPasswordProvider;

  public AppDependencyModule_ProvidesProjectPreferencesViewModelFactory(AppDependencyModule module,
      Provider<AdminPasswordProvider> adminPasswordProvider) {
    this.module = module;
    this.adminPasswordProvider = adminPasswordProvider;
  }

  @Override
  public ProjectPreferencesViewModel.Factory get() {
    return providesProjectPreferencesViewModel(module, adminPasswordProvider.get());
  }

  public static AppDependencyModule_ProvidesProjectPreferencesViewModelFactory create(
      AppDependencyModule module, Provider<AdminPasswordProvider> adminPasswordProvider) {
    return new AppDependencyModule_ProvidesProjectPreferencesViewModelFactory(module, adminPasswordProvider);
  }

  public static ProjectPreferencesViewModel.Factory providesProjectPreferencesViewModel(
      AppDependencyModule instance, AdminPasswordProvider adminPasswordProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesProjectPreferencesViewModel(adminPasswordProvider));
  }
}
