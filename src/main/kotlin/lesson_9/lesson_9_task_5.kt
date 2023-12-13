package lesson_9

import java.util.*

fun main() {
    println("Введите пять названий ингредиентов блюда, каждое в новой строке:")
    val listOfIngredients = List(5) { readln() }.distinct().sorted()

    println("Вы ввели следующий список:")
    for (i in 0 until listOfIngredients.size) {
        if (i == 0) {
            print(listOfIngredients[i].replaceFirstChar {
                if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
            })
        } else {
            print(", ${listOfIngredients[i]}")
        }
    }
}
