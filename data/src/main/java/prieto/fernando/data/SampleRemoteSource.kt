package prieto.fernando.data

import kotlinx.coroutines.flow.Flow
import prieto.fernando.data.model.SampleRepositoryModel

interface SampleRemoteSource {
    suspend fun getSample(): Flow<SampleRepositoryModel>
}
