package ${PACKAGE_NAME}

import androidx.compose.runtime.*
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun ${NAME}Screen(
    viewModel: ${NAME}ViewModel = hiltViewModel()
) {
    val state by viewModel.uiState.collectAsState()

    // Your UI logic here
}