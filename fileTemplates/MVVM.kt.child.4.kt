package ${PACKAGE_NAME}.navigation

import androidx.navigation3.EntryProviderScope
import androidx.navigation3.entry
import ${PACKAGE_NAME}.${NAME}Screen
import ${PACKAGE_NAME}.api.${NAME}Key // Assuming your Key is in an 'api' sub-package

fun EntryProviderScope.provide${NAME}Entry() = entry<${NAME}Key> {
    ${NAME}Screen()
}