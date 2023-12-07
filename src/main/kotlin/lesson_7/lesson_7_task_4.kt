package lesson_7

fun main() {
    println("Please enter number of seconds for timer:")
    val secNumber = readln().toInt()

    for (i in secNumber downTo 1) {
        println("Seconds left: $i")
        Thread.sleep(1000)
    }

    println("Time is over.")
}
