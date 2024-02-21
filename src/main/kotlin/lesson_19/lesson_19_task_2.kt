package lesson_19

enum class Category {
    CLOTHES {
        override fun getCategoryDescription(): String {
            return "одежда"
        }
    },
    STATIONERY {
        override fun getCategoryDescription(): String {
            return "канцелярские товары"
        }
    },
    OTHER {
        override fun getCategoryDescription(): String {
            return "разное"
        }
    };

    abstract fun getCategoryDescription(): String
}

class Good(
    val name: String,
    val id: Int,
    val category: Category,
) {
    fun getInfo() :String {
        return "Товар №$id - \'$name\', категория: \'${category.getCategoryDescription()}\'"
    }
}

fun main() {
    val good1 = Good("носки", 1, Category.CLOTHES)
    println(good1.getInfo())
    val good2 = Good("карандаш", 2, Category.STATIONERY)
    println(good2.getInfo())
    val good3 = Good("книга", 3, Category.OTHER)
    println(good3.getInfo())
}
