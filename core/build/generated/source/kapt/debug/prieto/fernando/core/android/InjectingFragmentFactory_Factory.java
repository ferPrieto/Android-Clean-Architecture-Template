// Generated by Dagger (https://dagger.dev).
package prieto.fernando.core.android;

import androidx.fragment.app.Fragment;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class InjectingFragmentFactory_Factory implements Factory<InjectingFragmentFactory> {
  private final Provider<Map<Class<? extends Fragment>, Provider<Fragment>>> creatorsProvider;

  public InjectingFragmentFactory_Factory(
      Provider<Map<Class<? extends Fragment>, Provider<Fragment>>> creatorsProvider) {
    this.creatorsProvider = creatorsProvider;
  }

  @Override
  public InjectingFragmentFactory get() {
    return newInstance(creatorsProvider.get());
  }

  public static InjectingFragmentFactory_Factory create(
      Provider<Map<Class<? extends Fragment>, Provider<Fragment>>> creatorsProvider) {
    return new InjectingFragmentFactory_Factory(creatorsProvider);
  }

  public static InjectingFragmentFactory newInstance(
      Map<Class<? extends Fragment>, Provider<Fragment>> creators) {
    return new InjectingFragmentFactory(creators);
  }
}