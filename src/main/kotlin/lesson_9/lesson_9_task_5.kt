package lesson_9

import java.util.*

fun main() {
    println("Введите пять названий ингредиентов блюда, каждое в новой строке:")
    val listOfIngredients = (List(5) { readln() }).toSortedSet()

    println("Вы ввели следующий список:")
    listOfIngredients.forEachIndexed { index, ingredient ->
        if (index == 0) {
            print(ingredient.replaceFirstChar {
                if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
            })
        } else {
            print(", $ingredient")
        }
    }
}
