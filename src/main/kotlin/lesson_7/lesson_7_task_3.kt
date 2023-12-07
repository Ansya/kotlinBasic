package lesson_7

fun main() {
    println("Please enter the number:")
    val valueForEvenNumbers = readln().toInt()
    val evenNumbersRange = 0..valueForEvenNumbers step 2

    for (i in evenNumbersRange) {
        println(i)
    }
}
