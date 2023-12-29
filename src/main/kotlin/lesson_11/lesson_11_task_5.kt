package lesson_11

import java.util.UUID

class ForumMember(
    val userName: String,
    val userId: UUID = UUID.randomUUID(),
)
class ForumMessage(
    val authorId: UUID,
    val message: String,
)
class Forum() {
    val messages: MutableList<ForumMessage> = mutableListOf()
    val authors: MutableList<ForumMember> = mutableListOf()
    fun createNewUser(userName: String) :ForumMember {
        val member = ForumMember(userName = userName)
        authors.add(member)
        return member
    }
    fun createNewMessage(authorId :UUID, message :String) {
        if (authors.any{ it.userId == authorId}) {
            val forumMessage = ForumMessage(authorId, message)
            messages.add(forumMessage)
        }
    }
    fun printThread() {
        println("Сообщения форума:")
        for (message in messages) {
            val memberName = authors.find { it.userId == message.authorId }?.userName
            println("${memberName} - ${message.message}")
        }
    }
}

fun main() {
    val myForum = Forum()
    val firstMember = myForum.createNewUser("ansya")
    myForum.createNewMessage(firstMember.userId, "Привет всем участникам форума")
    myForum.createNewMessage(firstMember.userId, "Приятно познакомиться")
    val secondMember = myForum.createNewUser("ksu")
    myForum.createNewMessage(secondMember.userId, "Да, всем привет! И хорошего дня.")
    myForum.createNewMessage(secondMember.userId, "А что будем делать тут?")
    myForum.createNewMessage(firstMember.userId, "Общаться и делиться опытом.")
    myForum.createNewMessage(secondMember.userId, "А давайте еще будем поддерживать друг друга!")

    myForum.printThread()
}
