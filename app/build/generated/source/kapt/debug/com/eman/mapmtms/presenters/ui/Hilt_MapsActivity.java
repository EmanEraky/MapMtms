package com.eman.mapmtms.presenters.ui;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.Object;
import java.lang.Override;
import javax.annotation.Generated;

/**
 * A generated base class to be extended by the @dagger.hilt.android.AndroidEntryPoint annotated class. If using the Gradle plugin, this is swapped as the base class via bytecode transformation.
 */
@Generated("dagger.hilt.android.processor.internal.androidentrypoint.ActivityGenerator")
public abstract class Hilt_MapsActivity extends FragmentActivity implements GeneratedComponentManager<Object> {
  private volatile ActivityComponentManager componentManager;

  private final Object componentManagerLock = new Object();

  Hilt_MapsActivity() {
    super();
  }

  Hilt_MapsActivity(int contentLayoutId) {
    super(contentLayoutId);
  }

  @CallSuper
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    inject();
    super.onCreate(savedInstanceState);
  }

  @Override
  public final Object generatedComponent() {
    return componentManager().generatedComponent();
  }

  protected ActivityComponentManager createComponentManager() {
    return new ActivityComponentManager(this);
  }

  protected final ActivityComponentManager componentManager() {
    if (componentManager == null) {
      synchronized (componentManagerLock) {
        if (componentManager == null) {
          componentManager = createComponentManager();
        }
      }
    }
    return componentManager;
  }

  protected void inject() {
    ((MapsActivity_GeneratedInjector) generatedComponent()).injectMapsActivity(UnsafeCasts.<MapsActivity>unsafeCast(this));
  }

  @Override
  public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
    ViewModelProvider.Factory factory = DefaultViewModelFactories.getActivityFactory(this);
    if (factory != null) {
      return factory;
    }
    return super.getDefaultViewModelProviderFactory();
  }
}
