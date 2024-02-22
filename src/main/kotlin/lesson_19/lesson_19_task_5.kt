package lesson_19

enum class Gender(
    val shot: String,
    val description: String,
) {
    MAN(shot = "м", description = "мужской"),
    WOMAN(shot = "ж", description = "женский"),
    UNDEFINDED(shot = "-", description = "неопределён")
}

class Human(
    val name: String,
    val gender: Gender,
) {
    fun getHumanInfo(): String = "$name - ${gender.description}"
}

fun main() {
    println("Давайте заполним картотеку.")
    val humans = mutableListOf<Human>()
    for (i in 1..5) {
        println("Введите имя и пол одной буквой м или ж через пробел:")
        val value = readln().split(" ")
        when (value[1]) {
            Gender.WOMAN.shot -> {
                humans.add(Human(name = value[0], Gender.WOMAN))
            }

            Gender.MAN.shot -> {
                humans.add(Human(name = value[0], Gender.MAN))
            }

            else -> {
                humans.add(Human(name = value[0], Gender.UNDEFINDED))
            }
        }
    }
    println()
    println("Каталог содержит следующие значения:")
    humans.forEach {
        println(it.getHumanInfo())
    }
}
