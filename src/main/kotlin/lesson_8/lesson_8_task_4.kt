package lesson_8

import java.util.*

fun main() {
    val arrayOfIngredients = arrayOf("Молоко", "Яйца", "Масло растительное", "Мука", "Сахар", "Соль")
    println("Список ингредиентов для Блинчиков: ${Arrays.toString(arrayOfIngredients)}")

    println("Напишите ингредиент, который хотите заменить:")
    val ingredientToReplace = readln()
    val indexOfIngredientToReplace = arrayOfIngredients.indexOf(ingredientToReplace)

    if (indexOfIngredientToReplace < 0) {
        println("Такого ингредиента в рецепте нет")
    } else {
        println("Какой ингредиент хотите добавить?")
        val ingredientToAdd = readln()
        arrayOfIngredients[indexOfIngredientToReplace] = ingredientToAdd
        println("Готово! Вы сохранили следующий список: ${Arrays.toString(arrayOfIngredients)}")
    }
}
