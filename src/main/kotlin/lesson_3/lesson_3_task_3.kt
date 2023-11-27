package lesson_3

const val ONE = 1
const val TWO = 2
const val THREE = 3
const val FOUR = 4
const val FIFE = 5
const val SIX = 6
const val SEVEN = 7
const val EIGHT = 8
const val NINE = 9

fun main() {
    val multiplyableValue = 7
    val multiStringForMultiplication = """
        $multiplyableValue * $ONE = ${multiplyableValue * ONE}
        $multiplyableValue * $TWO = ${multiplyableValue * TWO}
        $multiplyableValue * $THREE = ${multiplyableValue * THREE}
        $multiplyableValue * $FOUR = ${multiplyableValue * FOUR}
        $multiplyableValue * $FIFE = ${multiplyableValue * FIFE}
        $multiplyableValue * $SIX = ${multiplyableValue * SIX}
        $multiplyableValue * $SEVEN = ${multiplyableValue * SEVEN}
        $multiplyableValue * $EIGHT = ${multiplyableValue * EIGHT}
        $multiplyableValue * $NINE = ${multiplyableValue * NINE}
    """.trimIndent()

    println(multiStringForMultiplication)
}
