package prieto.fernando.data.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007\u00a8\u0006\n"}, d2 = {"Lprieto/fernando/data/di/SampleRepositoryModule;", "", "()V", "provideSampleRepository", "Lprieto/fernando/domain/SampleRepository;", "sampleRemoteSource", "Lprieto/fernando/data/SampleRemoteSource;", "sampleRepositoryMapper", "Lprieto/fernando/data/mapper/SampleRepositoryToDomainModelMapper;", "provideSampleRepositoryToDomainModelMapper", "data_debug"})
@dagger.Module()
public final class SampleRepositoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Reusable()
    @dagger.Provides()
    public final prieto.fernando.domain.SampleRepository provideSampleRepository(@org.jetbrains.annotations.NotNull()
    prieto.fernando.data.SampleRemoteSource sampleRemoteSource, @org.jetbrains.annotations.NotNull()
    prieto.fernando.data.mapper.SampleRepositoryToDomainModelMapper sampleRepositoryMapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Reusable()
    @dagger.Provides()
    public final prieto.fernando.data.mapper.SampleRepositoryToDomainModelMapper provideSampleRepositoryToDomainModelMapper() {
        return null;
    }
    
    public SampleRepositoryModule() {
        super();
    }
}