package lesson_8

fun main() {
    val numberOfAdViews = intArrayOf(43, 56, 34, 45, 54, 78, 90)
    var numberOfAdViewsPerWeek = 0

    for (adViews in numberOfAdViews) {
        numberOfAdViewsPerWeek += adViews
    }
    println("Number of ad views per week $numberOfAdViewsPerWeek")
}
