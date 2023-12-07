package lesson_6

fun main() {
    val valuesRange = 1..9
    val valueToWin = valuesRange.random()
    var numberOfAttempts = 5
    var guessedNumber: Int

    do {
        --numberOfAttempts
        println("Guess the number from 1 to 9:")
        guessedNumber = readln().toInt()
        if (guessedNumber == valueToWin) {
            println("You win! It was a great game!")
            break
        } else if (numberOfAttempts > 0) {
            println("Failure. Try again. $numberOfAttempts attempts left.")
        } else {
            println("You guessed wrong. The number $valueToWin was guessed.")
        }
    } while (numberOfAttempts > 0)
}
