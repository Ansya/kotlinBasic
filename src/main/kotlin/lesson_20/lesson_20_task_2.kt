package lesson_20

class Gamer(
    val name: String,
    var curretHealthLevel: Int,
    val maxHealthLevel: Int,
) {
    fun getGamerInfo(): String = "Игрок \'$name\' - здоровье $curretHealthLevel/$maxHealthLevel"
}

fun main() {
    val healingPotion: (Gamer) -> Unit
    healingPotion = {
        println("Игрок ${it.name} вылечился на ${it.maxHealthLevel - it.curretHealthLevel} пойнтов.")
        it.curretHealthLevel = it.maxHealthLevel
    }

    val gamer1 = Gamer("Коля", 12, 20)
    println(gamer1.getGamerInfo())
    healingPotion(gamer1)
    println(gamer1.getGamerInfo())
}
