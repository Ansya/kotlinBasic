package lesson_2

const val BAFF = 20.0f
const val ONE_HUNDRED_PERCENT = 100.0f
fun main() {
    val cristalOre = 7
    val ironOre = 11

    val cristalOreAsBaff = cristalOre * (BAFF / ONE_HUNDRED_PERCENT)
    val ironOreAsBaff = ironOre * (BAFF / ONE_HUNDRED_PERCENT)

    println("$cristalOre(+ %.0f baff) cristal ore".format(cristalOreAsBaff))
    println("$ironOre(+ %.0f baff) iron ore".format(ironOreAsBaff))
}
