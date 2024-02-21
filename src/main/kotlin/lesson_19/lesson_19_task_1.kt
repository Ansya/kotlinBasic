package lesson_19

enum class Fish {
    GUPPY {
        override fun getFishTypeNaming(): String {
            return "guppy"
        }
    },
    ANGELFISH {
        override fun getFishTypeNaming(): String {
            return "angelfish"
        }
    },
    GOLDFISH {
        override fun getFishTypeNaming(): String {
            return "goldfish"
        }
    },
    SIAMESE_FIGHTING_FISH {
        override fun getFishTypeNaming(): String {
            return "siamese fighting fish"
        }
    };

    abstract fun getFishTypeNaming() : String
}

fun main() {
    println("You can add to you aquarium next fishes:")
    for (i in Fish.entries) println(i.getFishTypeNaming())
}
