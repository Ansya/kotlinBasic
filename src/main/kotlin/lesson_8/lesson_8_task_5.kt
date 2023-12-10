package lesson_8

fun main() {
    println("Введите количество ингредиентов в рецепте:")
    val numberOfIngredientsInRecipe = readln().toInt()
    val arrayOfIngredients = arrayOfNulls<String>(numberOfIngredientsInRecipe)

    for (i in 0 until numberOfIngredientsInRecipe) {
        println("Введите ингредиент ${i + 1}:")
        arrayOfIngredients[i] = readln()
    }
    println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.contentToString()}")
}
