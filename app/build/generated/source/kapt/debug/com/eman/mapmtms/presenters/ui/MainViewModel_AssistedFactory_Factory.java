package com.eman.mapmtms.presenters.ui;

import com.eman.mapmtms.domain.useCases.PlaceUseCase;
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
public final class MainViewModel_AssistedFactory_Factory implements Factory<MainViewModel_AssistedFactory> {
  private final Provider<PlaceUseCase> mainRepositoryUseCaseProvider;

  public MainViewModel_AssistedFactory_Factory(
      Provider<PlaceUseCase> mainRepositoryUseCaseProvider) {
    this.mainRepositoryUseCaseProvider = mainRepositoryUseCaseProvider;
  }

  @Override
  public MainViewModel_AssistedFactory get() {
    return newInstance(mainRepositoryUseCaseProvider);
  }

  public static MainViewModel_AssistedFactory_Factory create(
      Provider<PlaceUseCase> mainRepositoryUseCaseProvider) {
    return new MainViewModel_AssistedFactory_Factory(mainRepositoryUseCaseProvider);
  }

  public static MainViewModel_AssistedFactory newInstance(
      Provider<PlaceUseCase> mainRepositoryUseCase) {
    return new MainViewModel_AssistedFactory(mainRepositoryUseCase);
  }
}
