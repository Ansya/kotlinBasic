package lesson_18

import kotlin.math.pow

open class Package {
    open fun calculateArea() = 0.0
}

class Parallelepiped(
    val height :Double,
    val width :Double,
    val length :Double,
) : Package() {
    override fun calculateArea(): Double {
        val area = 2 * (height * width + width * length + height * length)
        return area
    }
}

class Cube(
    val side :Double,
) : Package() {
    override fun calculateArea(): Double {
        val area = 6 * side.pow(2)
        return area
    }
}

fun main () {
    val packagesArray :Array<Package> = arrayOf(
        Cube(9.4),
        Parallelepiped(2.3, 4.5, 8.0),
        Cube(3.5),
        Parallelepiped(1.2, 4.0, 5.3)
    )

    packagesArray.forEach {
        println("Площадь поверхности посылки %.2f".format(it.calculateArea()))
    }
}
