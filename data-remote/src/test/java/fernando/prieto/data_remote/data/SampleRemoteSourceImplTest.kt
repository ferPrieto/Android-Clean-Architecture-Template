package fernando.prieto.data_remote.data

import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner
import prieto.fernando.core_android_test.MainCoroutineRule


@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class SampleRemoteSourceImplTest {

    private lateinit var cut: SampleRemoteSourceImpl


    @JvmField
    @Rule
    val mainCoroutineRule = MainCoroutineRule()

    @Before
    fun setUp() {
        cut = SampleRemoteSourceImpl()
    }

    // No tests, as there's no logic in the Class Under Test yet

}