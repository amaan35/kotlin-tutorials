open class Extended {
    var a=10
    var b=5
    open var c=20
    open fun operate(){
        println("Addition of $a and $b is ${a+b}")
    }
}
class Extend : Extended(){
    override var c=25
    override fun operate(){
        println("Multiplication of $a and $b is ${a*b}")
    }
}

fun main() {
    var obj = Extended()
    obj.operate()
    println(obj.c)
    var obj2 = Extend()
    obj2.operate()
    println(obj2.c)
}