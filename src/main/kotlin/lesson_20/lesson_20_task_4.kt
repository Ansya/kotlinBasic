package lesson_20

fun main() {
    val elementList = listOf("круг", "квадрат", "шестиугольник", "ромб")
    val elementsMap = elementList.map {
        { println("Нажат элемент $it") }
    }
    elementsMap.forEachIndexed { i, pair ->
        if (((i + 1) % 2) == 0) pair()
    }
}
