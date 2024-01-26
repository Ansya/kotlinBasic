package lesson_14

open class Cargo(
    val name: String,
    val speed: Int = 15,
    val crewMembersCapacity: Int = 20,
    val carryingCapacity: Int = 2500,
)

class Liner(
    name: String,
    speed: Int = 25,
    crewMembersCapacity: Int = 50,
    carryingCapacity: Int = 500,
    val passengerCapacity: Int = 200,
) : Cargo(name, speed, crewMembersCapacity, carryingCapacity)

class Icebreaker(
    name: String,
    speed: Int = 10,
    crewMembersCapacity: Int = 10,
    carryingCapacity: Int = 30,
    val isBreakIce: Boolean = true,
) : Cargo(name, speed, crewMembersCapacity, carryingCapacity)

fun main() {
    val liner1 = Liner("Константин Коротков", 26)
    val cargo1 = Cargo("Волгодон", 15)
    val icebreaker1 = Icebreaker("Ямал", 10)
}
