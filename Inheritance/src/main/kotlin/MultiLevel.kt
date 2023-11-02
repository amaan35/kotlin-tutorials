open class Grandfather{
    var x = "ABC"
    fun displayX(){
        println("X : $x")
    }
}
open class Father2 : Grandfather() {
    var y = "DEF"
    fun displayY(){
        println("Y : $y")
    }
}
class Son2 : Father2(){
    var z = "GHI"
    fun displayZ(){
        println("Z : $z")
    }
}

fun main() {
    var son = Son2()
    son.displayX()
    son.displayY()
    son.displayZ()
}