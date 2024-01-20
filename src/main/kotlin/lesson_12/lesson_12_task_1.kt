package lesson_12

class Weather {
    var daytimeTemperature: Int = 0
    var eveningTemperature: Int = 0
    var isPrecipitation: Boolean = false

    fun printWeather() {
        println("Дневная температура: $daytimeTemperature")
        println("Вечерняя температура: $eveningTemperature")
        println("Наличие осадков: $isPrecipitation")
    }
}

fun main() {
    val firstDayWeather = Weather()
    firstDayWeather.daytimeTemperature = -5
    firstDayWeather.eveningTemperature = -13
    firstDayWeather.isPrecipitation = true
    println("День 1, погода:")
    firstDayWeather.printWeather()

    val secondDayWeather = Weather()
    secondDayWeather.daytimeTemperature = -1
    secondDayWeather.eveningTemperature = -4
    secondDayWeather.isPrecipitation = false
    println("День 2, погода:")
    secondDayWeather.printWeather()
}