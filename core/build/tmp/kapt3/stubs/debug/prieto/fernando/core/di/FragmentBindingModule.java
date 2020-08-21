package prieto.fernando.core.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lprieto/fernando/core/di/FragmentBindingModule;", "", "()V", "bindFragmentFactory", "Landroidx/fragment/app/FragmentFactory;", "factory", "Lprieto/fernando/core/android/InjectingFragmentFactory;", "core_debug"})
@dagger.Module()
public abstract class FragmentBindingModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.fragment.app.FragmentFactory bindFragmentFactory(@org.jetbrains.annotations.NotNull()
    prieto.fernando.core.android.InjectingFragmentFactory factory);
    
    public FragmentBindingModule() {
        super();
    }
}