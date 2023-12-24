package lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = ""
) {
    fun printUserInfo() {
        println("Info about user:")
        println(id)
        println(login)
        println(password)
        println(email)
        println(bio)
    }

    fun changeBio() {
        println("Please enter bio info:")
        bio = readln()
    }

    fun changePassword() {
        println("To change password please enter you old password first:")
        val oldPassword = readln()
        if (oldPassword == password) {
            println("Enter you new password:")
            password = readln()
        } else {
            println("Unfortunately you enter wrong password, your cannot change it.")
        }
    }
}

fun main() {
    val curretnUser = User2(
        id = 1,
        login = "ansya",
        password = "sunny",
        email = "ansya@mail.ru"
    )

    curretnUser.printUserInfo()
    curretnUser.changeBio()
    curretnUser.changePassword()
    curretnUser.printUserInfo()
}
