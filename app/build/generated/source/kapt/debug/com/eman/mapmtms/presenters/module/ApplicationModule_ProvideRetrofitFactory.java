package com.eman.mapmtms.presenters.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final ApplicationModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public ApplicationModule_ProvideRetrofitFactory(ApplicationModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(module, okHttpClientProvider.get());
  }

  public static ApplicationModule_ProvideRetrofitFactory create(ApplicationModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new ApplicationModule_ProvideRetrofitFactory(module, okHttpClientProvider);
  }

  public static Retrofit provideRetrofit(ApplicationModule instance, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNull(instance.provideRetrofit(okHttpClient), "Cannot return null from a non-@Nullable @Provides method");
  }
}
