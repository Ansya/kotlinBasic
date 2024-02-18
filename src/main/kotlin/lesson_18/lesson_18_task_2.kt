package lesson_18

open class Die {
    protected open val numberOfSides = 0
    open fun rollTheDie() = ""
}

class FourSidesDie : Die() {
    override val numberOfSides = 4

    override fun rollTheDie(): String {
        val side = (1..numberOfSides).random()
        return "4-х гранный кубик брошен и выпало: $side"
    }
}

class SixSidesDie : Die() {
    override val numberOfSides = 6

    override fun rollTheDie(): String {
        val side = (1..numberOfSides).random()
        return "6-и гранный кубик брошен и выпало: $side"
    }
}

class EightSidesDie : Die() {
    override val numberOfSides = 8

    override fun rollTheDie(): String {
        val side = (1..numberOfSides).random()
        return "8-и гранный кубик брошен и выпало: $side"
    }
}

fun main() {
    val dies :List<Die> = listOf(FourSidesDie(), SixSidesDie(), EightSidesDie())
    showAllDieRolls(dies)
}

fun showAllDieRolls(dies :List<Die>) {
    dies.forEach {
        println(it.rollTheDie())
    }
}
