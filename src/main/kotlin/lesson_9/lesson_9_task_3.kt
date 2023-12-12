package lesson_9

fun main() {
    val listOfIngredients = listOf("Чечевица", "Лук", "Помидор", "Морковь", "Чеснок")
    // https://eda.ru/recepty/supy/sup-pjure-iz-chechevici-30588
    val listOfIngredientAmount = listOf(3.5, 0.5, 1.0, 0.5, 0.5)

    println("Сколько порций супа-пюре из чечевицы вы собираетесь приготовить?")
    val numberOfPortions = readln().toInt()
    println("На $numberOfPortions порций вам понадобится:")

    for (i in 0 until listOfIngredients.size) {
        println("${i + 1}) ${listOfIngredients[i]} - ${listOfIngredientAmount[i] * numberOfPortions}")
    }
}
