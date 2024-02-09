package lesson_16

import kotlin.random.Random

class Dice {
    private val number = Random.nextInt(1, 6)

    fun getDiceNumber() {
        println("На кубике выпало число $number")
    }
}

fun main() {
    val dice1 = Dice()
    dice1.getDiceNumber()
}
