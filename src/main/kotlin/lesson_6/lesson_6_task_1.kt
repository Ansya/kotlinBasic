package lesson_6

fun main() {
    println("To register please create your login:")
    val userLogin = readLine()!!
    println("Please, create your password:")
    val userPass = readLine()!!
    println("Great, you are register now.")
    var login: String
    var pass: String

    do {
        println("To authorise, please enter your login:")
        login = readLine()!!
        println("enter your password:")
        pass = readLine()!!

        val authMessage = when {
            (login == userLogin) && (pass == userPass) -> "Authorization successful!!!"
            else -> "Authorization fail."
        }
        println(authMessage)
    } while ((login != userLogin) || (pass != userPass))
}
