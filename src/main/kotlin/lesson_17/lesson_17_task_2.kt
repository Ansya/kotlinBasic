package lesson_17

class Ship(
    name: String,
    var averageSpeed: Int,
    var port: String,
) {
    var name = name
        set(value) {
            println("Имя корабля менять нельлзя!")
        }

    fun getInfo() {
        println("Корабль $name имеет порт приписки $port и среднюю скорость $averageSpeed миль/час")
    }
}

fun main() {
    val ship1 = Ship("Лютый", 35, "Южный")
    ship1.getInfo()
    ship1.name = "Радость"
    ship1.getInfo()
}
