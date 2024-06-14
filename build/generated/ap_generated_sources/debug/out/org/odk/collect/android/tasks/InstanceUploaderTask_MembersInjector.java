package org.odk.collect.android.tasks;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.instancemanagement.InstancesDataService;
import org.odk.collect.android.openrosa.OpenRosaHttpInterface;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.utilities.WebCredentialsUtils;
import org.odk.collect.metadata.PropertyManager;

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
public final class InstanceUploaderTask_MembersInjector implements MembersInjector<InstanceUploaderTask> {
  private final Provider<OpenRosaHttpInterface> httpInterfaceProvider;

  private final Provider<WebCredentialsUtils> webCredentialsUtilsProvider;

  private final Provider<PropertyManager> propertyManagerProvider;

  private final Provider<InstancesDataService> instancesDataServiceProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  public InstanceUploaderTask_MembersInjector(Provider<OpenRosaHttpInterface> httpInterfaceProvider,
      Provider<WebCredentialsUtils> webCredentialsUtilsProvider,
      Provider<PropertyManager> propertyManagerProvider,
      Provider<InstancesDataService> instancesDataServiceProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider) {
    this.httpInterfaceProvider = httpInterfaceProvider;
    this.webCredentialsUtilsProvider = webCredentialsUtilsProvider;
    this.propertyManagerProvider = propertyManagerProvider;
    this.instancesDataServiceProvider = instancesDataServiceProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
  }

  public static MembersInjector<InstanceUploaderTask> create(
      Provider<OpenRosaHttpInterface> httpInterfaceProvider,
      Provider<WebCredentialsUtils> webCredentialsUtilsProvider,
      Provider<PropertyManager> propertyManagerProvider,
      Provider<InstancesDataService> instancesDataServiceProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider) {
    return new InstanceUploaderTask_MembersInjector(httpInterfaceProvider, webCredentialsUtilsProvider, propertyManagerProvider, instancesDataServiceProvider, projectsDataServiceProvider);
  }

  @Override
  public void injectMembers(InstanceUploaderTask instance) {
    injectHttpInterface(instance, httpInterfaceProvider.get());
    injectWebCredentialsUtils(instance, webCredentialsUtilsProvider.get());
    injectPropertyManager(instance, propertyManagerProvider.get());
    injectInstancesDataService(instance, instancesDataServiceProvider.get());
    injectProjectsDataService(instance, projectsDataServiceProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.tasks.InstanceUploaderTask.httpInterface")
  public static void injectHttpInterface(InstanceUploaderTask instance,
      OpenRosaHttpInterface httpInterface) {
    instance.httpInterface = httpInterface;
  }

  @InjectedFieldSignature("org.odk.collect.android.tasks.InstanceUploaderTask.webCredentialsUtils")
  public static void injectWebCredentialsUtils(InstanceUploaderTask instance,
      WebCredentialsUtils webCredentialsUtils) {
    instance.webCredentialsUtils = webCredentialsUtils;
  }

  @InjectedFieldSignature("org.odk.collect.android.tasks.InstanceUploaderTask.propertyManager")
  public static void injectPropertyManager(InstanceUploaderTask instance,
      PropertyManager propertyManager) {
    instance.propertyManager = propertyManager;
  }

  @InjectedFieldSignature("org.odk.collect.android.tasks.InstanceUploaderTask.instancesDataService")
  public static void injectInstancesDataService(InstanceUploaderTask instance,
      InstancesDataService instancesDataService) {
    instance.instancesDataService = instancesDataService;
  }

  @InjectedFieldSignature("org.odk.collect.android.tasks.InstanceUploaderTask.projectsDataService")
  public static void injectProjectsDataService(InstanceUploaderTask instance,
      ProjectsDataService projectsDataService) {
    instance.projectsDataService = projectsDataService;
  }
}
