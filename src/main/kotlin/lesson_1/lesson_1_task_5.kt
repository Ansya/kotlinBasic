package lesson_1

const val secondsInMinute = 60
const val minutesInHour = 60

fun main() {
    var seconds = 6480
    val hours: Int
    var minutes: Int

    minutes = seconds / secondsInMinute
    seconds %= secondsInMinute
    hours = minutes / minutesInHour
    minutes %= minutesInHour


    println("Time spent by Yuri Gagarin in space is %02d:%02d:%02d".format(hours, minutes, seconds))
}