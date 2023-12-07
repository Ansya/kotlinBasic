package lesson_6

fun main() {
    println("To register please create your login:")
    val userLogin = readln()
    println("Please, create your password:")
    val userPass = readln()
    println("Great, you are register now.")
    var login: String
    var pass: String

    do {
        println("To authorise, please enter your login:")
        login = readln()
        println("enter your password:")
        pass = readln()

        val authMessage = when {
            (login == userLogin) && (pass == userPass) -> "Authorization successful!!!"
            else -> "Authorization fail."
        }
        println(authMessage)
    } while ((login != userLogin) || (pass != userPass))
}
