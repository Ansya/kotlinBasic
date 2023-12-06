package lesson_6

fun main() {
    println("Please enter number of seconds for timer:")
    var secNumber = readln().toInt()

    while (secNumber > 0) {
        println("Seconds left: ${secNumber--}")
        Thread.sleep(1000)
    }
    println("Time is over.")
}
