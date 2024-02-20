package lesson_18

abstract class Pet(
    val name: String,
) {
    abstract val food: String
    fun play() = "[$name] - [играет]"
    fun sleep() = "[$name] - [спит]"
    fun eat() = "[$name] - [кушает $food]"
}

class Fox(name: String) : Pet(name) {
    override val food = "ягодки"
}

class Dog(name: String) : Pet(name) {
    override val food = "косточку"
}

class Cat(name: String) : Pet(name) {
    override val food = "рыбку"
}

fun main() {
    val pet1 = Cat("Пуся")
    println(pet1.eat())
    println(pet1.sleep())
    println(pet1.play())
    println(pet1.eat())

    val pet2 = Fox("Алиса")
    println(pet2.sleep())
    println(pet2.eat())
    println(pet2.play())

    val pet3 = Dog("Тоби")
    println(pet3.sleep())
    println(pet3.play())
    println(pet3.eat())
}
