package lesson_15

import java.util.*

abstract class Member {
    abstract val id: UUID
    abstract val name: String
    abstract fun readMessage()
    abstract fun writeMessage()
}

class ForumUser(
    override val id: UUID = UUID.randomUUID(),
    override val name: String,
) : Member() {
    override fun readMessage() {
        println("Пользователь $name прочел сообщения форума.")
    }

    override fun writeMessage() {
        println("Пользователь $name написал сообщение в форум.")
    }
}

class ForumAdmin(
    override val id: UUID = UUID.randomUUID(),
    override val name: String,
) : Member() {
    override fun readMessage() {
        println("Администратор $name прочел сообщения форума.")
    }

    override fun writeMessage() {
        println("Администратор $name написал сообщение в форум.")
    }

    fun removeUser() {
        println("Администратор $name удалил пользователя.")
    }

    fun removeMessage() {
        println("Администратор $name удалил сообщение.")
    }
}

fun main() {
    val user1 = ForumUser(name = "Nick")
    user1.readMessage()
    user1.writeMessage()

    val admin1 = ForumAdmin(name = "Kolya")
    admin1.removeUser()
    admin1.removeMessage()
    admin1.readMessage()
    admin1.writeMessage()
}
