package lesson_1

const val CONVERSION_RATIO = 60

fun main() {
    var seconds = 6480
    val hours: Int
    var minutes: Int

    minutes = seconds / CONVERSION_RATIO
    seconds %= CONVERSION_RATIO
    hours = minutes / CONVERSION_RATIO
    minutes %= CONVERSION_RATIO


    println("Time spent by Yuri Gagarin in space is %02d:%02d:%02d".format(hours, minutes, seconds))
}