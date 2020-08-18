package prieto.fernando.presentation;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FirstViewModelImpl_Factory implements Factory<FirstViewModelImpl> {
  @Override
  public FirstViewModelImpl get() {
    return newInstance();
  }

  public static FirstViewModelImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FirstViewModelImpl newInstance() {
    return new FirstViewModelImpl();
  }

  private static final class InstanceHolder {
    private static final FirstViewModelImpl_Factory INSTANCE = new FirstViewModelImpl_Factory();
  }
}
