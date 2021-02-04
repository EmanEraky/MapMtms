package com.eman.mapmtms.presenters.module;

import com.eman.mapmtms.data.api.ApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideApiServiceFactory implements Factory<ApiService> {
  private final ApplicationModule module;

  private final Provider<Retrofit> retrofitProvider;

  public ApplicationModule_ProvideApiServiceFactory(ApplicationModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiService get() {
    return provideApiService(module, retrofitProvider.get());
  }

  public static ApplicationModule_ProvideApiServiceFactory create(ApplicationModule module,
      Provider<Retrofit> retrofitProvider) {
    return new ApplicationModule_ProvideApiServiceFactory(module, retrofitProvider);
  }

  public static ApiService provideApiService(ApplicationModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(instance.provideApiService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
