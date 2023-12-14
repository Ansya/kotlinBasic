package lesson_10

fun main() {
    println("Please add password size:")
    val passwordSize = readln().toInt()

    val password = passwordGenerator(passwordSize)
    println("Generated password: $password")
}

fun passwordGenerator(passwordSize: Int): String {
    var password = ""
    val rangeOfNumbersForPassword = (0..9)
    val rangeOfSymbolsForPassword = (' '..'/')
    for (i in 0 until passwordSize) {
        if (i % 2 == 0) {
            password += rangeOfNumbersForPassword.random().toString()
        } else {
            password += rangeOfSymbolsForPassword.random()
        }
    }
    return password
}
