package com.eman.mapmtms.presenters.ui;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.eman.mapmtms.domain.useCases.PlaceUseCase;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class MainViewModel_AssistedFactory implements ViewModelAssistedFactory<MainViewModel> {
  private final Provider<PlaceUseCase> mainRepositoryUseCase;

  @Inject
  MainViewModel_AssistedFactory(Provider<PlaceUseCase> mainRepositoryUseCase) {
    this.mainRepositoryUseCase = mainRepositoryUseCase;
  }

  @Override
  @NonNull
  public MainViewModel create(SavedStateHandle arg0) {
    return new MainViewModel(mainRepositoryUseCase.get());
  }
}
