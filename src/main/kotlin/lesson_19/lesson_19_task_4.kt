package lesson_19

enum class PatronType(val strikeForce :Int) {
    BLUE(5) {
        override fun getTypeName(): String {
            return "синий"
        }
    },
    GREEN(10) {
        override fun getTypeName(): String {
            return "зеленый"
        }
    },
    RED(20) {
        override fun getTypeName(): String {
            return "красный"
        }
    },
    NONE(0) {
        override fun getTypeName(): String {
            return "<не заряжен>"
        }
    };

    abstract fun getTypeName() : String
}

class Tank(
    val name: String,
    var patron :PatronType = PatronType.NONE,
) {
    fun armPatron(newPatron: PatronType) {
        patron = newPatron
        println("Танк \'$name\' вооружился патроном типа \'$patron\'.")
    }

    fun shoot() {
        if (patron == PatronType.NONE) {
            println("Танк \'$name\' не может стрелять, сперва зарядите!!!")
        } else {
            println("Танк \'$name\' выстрелил и нанес урон в ${patron.strikeForce} единиц.")
            patron = PatronType.NONE
        }
    }
}

fun main() {
    val t34 = Tank("Т-34")
    t34.armPatron(PatronType.BLUE)
    t34.shoot()
    t34.armPatron(PatronType.RED)
    t34.shoot()
    t34.shoot()
    t34.armPatron(PatronType.GREEN)
    t34.shoot()
}
