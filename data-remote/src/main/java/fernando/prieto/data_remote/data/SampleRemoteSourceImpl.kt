package fernando.prieto.data_remote.data

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import prieto.fernando.data.SampleRemoteSource
import prieto.fernando.data.model.SampleRepositoryModel
import javax.inject.Inject

@FlowPreview
@ExperimentalCoroutinesApi
class SampleRemoteSourceImpl @Inject constructor() : SampleRemoteSource {
    private val sampleChannel = ConflatedBroadcastChannel<SampleRepositoryModel>()

    override suspend fun getSample(): Flow<SampleRepositoryModel> {
        sampleChannel.offer(SampleRepositoryModel("Welcome to the Clean Code Template (MVVM + DI + Coroutines)", "12"))
        return sampleChannel.asFlow()
    }
}