package lesson_18

abstract class Dice {
    abstract val numberOfSides :Int
    abstract fun rollTheDie(): String
}

class FourSidesDie : Dice() {
    override val numberOfSides = 4

    override fun rollTheDie(): String {
        val side = (1..numberOfSides).random()
        return "4-х гранный кубик брошен и выпало: $side"
    }
}

class SixSidesDie : Dice() {
    override val numberOfSides = 6

    override fun rollTheDie(): String {
        val side = (1..numberOfSides).random()
        return "6-и гранный кубик брошен и выпало: $side"
    }
}

class EightSidesDie : Dice() {
    override val numberOfSides = 8

    override fun rollTheDie(): String {
        val side = (1..numberOfSides).random()
        return "8-и гранный кубик брошен и выпало: $side"
    }
}

fun main() {
    val dies :List<Dice> = listOf(FourSidesDie(), SixSidesDie(), EightSidesDie())
    showAllDieRolls(dies)
}

fun showAllDieRolls(dies :List<Dice>) {
    dies.forEach {
        println(it.rollTheDie())
    }
}
