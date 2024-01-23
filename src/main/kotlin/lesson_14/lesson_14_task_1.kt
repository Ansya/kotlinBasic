package lesson_14

open class Liner(
    val name :String,
    val speed :Int = 25,
    val crewMembersCapacity :Int = 40,
    val passengerCapacity :Int = 0,
) {
    fun numberOfCrewMembers() {
        println("$name: число членов команды $crewMembersCapacity")
    }
    fun maxSpeed() {
        println("$name: cаксимальная скорость $speed")
    }
    fun numberOfPassengeres() {
        println("$name: пассажировместиомость $passengerCapacity")
    }
}

class Cargo(
    name :String,
    speed :Int = 15,
    val carryingCapacity :Int = 30,
    crewMembersCapacity :Int = 20,
) : Liner(name, speed, crewMembersCapacity)

class Icebreaker(
    name :String,
    speed :Int = 10,
    val canBreakIce :Boolean = true,
    crewMembersCapacity :Int = 10,
) : Liner(name, speed, crewMembersCapacity)

fun main() {
    val liner1 = Liner("Константин Коротков", 26, 55, 245)
    val cargo1 = Cargo("Волгодон", 15, 2050, 25)
    val icebreaker1 = Icebreaker("Ямал", 10, true)
}
