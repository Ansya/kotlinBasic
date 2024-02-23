package lesson_19

enum class Fish(val nameFish :String) {
    GUPPY("guppy"),
    ANGELFISH("angelfish"),
    GOLDFISH("goldfish"),
    SIAMESE_FIGHTING_FISH("siamese fighting fish"),
}

fun main() {
    println("You can add to you aquarium next fishes:")
    for (i in Fish.entries) println(i.nameFish)
}
