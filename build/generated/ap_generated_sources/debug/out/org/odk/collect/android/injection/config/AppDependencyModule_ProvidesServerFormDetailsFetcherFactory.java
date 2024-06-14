package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.formmanagement.FormSourceProvider;
import org.odk.collect.android.formmanagement.ServerFormsDetailsFetcher;
import org.odk.collect.android.utilities.FormsRepositoryProvider;

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
public final class AppDependencyModule_ProvidesServerFormDetailsFetcherFactory implements Factory<ServerFormsDetailsFetcher> {
  private final AppDependencyModule module;

  private final Provider<FormsRepositoryProvider> formsRepositoryProvider;

  private final Provider<FormSourceProvider> formSourceProvider;

  public AppDependencyModule_ProvidesServerFormDetailsFetcherFactory(AppDependencyModule module,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<FormSourceProvider> formSourceProvider) {
    this.module = module;
    this.formsRepositoryProvider = formsRepositoryProvider;
    this.formSourceProvider = formSourceProvider;
  }

  @Override
  public ServerFormsDetailsFetcher get() {
    return providesServerFormDetailsFetcher(module, formsRepositoryProvider.get(), formSourceProvider.get());
  }

  public static AppDependencyModule_ProvidesServerFormDetailsFetcherFactory create(
      AppDependencyModule module, Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<FormSourceProvider> formSourceProvider) {
    return new AppDependencyModule_ProvidesServerFormDetailsFetcherFactory(module, formsRepositoryProvider, formSourceProvider);
  }

  public static ServerFormsDetailsFetcher providesServerFormDetailsFetcher(
      AppDependencyModule instance, FormsRepositoryProvider formsRepositoryProvider,
      FormSourceProvider formSourceProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesServerFormDetailsFetcher(formsRepositoryProvider, formSourceProvider));
  }
}
