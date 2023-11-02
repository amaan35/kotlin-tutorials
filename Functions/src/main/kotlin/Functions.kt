fun main(){
    nonParameterizedFunction()
    parameterizedFunction1(50)
    parameterizedFunction2(96, "Ali")
    println(returningNonParameterizedFunction())
    println(returningParameterizedFunction(20, 30))
    defaultParameterizedFunction("parameterized message")
}
fun nonParameterizedFunction(){
    println("Display function")
}
fun parameterizedFunction1(marks:Int){
    println("The amount of money : $marks")
}
fun parameterizedFunction2(marks:Int, studentName:String){
    println("$studentName has $marks marks")
}
fun returningNonParameterizedFunction():Int{
    val a=10
    val b=20
    return a+b
}
fun returningParameterizedFunction(a:Int, b:Int):Int{
    return a+b
}
fun defaultParameterizedFunction(message:String="Default message"){
    println(message)
}