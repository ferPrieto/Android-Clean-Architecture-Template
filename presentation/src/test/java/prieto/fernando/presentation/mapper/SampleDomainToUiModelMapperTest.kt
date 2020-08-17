package prieto.fernando.presentation.mapper

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import prieto.fernando.domain.model.SampleDomainModel
import prieto.fernando.presentation.model.SampleUiModel
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class SampleDomainToUiModelMapperTest(
    private val givenSample: SampleDomainModel,
    private val expected: SampleUiModel
) {
    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): Collection<Array<Any>> {
            return listOf(
                arrayOf(
                    SampleDomainModel(
                        "text",
                        1
                    ), SampleUiModel(
                        "text",
                        1
                    )
                ),
                arrayOf(
                    SampleDomainModel(
                        "Some Title",
                        199
                    ), SampleUiModel(
                        "Some Title",
                        199
                    )
                ),
                arrayOf(
                    SampleDomainModel(
                        "Some other Title",
                        -1
                    ), SampleUiModel(
                        "Some other Title",
                        -1
                    )
                )
            )
        }
    }

    private lateinit var cut: SampleDomainToUiModelMapperImpl

    @Before
    fun setUp() {
        cut = SampleDomainToUiModelMapperImpl()
    }

    @Test
    fun `Given SampleDomainModel when toUiModel then returns expected result`() {
        // When
        val actualValue = cut.toUiModel(givenSample)

        // Then
        assertEquals(expected, actualValue)
    }
}
