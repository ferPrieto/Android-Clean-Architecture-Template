package prieto.fernando.domain.usecase

import kotlinx.coroutines.flow.Flow
import prieto.fernando.domain.SampleRepository
import prieto.fernando.domain.model.SampleDomainModel
import javax.inject.Inject

interface GetSampleUseCase {
    suspend fun execute(): Flow<SampleDomainModel>
}

class GetSampleUseCaseImpl @Inject constructor(
    private val sampleRepository: SampleRepository
) : GetSampleUseCase {
    override suspend fun execute(): Flow<SampleDomainModel> = sampleRepository.getSample()
}
