package lesson_4

const val FAVORABLE_WEATHER = "sunny"
const val FAVORABLE_AWNING_OPEN = true
const val FAVORABLE_AIR_HUMIDITY = 20
const val FAVORABLE_SEASON = "summer"

fun main() {
    val weather = "sunny"
    val awningOpen = true
    val airHumidity = 20
    val season = "winter"

    println(
        "Are the conditions now favorable for the growth of legumes? - " +
            "${(weather == FAVORABLE_WEATHER) && (awningOpen == FAVORABLE_AWNING_OPEN) &&
                (airHumidity == FAVORABLE_AIR_HUMIDITY) && (season == FAVORABLE_SEASON)}"
    )
}
