package lesson_4

const val NUMBER_OF_CREW_MEMBERS_MIN = 55
const val NUMBER_OF_CREW_MEMBERS_MAX = 70
const val BOXES_PROVISIONS_NUMBER = 50

fun main() {
    println("Enter, please, if ship damaged or not (true, false):")
    val isShipDamaged = readln().toBoolean()
    println("Send a number of crew members:")
    val numberOfCrewMembers = readln().toInt()
    println("Send a number of provision boxes:")
    val boxesProvisionNumber = readln().toInt()
    println("If the weather good? (true, false):")
    val isWeatherConditionsGood = readln().toBoolean()

    println(
        "The ship can set sail: " +
            "${
                (
                    (
                        !isShipDamaged &&
                            (numberOfCrewMembers in NUMBER_OF_CREW_MEMBERS_MIN..NUMBER_OF_CREW_MEMBERS_MAX)
                        ) || (
                        isShipDamaged &&
                            (numberOfCrewMembers == NUMBER_OF_CREW_MEMBERS_MAX) &&
                            isWeatherConditionsGood
                        )
                    ) && (boxesProvisionNumber > BOXES_PROVISIONS_NUMBER)
            }"
    )
}
