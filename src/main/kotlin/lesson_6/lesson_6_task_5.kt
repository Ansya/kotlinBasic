package lesson_6

const val USER_NAME = "Zaphod"
const val USER_PASSWORD = "PanGalactic"
fun main() {
    println("To authorise please enter your user name:")
    val userName = readln()
    println("Please enter you password:")
    val pass = readln()

    if (userName == USER_NAME) {
        if (pass == USER_PASSWORD) {
            val valuesRange = 1..9
            var firstValue: Int
            var secondValue: Int
            var result: Int
            var numberOfAttempts = 3

            do {
                --numberOfAttempts
                firstValue = valuesRange.random()
                secondValue = valuesRange.random()
                println("Prove that you are not a robot, please. Solve a simple example " +
                            "($firstValue + $secondValue) = ")
                result = readln().toInt()

                if (result == firstValue + secondValue) {
                    println("Welcome!")
                    break
                } else {
                    println("Access denied.")
                }
            } while (numberOfAttempts > 0)
        } else {
            println("Authorisation failed.")
        }
    } else {
        println("Looks like you are not registered yet on the \"Heart of Gold\". \nPlease register first.")
    }
}
