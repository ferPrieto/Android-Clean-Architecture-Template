package prieto.fernando.data.di

import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import prieto.fernando.data.SampleRemoteSource
import prieto.fernando.data.mapper.SampleRepositoryToDomainModelMapper
import prieto.fernando.data.mapper.SampleRepositoryToDomainModelMapperImpl
import prieto.fernando.data.repository.SampleRepositoryImpl
import prieto.fernando.domain.SampleRepository

@Module
@InstallIn(ApplicationComponent::class)
class SampleRepositoryModule {
    @Provides
    @Reusable
    fun provideSampleRepository(
        sampleRemoteSource: SampleRemoteSource,
        sampleRepositoryMapper: SampleRepositoryToDomainModelMapper
    ): SampleRepository = SampleRepositoryImpl(sampleRemoteSource, sampleRepositoryMapper)

    @Provides
    @Reusable
    fun provideSampleRepositoryToDomainModelMapper(): SampleRepositoryToDomainModelMapper =
        SampleRepositoryToDomainModelMapperImpl()

}
