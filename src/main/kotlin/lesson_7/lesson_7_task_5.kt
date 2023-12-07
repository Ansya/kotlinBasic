package lesson_7

const val PASSWORD_SIZE_MIN = 6
fun main() {
    val lowerCaseCharRangeForPassword: CharRange = 'a'..'z'
    val upperCaseCharRangeForPassword: CharRange = 'A'..'Z'
    val intRangeForPassword: IntRange = 0..9
    val passwordElementsRange = 1..3
    var password = ""

    println("Please add password size (min value is 6):")
    var passwordSize = readln().toInt()
    if (passwordSize < PASSWORD_SIZE_MIN) passwordSize = PASSWORD_SIZE_MIN

//    for (i in passwordSize downTo 1) {
    (0 until passwordSize).forEach {
        val element = passwordElementsRange.random()

        when (element) {
            1 -> password += intRangeForPassword.random().toString()
            2 -> password += upperCaseCharRangeForPassword.random()
            3 -> password += lowerCaseCharRangeForPassword.random()
        }
    }
    println("Generated password: $password")
}
