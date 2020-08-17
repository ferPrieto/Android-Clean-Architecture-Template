package prieto.fernando.presentation.mapper

import prieto.fernando.domain.model.SampleDomainModel
import prieto.fernando.presentation.model.SampleUiModel
import javax.inject.Inject

interface SampleDomainToUiModelMapper {
    fun toUiModel(sampleDomainModel: SampleDomainModel): SampleUiModel
}

class SampleDomainToUiModelMapperImpl @Inject constructor() :
    SampleDomainToUiModelMapper {
    override fun toUiModel(sampleDomainModel: SampleDomainModel): SampleUiModel =
        SampleUiModel(
            title = sampleDomainModel.title,
            amount = sampleDomainModel.amount
        )
}
