package lesson_21

fun String.vowelCount(): Int {
    val vowelLetters = listOf('a', 'e', 'y', 'u', 'i', 'o', 'j')
    return this.lowercase().count {
        vowelLetters.contains(it)
    }
}

fun main() {
    val str1 = "Never look back."
    println("Vowel count in \'$str1\' is ${str1.vowelCount()}")
    val str2 = "A life is a moment."
    println("Vowel count in \'$str2\' is ${str2.vowelCount()}")
}
