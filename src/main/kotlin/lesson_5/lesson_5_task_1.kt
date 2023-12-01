package lesson_5

val VALUES_RANGE = 0..100

fun main() {
    val firstValue = VALUES_RANGE.random()
    val secondValue = VALUES_RANGE.random()

    println("Prove that you are not a robot, please. Solve a simple example ($firstValue + $secondValue) = ")
    val result = readln().toInt()
    if (result == firstValue + secondValue) {
        println("Welcome!")
    } else {
        println("Access denied.")
    }
}
