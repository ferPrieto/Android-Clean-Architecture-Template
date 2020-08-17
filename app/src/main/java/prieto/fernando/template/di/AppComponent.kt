package prieto.fernando.template.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import fernando.prieto.data_remote.di.DataRemoteModule
import prieto.fernando.core.di.FragmentBindingModule
import prieto.fernando.core.di.ViewModelBindingModule
import prieto.fernando.data.di.SampleRepositoryModule
import prieto.fernando.domain.di.DomainModule
import prieto.fernando.presentation.di.PresentationModule
import prieto.fernando.template.TemplateApp
import javax.inject.Singleton

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        MainActivityModule::class,
        PresentationModule::class,
        DomainModule::class,
        SampleRepositoryModule::class,
        ViewModelBindingModule::class,
        FragmentBindingModule::class,
        DataRemoteModule::class
    ]
)
@Singleton
interface AppComponent : AndroidInjector<TemplateApp>
