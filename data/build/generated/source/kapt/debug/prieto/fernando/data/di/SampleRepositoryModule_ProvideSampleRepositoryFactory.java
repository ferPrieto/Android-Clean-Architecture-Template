package prieto.fernando.data.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import prieto.fernando.data.SampleRemoteSource;
import prieto.fernando.data.mapper.SampleRepositoryToDomainModelMapper;
import prieto.fernando.domain.SampleRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SampleRepositoryModule_ProvideSampleRepositoryFactory implements Factory<SampleRepository> {
  private final SampleRepositoryModule module;

  private final Provider<SampleRemoteSource> sampleRemoteSourceProvider;

  private final Provider<SampleRepositoryToDomainModelMapper> sampleRepositoryMapperProvider;

  public SampleRepositoryModule_ProvideSampleRepositoryFactory(SampleRepositoryModule module,
      Provider<SampleRemoteSource> sampleRemoteSourceProvider,
      Provider<SampleRepositoryToDomainModelMapper> sampleRepositoryMapperProvider) {
    this.module = module;
    this.sampleRemoteSourceProvider = sampleRemoteSourceProvider;
    this.sampleRepositoryMapperProvider = sampleRepositoryMapperProvider;
  }

  @Override
  public SampleRepository get() {
    return provideSampleRepository(module, sampleRemoteSourceProvider.get(), sampleRepositoryMapperProvider.get());
  }

  public static SampleRepositoryModule_ProvideSampleRepositoryFactory create(
      SampleRepositoryModule module, Provider<SampleRemoteSource> sampleRemoteSourceProvider,
      Provider<SampleRepositoryToDomainModelMapper> sampleRepositoryMapperProvider) {
    return new SampleRepositoryModule_ProvideSampleRepositoryFactory(module, sampleRemoteSourceProvider, sampleRepositoryMapperProvider);
  }

  public static SampleRepository provideSampleRepository(SampleRepositoryModule instance,
      SampleRemoteSource sampleRemoteSource,
      SampleRepositoryToDomainModelMapper sampleRepositoryMapper) {
    return Preconditions.checkNotNull(instance.provideSampleRepository(sampleRemoteSource, sampleRepositoryMapper), "Cannot return null from a non-@Nullable @Provides method");
  }
}
