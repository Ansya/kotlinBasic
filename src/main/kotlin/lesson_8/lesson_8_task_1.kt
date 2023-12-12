package lesson_8

import java.util.Arrays

fun main() {
    val numberOfAdViews = intArrayOf(43, 56, 34, 45, 54, 78, 90)
    val numberOfAdViewsPerWeek = numberOfAdViews.sum()

    println("Number of ad for every day: ${numberOfAdViews.contentToString()}")
    println("Number of ad views per week $numberOfAdViewsPerWeek")
}
