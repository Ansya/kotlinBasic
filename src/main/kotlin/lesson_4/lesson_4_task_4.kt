package lesson_4

fun main() {
    val dayOfExercise = 5
    val isEven = (dayOfExercise % 2 == 0)
    val exerciseForHands = !isEven
    val exerciseForLags = isEven
    val exerciseForBack = isEven
    val exerciseForPress = !isEven

    val exersisesPlan = "Exercises for hans:  $exerciseForHands\n" +
        "Exercises for lags: $exerciseForLags\n" +
        "Exercises for back: $exerciseForBack\n" +
        "Exercises for press: $exerciseForPress"

    println(exersisesPlan)
}
