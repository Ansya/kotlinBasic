package lesson_1

const val ConversionRatio = 60

fun main() {
    var seconds = 6480
    val hours: Int
    var minutes: Int

    minutes = seconds / ConversionRatio
    seconds %= ConversionRatio
    hours = minutes / ConversionRatio
    minutes %= ConversionRatio


    println("Time spent by Yuri Gagarin in space is %02d:%02d:%02d".format(hours, minutes, seconds))
}