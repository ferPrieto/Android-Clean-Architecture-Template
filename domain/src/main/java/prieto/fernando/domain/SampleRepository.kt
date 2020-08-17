package prieto.fernando.domain

import kotlinx.coroutines.flow.Flow
import prieto.fernando.domain.model.SampleDomainModel

interface SampleRepository {
    suspend fun getSample(): Flow<SampleDomainModel>
}