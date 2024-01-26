package lesson_13

class Contact4(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printContact() {
        println("Контакт:")
        println(" - Имя: ${name}\n - Номер: ${phoneNumber}\n - Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    println("Введите имя:")
    val name = readln()

    println("Введите номер телефона:")
    var phoneNumber :Long = 0
    try {
        phoneNumber = readln().toLong()
    } catch (e: Exception) {
        println(e)
    }

    println("Введите компанию:")
    var companyName = readlnOrNull()
    if (companyName.isNullOrBlank()) companyName = null

    val contact = Contact4(name, phoneNumber, companyName)
    contact.printContact()
}
