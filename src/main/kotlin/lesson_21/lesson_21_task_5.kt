package lesson_21


fun Map<String, Int>.maxCategory() :String {
    return this.maxBy { (_, experiencePoints) ->
        experiencePoints
    }.key
}

fun main() {
    val skills: Map<String, Int> = mapOf(
        "верховая езда" to 25,
        "клинок" to 30,
        "лекарь" to 50,
        "щит" to 28,
    )
    println("Максимально развитый навык - ${skills.maxCategory()}")
}
