package lesson_4

const val FAVORABLE_WEATHER_IS_SUNNY = true
const val FAVORABLE_AWNING_OPEN = true
const val FAVORABLE_AIR_HUMIDITY = 20
const val FAVORABLE_SEASONS = "summer,autumn,spring"

fun main() {
    val isWeatherSunny = true
    val awningOpen = true
    val airHumidity = 20
    val season = "winter"

    println(
        "Are the conditions now favorable for the growth of legumes? - " +
            "${(isWeatherSunny == FAVORABLE_WEATHER_IS_SUNNY) && (awningOpen == FAVORABLE_AWNING_OPEN) &&
                (airHumidity == FAVORABLE_AIR_HUMIDITY) && FAVORABLE_SEASONS.contains(season)}"
    )
}
