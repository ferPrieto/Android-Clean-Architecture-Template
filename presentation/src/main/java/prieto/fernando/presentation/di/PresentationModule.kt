package prieto.fernando.presentation.di

import dagger.Module
import dagger.Provides
import dagger.Reusable
import prieto.fernando.presentation.mapper.SampleDomainToUiModelMapper
import prieto.fernando.presentation.mapper.SampleDomainToUiModelMapperImpl

@Module
class PresentationModule {
    @Provides
    @Reusable
    fun provideSampleDomainToUiModelMapper(): SampleDomainToUiModelMapper =
        SampleDomainToUiModelMapperImpl()
}