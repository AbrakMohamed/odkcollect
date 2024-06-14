package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.odk.collect.android.itemsets.FastExternalItemsetsRepository;

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
public final class AppDependencyModule_ProvidesItemsetsRepositoryFactory implements Factory<FastExternalItemsetsRepository> {
  private final AppDependencyModule module;

  public AppDependencyModule_ProvidesItemsetsRepositoryFactory(AppDependencyModule module) {
    this.module = module;
  }

  @Override
  public FastExternalItemsetsRepository get() {
    return providesItemsetsRepository(module);
  }

  public static AppDependencyModule_ProvidesItemsetsRepositoryFactory create(
      AppDependencyModule module) {
    return new AppDependencyModule_ProvidesItemsetsRepositoryFactory(module);
  }

  public static FastExternalItemsetsRepository providesItemsetsRepository(
      AppDependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesItemsetsRepository());
  }
}
