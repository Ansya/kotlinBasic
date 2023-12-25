package lesson_11

class RecipeCategory(
    val id: Int,
    val name: String,
    val avatar: String,
    val description: String
)
class Ingredient(
    val id: Int,
    val name: String,
    val quantity: Int,
    val unit: String
)

class Recipe(
    val id: Int,
    val name: String,
    val avatar: String,
    val category: RecipeCategory,
    val ingredients: List<Ingredient>,
    val cookingMethod: String
)
fun main() {
    println("Recipes")
}
