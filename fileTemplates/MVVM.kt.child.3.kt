package ${PACKAGE_NAME}

sealed interface ${NAME}Event {
    data class NavigateTo(val route: String) : ${NAME}Event
}