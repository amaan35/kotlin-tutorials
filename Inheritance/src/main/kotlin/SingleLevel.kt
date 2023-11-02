open class Father{
    var x = 10
    fun displayX(){
        println("X : $x")
    }
}
class Son : Father() {
    var y = 20
    fun displayY(){
        println("Y : $y")
    }
}

fun main() {
    var son = Son()
    son.displayX()
    son.displayY()
}