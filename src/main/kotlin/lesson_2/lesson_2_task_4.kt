package lesson_2

const val BAFF = 0.2
fun main() {
    val cristalOre = 7
    val ironOre = 11

    val cristalOreAsBaff = cristalOre * BAFF
    val ironOreAsBaff = ironOre * BAFF

    println("$cristalOre(+ %.0f baff) cristal ore".format(cristalOreAsBaff))
    println("$ironOre(+ %.0f baff) iron ore".format(ironOreAsBaff))
}
