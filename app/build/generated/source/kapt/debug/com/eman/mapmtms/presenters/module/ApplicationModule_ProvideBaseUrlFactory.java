package com.eman.mapmtms.presenters.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideBaseUrlFactory implements Factory<String> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideBaseUrlFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideBaseUrl(module);
  }

  public static ApplicationModule_ProvideBaseUrlFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideBaseUrlFactory(module);
  }

  public static String provideBaseUrl(ApplicationModule instance) {
    return Preconditions.checkNotNull(instance.provideBaseUrl(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
