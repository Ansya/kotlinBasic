package lesson_15

interface Flying {
    fun fly()
}

interface Swimming {
    fun swim()
}

abstract class Fish : Swimming {
    abstract val flippers: String
}

abstract class Waterbird : Flying, Swimming {
    abstract val webbedFeet: String
    abstract val wing: String
}

class Crucian(
    val name: String,
    override val flippers: String,
) : Fish() {
    override fun swim() {
        println("$name плывет под водой с помощью: $flippers")
    }
}

class Duck(
    val name: String,
    override val webbedFeet: String,
    override val wing: String,
) : Waterbird() {
    override fun fly() {
        println("$name летит с помощью: $wing")
    }

    override fun swim() {
        println("$name плывет над водой с помощью: $webbedFeet")
    }
}

class Gull(
    val name: String,
    override val webbedFeet: String,
    override val wing: String,
) : Waterbird() {
    override fun fly() {
        println("$name летит с помощью: $wing")
    }

    override fun swim() {
        println("$name плывет над водой с помощью: $webbedFeet")
    }
}

fun main() {
    val crucian = Crucian(
        name = "карась морской",
        flippers = "плавники"
    )
    crucian.swim()

    val dack = Duck(
        name = "кряква",
        webbedFeet = "лапы с перепонками",
        wing = "пестрые крылья"
    )
    dack.fly()
    dack.swim()

    val gull = Gull(
        name = "сизая чайка",
        webbedFeet = "лапы с перепонками",
        wing = "серые крылья"
    )
    gull.fly()
    gull.swim()
}
