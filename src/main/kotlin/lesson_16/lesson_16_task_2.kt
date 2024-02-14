package lesson_16

import kotlin.math.pow

private const val PI_VALUE = 3.14

class Circle(radius: Double) {
    private var circleRadius: Double = radius

    fun calculateArea(): Double {
        return PI_VALUE * circleRadius.pow(circleRadius)
    }

    fun calculatePerimeter(): Double {
        return 2 * PI_VALUE * circleRadius
    }
}

fun main() {
    val circle1 = Circle(3.5)
    println("Площадь круга %.2f".format(circle1.calculateArea()))
    println("Периметр круга %.2f".format(circle1.calculatePerimeter()))
}
