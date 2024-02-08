package lesson_15

import java.util.UUID

interface Seeker {
    fun startSearch()
}

abstract class Product() {
    abstract val id: UUID
    abstract val name: String
    abstract val amount: Int
}

class MusicalTool(
    override val id: UUID = UUID.randomUUID(),
    override val name: String,
    override val amount: Int,
) : Product(), Seeker {
    override fun startSearch() {
        println("Выполняется поиск комплеткующих к $name")
    }
}

class Component(
    override val id: UUID = UUID.randomUUID(),
    override val name: String,
    override val amount: Int,
) : Product()

fun main() {
    val strings = Component(name = "струны", amount = 12)
    println("В магазине есть ${strings.name} в количестве ${strings.amount}")

    val guitar = MusicalTool(name = "гитара", amount = 2)
    println("В магазине есть ${guitar.name} в количестве ${guitar.amount}")
    guitar.startSearch()
}
