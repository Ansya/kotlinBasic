package lesson_9

fun main() {
    fun String.toBoolean() = equals("ДА", ignoreCase = true)

    val listOfIngredients = mutableListOf("Молоко", "Мука", "Соль")
    println("В рецепте есть базовые ингредиенты: $listOfIngredients")

    println("Желаете добавить еще?")
    if (readln().toBoolean()) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()
        listOfIngredients.add(newIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients")
    }
}
