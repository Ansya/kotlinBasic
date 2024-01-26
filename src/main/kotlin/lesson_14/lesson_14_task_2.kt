package lesson_14

open class Cargo1(
    val name: String,
    val speed: Int = 15,
    val crewMembersCapacity: Int = 20,
    val carryingCapacity: Int = 2500,
) {
    open fun printShipProperties() {
        println("--------------------------")
        println("$name имеет следующие характеристики:")
        println("Максимальная скорость, км/ч: $speed")
        println("Численность экипажа, чел: $crewMembersCapacity")
        println("Валовая вместимость (GT): $carryingCapacity")
    }

    open fun startLoading() {
        println("Активировать погрузочный кран и начать погрузку судна")
    }
}

class Liner1(
    name: String,
    speed: Int = 25,
    crewMembersCapacity: Int = 50,
    carryingCapacity: Int = 500,
    val passengerCapacity: Int = 200,
) : Cargo1(name, speed, crewMembersCapacity, carryingCapacity) {

    override fun printShipProperties() {
        super.printShipProperties()
        println("Пассажировместимость, чел: $passengerCapacity")
    }

    override fun startLoading() {
        println("Выдвинуть горизонтальный трап со шкафута и начать погрузку судна")
    }
}

class Icebreaker1(
    name: String,
    speed: Int = 10,
    crewMembersCapacity: Int = 10,
    carryingCapacity: Int = 30,
    val isBreakIce: Boolean = true,
) : Cargo1(name, speed, crewMembersCapacity, carryingCapacity) {

    override fun printShipProperties() {
        super.printShipProperties()
        println("Может колоть лёд: $isBreakIce")
    }

    override fun startLoading() {
        println("Открыть ворота со стороны кормы и начать погрузку судна")
    }
}

fun main() {
    val liner1 = Liner1("Константин Коротков", 26, 55, 245)
    liner1.printShipProperties()
    liner1.startLoading()

    val cargo1 = Cargo1("Волгодон", 15, 2050, 25)
    cargo1.printShipProperties()
    cargo1.startLoading()

    val icebreaker1 = Icebreaker1("Ямал", 10, 20, 1400, true)
    icebreaker1.printShipProperties()
    icebreaker1.startLoading()
}
