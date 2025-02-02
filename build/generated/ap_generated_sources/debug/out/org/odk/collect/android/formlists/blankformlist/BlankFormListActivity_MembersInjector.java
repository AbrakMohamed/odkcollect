package org.odk.collect.android.formlists.blankformlist;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.androidshared.network.NetworkStateProvider;
import org.odk.collect.permissions.PermissionsProvider;

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
public final class BlankFormListActivity_MembersInjector implements MembersInjector<BlankFormListActivity> {
  private final Provider<BlankFormListViewModel.Factory> viewModelFactoryProvider;

  private final Provider<NetworkStateProvider> networkStateProvider;

  private final Provider<PermissionsProvider> permissionsProvider;

  public BlankFormListActivity_MembersInjector(
      Provider<BlankFormListViewModel.Factory> viewModelFactoryProvider,
      Provider<NetworkStateProvider> networkStateProvider,
      Provider<PermissionsProvider> permissionsProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.networkStateProvider = networkStateProvider;
    this.permissionsProvider = permissionsProvider;
  }

  public static MembersInjector<BlankFormListActivity> create(
      Provider<BlankFormListViewModel.Factory> viewModelFactoryProvider,
      Provider<NetworkStateProvider> networkStateProvider,
      Provider<PermissionsProvider> permissionsProvider) {
    return new BlankFormListActivity_MembersInjector(viewModelFactoryProvider, networkStateProvider, permissionsProvider);
  }

  @Override
  public void injectMembers(BlankFormListActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectNetworkStateProvider(instance, networkStateProvider.get());
    injectPermissionsProvider(instance, permissionsProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.formlists.blankformlist.BlankFormListActivity.viewModelFactory")
  public static void injectViewModelFactory(BlankFormListActivity instance,
      BlankFormListViewModel.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("org.odk.collect.android.formlists.blankformlist.BlankFormListActivity.networkStateProvider")
  public static void injectNetworkStateProvider(BlankFormListActivity instance,
      NetworkStateProvider networkStateProvider) {
    instance.networkStateProvider = networkStateProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.formlists.blankformlist.BlankFormListActivity.permissionsProvider")
  public static void injectPermissionsProvider(BlankFormListActivity instance,
      PermissionsProvider permissionsProvider) {
    instance.permissionsProvider = permissionsProvider;
  }
}
