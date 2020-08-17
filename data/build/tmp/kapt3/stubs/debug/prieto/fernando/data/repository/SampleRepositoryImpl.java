package prieto.fernando.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lprieto/fernando/data/repository/SampleRepositoryImpl;", "Lprieto/fernando/domain/SampleRepository;", "sampleRemoteSource", "Lprieto/fernando/data/SampleRemoteSource;", "sampleDomainMapper", "Lprieto/fernando/data/mapper/SampleRepositoryToDomainModelMapper;", "(Lprieto/fernando/data/SampleRemoteSource;Lprieto/fernando/data/mapper/SampleRepositoryToDomainModelMapper;)V", "getSample", "Lkotlinx/coroutines/flow/Flow;", "Lprieto/fernando/domain/model/SampleDomainModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class SampleRepositoryImpl implements prieto.fernando.domain.SampleRepository {
    private final prieto.fernando.data.SampleRemoteSource sampleRemoteSource = null;
    private final prieto.fernando.data.mapper.SampleRepositoryToDomainModelMapper sampleDomainMapper = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSample(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<prieto.fernando.domain.model.SampleDomainModel>> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public SampleRepositoryImpl(@org.jetbrains.annotations.NotNull()
    prieto.fernando.data.SampleRemoteSource sampleRemoteSource, @org.jetbrains.annotations.NotNull()
    prieto.fernando.data.mapper.SampleRepositoryToDomainModelMapper sampleDomainMapper) {
        super();
    }
}