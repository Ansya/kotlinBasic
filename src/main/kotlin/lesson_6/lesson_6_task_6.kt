package lesson_6

fun main() {
    println("Please enter number of seconds for timer:")
    val secNumber = readln().toInt()

    Thread.sleep((1000 * secNumber).toLong())
    println("\n$secNumber seconds have passed.")
}
