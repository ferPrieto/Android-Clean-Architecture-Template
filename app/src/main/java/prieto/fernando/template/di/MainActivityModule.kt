package prieto.fernando.template.di

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.multibindings.IntoMap
import prieto.fernando.core.di.FragmentKey
import prieto.fernando.core.di.ViewModelKey
import prieto.fernando.presentation.FirstViewModel
import prieto.fernando.presentation.FirstViewModelImpl
import prieto.fernando.template.ui.FirstFragment
import prieto.fernando.template.ui.MainActivity

@Module
@InstallIn(ApplicationComponent::class)
internal abstract class MainActivityModule {
    @ActivityScope
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity

    @Binds
    @IntoMap
    @FragmentKey(FirstFragment::class)
    abstract fun bindFirstFragment(firstFragment: FirstFragment): Fragment

    @Binds
    @IntoMap
    @ViewModelKey(FirstViewModel::class)
    abstract fun bindFirstViewModelImpl(viewModel: FirstViewModelImpl): ViewModel
}
