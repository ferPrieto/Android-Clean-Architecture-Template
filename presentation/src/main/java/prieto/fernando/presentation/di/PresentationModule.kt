package prieto.fernando.presentation.di

import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import prieto.fernando.presentation.mapper.SampleDomainToUiModelMapper
import prieto.fernando.presentation.mapper.SampleDomainToUiModelMapperImpl

@Module
@InstallIn(ApplicationComponent::class)
class PresentationModule {
    @Provides
    @Reusable
    fun provideSampleDomainToUiModelMapper(): SampleDomainToUiModelMapper =
        SampleDomainToUiModelMapperImpl()
}