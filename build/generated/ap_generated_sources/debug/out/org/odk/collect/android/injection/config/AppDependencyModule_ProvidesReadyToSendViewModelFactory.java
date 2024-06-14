package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.instancemanagement.send.ReadyToSendViewModel;
import org.odk.collect.android.utilities.InstancesRepositoryProvider;
import org.odk.collect.async.Scheduler;

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
public final class AppDependencyModule_ProvidesReadyToSendViewModelFactory implements Factory<ReadyToSendViewModel.Factory> {
  private final AppDependencyModule module;

  private final Provider<InstancesRepositoryProvider> instancesRepositoryProvider;

  private final Provider<Scheduler> schedulerProvider;

  public AppDependencyModule_ProvidesReadyToSendViewModelFactory(AppDependencyModule module,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<Scheduler> schedulerProvider) {
    this.module = module;
    this.instancesRepositoryProvider = instancesRepositoryProvider;
    this.schedulerProvider = schedulerProvider;
  }

  @Override
  public ReadyToSendViewModel.Factory get() {
    return providesReadyToSendViewModel(module, instancesRepositoryProvider.get(), schedulerProvider.get());
  }

  public static AppDependencyModule_ProvidesReadyToSendViewModelFactory create(
      AppDependencyModule module, Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<Scheduler> schedulerProvider) {
    return new AppDependencyModule_ProvidesReadyToSendViewModelFactory(module, instancesRepositoryProvider, schedulerProvider);
  }

  public static ReadyToSendViewModel.Factory providesReadyToSendViewModel(
      AppDependencyModule instance, InstancesRepositoryProvider instancesRepositoryProvider,
      Scheduler scheduler) {
    return Preconditions.checkNotNullFromProvides(instance.providesReadyToSendViewModel(instancesRepositoryProvider, scheduler));
  }
}
