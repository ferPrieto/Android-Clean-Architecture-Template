package prieto.fernando.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u0005H&R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0007\u00a8\u0006\u000f"}, d2 = {"Lprieto/fernando/presentation/FirstViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "headerError", "Landroidx/lifecycle/LiveData;", "", "getHeaderError", "()Landroidx/lifecycle/LiveData;", "loadingHeader", "", "getLoadingHeader", "showSample", "Lprieto/fernando/presentation/model/SampleUiModel;", "getShowSample", "getSample", "presentation_debug"})
public abstract class FirstViewModel extends androidx.lifecycle.ViewModel {
    
    public abstract void getSample();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<prieto.fernando.presentation.model.SampleUiModel> getShowSample();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Boolean> getLoadingHeader();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<kotlin.Unit> getHeaderError();
    
    public FirstViewModel() {
        super();
    }
}