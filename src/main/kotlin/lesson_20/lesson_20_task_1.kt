package lesson_20

fun main() {
    val greetingAtSplashScreen: (String) -> String

    greetingAtSplashScreen = {
        "С наступающим Новым Годом, $it!"
    }

    println(greetingAtSplashScreen("Настя"))
}
