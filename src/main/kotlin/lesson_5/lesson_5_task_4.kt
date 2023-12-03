package lesson_5

const val USER_NAME = "Zaphod"
const val USER_PASSWORD = "PanGalactic"
fun main() {
    println("Please enter you user name:")
    val userName = readln()
    println("Please enter you password:")
    val pass = readln()

    if (userName == USER_NAME) {
        if (pass == USER_PASSWORD) {
            println("Looks like you are already registered on the \"Heart of Gold\". \nWelcome on board!!!")
        } else {
            println("Authorisation failed.")
        }
    } else {
        println("Looks like you are not registered yet on the \"Heart of Gold\". \nPlease register first.")
    }
}
