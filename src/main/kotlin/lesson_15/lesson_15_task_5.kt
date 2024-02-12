package lesson_15

interface Movement {
    fun move()
}

interface CargoCarriage {
    val cargoAmount: Int
    fun loadCargo(amount: Int)
    fun unloadCargo(amount: Int)
}

interface PassengerCarriage {
    var passengersAmount: Int
    fun boardPassenger(amount: Int)
    fun dropOffPassengers(amount: Int)
}

class Track(
    val name: String,
    override var cargoAmount: Int = 0,
    override var passengersAmount: Int = 0,
) : Movement, CargoCarriage, PassengerCarriage {
    override fun move() {
        println("Грузовая машина $name поехала и повезла $passengersAmount пассажиров и $cargoAmount тонн груза.")
    }

    override fun loadCargo(amount: Int) {
        if (cargoAmount + amount > 2) {
            println("Грузовая машина  $name может вместить всего 2 тонны груза, сейчас уже $cargoAmount тонн.")
        } else {
            cargoAmount += amount
            println("В грузовой машине $name теперь $cargoAmount тонн груза.")
        }
    }

    override fun unloadCargo(amount: Int) {
        if (amount > cargoAmount) {
            println("Не могу выыгрузить столько груза. В грузовой машине $name только $cargoAmount тонн.")
        } else {
            cargoAmount -= amount
            println("В грузовой машине $name теперь $cargoAmount тонн груза.")
        }
    }

    override fun boardPassenger(amount: Int) {
        if (passengersAmount + amount > 1) {
            println("Грузовая машина  $name может вместить всего 1 пассажира, сейчас уже $passengersAmount пассажиров.")
        } else {
            passengersAmount += amount
            println("В грузовой машине $name теперь $passengersAmount пассажиров.")
        }
    }

    override fun dropOffPassengers(amount: Int) {
        if (amount > passengersAmount) {
            println("Не могу высадить столько пассажиров. В грузовой машине $name только $passengersAmount пассажиров.")
        } else {
            passengersAmount -= amount
            println("В грузовой машине $name теперь $passengersAmount пассажиров.")
        }
    }
}

class Car(
    val name: String,
    override var passengersAmount: Int = 0,
) : Movement, PassengerCarriage {
    override fun move() {
        println("Автомобиль $name поехал и повез $passengersAmount пассажиров.")
    }

    override fun boardPassenger(amount: Int) {
        if (passengersAmount + amount > 3) {
            println("Автомобиль $name может вместить всего 3 пассажира, сейчас уже $passengersAmount пассажиров.")
        } else {
            passengersAmount += amount
            println("В автомобиле $name теперь $passengersAmount пассажиров.")
        }
    }

    override fun dropOffPassengers(amount: Int) {
        if (amount > passengersAmount) {
            println("Не могу высадить столько пассажиров. В автомобиле $name только $passengersAmount пассажиров.")
        } else {
            passengersAmount -= amount
            println("В автомобиле $name теперь $passengersAmount пассажиров.")
        }
    }
}

fun main() {
    val lada = Car("Lada")
    lada.boardPassenger(6)
    lada.boardPassenger(3)
    lada.move()
    lada.dropOffPassengers(3)

    val reno = Car("Reno")
    reno.boardPassenger(3)
    reno.move()
    reno.dropOffPassengers(6)
    reno.dropOffPassengers(3)

    val volvo = Track("volvo", cargoAmount = 1)
    volvo.loadCargo(2)
    volvo.unloadCargo(1)
    volvo.loadCargo(2)
    volvo.move()
    volvo.unloadCargo(2)
}
