package lesson_9

fun main() {
    val listOfIngredientAmount = listOf(2, 50, 15)

    println("Сколько порций омлета вы собираетесь приготовить?")
    val numberOfPortions = readln().toInt()
    println("На $numberOfPortions порций вам понадобится: " +
            "Яиц - ${listOfIngredientAmount[0] * numberOfPortions}, " +
            "молока - ${listOfIngredientAmount[1] * numberOfPortions}, " +
            "сливочного масла - ${listOfIngredientAmount[2] * numberOfPortions}.")
}
