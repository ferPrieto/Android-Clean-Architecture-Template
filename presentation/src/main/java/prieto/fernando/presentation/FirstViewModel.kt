package prieto.fernando.presentation

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import prieto.fernando.presentation.model.SampleUiModel
import javax.inject.Inject

abstract class FirstViewModel @ViewModelInject constructor() : ViewModel() {
    abstract fun getSample()

    abstract val showSample: LiveData<SampleUiModel>
}

class FirstViewModelImpl @Inject constructor() : FirstViewModel() {
    private val _showSample = MediatorLiveData<SampleUiModel>()
    override val showSample: LiveData<SampleUiModel>
        get() = _showSample

    override fun getSample() {
        val sampleUiModel = SampleUiModel("Welcome to the Reduced Template (MVVM + DI)", 6)
        _showSample.postValue(sampleUiModel)
    }
}
