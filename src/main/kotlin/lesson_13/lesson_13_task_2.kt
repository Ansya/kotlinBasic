package lesson_13

class Contact(
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
    val contact1 = Contact("Настя", 89084756632)
    contact1.printContact()
    val contact2 = Contact("Сергей", 89048976546, "ВГУВТ")
    contact2.printContact()
}
