package lesson_7

const val PASSWORD_SIZE = 6
fun main() {
    val charRangeForPassword: CharRange = 'a'..'z'
    val intRangeForPassword: IntRange = 0..9
    var password = ""

    for (i in PASSWORD_SIZE downTo 1) {
        if (i % 2 == 0) password += charRangeForPassword.random()
        else password += intRangeForPassword.random().toString()
    }
    println("Generated password: $password")
}
