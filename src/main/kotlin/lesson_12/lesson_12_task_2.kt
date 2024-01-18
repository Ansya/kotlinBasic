package lesson_12

class Weather1(
    val daytimeTemperature: Int,
    val eveningTemperature: Int,
    val isPrecipitation: Boolean,
) {
    fun printWeather() {
        println("Дневная температура: $daytimeTemperature")
        println("Вечерняя температура: $eveningTemperature")
        println("Наличие осадков: $isPrecipitation")
    }
}

fun main() {
    val dayWeather = Weather1(-3, -9, true)
    println("Погода:")
    dayWeather.printWeather()
}