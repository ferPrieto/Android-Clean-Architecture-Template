package prieto.fernando.template

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import prieto.fernando.template.di.DaggerAppComponent

open class TemplateApp : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent.builder()
            .build()
}
