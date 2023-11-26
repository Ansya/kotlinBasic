package lesson_3

fun main() {
    val userName = "Anastasia"
    val dayGreeting = "Good day, "
    val eveningGreeting = "Good evening, "

    var greeting = dayGreeting + userName
    println(greeting)

    greeting = eveningGreeting + userName
    println(greeting)
}