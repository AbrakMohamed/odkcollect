package org.odk.collect.android.backgroundwork;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.formmanagement.FormsDataService;

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
public final class SyncFormsTaskSpec_MembersInjector implements MembersInjector<SyncFormsTaskSpec> {
  private final Provider<FormsDataService> formsDataServiceProvider;

  public SyncFormsTaskSpec_MembersInjector(Provider<FormsDataService> formsDataServiceProvider) {
    this.formsDataServiceProvider = formsDataServiceProvider;
  }

  public static MembersInjector<SyncFormsTaskSpec> create(
      Provider<FormsDataService> formsDataServiceProvider) {
    return new SyncFormsTaskSpec_MembersInjector(formsDataServiceProvider);
  }

  @Override
  public void injectMembers(SyncFormsTaskSpec instance) {
    injectFormsDataService(instance, formsDataServiceProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.backgroundwork.SyncFormsTaskSpec.formsDataService")
  public static void injectFormsDataService(SyncFormsTaskSpec instance,
      FormsDataService formsDataService) {
    instance.formsDataService = formsDataService;
  }
}
