package prieto.fernando.template.di;

import android.app.Application;
import android.content.res.Resources;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideResourcesFactory implements Factory<Resources> {
  private final AppModule module;

  private final Provider<Application> appProvider;

  public AppModule_ProvideResourcesFactory(AppModule module, Provider<Application> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public Resources get() {
    return provideResources(module, appProvider.get());
  }

  public static AppModule_ProvideResourcesFactory create(AppModule module,
      Provider<Application> appProvider) {
    return new AppModule_ProvideResourcesFactory(module, appProvider);
  }

  public static Resources provideResources(AppModule instance, Application app) {
    return Preconditions.checkNotNull(instance.provideResources(app), "Cannot return null from a non-@Nullable @Provides method");
  }
}
