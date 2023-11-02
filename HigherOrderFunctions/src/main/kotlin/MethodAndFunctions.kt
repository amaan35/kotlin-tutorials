fun func(){
    println("This is called a function as it is outside a class, it represents functional programming")
}
class MethodAndFunctions{
    fun method(){
        println("This is a method as it is inside a class, an object of this class " +
                "needs to be created to call this function")
    }
}

fun main() {
    func()
    val meth = MethodAndFunctions()
    meth.method()
}