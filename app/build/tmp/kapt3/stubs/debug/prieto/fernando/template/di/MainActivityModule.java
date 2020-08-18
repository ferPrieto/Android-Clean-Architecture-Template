package prieto.fernando.template.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'\u00a8\u0006\r"}, d2 = {"Lprieto/fernando/template/di/MainActivityModule;", "", "()V", "bindFirstFragment", "Landroidx/fragment/app/Fragment;", "firstFragment", "Lprieto/fernando/template/ui/FirstFragment;", "bindFirstViewModelImpl", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lprieto/fernando/presentation/FirstViewModelImpl;", "bindMainActivity", "Lprieto/fernando/template/ui/MainActivity;", "app_debug"})
@dagger.Module()
public abstract class MainActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @ActivityScope()
    public abstract prieto.fernando.template.ui.MainActivity bindMainActivity();
    
    @org.jetbrains.annotations.NotNull()
    @prieto.fernando.core.di.FragmentKey(value = prieto.fernando.template.ui.FirstFragment.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.fragment.app.Fragment bindFirstFragment(@org.jetbrains.annotations.NotNull()
    prieto.fernando.template.ui.FirstFragment firstFragment);
    
    @org.jetbrains.annotations.NotNull()
    @prieto.fernando.core.di.ViewModelKey(value = prieto.fernando.presentation.FirstViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindFirstViewModelImpl(@org.jetbrains.annotations.NotNull()
    prieto.fernando.presentation.FirstViewModelImpl viewModel);
    
    public MainActivityModule() {
        super();
    }
}