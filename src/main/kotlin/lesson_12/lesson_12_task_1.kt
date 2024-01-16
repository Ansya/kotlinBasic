package lesson_12

class Weather() {
    var daytimeTemperature: Int = 0
    var eveningTemperature: Int = 0
    var precipitation: Boolean = false

    fun printWeather() {
        println("Дневная температура: $daytimeTemperature")
        println("Вечерняя температура: $eveningTemperature")
        println("Наличие осадков: $precipitation")
    }
}

fun main() {
    val firstDayWeather = Weather()
    firstDayWeather.daytimeTemperature = -5
    firstDayWeather.eveningTemperature = -13
    firstDayWeather.precipitation = true
    println("День 1, погода:")
    firstDayWeather.printWeather()

    val secondDayWeather = Weather()
    secondDayWeather.daytimeTemperature = -1
    secondDayWeather.eveningTemperature = -4
    secondDayWeather.precipitation = false
    println("День 2, погода:")
    secondDayWeather.printWeather()
}