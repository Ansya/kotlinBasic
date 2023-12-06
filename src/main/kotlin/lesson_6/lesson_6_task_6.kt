package lesson_6

fun main() {
    println("Please enter number of seconds for timer:")
    var secNumber = readln().toInt()
    val endMessage = "\n$secNumber seconds have passed."

    while (secNumber-- > 0) {
        Thread.sleep(1000)
        print(".")
    }
    println(endMessage)
}
