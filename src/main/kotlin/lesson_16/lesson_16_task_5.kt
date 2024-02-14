package lesson_16

class Gamer(val name :String) {
    private var half :Int = 100
    private var impactForce :Int = 30

    private fun dead() {
        half = 0
        impactForce = 0
        println("Герой $name мертв")
    }

    fun damage(value :Int) {
        half -= value
        if (half < 0) dead()
        else println("Здорьве героя $name - $half")
    }

    fun treatment(value :Int) {
        if (half <= 0) println("Герой $name мертв, его невозможно вылечить")
        else {
            half += value
            println("Здорьве героя $name - $half")
        }
    }
}

fun main() {
    val gamer1 = Gamer("Ivan")
    gamer1.damage(56)
    gamer1.treatment(35)
    gamer1.damage(12)
    gamer1.damage(12)
    gamer1.treatment(20)
    gamer1.damage(12)
    gamer1.damage(52)
    gamer1.treatment(10)
    gamer1.damage(52)
}
