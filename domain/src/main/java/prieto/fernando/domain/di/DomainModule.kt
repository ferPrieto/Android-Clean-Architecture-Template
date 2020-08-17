package prieto.fernando.domain.di

import dagger.Module
import dagger.Provides
import dagger.Reusable
import prieto.fernando.domain.SampleRepository
import prieto.fernando.domain.usecase.GetSampleUseCase
import prieto.fernando.domain.usecase.GetSampleUseCaseImpl

@Module
class DomainModule {
    @Provides
    @Reusable
    fun provideGetSampleUseCaseImpl(
        sampleRepository: SampleRepository
    ): GetSampleUseCase = GetSampleUseCaseImpl(sampleRepository)

}
