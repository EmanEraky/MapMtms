package com.eman.mapmtms.domain.useCases;

import com.eman.trudocapp.data.repo.ApiHelper;
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
public final class PlaceUseCase_Factory implements Factory<PlaceUseCase> {
  private final Provider<ApiHelper> apiHelperProvider;

  public PlaceUseCase_Factory(Provider<ApiHelper> apiHelperProvider) {
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public PlaceUseCase get() {
    return newInstance(apiHelperProvider.get());
  }

  public static PlaceUseCase_Factory create(Provider<ApiHelper> apiHelperProvider) {
    return new PlaceUseCase_Factory(apiHelperProvider);
  }

  public static PlaceUseCase newInstance(ApiHelper apiHelper) {
    return new PlaceUseCase(apiHelper);
  }
}
