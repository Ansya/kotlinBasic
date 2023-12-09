package lesson_7

fun main() {
    val codeValuesRange = 1000..9999
    var codeToAuthorise: Int
    var userEnteredCode: Int

    do {
        codeToAuthorise = codeValuesRange.random()
        println("Your authorisation code is $codeToAuthorise")
        println("Enter you code to authorise:")
        userEnteredCode = readln().toInt()
    } while (codeToAuthorise != userEnteredCode)

    println("You are welcome!")
}
