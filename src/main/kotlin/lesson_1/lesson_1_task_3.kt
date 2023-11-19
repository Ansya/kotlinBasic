package lesson_1

fun main() {
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7

    println(year)
    print("%02d".format(hour))
    print(":")
    print("%02d".format(minute))
    println()

    hour = 10
    minute = 55
    println("$hour:$minute")
}