package org.odk.collect.android.injection.config;

import androidx.work.WorkManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class AppDependencyModule_ProvidesSchedulerFactory implements Factory<Scheduler> {
  private final AppDependencyModule module;

  private final Provider<WorkManager> workManagerProvider;

  public AppDependencyModule_ProvidesSchedulerFactory(AppDependencyModule module,
      Provider<WorkManager> workManagerProvider) {
    this.module = module;
    this.workManagerProvider = workManagerProvider;
  }

  @Override
  public Scheduler get() {
    return providesScheduler(module, workManagerProvider.get());
  }

  public static AppDependencyModule_ProvidesSchedulerFactory create(AppDependencyModule module,
      Provider<WorkManager> workManagerProvider) {
    return new AppDependencyModule_ProvidesSchedulerFactory(module, workManagerProvider);
  }

  public static Scheduler providesScheduler(AppDependencyModule instance, WorkManager workManager) {
    return Preconditions.checkNotNullFromProvides(instance.providesScheduler(workManager));
  }
}
