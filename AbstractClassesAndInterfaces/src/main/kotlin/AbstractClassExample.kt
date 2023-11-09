abstract class AbsClass{
    abstract val str:String
    fun concreteFunction(){
        println("This is a complete function with body")
    }
    abstract fun absFunction()
}
class Inherit:AbsClass(){
    override val str: String = "This is a string"

    override fun absFunction() {
        println("This is an abstract function's body completed in the child class")
    }
}

fun main() {
    var i = Inherit()
    println(i.str)
    i.concreteFunction()
    i.absFunction()
}