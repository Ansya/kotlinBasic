package lesson_13

class Contact2(
val name :String,
val phoneNumber :Long,
val company :String? = null,
) {
    fun printContact() {
        println("Контакт:")
        println(" - Имя: ${name}\n - Номер: ${phoneNumber}\n - Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contactsList = listOf(
        Contact2("Настя", 89073644417, null),
        Contact2("Сергей", 89503932920, "null"),
        Contact2("Иван", 89509878392, "MTS Ltd."),
        Contact2("Роман", 89736782799, null),
        Contact2("Анна", 89873265345, "Netcracker Ltd."),
        )

    val companiesList = contactsList.filter{ it.company != null }.map { it.company }
    println("Список всех компаний: $companiesList")
}
