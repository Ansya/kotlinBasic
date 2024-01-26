package lesson_13

class Contact3(
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
    val contactsList = mutableListOf<Contact3>()
    println("Создание телефонной книги")
    do {
        println("Введите имя:")
        val name = readln()

        println("Введите номер телефона:")
        val phoneNumber = readln().toLongOrNull()

        println("Введите компанию:")
        var companyName = readlnOrNull()
        if (companyName.isNullOrBlank()) companyName = null
        if (phoneNumber != null) {
            contactsList.add(Contact3(name, phoneNumber, companyName))
        } else {
            println("не могу сохранить контакт без номера телефона")
        }

        println("Хотите ввести еще контакт? (введите да или нет)")
        val isWantToCreateContact = readln().equals("да", ignoreCase = true)
    } while (isWantToCreateContact)

    println("Список контактов:")
    contactsList.forEach { it.printContact() }
}
