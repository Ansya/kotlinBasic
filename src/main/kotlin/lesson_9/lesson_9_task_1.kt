package lesson_9

fun main() {
    val listOfIngredients = listOf("Молоко", "Яйца", "Масло растительное", "Мука", "Сахар", "Соль")
    println("Список ингредиентов для Блинчиков:")
    for (ingredient in listOfIngredients) {
        println("${listOfIngredients.indexOf(ingredient) + 1}) $ingredient")
    }
}
