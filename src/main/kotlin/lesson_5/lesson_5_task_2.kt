package lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18
fun main() {
    println("Enter your year of birth, please (in 1999 format):")
    val userYearOfBirth = readln().toInt()
    val currentYear = LocalDate.now().year

    if ((currentYear - userYearOfBirth) >= AGE_OF_MAJORITY) {
        println("Show screen with hidden content.")
    } else {
        println("Show main screen.")
    }
}
