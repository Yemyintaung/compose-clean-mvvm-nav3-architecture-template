package ${PACKAGE_NAME}

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class ${NAME}ViewModel @Inject constructor() : ViewModel() {
    private val _uiState = MutableStateFlow(${NAME}State())
    val uiState = _uiState.asStateFlow()

    fun onAction(action: ${NAME}Action) {
        when(action) {
            is ${NAME}Action.Initialize -> { /* TODO */ }
        }
    }
}