package lesson_3

fun main() {
    var moveFrom = "E2"
    var moveWere = "E4"
    var chessMoveNumber = 1

    println("$moveFrom-$moveWere;$chessMoveNumber")

    moveFrom = "D2"
    moveWere = "D3"

    println("$moveFrom-$moveWere;${++chessMoveNumber}")
}
