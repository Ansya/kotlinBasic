package lesson_15

abstract class WeatherStationStats(val value :Int)
class Temperature(value: Int) :WeatherStationStats(value)
class PrecipitationAmount(value: Int) :WeatherStationStats(value)

class WeatherServer {
    fun sendStatsToServer(statsValue :WeatherStationStats) {
        if (statsValue is Temperature) {
            println("Отправляю на сервер данные: Температура = ${statsValue.value}")
        } else if (statsValue is PrecipitationAmount) {
            println("Отправляю на сервер данные: Количество осадков = ${statsValue.value}")
        }
    }
}

fun main() {
    val temperature = Temperature(12)
    val precipitationAmount = PrecipitationAmount(2)
    val server = WeatherServer()
    server.sendStatsToServer(temperature)
    server.sendStatsToServer(precipitationAmount)
}
