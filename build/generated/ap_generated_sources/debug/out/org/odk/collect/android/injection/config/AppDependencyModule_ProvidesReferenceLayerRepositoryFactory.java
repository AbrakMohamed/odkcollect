package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.storage.StoragePathProvider;
import org.odk.collect.maps.layers.ReferenceLayerRepository;

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
public final class AppDependencyModule_ProvidesReferenceLayerRepositoryFactory implements Factory<ReferenceLayerRepository> {
  private final AppDependencyModule module;

  private final Provider<StoragePathProvider> storagePathProvider;

  public AppDependencyModule_ProvidesReferenceLayerRepositoryFactory(AppDependencyModule module,
      Provider<StoragePathProvider> storagePathProvider) {
    this.module = module;
    this.storagePathProvider = storagePathProvider;
  }

  @Override
  public ReferenceLayerRepository get() {
    return providesReferenceLayerRepository(module, storagePathProvider.get());
  }

  public static AppDependencyModule_ProvidesReferenceLayerRepositoryFactory create(
      AppDependencyModule module, Provider<StoragePathProvider> storagePathProvider) {
    return new AppDependencyModule_ProvidesReferenceLayerRepositoryFactory(module, storagePathProvider);
  }

  public static ReferenceLayerRepository providesReferenceLayerRepository(
      AppDependencyModule instance, StoragePathProvider storagePathProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesReferenceLayerRepository(storagePathProvider));
  }
}
