package lesson_16

import java.util.UUID

class Order {
    private val orderNumber = UUID.randomUUID()
    private val orderStatuses = mapOf(
        1 to "Обрабатывается",
        2 to "Едет в пункт выдачи",
        3 to "Готов к получению",
        4 to "Выполнен",
        0 to "Отменён")
    private var orderStatus :Int = 1

    private fun changeStatus(status :Int) {
        orderStatus = status
    }

    fun requestToChangeStatus(status: Int) :Boolean {
        return if ((status - 1) == orderStatus || status == 0) {
            changeStatus(status)
            true
        } else {
            false
        }
    }

    fun getOrderStatus() {
        println("Статус заказа #$orderNumber:  ${orderStatuses[orderStatus] ?: "<статус неизвестен>"}")
    }
}

fun main() {
    val order1 = Order()
    println("Статус заказа: ${order1.getOrderStatus()}")
    if (order1.requestToChangeStatus(3)) {
        println("Статус заказа изменен успешно")
    } else {
        println("При смене статуса заказа возникла ошибка")
    }
    println("Статус заказа: ${order1.getOrderStatus()}")

    if (order1.requestToChangeStatus(2)) {
        println("Статус заказа изменен успешно")
    } else {
        println("При смене статуса заказа возникла ошибка")
    }
    println("Статус заказа: ${order1.getOrderStatus()}")
}
