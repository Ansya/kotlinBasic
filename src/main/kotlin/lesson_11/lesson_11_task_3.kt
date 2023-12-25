package lesson_11

class Room(
    val id: Int,
    val cover: String,
    val roomName: String,
    val membersList: List<RoomMember> = emptyList()
)

class RoomMember(
    val id: Int,
    val avatar: String,
    val userName: String,
    val status: String
)

fun main() {
    val memberStatus = arrayOf("разговаривает", "микрофон выключен", "пользователь заглушен")
    val member1 = RoomMember(
        id = 0,
        avatar = "sun image",
        userName = "ansya",
        status = memberStatus[1]
    )
    val member2 = RoomMember(
        id = 1,
        avatar = "flower image",
        userName = "kostya",
        status = memberStatus[0]
    )
    val member3 = RoomMember(
        id = 2,
        avatar = "rain image",
        userName = "kris",
        status = memberStatus[2]
    )
    val firstRoom = Room(
        id = 0,
        cover = "Image 1",
        roomName = "Kniting Room",
        membersList = listOf(member1, member2, member3)
    )
    println("Room: ${firstRoom.roomName}")
    println(firstRoom.cover)
    println("List of members:")
    for (member in firstRoom.membersList) {
        println("${member.avatar} - ${member.status}")
    }
}
