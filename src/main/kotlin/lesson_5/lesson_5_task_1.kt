package lesson_5

fun main() {
    val valuesRange = 0..100
    val firstValue = valuesRange.random()
    val secondValue = valuesRange.random()

    println("Prove that you are not a robot, please. Solve a simple example ($firstValue + $secondValue) = ")
    val result = readln().toInt()
    if (result == firstValue + secondValue) {
        println("Welcome!")
    } else {
        println("Access denied.")
    }
}
