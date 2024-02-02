package lesson_14

abstract class Globe(
    val name: String,
    val isWithAtmosphere: Boolean,
    val isSuitableForLand: Boolean,
)

class Satellite(
    name: String,
    isWithAtmosphere: Boolean,
    isSuitableForLand: Boolean,
) : Globe(name, isWithAtmosphere, isSuitableForLand)

class Planet(
    name: String,
    isWithAtmosphere: Boolean,
    isSuitableForLand: Boolean,
    val satellites: List<Satellite>,
) : Globe(name, isWithAtmosphere, isSuitableForLand)

fun main() {
    val satellite1 = Satellite("Деймос", isWithAtmosphere = false, isSuitableForLand = false)
    val satellite2 = Satellite("Фобос", isWithAtmosphere = false, isSuitableForLand = false)
    val planet = Planet("Марс", isWithAtmosphere = true, isSuitableForLand = true, listOf(satellite1, satellite2))

    println("Планета ${planet.name} имеет следующие спутники:")
    planet.satellites.forEach {
        println(it.name)
    }
}
