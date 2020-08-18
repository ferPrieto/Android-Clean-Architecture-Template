package prieto.fernando.template.ui

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.AndroidEntryPoint
import prieto.fernando.presentation.FirstViewModel
import prieto.fernando.template.R
import javax.inject.Inject
import kotlinx.android.synthetic.main.fragment_first.header_title as headerTitle
import kotlinx.android.synthetic.main.fragment_first.progress_bar_header as progressBarHeader

@AndroidEntryPoint
class FirstFragment @Inject constructor(
    viewModelFactory: ViewModelProvider.Factory
) : Fragment(R.layout.fragment_first) {
    private val viewModel by viewModels<FirstViewModel> { viewModelFactory }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViewModelObservers()
    }

    private fun setViewModelObservers() {
        viewModel.loadingHeader.observe(this, Observer { showLoading ->
            progressBarHeader.isVisible = showLoading
        })
        viewModel.showSample.observe(this, Observer { sample ->
            headerTitle.text = sample.title
        })
    }

    override fun onResume() {
        super.onResume()
        viewModel.getSample()
    }
}