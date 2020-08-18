package prieto.fernando.template.ui;

import androidx.fragment.app.FragmentFactory;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<FragmentFactory> fragmentFactoryProvider;

  public MainActivity_MembersInjector(Provider<FragmentFactory> fragmentFactoryProvider) {
    this.fragmentFactoryProvider = fragmentFactoryProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<FragmentFactory> fragmentFactoryProvider) {
    return new MainActivity_MembersInjector(fragmentFactoryProvider);}

  @Override
  public void injectMembers(MainActivity instance) {
    injectFragmentFactory(instance, fragmentFactoryProvider.get());
  }

  @InjectedFieldSignature("prieto.fernando.template.ui.MainActivity.fragmentFactory")
  public static void injectFragmentFactory(MainActivity instance, FragmentFactory fragmentFactory) {
    instance.fragmentFactory = fragmentFactory;
  }
}
