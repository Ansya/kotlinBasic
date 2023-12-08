package lesson_8

fun main() {
    val arrayOfIngredients: Array<String> = arrayOf("Молоко", "Яйца", "Масло растительное", "Мука", "Сахар", "Соль")

    println("Напишите ингредиент, который хотите найти:")
    val ingredientToFound = readln()
    var answerMessage = "Такого ингредиента в рецепте нет"

    for (ingredient in arrayOfIngredients) {
        if (ingredient == ingredientToFound) {
            answerMessage = "Ингредиент [$ingredient] в рецепте есть"
            break
        }
    }
    println(answerMessage)
}
