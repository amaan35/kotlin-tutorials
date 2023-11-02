fun main(){
    var func = {
        println("Lambda function")
    }
    val square = {
        x:Int->x*x
    }
    val addition1 = {
        x:Int, y:Int->x+y
    }
    val addition2 = {
        x:Int, y:Int->
            println("Multiple lines lambda function")
            x+y
    }
    func()
    println(square(2))
    println("Addition using lambda function : ${addition1(5, 8)}")
    println(addition2(3,2))
}