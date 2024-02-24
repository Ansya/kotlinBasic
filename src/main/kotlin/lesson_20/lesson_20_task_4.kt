package lesson_20

fun main() {
    val elementList = listOf("круг", "квадрат", "шестиугольник", "ромб")
    val pressElement: (String) -> Unit = {
        println("Нажат элемент \'$it\'")
    }

    val elementsMap = elementList.map { it to pressElement(it) }
    elementsMap.forEach{
        it.second
    }
}
