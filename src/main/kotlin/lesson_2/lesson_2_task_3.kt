package lesson_2

const val CONVERSION_RATIO = 60
fun main() {
    val trainDepartureTimeHours = 9
    val trainDepartureTimeMinutes = 39
    val trainTravelTimeInMinutes = 457

    println("Train departure time is %02d:%02d".format(trainDepartureTimeHours, trainDepartureTimeMinutes))
    println("Train will be in travel $trainTravelTimeInMinutes minutes")

    val trainArrivalTimeInMinutes = (trainTravelTimeInMinutes + trainDepartureTimeMinutes) % CONVERSION_RATIO
    val trainArrivalTimeInHours = trainDepartureTimeHours +
            (trainTravelTimeInMinutes + trainDepartureTimeMinutes) / CONVERSION_RATIO

    println("Train arrival time is %02d:%02d".format(trainArrivalTimeInHours, trainArrivalTimeInMinutes))
}
