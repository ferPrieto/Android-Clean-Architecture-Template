package prieto.fernando.data.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u00a8\u0006\u000b"}, d2 = {"Lprieto/fernando/data/mapper/SampleRepositoryToDomainModelMapperImpl;", "Lprieto/fernando/data/mapper/SampleRepositoryToDomainModelMapper;", "()V", "toDomainModel", "Lprieto/fernando/domain/model/SampleDomainModel;", "sampleRepositoryModel", "Lprieto/fernando/data/model/SampleRepositoryModel;", "transformAmountInteger", "", "amount", "", "data_debug"})
public final class SampleRepositoryToDomainModelMapperImpl implements prieto.fernando.data.mapper.SampleRepositoryToDomainModelMapper {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public prieto.fernando.domain.model.SampleDomainModel toDomainModel(@org.jetbrains.annotations.NotNull()
    prieto.fernando.data.model.SampleRepositoryModel sampleRepositoryModel) {
        return null;
    }
    
    private final int transformAmountInteger(java.lang.String amount) {
        return 0;
    }
    
    @javax.inject.Inject()
    public SampleRepositoryToDomainModelMapperImpl() {
        super();
    }
}