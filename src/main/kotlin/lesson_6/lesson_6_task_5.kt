package lesson_6

fun main() {
    val valuesRange = 1..9
    var firstValue: Int
    var secondValue: Int
    var result: Int
    var numberOfAttempts = 3

    do {
        --numberOfAttempts
        firstValue = valuesRange.random()
        secondValue = valuesRange.random()
        println("Prove that you are not a robot, please. Solve a simple example ($firstValue + $secondValue):")
        result = readln().toInt()

        if (result == firstValue + secondValue) {
            println("Welcome!")
            break
        } else {
            println("Access denied.")
        }
    } while (numberOfAttempts > 0)
}
