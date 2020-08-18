package prieto.fernando.presentation;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import prieto.fernando.domain.usecase.GetSampleUseCase;
import prieto.fernando.presentation.mapper.SampleDomainToUiModelMapper;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FirstViewModelImpl_Factory implements Factory<FirstViewModelImpl> {
  private final Provider<GetSampleUseCase> getSampleUseCaseProvider;

  private final Provider<SampleDomainToUiModelMapper> sampleDomainToUiModelMapperProvider;

  public FirstViewModelImpl_Factory(Provider<GetSampleUseCase> getSampleUseCaseProvider,
      Provider<SampleDomainToUiModelMapper> sampleDomainToUiModelMapperProvider) {
    this.getSampleUseCaseProvider = getSampleUseCaseProvider;
    this.sampleDomainToUiModelMapperProvider = sampleDomainToUiModelMapperProvider;
  }

  @Override
  public FirstViewModelImpl get() {
    return newInstance(getSampleUseCaseProvider.get(), sampleDomainToUiModelMapperProvider.get());
  }

  public static FirstViewModelImpl_Factory create(
      Provider<GetSampleUseCase> getSampleUseCaseProvider,
      Provider<SampleDomainToUiModelMapper> sampleDomainToUiModelMapperProvider) {
    return new FirstViewModelImpl_Factory(getSampleUseCaseProvider, sampleDomainToUiModelMapperProvider);
  }

  public static FirstViewModelImpl newInstance(GetSampleUseCase getSampleUseCase,
      SampleDomainToUiModelMapper sampleDomainToUiModelMapper) {
    return new FirstViewModelImpl(getSampleUseCase, sampleDomainToUiModelMapper);
  }
}
