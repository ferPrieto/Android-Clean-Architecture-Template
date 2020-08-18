package prieto.fernando.template.di;

import android.app.Application;
import android.content.Context;
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
public final class AppModule_ProvideContextFactory implements Factory<Context> {
  private final AppModule module;

  private final Provider<Application> appProvider;

  public AppModule_ProvideContextFactory(AppModule module, Provider<Application> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public Context get() {
    return provideContext(module, appProvider.get());
  }

  public static AppModule_ProvideContextFactory create(AppModule module,
      Provider<Application> appProvider) {
    return new AppModule_ProvideContextFactory(module, appProvider);
  }

  public static Context provideContext(AppModule instance, Application app) {
    return Preconditions.checkNotNull(instance.provideContext(app), "Cannot return null from a non-@Nullable @Provides method");
  }
}
