package org.odk.collect.android.injection.config;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.backgroundwork.InstanceSubmitScheduler;
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
public final class AppDependencyModule_ProvidesFormSubmitManagerFactory implements Factory<InstanceSubmitScheduler> {
  private final AppDependencyModule module;

  private final Provider<Scheduler> schedulerProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<Application> applicationProvider;

  public AppDependencyModule_ProvidesFormSubmitManagerFactory(AppDependencyModule module,
      Provider<Scheduler> schedulerProvider, Provider<SettingsProvider> settingsProvider,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.schedulerProvider = schedulerProvider;
    this.settingsProvider = settingsProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public InstanceSubmitScheduler get() {
    return providesFormSubmitManager(module, schedulerProvider.get(), settingsProvider.get(), applicationProvider.get());
  }

  public static AppDependencyModule_ProvidesFormSubmitManagerFactory create(
      AppDependencyModule module, Provider<Scheduler> schedulerProvider,
      Provider<SettingsProvider> settingsProvider, Provider<Application> applicationProvider) {
    return new AppDependencyModule_ProvidesFormSubmitManagerFactory(module, schedulerProvider, settingsProvider, applicationProvider);
  }

  public static InstanceSubmitScheduler providesFormSubmitManager(AppDependencyModule instance,
      Scheduler scheduler, SettingsProvider settingsProvider, Application application) {
    return Preconditions.checkNotNullFromProvides(instance.providesFormSubmitManager(scheduler, settingsProvider, application));
  }
}
