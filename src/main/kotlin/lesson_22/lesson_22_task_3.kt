package lesson_22

data class Statistics(
    val learnedWordsCount: Int,
    val allWordsCount: Int,
    val percent: Int = learnedWordsCount * 100 / allWordsCount,
)

fun main() {
    val statistics = Statistics(23, 45)
    val (learnedWordsCount, allWordsCount, percent) = statistics

    println(
        "Выучено ${learnedWordsCount} " +
                "из ${allWordsCount} слов |" +
                " ${percent}%"
    )
}
