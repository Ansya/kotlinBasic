package lesson_10

const val USER_NAME = "Zaphod"
const val USER_PASSWORD = "PanGalactic"
const val TOKEN_SIZE = 32

fun main() {
    println("To get list of purchases, please enter you user name:")
    val userLogin = readln()
    println("and you password:")
    val userPassword = readln()

    val userShoppingList = getShoppingList(authoriseTheUser(userLogin, userPassword))
    if (userShoppingList == null) {
        println("You are not authorised. Cannot list your shopping list.")
    } else {
        println("Your shopping list is: $userShoppingList")
    }
}

fun authoriseTheUser(login: String, password: String): String? {
    var token: String? = null
    if (login == USER_NAME && password == USER_PASSWORD) {
        token = generateToken()
    }
    return token
}

fun generateToken(): String {
    var token = ""
    val rangeOfToken = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    for (i in 0 until TOKEN_SIZE) {
        token += rangeOfToken.random()
    }
    return token
}

fun getShoppingList(token: String?): List<String>? {
    return if (token.isNullOrBlank()) {
        null
    } else {
        listOf("paper", "paints", "brushes", "plasticine")
    }
}
