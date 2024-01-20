package lesson_12

const val KELVIN_COEFFICIENT = 273.15

class Weather3(
    _daytimeTemperature: Int,
    _eveningTemperature: Int,
    _isPrecipitation: Boolean,
) {
    val daytimeTemperature = (_daytimeTemperature - KELVIN_COEFFICIENT).toInt()
    val eveningTemperature = (_eveningTemperature - KELVIN_COEFFICIENT).toInt()
    val isPrecipitation = _isPrecipitation
    init {
        println("Погода:")
        println("Дневная температура: $daytimeTemperature")
        println("Вечерняя температура: $eveningTemperature")
        println("Наличие осадков: $isPrecipitation")
    }
}

fun main() {
    val dayWeather = Weather3(265, 260, true)
}
