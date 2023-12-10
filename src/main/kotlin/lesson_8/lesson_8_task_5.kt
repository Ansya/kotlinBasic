package lesson_8

fun main() {
    println("Введите ингредиенты рецепта, каждый на новой строке. Начните с количества ингредиентов:")
    val arrayOfIngredients = Array(readln().toInt()) { readln() }
    println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.contentToString()}")
}
