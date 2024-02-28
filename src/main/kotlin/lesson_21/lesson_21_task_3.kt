package lesson_21

class Gamer1(
    val name: String,
    var curretHealthLevel: Int,
    val maxHealthLevel: Int,
) {
    fun getGamerInfo(): String = "Игрок \'$name\' - здоровье $curretHealthLevel/$maxHealthLevel"
}

fun Gamer1.isHealthy() :Boolean = (curretHealthLevel == maxHealthLevel)

fun main() {
    val gamer1 = Gamer1("Коля", 12, 20)
    println(gamer1.getGamerInfo())
    println("Здоровье игрока ${if (!gamer1.isHealthy()) "не" else ""} равно максимальному здоровью")

    val gamer2 = Gamer1("Коля", 30, 30)
    println(gamer2.getGamerInfo())
    println("Здоровье игрока ${if (!gamer2.isHealthy()) "не " else ""}равно максимальному здоровью")
}
