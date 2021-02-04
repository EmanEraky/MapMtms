package com.eman.trudocapp.data.repo;

import com.eman.mapmtms.data.api.ApiService;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiPlaceRepo_Factory implements Factory<ApiPlaceRepo> {
  private final Provider<ApiService> apiServiceProvider;

  public ApiPlaceRepo_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public ApiPlaceRepo get() {
    return newInstance(apiServiceProvider.get());
  }

  public static ApiPlaceRepo_Factory create(Provider<ApiService> apiServiceProvider) {
    return new ApiPlaceRepo_Factory(apiServiceProvider);
  }

  public static ApiPlaceRepo newInstance(ApiService apiService) {
    return new ApiPlaceRepo(apiService);
  }
}
