package lesson_12

class Weather1(
    var daytimeTemperature: Int,
    var eveningTemperature: Int,
    var precipitation: Boolean,
) {
    fun printWeather() {
        println("Дневная температура: $daytimeTemperature")
        println("Вечерняя температура: $eveningTemperature")
        println("Наличие осадков: $precipitation")
    }
}

fun main() {
    val dayWeather = Weather1(-3, -9, true)
    println("Погода:")
    dayWeather.printWeather()
}