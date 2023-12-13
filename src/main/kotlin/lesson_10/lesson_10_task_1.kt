package lesson_10

fun main() {
    fun diceTheRoll(): Int {
        val valueRange = 1..6
        return valueRange.random()
    }

    println("Игра в кости")
    val computerDiceRoll = diceTheRoll()
    println("Компьютер бросил: $computerDiceRoll")
    val humanDiceRoll = diceTheRoll()
    println("Человек бросил: $humanDiceRoll")

    if (computerDiceRoll > humanDiceRoll) println("Победила машина")
    else if (computerDiceRoll == humanDiceRoll) println("Ничья")
    else println("Победил человек")
}
