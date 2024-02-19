package lesson_18

class Order(
    val orderNumber: Int,
) {
    fun makeOrder(product: String) {
        println("Заказан товар: $product")
    }

    fun makeOrder(product: List<String>) {
        println("Заказаны следующие товары: $product")
    }
}

fun main() {
    val order1 = Order(123432)
    order1.makeOrder("Крючок для вязания")
    val order2 = Order(123433)
    order2.makeOrder(listOf("пряжа шерстяная", "пряжа хлопок", "журнал"))
}
