package lesson_3

fun main() {
    val chessMoveFromServer = "D2-D4;1"
    val chessMove = chessMoveFromServer.split("-", ";").toTypedArray()

    val moveFrom = chessMove[0]
    println(moveFrom)
    val moveWhere = chessMove[1]
    println(moveWhere)
    val chessMoveNumber = chessMove[2]
    println(chessMoveNumber)
}
