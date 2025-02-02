package org.odk.collect.android.utilities;

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
public final class AuthDialogUtility_MembersInjector implements MembersInjector<AuthDialogUtility> {
  private final Provider<WebCredentialsUtils> webCredentialsUtilsProvider;

  private final Provider<PropertyManager> propertyManagerProvider;

  public AuthDialogUtility_MembersInjector(
      Provider<WebCredentialsUtils> webCredentialsUtilsProvider,
      Provider<PropertyManager> propertyManagerProvider) {
    this.webCredentialsUtilsProvider = webCredentialsUtilsProvider;
    this.propertyManagerProvider = propertyManagerProvider;
  }

  public static MembersInjector<AuthDialogUtility> create(
      Provider<WebCredentialsUtils> webCredentialsUtilsProvider,
      Provider<PropertyManager> propertyManagerProvider) {
    return new AuthDialogUtility_MembersInjector(webCredentialsUtilsProvider, propertyManagerProvider);
  }

  @Override
  public void injectMembers(AuthDialogUtility instance) {
    injectWebCredentialsUtils(instance, webCredentialsUtilsProvider.get());
    injectPropertyManager(instance, propertyManagerProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.utilities.AuthDialogUtility.webCredentialsUtils")
  public static void injectWebCredentialsUtils(AuthDialogUtility instance,
      WebCredentialsUtils webCredentialsUtils) {
    instance.webCredentialsUtils = webCredentialsUtils;
  }

  @InjectedFieldSignature("org.odk.collect.android.utilities.AuthDialogUtility.propertyManager")
  public static void injectPropertyManager(AuthDialogUtility instance,
      PropertyManager propertyManager) {
    instance.propertyManager = propertyManager;
  }
}
