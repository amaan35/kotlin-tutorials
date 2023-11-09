open class Shape{
    open fun area(){
        println("This is Shape class area function")
    }
}
class Circle: Shape() {
    override fun area(){
        println("This is Circle class area function")
    }
}
class Rectangle: Shape(){
    override fun area() {
        println("This is Rectangle class area function")
    }
}

fun main() {
    var shape:Shape = Rectangle();
    shape.area()
}