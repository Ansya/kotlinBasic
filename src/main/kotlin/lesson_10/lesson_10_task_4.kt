package lesson_10

import java.util.*

fun main() {
    println("ИГРА в КОСТИ")
    var numberOfHumanWins = 0

    do {
        if (playOneRound()) numberOfHumanWins++
        println("Хотите бросить кости еще раз? Введите Да или Нет.")
        val answer = readln().lowercase(Locale.getDefault())
    } while (answer == "да")

    println("Количества выигрышных партий человека: $numberOfHumanWins")
}

fun rollDice(): Int {
    val valueRange = 1..6
    return valueRange.random()
}

fun playOneRound(): Boolean {
    var isHumanWin = false
    val computerDiceRoll = rollDice()
    println("Компьютер бросил: $computerDiceRoll")
    val humanDiceRoll = rollDice()
    println("Человек бросил: $humanDiceRoll")

    if (computerDiceRoll > humanDiceRoll) {
        println("> Победила машина")
    } else if (computerDiceRoll == humanDiceRoll) {
        println("> Ничья")
    } else {
        println("> Победил человек")
        isHumanWin = true
    }
    return isHumanWin
}
