package prieto.fernando.presentation

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.rules.TestRule
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class FirstViewModelTest {
    private lateinit var cut: FirstViewModel

    @Before
    fun setUp() {
        cut = FirstViewModelImpl()
    }

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()
}
