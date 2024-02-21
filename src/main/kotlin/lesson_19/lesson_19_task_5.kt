package lesson_19

enum class Gender(val shot :String) {
    MAN("м") {
        override fun getGenderDescription(): String = "мужской"
    },
    WOMAN("ж") {
        override fun getGenderDescription(): String = "женский"
    };

    abstract fun getGenderDescription(): String
}

class Human(
    val name: String,
    val gender: Gender,
) {
    fun getHumanInfo(): String = "$name - ${gender.getGenderDescription()}"
}

fun main() {
    println("Давайте заполним картотеку.")
    val humans = mutableListOf <Human>()
    for(i in 1..5) {
        println("Введите имя и пол одной буквой м или ж через пробел:")
        val value = readln().split(" ")
        when (value[1]) {
            Gender.WOMAN.shot -> {
                val human = Human(name = value[0], Gender.WOMAN)
                humans.add(human)
            }
            Gender.MAN.shot -> {
                val human = Human(name = value[0], Gender.MAN)
                humans.add(human)
            }
        }
    }
    println()
    println("Каталог содержит следующие значения:")
    humans.forEach{
        println(it.getHumanInfo())
    }
}
