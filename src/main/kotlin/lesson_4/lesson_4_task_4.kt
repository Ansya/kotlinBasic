package lesson_4

fun main() {
    val exerciseForHands = true
    val exerciseForLags = false
    val exerciseForBack = false
    val exerciseForPress = true

    val dayOfExercise = 5
    val exersisesPlan = "Exercises for hans:  %b\n" +
        "Exercises for lags: %b\n" +
        "Exercises for back: %b\n" +
        "Exercises for press: %b"

    if (dayOfExercise % 2 == 0) {
        println(exersisesPlan.format(!exerciseForHands, !exerciseForLags, !exerciseForBack, !exerciseForPress))
    } else {
        println(exersisesPlan.format(exerciseForHands, exerciseForLags, exerciseForBack, exerciseForPress))
    }
}
