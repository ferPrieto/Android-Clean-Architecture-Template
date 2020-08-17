package prieto.fernando.template.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Lprieto/fernando/template/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Lprieto/fernando/template/TemplateApp;", "app_debug"})
@javax.inject.Singleton()
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, prieto.fernando.template.di.AppModule.class, prieto.fernando.template.di.MainActivityModule.class, prieto.fernando.presentation.di.PresentationModule.class, prieto.fernando.domain.di.DomainModule.class, prieto.fernando.data.di.SampleRepositoryModule.class, prieto.fernando.core.di.ViewModelBindingModule.class, prieto.fernando.core.di.FragmentBindingModule.class, fernando.prieto.data_remote.di.DataRemoteModule.class})
public abstract interface AppComponent extends dagger.android.AndroidInjector<prieto.fernando.template.TemplateApp> {
}