package lesson_14

import java.awt.Color
import kotlin.math.PI

abstract class Figure(
    val color: Color,
) {
    abstract fun calculateArea(): Int
    abstract fun calculatePerimeter(): Int
}

class Circle(
    color: Color,
    val radius: Int,
) : Figure(color) {
    override fun calculateArea(): Int {
        return (PI * radius * radius).toInt()
    }

    override fun calculatePerimeter(): Int {
        return (2 * PI * radius).toInt()
    }
}

class Rectangle(
    color: Color,
    val height: Int,
    val width: Int,
) : Figure(color) {
    override fun calculateArea(): Int {
        return height * width
    }

    override fun calculatePerimeter(): Int {
        return 2 * height + 2 * width
    }
}


fun main() {
    val figures = mutableListOf<Figure>()
    figures.add(Circle(Color.WHITE, 12))
    figures.add(Rectangle(Color.BLACK, 5, 7))
    figures.add(Circle(Color.BLACK, 7))
    figures.add(Rectangle(Color.BLACK, 9, 6))
    figures.add(Rectangle(Color.WHITE, 7, 7))
    figures.add(Rectangle(Color.WHITE, 13, 7))
    figures.add(Circle(Color.WHITE, 19))
    figures.add(Circle(Color.BLACK, 8))

    var perimetersSumOfBlackFigures = 0
    var areasSumOfWhiteFigures = 0
    figures.filter { it.color == Color.WHITE }.forEach {
        areasSumOfWhiteFigures += it.calculateArea()
    }
    figures.filter { it.color == Color.BLACK }.forEach {
        perimetersSumOfBlackFigures += it.calculatePerimeter()
    }
    println("Сумма периметров всех черных фигур = $perimetersSumOfBlackFigures")
    println("Сумма площадей всех белых фигур = $areasSumOfWhiteFigures")
}
