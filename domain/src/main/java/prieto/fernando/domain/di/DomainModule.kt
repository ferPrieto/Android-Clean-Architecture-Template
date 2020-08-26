package prieto.fernando.domain.di

import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import prieto.fernando.domain.SampleRepository
import prieto.fernando.domain.usecase.GetSampleUseCase
import prieto.fernando.domain.usecase.GetSampleUseCaseImpl

@Module
@InstallIn(ApplicationComponent::class)
class DomainModule {
    @Provides
    @Reusable
    fun provideGetSampleUseCaseImpl(
        sampleRepository: SampleRepository
    ): GetSampleUseCase = GetSampleUseCaseImpl(sampleRepository)

}
