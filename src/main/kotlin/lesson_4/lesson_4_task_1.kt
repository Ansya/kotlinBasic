package lesson_4

const val TABLES_NUMBER = 13
fun main() {
    val todayBookedTables = 13
    val tomorrowBookedTables = 9

    println(
        "Table availability today:   \t[${todayBookedTables < TABLES_NUMBER}]\n" +
            "Table availability tomorrow:\t[${tomorrowBookedTables < TABLES_NUMBER}]"
    )
}
