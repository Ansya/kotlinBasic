package lesson_21

fun List<Int>.evenNumbersSum(): Int {
    var sum = 0
    this.forEach{
        if (it % 2 == 0) {
            sum += it
        }
    }
    return sum
}

fun main() {
    val numbersList = listOf(2, 5, 4, 3, 8, 1, 3)
    println("Even numbers sum in \'$numbersList\' is ${numbersList.evenNumbersSum()}")
}
