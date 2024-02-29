package lesson_22

class RegularBook(
    val name :String,
    val author :String,
)

data class DataBook(
    val name :String,
    val author :String,
)


fun main() {
    val regularBook1 = RegularBook("Песни мамы Шамана", "Яна Мори")
    val regularBook2 = RegularBook("Песни мамы Шамана", "Яна Мори")

    println("${regularBook1 == regularBook2}") //false
    //потому что сравинваются дареса объектов в памяти

    val dataBook1 = DataBook("Песни мамы Шамана", "Яна Мори")
    val dataBook2 = DataBook("Песни мамы Шамана", "Яна Мори")

    println("${dataBook1 == dataBook2}") //true
    //потому что сравниваются значения полей классов
}
