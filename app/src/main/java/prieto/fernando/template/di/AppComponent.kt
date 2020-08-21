package prieto.fernando.template.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import prieto.fernando.core.di.FragmentBindingModule
import prieto.fernando.core.di.ViewModelBindingModule
import prieto.fernando.template.TemplateApp
import javax.inject.Singleton

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        MainActivityModule::class,
        ViewModelBindingModule::class,
        FragmentBindingModule::class
    ]
)
@Singleton
interface AppComponent : AndroidInjector<TemplateApp>
