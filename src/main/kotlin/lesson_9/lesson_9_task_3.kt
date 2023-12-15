package lesson_9

fun main() {
    val listOfIngredientAmount = listOf(2, 50, 15)

    println("Сколько порций омлета вы собираетесь приготовить?")
    val numberOfPortions = readln().toInt()

    val listOfIngredientsNeeded = listOfIngredientAmount.map {
        it * numberOfPortions
    }
    println("На $numberOfPortions порций вам понадобится:\n" +
            "Яиц - ${listOfIngredientsNeeded[0]}, " +
            "молока - ${listOfIngredientsNeeded[1]}, " +
            "сливочного масла - ${listOfIngredientsNeeded[2]}.")
}
