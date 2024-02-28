package lesson_20

import kotlin.random.Random

class Robot {
    private val phrases = listOf(
        "хороший денёк для хорошей беседы",
        "цените мир небездушных людей пока нас не заменили роботы",
        "роботов ещё не создали а люди уже не нужны",
        "за созданием любого робота стоит человек поэтому и с роботом можно поговорить",
        "чем больше я узнаю людей тем больше люблю робототехнику и компьютеры"
    )
    var modifier: (String) -> String = { it }
    fun setRobotModifier(newModifier: (String) -> String) {
        modifier = newModifier
    }

    fun say() {
        val randomIndex = Random.nextInt(phrases.size)
        val phraseToSay = modifier(phrases[randomIndex])
        println(phraseToSay)
    }
}


fun main() {

    val inventor: (String) -> String = {
        val words = it.split(" ")
        var convertedString = ""
        words.forEach {
            convertedString += it.reversed()
            convertedString += " "
        }
        convertedString
    }


    val bot1 = Robot()
    bot1.say()
    bot1.setRobotModifier(inventor)
    bot1.say()
}
