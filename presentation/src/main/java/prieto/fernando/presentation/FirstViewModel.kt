package prieto.fernando.presentation

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import prieto.fernando.domain.usecase.GetSampleUseCase
import prieto.fernando.presentation.mapper.SampleDomainToUiModelMapper
import prieto.fernando.presentation.model.SampleUiModel
import javax.inject.Inject

private const val TAG = "FirstViewModel"

abstract class FirstViewModel @ViewModelInject constructor() : ViewModel() {
    abstract fun getSample()

    abstract val showSample: LiveData<SampleUiModel>
    abstract val loadingHeader: LiveData<Boolean>
    abstract val headerError: LiveData<Unit>
}

@ExperimentalCoroutinesApi
@FlowPreview
class FirstViewModelImpl @Inject constructor(
    private val getSampleUseCase: GetSampleUseCase,
    private val sampleDomainToUiModelMapper: SampleDomainToUiModelMapper
) : FirstViewModel() {
    private val _loadingHeader = MediatorLiveData<Boolean>()
    override val loadingHeader: LiveData<Boolean>
        get() = _loadingHeader

    private val _showSample = MediatorLiveData<SampleUiModel>()
    override val showSample: LiveData<SampleUiModel>
        get() = _showSample

    private val _headerError = MediatorLiveData<Unit>()
    override val headerError: LiveData<Unit>
        get() = _headerError

    private val errorHandler = CoroutineExceptionHandler { _, exception ->
        Log.e(TAG, exception.localizedMessage ?: "")
        _loadingHeader.value = false
    }

    override fun getSample() {
        viewModelScope.launch(errorHandler) {
            _loadingHeader.value = true
            getSampleUseCase.execute()
                .catch { throwable ->
                    Log.d(TAG, throwable.localizedMessage ?: "")
                    _headerError.postValue(Unit)
                    _loadingHeader.value = false
                }
                .collect { sampleDomainModel ->
                    val sampleUiModel =
                        sampleDomainToUiModelMapper.toUiModel(sampleDomainModel)
                    _showSample.postValue(sampleUiModel)
                    _loadingHeader.value = false
                }
        }
    }
}
