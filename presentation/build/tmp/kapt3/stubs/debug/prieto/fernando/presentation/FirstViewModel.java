package prieto.fernando.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH&R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lprieto/fernando/presentation/FirstViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "showSample", "Landroidx/lifecycle/LiveData;", "Lprieto/fernando/presentation/model/SampleUiModel;", "getShowSample", "()Landroidx/lifecycle/LiveData;", "getSample", "", "presentation_debug"})
public abstract class FirstViewModel extends androidx.lifecycle.ViewModel {
    
    public abstract void getSample();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<prieto.fernando.presentation.model.SampleUiModel> getShowSample();
    
    public FirstViewModel() {
        super();
    }
}