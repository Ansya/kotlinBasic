package lesson_17

class User(
    login: String,
    password: String,
) {
    var login = login
        set(value) {
            println("Логин изменен с \'$field\'  на \'$value\'")
            field = value
        }

    var password = password
        get() {
            var stars = ""
            field.forEach { stars += "*" }
            return stars
        }
        set(value) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {
    val user1 = User("ansya", "1234poiuy")
    println("У польлзователя \'${user1.login}\' пароль: ${user1.password}")
    user1.login = "Sunsya"
    user1.password = "4321qweqrt"
    println("У польлзователя \'${user1.login}\' пароль: ${user1.password}")
}
