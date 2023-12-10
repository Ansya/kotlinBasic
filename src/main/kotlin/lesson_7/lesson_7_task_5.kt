package lesson_7

const val PASSWORD_SIZE_MIN = 6
fun main() {
    val rangeForPassword = ('a'..'z') + ('A'..'Z') + (0..9)
    var password = ""

    println("Please add password size (min value is 6):")
    var passwordSize = readln().toInt()
    if (passwordSize < PASSWORD_SIZE_MIN) passwordSize = PASSWORD_SIZE_MIN

    (0 until passwordSize).forEach {
        password += rangeForPassword.random().toString()
    }
    println("Generated password: $password")
}
