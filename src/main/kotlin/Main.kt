fun isLetterOrUnderscore(c :Char) = c in '1'..'9' || c in 'a'..'z' || c in 'A'..'Z' || c in '_'..'_'

fun isValidIdentifier(s: String): Boolean {
    var isValidIdentifier = s.isNotEmpty()
    for (c in s) {
        if (!isLetterOrUnderscore(c)) isValidIdentifier = false
    }
    return isValidIdentifier
}

fun List<Int>.sum(): Int {
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}

fun main() {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false

    val sum = listOf(1, 2, 5).sum()
    println(sum)    // 6
}
