package prieto.fernando.presentation.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lprieto/fernando/presentation/di/PresentationModule;", "", "()V", "provideSampleDomainToUiModelMapper", "Lprieto/fernando/presentation/mapper/SampleDomainToUiModelMapper;", "presentation_debug"})
@dagger.Module()
public final class PresentationModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Reusable()
    @dagger.Provides()
    public final prieto.fernando.presentation.mapper.SampleDomainToUiModelMapper provideSampleDomainToUiModelMapper() {
        return null;
    }
    
    public PresentationModule() {
        super();
    }
}