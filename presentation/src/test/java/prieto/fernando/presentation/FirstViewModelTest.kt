package prieto.fernando.presentation

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.setMain
import org.junit.Before
import org.junit.Rule
import org.junit.rules.TestRule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import prieto.fernando.domain.usecase.GetSampleUseCase
import prieto.fernando.presentation.mapper.SampleDomainToUiModelMapper

@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class FirstViewModelTest {
    private lateinit var cut: FirstViewModel

    @Mock
    lateinit var getSampleUseCase: GetSampleUseCase

    @Mock
    lateinit var sampleMapper: SampleDomainToUiModelMapper

    @Before
    fun setUp() {
        Dispatchers.setMain(Dispatchers.Unconfined)
        cut = FirstViewModelImpl(getSampleUseCase, sampleMapper)
    }

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()
}
