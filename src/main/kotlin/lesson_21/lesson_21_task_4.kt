package lesson_21

import java.io.File

const val DICTIONARY_FILE_NAME = "words.txt"

data class Word(
    val original: String,
    val translate: String,
    var correctAnswersCount: Int = 0,
)

fun File.saveWordToFile(word: Word) {
    val line = "${word.original}|${word.translate}|${word.correctAnswersCount}"
    this.appendText(line)
}

fun main() {
    val word1 = Word("crayon", "карандаш", 0)
    val word2 = Word("fenêtre", "окно", 0)
    val wordsFile = File(DICTIONARY_FILE_NAME)

    wordsFile.saveWordToFile(word1)
    wordsFile.saveWordToFile(word2)
}
