package fernando.prieto.data_remote.di

import dagger.Module
import dagger.Provides
import fernando.prieto.data_remote.data.SampleRemoteSourceImpl
import prieto.fernando.data.SampleRemoteSource
import javax.inject.Singleton

@Module
class DataRemoteModule {
    @Singleton
    @Provides
    fun provideSampleRemoteSource(): SampleRemoteSource = SampleRemoteSourceImpl()
}