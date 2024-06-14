package org.odk.collect.android.preferences.screens;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class ProjectPreferencesActivity_MembersInjector implements MembersInjector<ProjectPreferencesActivity> {
  private final Provider<PropertyManager> propertyManagerProvider;

  public ProjectPreferencesActivity_MembersInjector(
      Provider<PropertyManager> propertyManagerProvider) {
    this.propertyManagerProvider = propertyManagerProvider;
  }

  public static MembersInjector<ProjectPreferencesActivity> create(
      Provider<PropertyManager> propertyManagerProvider) {
    return new ProjectPreferencesActivity_MembersInjector(propertyManagerProvider);
  }

  @Override
  public void injectMembers(ProjectPreferencesActivity instance) {
    injectPropertyManager(instance, propertyManagerProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.ProjectPreferencesActivity.propertyManager")
  public static void injectPropertyManager(ProjectPreferencesActivity instance,
      PropertyManager propertyManager) {
    instance.propertyManager = propertyManager;
  }
}
