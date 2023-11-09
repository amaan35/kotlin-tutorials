interface MyInterface{
    val s:String
    fun fun1()
    fun fun2(){
        println("An interface function which has a body")
    }
}
class ImplMyInterface : MyInterface{
    override val s: String = "This is string in interface"

    override fun fun1() {
        println("This is an interface function whose body is created in class")
    }
}

fun main() {
    var impl=ImplMyInterface()
    println(impl.s)
    impl.fun1()
    impl.fun2()
}