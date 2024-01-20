package lesson_12

import kotlin.random.Random

const val KELVIN_COEFFICIENT2 = 273.15

class Weather4(
    _daytimeTemperature: Int,
    _eveningTemperature: Int,
    _isPrecipitation: Boolean,
) {
    val daytimeTemperature = (_daytimeTemperature - KELVIN_COEFFICIENT2).toInt()
    val eveningTemperature = (_eveningTemperature - KELVIN_COEFFICIENT2).toInt()
    val isPrecipitation = _isPrecipitation
    init {
        println("Погода:")
        println("Дневная температура: $daytimeTemperature")
        println("Вечерняя температура: $eveningTemperature")
        println("Наличие осадков: $isPrecipitation")
    }
}

fun main() {
    val temperatureRange = 248..275
    val weatherForMonth = mutableListOf<Weather4>()
    for (i in 0..30) {
        weatherForMonth.add(
            Weather4(temperatureRange.random(),
                     temperatureRange.random() - 5,
                     Random.nextBoolean())
        )
    }

    println()
    val daytimeTemperatures = weatherForMonth.map { it.daytimeTemperature }
    println("Средняя дневная температура за месяц: ${daytimeTemperatures.average().toInt()}")

    val eveningTemperatures = weatherForMonth.map { it.eveningTemperature }
    println("Средняя ночная температура за месяц: ${eveningTemperatures.average().toInt()}")

    val daysWithPrecipitations = weatherForMonth.count{ it.isPrecipitation == true }
    println("Количество дней с осадками: $daysWithPrecipitations")
}