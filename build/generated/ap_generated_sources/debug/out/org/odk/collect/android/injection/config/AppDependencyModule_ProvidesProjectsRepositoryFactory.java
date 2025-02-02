package org.odk.collect.android.injection.config;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.projects.ProjectsRepository;
import org.odk.collect.settings.SettingsProvider;
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
public final class AppDependencyModule_ProvidesProjectsRepositoryFactory implements Factory<ProjectsRepository> {
  private final AppDependencyModule module;

  private final Provider<UUIDGenerator> uuidGeneratorProvider;

  private final Provider<Gson> gsonProvider;

  private final Provider<SettingsProvider> settingsProvider;

  public AppDependencyModule_ProvidesProjectsRepositoryFactory(AppDependencyModule module,
      Provider<UUIDGenerator> uuidGeneratorProvider, Provider<Gson> gsonProvider,
      Provider<SettingsProvider> settingsProvider) {
    this.module = module;
    this.uuidGeneratorProvider = uuidGeneratorProvider;
    this.gsonProvider = gsonProvider;
    this.settingsProvider = settingsProvider;
  }

  @Override
  public ProjectsRepository get() {
    return providesProjectsRepository(module, uuidGeneratorProvider.get(), gsonProvider.get(), settingsProvider.get());
  }

  public static AppDependencyModule_ProvidesProjectsRepositoryFactory create(
      AppDependencyModule module, Provider<UUIDGenerator> uuidGeneratorProvider,
      Provider<Gson> gsonProvider, Provider<SettingsProvider> settingsProvider) {
    return new AppDependencyModule_ProvidesProjectsRepositoryFactory(module, uuidGeneratorProvider, gsonProvider, settingsProvider);
  }

  public static ProjectsRepository providesProjectsRepository(AppDependencyModule instance,
      UUIDGenerator uuidGenerator, Gson gson, SettingsProvider settingsProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesProjectsRepository(uuidGenerator, gson, settingsProvider));
  }
}
