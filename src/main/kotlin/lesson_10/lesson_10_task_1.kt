package lesson_10

fun main() {
    println("Игра в кости")
    val computerDiceRoll = rollDice()
    println("Компьютер бросил: $computerDiceRoll")
    val humanDiceRoll = rollDice()
    println("Человек бросил: $humanDiceRoll")

    if (computerDiceRoll > humanDiceRoll) println("Победила машина")
    else if (computerDiceRoll == humanDiceRoll) println("Ничья")
    else println("Победил человек")
}

fun rollDice(): Int {
    val valueRange = 1..6
    return valueRange.random()
}
