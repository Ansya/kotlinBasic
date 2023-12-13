package lesson_9

fun main() {
    println("Введите пять названий ингредиентов блюда в одной строке, разделив их запятой с пробелом:")
    val listOfIngredients = readln().split(", ")
    println("Вы ввели следующий список: ${listOfIngredients.sorted()}")
}
