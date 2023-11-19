package lesson_1

fun main() {
    var seconds = 6480
    val hours: Int
    var minutes: Int

    minutes = seconds/60
    seconds %= 60
    hours = minutes/60
    minutes %= 60


    println("Time spent by Yuri Gagarin in space is %02d".format(hours)
            + ":%02d".format(minutes)
            + ":%02d".format(seconds))
}