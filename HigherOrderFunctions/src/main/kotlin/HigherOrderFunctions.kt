fun sumTwoNumbers(a:Int, b:Int, higherOrderFunction:()->Unit){  //unit means it does not return anything
    println("Sum : ${a+b}")
    higherOrderFunction()
}
//fun cubeKardo(a:Int, cubeDisplay:(message:String)->Unit){
//    println("Cube result : ${a * a * a}")
//    cubeDisplay("")
//}
fun multipleArgsFunction(vararg num:Int){
    for(i in num){
        println(i)
    }
}
fun main(){
    val func = {
        println("Function sent as parameter")
    }
    sumTwoNumbers(1,2, func)
//    cubeKardo(2) { "message sent through parameter" }
    multipleArgsFunction(1,2,3,4,5)
}