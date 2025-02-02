package org.odk.collect.android.injection.config;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.backgroundwork.FormUpdateScheduler;
import org.odk.collect.async.Scheduler;
import org.odk.collect.settings.SettingsProvider;

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
public final class AppDependencyModule_ProvidesFormUpdateMangerFactory implements Factory<FormUpdateScheduler> {
  private final AppDependencyModule module;

  private final Provider<Scheduler> schedulerProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<Application> applicationProvider;

  public AppDependencyModule_ProvidesFormUpdateMangerFactory(AppDependencyModule module,
      Provider<Scheduler> schedulerProvider, Provider<SettingsProvider> settingsProvider,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.schedulerProvider = schedulerProvider;
    this.settingsProvider = settingsProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public FormUpdateScheduler get() {
    return providesFormUpdateManger(module, schedulerProvider.get(), settingsProvider.get(), applicationProvider.get());
  }

  public static AppDependencyModule_ProvidesFormUpdateMangerFactory create(
      AppDependencyModule module, Provider<Scheduler> schedulerProvider,
      Provider<SettingsProvider> settingsProvider, Provider<Application> applicationProvider) {
    return new AppDependencyModule_ProvidesFormUpdateMangerFactory(module, schedulerProvider, settingsProvider, applicationProvider);
  }

  public static FormUpdateScheduler providesFormUpdateManger(AppDependencyModule instance,
      Scheduler scheduler, SettingsProvider settingsProvider, Application application) {
    return Preconditions.checkNotNullFromProvides(instance.providesFormUpdateManger(scheduler, settingsProvider, application));
  }
}
