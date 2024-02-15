package lesson_17

class Folder(
    val secret: Boolean,
    name: String,
    filesCount: Int,
) {
    val name = name
        get() = if (secret) "Секретно" else field
    val filesCount = filesCount
        get() = if (secret) 0 else field
}

fun main() {
    val folder1 = Folder(false, "Рукоделие", 32)
    println("В папке \"${folder1.name}\" количество файлов: ${folder1.filesCount}.")
    val folder2 = Folder(true, "Доки", 5)
    println("В папке \"${folder2.name}\" количество файлов: ${folder2.filesCount}.")
}
