package prieto.fernando.data.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lprieto/fernando/data/mapper/SampleRepositoryToDomainModelMapper;", "", "toDomainModel", "Lprieto/fernando/domain/model/SampleDomainModel;", "sampleRepositoryModel", "Lprieto/fernando/data/model/SampleRepositoryModel;", "data_debug"})
public abstract interface SampleRepositoryToDomainModelMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract prieto.fernando.domain.model.SampleDomainModel toDomainModel(@org.jetbrains.annotations.NotNull()
    prieto.fernando.data.model.SampleRepositoryModel sampleRepositoryModel);
}