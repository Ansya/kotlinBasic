package lesson_4

const val WEIGHT_MIN = 35
const val WEIGHT_MAX = 100
const val VOLUME_MIN = 100
fun main() {
    var cargoWeight = 20
    var cargoVolume = 80

    println(
        "A cargo with a weight of $cargoWeight kg and a volume of $cargoVolume liters " +
                "corresponds to the 'Average' category: " +
                "${(cargoWeight >= WEIGHT_MIN) && (cargoWeight <= WEIGHT_MAX) && (cargoVolume <= VOLUME_MIN)}"
    )

    cargoWeight = 50
    cargoVolume = 100
    println(
        "A cargo with a weight of $cargoWeight kg and a volume of $cargoVolume liters " +
                "corresponds to the 'Average' category: " +
                "${(cargoWeight >= WEIGHT_MIN) && (cargoWeight <= WEIGHT_MAX) && (cargoVolume <= VOLUME_MIN)}"
    )

}
