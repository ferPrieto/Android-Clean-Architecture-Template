package prieto.fernando.data.mapper

import prieto.fernando.data.model.SampleRepositoryModel
import prieto.fernando.domain.model.SampleDomainModel
import javax.inject.Inject

interface SampleRepositoryToDomainModelMapper {
    fun toDomainModel(sampleRepositoryModel: SampleRepositoryModel): SampleDomainModel
}

class SampleRepositoryToDomainModelMapperImpl @Inject constructor() :
    SampleRepositoryToDomainModelMapper {
    override fun toDomainModel(sampleRepositoryModel: SampleRepositoryModel) =
        SampleDomainModel(
            title = sampleRepositoryModel.title,
            amount = transformAmountInteger(sampleRepositoryModel.amount)
        )

    private fun transformAmountInteger(amount: String) = try {
        amount.toInt()
    } catch (exception: Exception) {
        throw UnsupportedOperationException("Amount not transformable $amount")
    }
}
