package lesson_10

const val MIN_PASSWORD_AND_LOGIN_LENGTH = 4
fun main() {
    println("To register please create your login:")
    val userLogin = readln()
    println("Please, create your password:")
    val userPass = readln()

    if (isValueHasEnoughLength(userLogin) || isValueHasEnoughLength(userPass)) {
        println("Great, you are register now.")
    } else {
        println("Password or login has not enough length.")
    }
}

fun isValueHasEnoughLength(value: String): Boolean {
    return (value.length >= MIN_PASSWORD_AND_LOGIN_LENGTH)
}

