package lesson_17

class Package(
    val trackingNumber: Int,
    location :String,
) {
    var moveCount = 1
    var location = location
        set(value) {
            field = value
            ++moveCount
        }
}

fun main() {
    val package1 = Package(123, "Сортировочный")
    println("${package1.moveCount} Посылка №${package1.trackingNumber} в \"${package1.location}\"")
    package1.location = "Москва"
    println("${package1.moveCount} Посылка №${package1.trackingNumber} в \"${package1.location}\"")
    package1.location = "Нижний Новгород"
    println("${package1.moveCount} Посылка №${package1.trackingNumber} в \"${package1.location}\"")
}
