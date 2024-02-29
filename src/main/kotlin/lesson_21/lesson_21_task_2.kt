package lesson_21

fun List<Int>.evenNumbersSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}

fun main() {
    val numbersList = listOf(2, 5, 4, 3, 8, 1, 3, 2)
    println("Even numbers sum in \'$numbersList\' is ${numbersList.evenNumbersSum()}")
}
