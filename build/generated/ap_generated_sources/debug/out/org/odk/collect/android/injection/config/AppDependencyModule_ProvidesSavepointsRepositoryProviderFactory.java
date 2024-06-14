package org.odk.collect.android.injection.config;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.storage.StoragePathProvider;
import org.odk.collect.android.utilities.SavepointsRepositoryProvider;

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
public final class AppDependencyModule_ProvidesSavepointsRepositoryProviderFactory implements Factory<SavepointsRepositoryProvider> {
  private final AppDependencyModule module;

  private final Provider<Context> contextProvider;

  private final Provider<StoragePathProvider> storagePathProvider;

  public AppDependencyModule_ProvidesSavepointsRepositoryProviderFactory(AppDependencyModule module,
      Provider<Context> contextProvider, Provider<StoragePathProvider> storagePathProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.storagePathProvider = storagePathProvider;
  }

  @Override
  public SavepointsRepositoryProvider get() {
    return providesSavepointsRepositoryProvider(module, contextProvider.get(), storagePathProvider.get());
  }

  public static AppDependencyModule_ProvidesSavepointsRepositoryProviderFactory create(
      AppDependencyModule module, Provider<Context> contextProvider,
      Provider<StoragePathProvider> storagePathProvider) {
    return new AppDependencyModule_ProvidesSavepointsRepositoryProviderFactory(module, contextProvider, storagePathProvider);
  }

  public static SavepointsRepositoryProvider providesSavepointsRepositoryProvider(
      AppDependencyModule instance, Context context, StoragePathProvider storagePathProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesSavepointsRepositoryProvider(context, storagePathProvider));
  }
}
