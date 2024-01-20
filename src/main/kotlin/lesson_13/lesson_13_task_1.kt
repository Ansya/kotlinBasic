package lesson_13

class Contact(
    val name :String,
    val phoneNumber :Long,
    val company :String?,
)

fun main() {
    val contact1 = Contact("Настя", 32, null)
    println("Контакт: ${contact1.name}, ${contact1.phoneNumber}, работает: ${contact1.company ?: ""}")
    val contact2 = Contact("Сергей", 31, "ВГУВТ")
    println("Контакт: ${contact2.name}, ${contact2.phoneNumber}, работает: ${contact2.company ?: ""}")
}
