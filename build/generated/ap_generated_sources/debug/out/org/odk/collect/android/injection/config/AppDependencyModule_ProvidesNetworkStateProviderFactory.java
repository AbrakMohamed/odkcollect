package org.odk.collect.android.injection.config;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.androidshared.network.NetworkStateProvider;

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
public final class AppDependencyModule_ProvidesNetworkStateProviderFactory implements Factory<NetworkStateProvider> {
  private final AppDependencyModule module;

  private final Provider<Context> contextProvider;

  public AppDependencyModule_ProvidesNetworkStateProviderFactory(AppDependencyModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public NetworkStateProvider get() {
    return providesNetworkStateProvider(module, contextProvider.get());
  }

  public static AppDependencyModule_ProvidesNetworkStateProviderFactory create(
      AppDependencyModule module, Provider<Context> contextProvider) {
    return new AppDependencyModule_ProvidesNetworkStateProviderFactory(module, contextProvider);
  }

  public static NetworkStateProvider providesNetworkStateProvider(AppDependencyModule instance,
      Context context) {
    return Preconditions.checkNotNullFromProvides(instance.providesNetworkStateProvider(context));
  }
}
