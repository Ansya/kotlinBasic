package lesson_22

class RegularBook1(
    val name :String,
    val author :String,
)

data class DataBook1(
    val name :String,
    val author :String,
)


fun main() {
    val regularBook1 = RegularBook1("Песни мамы Шамана", "Яна Мори")
    val dataBook1 = DataBook1("Песни мамы Шамана", "Яна Мори")

    println(regularBook1) // lesson_22.RegularBook1@1d251891
    //это строковое представление объекта по умолчанию

    println(dataBook1) // DataBook1(name=Песни мамы Шамана, author=Яна Мори)
    //выводится понятное строковое представление подготовленное для data class
    //его можно переопределить - это функция toString()
}
