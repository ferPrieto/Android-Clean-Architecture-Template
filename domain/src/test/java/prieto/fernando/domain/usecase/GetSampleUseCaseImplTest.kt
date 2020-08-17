package prieto.fernando.domain.usecase

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.nhaarman.mockito_kotlin.times
import com.nhaarman.mockito_kotlin.verify
import com.nhaarman.mockito_kotlin.whenever
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import prieto.fernando.core_android_test.MainCoroutineRule
import prieto.fernando.domain.SampleRepository
import prieto.fernando.domain.model.SampleDomainModel
import kotlin.test.assertEquals

@FlowPreview
@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class GetSampleUseCaseImplTest {
    private lateinit var cut: GetSampleUseCase

    @Mock
    lateinit var sampleRepository: SampleRepository

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    @JvmField
    @Rule
    val mainCoroutineRule = MainCoroutineRule()

    @Before
    fun setUp() {
        cut = GetSampleUseCaseImpl(sampleRepository)
    }

    @Test
    fun `When execute then returns expected SampleDomainModel`() {
        runBlocking {
            // Given
            val sampleDomainModel = SampleDomainModel(
                "sample title",
                1
            )
            val channelSample = ConflatedBroadcastChannel<SampleDomainModel>()
            channelSample.offer(sampleDomainModel)
            val expected = SampleDomainModel(
                "sample title",
                1
            )
            whenever(sampleRepository.getSample()).thenReturn(channelSample.asFlow())

            // When
            val actualValue = cut.execute().first()

            // Then
            verify(sampleRepository, times(1)).getSample()
            assertEquals(expected, actualValue)
        }
    }
}
