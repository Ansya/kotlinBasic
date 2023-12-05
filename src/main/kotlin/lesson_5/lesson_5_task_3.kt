package lesson_5

const val FIRST_VALUE = 17
const val SECOND_VALUE = 38

fun main() {
    println("To win in lottery enter two numbers from 0 till 42.")
    println("First number:")
    val firstValue = readln().toInt()
    println("Second number:")
    val secondValue = readln().toInt()

    if ((firstValue == FIRST_VALUE && secondValue == SECOND_VALUE) ||
        (firstValue == SECOND_VALUE && secondValue == FIRST_VALUE)) {
        println("Congratulations! You won the main prize!")
    } else if (firstValue == FIRST_VALUE || secondValue == FIRST_VALUE ||
        firstValue == SECOND_VALUE || secondValue == SECOND_VALUE) {
        println("You won a consolation prize!")
    } else {
        println("Failure.")
    }
}
