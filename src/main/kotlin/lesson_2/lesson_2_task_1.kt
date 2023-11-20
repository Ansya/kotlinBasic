package lesson_2

const val numberOfStudents = 4
fun main() {
    val studentScore1 = 3f
    val studentScore2 = 4f
    val studentScore3 = 5f
    val studentScore4 = 3f

    val averageScore = (studentScore1 + studentScore2 + studentScore3 + studentScore4) / numberOfStudents
    println("Average score is %.2f".format(averageScore))
}