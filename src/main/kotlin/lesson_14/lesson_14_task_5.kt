package lesson_14

import java.util.*

open class Message(
    val text: String,
    val author: String,
    val messageId: UUID = UUID.randomUUID(),
)

class ChildMessage(
    text: String,
    author: String,
    val parentMessageId: UUID,
) : Message(text, author)

class Chat() {
    var chatMessages = mutableListOf<Message>()

    fun addMessage(author: String, text: String): UUID {
        val message = Message(text, author)
        chatMessages.add(message)
        return message.messageId
    }

    fun addThreadMessage(author: String, text: String, parentMessageId: UUID) {
        chatMessages.add(ChildMessage(text, author, parentMessageId))
    }

    fun printChat() {
        val parentMessages = chatMessages.filterNot { it is ChildMessage }
        val childMessages = chatMessages.filterIsInstance<ChildMessage>().groupBy { it.parentMessageId }

        parentMessages.forEach { parentMessage ->
            println("${parentMessage.author}: ${parentMessage.text}")
            childMessages.forEach {
                if (it.key == parentMessage.messageId) {
                    it.value.forEach {
                        println("\t${it.author}: ${it.text}")
                    }
                }
            }
        }
    }
}

fun main() {
    val chat = Chat()
    val parenMessage1Id = chat.addMessage(author = "Настя", text = "Ищу няню в Советском районе")
    chat.addThreadMessage(
        text = "Я хорошая няня. Возьмите меня",
        author = "Галина",
        parentMessageId = parenMessage1Id
    )
    chat.addThreadMessage(
        text = "Я живу близко и могу быть вашей няней",
        author = "Марина",
        parentMessageId = parenMessage1Id
    )
    chat.addThreadMessage(
        text = "Спасибо, Галина, давайте созвонимся.",
        author = "Настя",
        parentMessageId = parenMessage1Id
    )
    chat.addThreadMessage(
        text = "Спасибо, Марина, нам надо пообщаться лично.",
        author = "Настя",
        parentMessageId = parenMessage1Id
    )
    chat.addMessage(text = "Соберемся на субботник", author = "Роман")
    val parenMessage2Id = chat.addMessage(author = "Полина", text = "Приглашаю на ДР")
    chat.addThreadMessage(
        text = "Я приду, но с детьми",
        author = "Марина",
        parentMessageId = parenMessage2Id
    )
    chat.addThreadMessage(
        text = "Спасибо, Полина, я приду.",
        author = "Настя",
        parentMessageId = parenMessage2Id
    )

    chat.printChat()
}
