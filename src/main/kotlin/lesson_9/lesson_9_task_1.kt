package lesson_9

fun main() {
    val listOfIngredients = listOf("Молоко", "Яйца", "Масло растительное", "Мука", "Сахар", "Соль")
    println("Список ингредиентов для Блинчиков:")

    for (i in 0 until listOfIngredients.size) {
        println("${i + 1}) ${listOfIngredients[i]}")
    }
}
