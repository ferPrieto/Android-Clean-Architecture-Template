package prieto.fernando.domain.usecase;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import prieto.fernando.domain.SampleRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetSampleUseCaseImpl_Factory implements Factory<GetSampleUseCaseImpl> {
  private final Provider<SampleRepository> sampleRepositoryProvider;

  public GetSampleUseCaseImpl_Factory(Provider<SampleRepository> sampleRepositoryProvider) {
    this.sampleRepositoryProvider = sampleRepositoryProvider;
  }

  @Override
  public GetSampleUseCaseImpl get() {
    return newInstance(sampleRepositoryProvider.get());
  }

  public static GetSampleUseCaseImpl_Factory create(
      Provider<SampleRepository> sampleRepositoryProvider) {
    return new GetSampleUseCaseImpl_Factory(sampleRepositoryProvider);
  }

  public static GetSampleUseCaseImpl newInstance(SampleRepository sampleRepository) {
    return new GetSampleUseCaseImpl(sampleRepository);
  }
}
