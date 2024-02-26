package lesson_20

fun main() {
    val elementList = listOf("круг", "квадрат", "шестиугольник", "ромб")
    val pressElement: () -> String = { "Нажат элемент" }

    val elementsMap = elementList.map { it to pressElement() }
    elementsMap.forEachIndexed { i, pair ->
        if (((i + 1) % 2) == 0) {
            println("${pair.second} ${pair.first}")
        }
    }
}
