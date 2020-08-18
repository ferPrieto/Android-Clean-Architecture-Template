package prieto.fernando.template.ui;

import androidx.lifecycle.ViewModelProvider;
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
public final class FirstFragment_Factory implements Factory<FirstFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public FirstFragment_Factory(Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  @Override
  public FirstFragment get() {
    return newInstance(viewModelFactoryProvider.get());
  }

  public static FirstFragment_Factory create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new FirstFragment_Factory(viewModelFactoryProvider);
  }

  public static FirstFragment newInstance(ViewModelProvider.Factory viewModelFactory) {
    return new FirstFragment(viewModelFactory);
  }
}
