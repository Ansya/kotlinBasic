package lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String
)

fun main() {
    val firstUser = User(
        id = 1,
        login = "ansya",
        password = "sunny",
        email = "ansya@mail.ru"
    )
    val secondUser = User(
        id = 2,
        login = "kostya",
        password = "rainy",
        email = "kostya@mail.ru"
    )

    println("First user info:")
    println(firstUser.id)
    println(firstUser.login)
    println(firstUser.password)
    println(firstUser.email)
    println("\nSecond user info:")
    println(secondUser.id)
    println(secondUser.login)
    println(secondUser.password)
    println(secondUser.email)
}
