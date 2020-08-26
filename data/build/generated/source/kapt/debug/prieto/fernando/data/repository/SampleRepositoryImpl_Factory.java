package prieto.fernando.data.repository;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import prieto.fernando.data.SampleRemoteSource;
import prieto.fernando.data.mapper.SampleRepositoryToDomainModelMapper;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SampleRepositoryImpl_Factory implements Factory<SampleRepositoryImpl> {
  private final Provider<SampleRemoteSource> sampleRemoteSourceProvider;

  private final Provider<SampleRepositoryToDomainModelMapper> sampleDomainMapperProvider;

  public SampleRepositoryImpl_Factory(Provider<SampleRemoteSource> sampleRemoteSourceProvider,
      Provider<SampleRepositoryToDomainModelMapper> sampleDomainMapperProvider) {
    this.sampleRemoteSourceProvider = sampleRemoteSourceProvider;
    this.sampleDomainMapperProvider = sampleDomainMapperProvider;
  }

  @Override
  public SampleRepositoryImpl get() {
    return newInstance(sampleRemoteSourceProvider.get(), sampleDomainMapperProvider.get());
  }

  public static SampleRepositoryImpl_Factory create(
      Provider<SampleRemoteSource> sampleRemoteSourceProvider,
      Provider<SampleRepositoryToDomainModelMapper> sampleDomainMapperProvider) {
    return new SampleRepositoryImpl_Factory(sampleRemoteSourceProvider, sampleDomainMapperProvider);
  }

  public static SampleRepositoryImpl newInstance(SampleRemoteSource sampleRemoteSource,
      SampleRepositoryToDomainModelMapper sampleDomainMapper) {
    return new SampleRepositoryImpl(sampleRemoteSource, sampleDomainMapper);
  }
}
