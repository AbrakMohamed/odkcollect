package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.backgroundwork.FormUpdateScheduler;
import org.odk.collect.android.formmanagement.FormsDataService;
import org.odk.collect.metadata.PropertyManager;
import org.odk.collect.settings.importing.SettingsChangeHandler;

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
public final class AppDependencyModule_ProvidesSettingsChangeHandlerFactory implements Factory<SettingsChangeHandler> {
  private final AppDependencyModule module;

  private final Provider<PropertyManager> propertyManagerProvider;

  private final Provider<FormUpdateScheduler> formUpdateSchedulerProvider;

  private final Provider<FormsDataService> formsDataServiceProvider;

  public AppDependencyModule_ProvidesSettingsChangeHandlerFactory(AppDependencyModule module,
      Provider<PropertyManager> propertyManagerProvider,
      Provider<FormUpdateScheduler> formUpdateSchedulerProvider,
      Provider<FormsDataService> formsDataServiceProvider) {
    this.module = module;
    this.propertyManagerProvider = propertyManagerProvider;
    this.formUpdateSchedulerProvider = formUpdateSchedulerProvider;
    this.formsDataServiceProvider = formsDataServiceProvider;
  }

  @Override
  public SettingsChangeHandler get() {
    return providesSettingsChangeHandler(module, propertyManagerProvider.get(), formUpdateSchedulerProvider.get(), formsDataServiceProvider.get());
  }

  public static AppDependencyModule_ProvidesSettingsChangeHandlerFactory create(
      AppDependencyModule module, Provider<PropertyManager> propertyManagerProvider,
      Provider<FormUpdateScheduler> formUpdateSchedulerProvider,
      Provider<FormsDataService> formsDataServiceProvider) {
    return new AppDependencyModule_ProvidesSettingsChangeHandlerFactory(module, propertyManagerProvider, formUpdateSchedulerProvider, formsDataServiceProvider);
  }

  public static SettingsChangeHandler providesSettingsChangeHandler(AppDependencyModule instance,
      PropertyManager propertyManager, FormUpdateScheduler formUpdateScheduler,
      FormsDataService formsDataService) {
    return Preconditions.checkNotNullFromProvides(instance.providesSettingsChangeHandler(propertyManager, formUpdateScheduler, formsDataService));
  }
}
