package lesson_5

fun main() {
    val valuesRange = 0..42
    val valuesToWin = listOf(valuesRange.random(), valuesRange.random(), valuesRange.random())

    println("To win in lottery enter three numbers from 0 till 42 separated by spase:")

    val (sugestedValue1, sugestedValue2, sugestedValue3) = readLine()!!.split(' ')
    val sugestedValues = listOf(sugestedValue1.toInt(), sugestedValue2.toInt(), sugestedValue3.toInt())
    val numberOfMatches = (valuesToWin intersect sugestedValues).size

    when (numberOfMatches) {
        3 -> println("Congratulations! You matched all the numbers and won the jackpot! You won the main prize!")
        2 -> println("Congratulations! You matched two numbers and won a big prize!")
        1 -> println("Congratulations! You matched one number and won a consolation prize!")
        0 -> println("Failure. You didn't match any number.")
    }
    println("This are numbers to win: $valuesToWin")
}
