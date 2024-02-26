package lesson_20

class Gamer1(
    val name :String,
    var hasKey :Boolean,
) {
    fun getInfo() :String = "У игрока \'$name\' ${if (hasKey) "есть ключ" else "нет ключа"}."
}

fun main() {
    val openDoor : (gamer :Gamer1) -> Unit = {
        if (it.hasKey) println("Игрок \'${it.name}\' открыл дверь.")
        else println("Для игрока '${it.name}' дверь заперта.")
    }

    val gamer1 = Gamer1("Саша", true)
    println(gamer1.getInfo())
    openDoor(gamer1)
    val gamer2 = Gamer1("Аня", false)
    println(gamer2.getInfo())
    openDoor(gamer2)
}
