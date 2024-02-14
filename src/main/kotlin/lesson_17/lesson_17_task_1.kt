package lesson_17

class QuizElement (
    question :String,
    answer :String = "",
) {
    val question :String = question
        get() = field

    var answer :String = answer
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val element1 = QuizElement("сколько ног у осьминога?")
    element1.answer = "8"

    println("Вопрос: ${element1.question}, ответ: ${element1.answer}")
}
