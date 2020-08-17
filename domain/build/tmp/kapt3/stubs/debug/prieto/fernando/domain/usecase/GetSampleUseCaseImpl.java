package prieto.fernando.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lprieto/fernando/domain/usecase/GetSampleUseCaseImpl;", "Lprieto/fernando/domain/usecase/GetSampleUseCase;", "sampleRepository", "Lprieto/fernando/domain/SampleRepository;", "(Lprieto/fernando/domain/SampleRepository;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lprieto/fernando/domain/model/SampleDomainModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public final class GetSampleUseCaseImpl implements prieto.fernando.domain.usecase.GetSampleUseCase {
    private final prieto.fernando.domain.SampleRepository sampleRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<prieto.fernando.domain.model.SampleDomainModel>> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public GetSampleUseCaseImpl(@org.jetbrains.annotations.NotNull()
    prieto.fernando.domain.SampleRepository sampleRepository) {
        super();
    }
}