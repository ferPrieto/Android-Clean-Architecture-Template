package prieto.fernando.presentation;

import java.lang.System;

@kotlinx.coroutines.FlowPreview()
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\tH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013\u00a8\u0006\u0019"}, d2 = {"Lprieto/fernando/presentation/FirstViewModelImpl;", "Lprieto/fernando/presentation/FirstViewModel;", "getSampleUseCase", "Lprieto/fernando/domain/usecase/GetSampleUseCase;", "sampleDomainToUiModelMapper", "Lprieto/fernando/presentation/mapper/SampleDomainToUiModelMapper;", "(Lprieto/fernando/domain/usecase/GetSampleUseCase;Lprieto/fernando/presentation/mapper/SampleDomainToUiModelMapper;)V", "_headerError", "Landroidx/lifecycle/MediatorLiveData;", "", "_loadingHeader", "", "_showSample", "Lprieto/fernando/presentation/model/SampleUiModel;", "errorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "headerError", "Landroidx/lifecycle/LiveData;", "getHeaderError", "()Landroidx/lifecycle/LiveData;", "loadingHeader", "getLoadingHeader", "showSample", "getShowSample", "getSample", "presentation_debug"})
public final class FirstViewModelImpl extends prieto.fernando.presentation.FirstViewModel {
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> _loadingHeader = null;
    private final androidx.lifecycle.MediatorLiveData<prieto.fernando.presentation.model.SampleUiModel> _showSample = null;
    private final androidx.lifecycle.MediatorLiveData<kotlin.Unit> _headerError = null;
    private final kotlinx.coroutines.CoroutineExceptionHandler errorHandler = null;
    private final prieto.fernando.domain.usecase.GetSampleUseCase getSampleUseCase = null;
    private final prieto.fernando.presentation.mapper.SampleDomainToUiModelMapper sampleDomainToUiModelMapper = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> getLoadingHeader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<prieto.fernando.presentation.model.SampleUiModel> getShowSample() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<kotlin.Unit> getHeaderError() {
        return null;
    }
    
    @java.lang.Override()
    public void getSample() {
    }
    
    @javax.inject.Inject()
    public FirstViewModelImpl(@org.jetbrains.annotations.NotNull()
    prieto.fernando.domain.usecase.GetSampleUseCase getSampleUseCase, @org.jetbrains.annotations.NotNull()
    prieto.fernando.presentation.mapper.SampleDomainToUiModelMapper sampleDomainToUiModelMapper) {
        super();
    }
}