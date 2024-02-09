package lesson_16

class User(
    val name: String,
    private val password: String,
) {
    fun isPasswordCorrect(valueToCheck: String): Boolean {
        return valueToCheck == password
    }
}

fun main() {
    val ansya = User(name = "ansya", password = "Qwerty098")
    println("Введите пароль для проверки учетной записи ${ansya.name}:")
    val passValue = readln()
    if (ansya.isPasswordCorrect(passValue)) {
        println("Пароль корректный.")
    } else {
        println("Пароль введет неверно.")
    }
}
