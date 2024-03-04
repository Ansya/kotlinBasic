package lesson_22

import java.util.Timer
import kotlin.concurrent.schedule

data class MainScreenState(
    val data: String?,
    val isLoading: Boolean = false,
)

class MainScreenViewModel(
    var mainScreenState: MainScreenState,
) {
    fun loadData(newData: String?) {
        mainScreenState = mainScreenState.copy(isLoading = true)
        Timer().schedule(2000) {
            mainScreenState = mainScreenState.copy(data = newData, isLoading = false)
        }
    }

    fun currentState(): String {
        return if (mainScreenState.data == null && !mainScreenState.isLoading) "данные отсутствуют"
        else if (mainScreenState.isLoading) "загрузка данных"
        else "данные в наличии"
    }
}

fun main() {
    val viewModel = MainScreenViewModel(MainScreenState(null))
    println(viewModel.currentState())
    viewModel.loadData("Long long string to load...")
    println(viewModel.currentState())
    Thread.sleep(1000)
    println(viewModel.currentState())
    Thread.sleep(1000)
    println(viewModel.currentState())
}
