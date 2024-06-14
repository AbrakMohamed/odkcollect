package org.odk.collect.android.backgroundwork;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.instancemanagement.InstancesDataService;

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
public final class AutoSendTaskSpec_MembersInjector implements MembersInjector<AutoSendTaskSpec> {
  private final Provider<InstancesDataService> instancesDataServiceProvider;

  public AutoSendTaskSpec_MembersInjector(
      Provider<InstancesDataService> instancesDataServiceProvider) {
    this.instancesDataServiceProvider = instancesDataServiceProvider;
  }

  public static MembersInjector<AutoSendTaskSpec> create(
      Provider<InstancesDataService> instancesDataServiceProvider) {
    return new AutoSendTaskSpec_MembersInjector(instancesDataServiceProvider);
  }

  @Override
  public void injectMembers(AutoSendTaskSpec instance) {
    injectInstancesDataService(instance, instancesDataServiceProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.backgroundwork.AutoSendTaskSpec.instancesDataService")
  public static void injectInstancesDataService(AutoSendTaskSpec instance,
      InstancesDataService instancesDataService) {
    instance.instancesDataService = instancesDataService;
  }
}
