package lesson_18

class Circle(
    val radius: Double,
) {
    fun getFigure(): String = "круг с радиусом %.2f".format(radius)
}

class Square(
    val side: Double,
) {
    fun getFigure(): String = "квадрат с длинной стороны %.2f".format(side)
}

class Point {
    fun getFigure(): String = "точка"
}

class Screen {
    fun draw(x: Int, y: Int, circle: Circle) {
        println("Нарисована фигура ${circle.getFigure()} и с центром в точке ($x, $y)")
    }

    fun draw(x: Float, y: Float, circle: Circle) {
        println("Нарисована фигура ${circle.getFigure()} и с центром в точке (%.2f, %.2f)".format(x, y))
    }

    fun draw(x: Int, y: Int, square: Square) {
        println("Нарисована фигура ${square.getFigure()} и с центром в точке ($x, $y)")
    }

    fun draw(x: Float, y: Float, square: Square) {
        println("Нарисована фигура ${square.getFigure()} и с центром в точке (%.2f, %.2f)".format(x, y))
    }

    fun draw(x: Int, y: Int, point: Point) {
        println("Нарисована фигура ${point.getFigure()} с координатами ($x, $y)")
    }

    fun draw(x: Float, y: Float, point: Point) {
        println("Нарисована фигура ${point.getFigure()} с координатами (%.2f, %.2f)".format(x, y))
    }
}

fun main() {
    val screen1 = Screen()
    screen1.draw(2, 4, Circle(9.3))
    screen1.draw(5.3F, 6.7F, Circle(2.0))
    screen1.draw(1, 0, Square(1.0))
    screen1.draw(7.6F, 8.2F, Square(3.0))
    screen1.draw(-5, -1, Point())
    screen1.draw(-9.0f, -4.0f, Point())
}
