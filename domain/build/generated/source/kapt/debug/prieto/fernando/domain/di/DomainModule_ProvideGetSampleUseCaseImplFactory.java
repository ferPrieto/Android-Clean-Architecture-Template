package prieto.fernando.domain.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import prieto.fernando.domain.SampleRepository;
import prieto.fernando.domain.usecase.GetSampleUseCase;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DomainModule_ProvideGetSampleUseCaseImplFactory implements Factory<GetSampleUseCase> {
  private final DomainModule module;

  private final Provider<SampleRepository> sampleRepositoryProvider;

  public DomainModule_ProvideGetSampleUseCaseImplFactory(DomainModule module,
      Provider<SampleRepository> sampleRepositoryProvider) {
    this.module = module;
    this.sampleRepositoryProvider = sampleRepositoryProvider;
  }

  @Override
  public GetSampleUseCase get() {
    return provideGetSampleUseCaseImpl(module, sampleRepositoryProvider.get());
  }

  public static DomainModule_ProvideGetSampleUseCaseImplFactory create(DomainModule module,
      Provider<SampleRepository> sampleRepositoryProvider) {
    return new DomainModule_ProvideGetSampleUseCaseImplFactory(module, sampleRepositoryProvider);
  }

  public static GetSampleUseCase provideGetSampleUseCaseImpl(DomainModule instance,
      SampleRepository sampleRepository) {
    return Preconditions.checkNotNull(instance.provideGetSampleUseCaseImpl(sampleRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
}
