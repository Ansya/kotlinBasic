package lesson_5

fun main() {
    val firstValue = (0..100).random()
    val secondValue = (0..100).random()

    println("Prove that you are not a robot, please. Solve a simple example ($firstValue + $secondValue) = ")
    val result = readln().toInt()
    if (result == firstValue + secondValue) {
        println("Welcome!")
    } else {
        println("Access denied.")
    }
}
