package com.eman.mapmtms.presenters.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideOkHttpClientFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(module);
  }

  public static ApplicationModule_ProvideOkHttpClientFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideOkHttpClientFactory(module);
  }

  public static OkHttpClient provideOkHttpClient(ApplicationModule instance) {
    return Preconditions.checkNotNull(instance.provideOkHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
