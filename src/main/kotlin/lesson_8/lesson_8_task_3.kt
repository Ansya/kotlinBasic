package lesson_8

fun main() {
    val arrayOfIngredients: Array<String> = arrayOf("Молоко", "Яйца", "Масло растительное", "Мука", "Сахар", "Соль")

    println("Напишите ингредиент, который хотите найти:")
    val ingredientToFound = readln()

    if (arrayOfIngredients.indexOf(ingredientToFound) < 0) {
        println("Такого ингредиента в рецепте нет")
    } else {
        println("Ингредиент [$ingredientToFound] в рецепте есть")
    }
}
