package prieto.fernando.data.mapper

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import prieto.fernando.data.model.SampleRepositoryModel
import prieto.fernando.domain.model.SampleDomainModel
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class SampleRepositoryToDomainModelMapperImplTest(
    private val givenSample: SampleRepositoryModel,
    private val expected: SampleDomainModel
) {
    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): Collection<Array<Any>> {
            return listOf(
                arrayOf(
                    SampleRepositoryModel(
                        "some title",
                        "11"
                    ), SampleDomainModel(
                        "some title",
                        11
                    )
                ),
                arrayOf(
                    SampleRepositoryModel(
                        "aaaa",
                        "0"
                    ), SampleDomainModel(
                        "aaaa",
                        0
                    )
                ),
                arrayOf(
                    SampleRepositoryModel(
                        "aa112aa",
                        "-1"
                    ), SampleDomainModel(
                        "aa112aa",
                        -1
                    )
                )
            )
        }
    }

    private lateinit var cut: SampleRepositoryToDomainModelMapperImpl

    @Before
    fun setUp() {
        cut = SampleRepositoryToDomainModelMapperImpl()
    }

    @Test
    fun `Given givenSample when toDomainModel then returns expected result`() {
        // When
        val actualValue = cut.toDomainModel(givenSample)

        // Then
        assertEquals(expected, actualValue)
    }
}
