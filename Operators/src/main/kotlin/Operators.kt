fun main(){
    println("Arithmetic Operators")
    //arithmetic operators
    val x = 10
    val y = 5
    println(x+y)
    println(x-y)
    println(x*y)
    println(x/y)
    println(x%y)
    println(x.plus(y))
    println(x.minus(y))
    //Increment operator
    var temp = 60
    temp++
    println(temp)
    val incremented = temp.inc()
    println(incremented)
    println("Comparison Operators")
    //Comparison operator
    var a = 1
    var b = 2
    println(a==b)
    println(a!=b)
    println(a<b)
    println(a>b)
    println(a<=b)
    println(a>=b)

    println("Logical Operators")
    //Logical operators
    var match1 = true
    var match2 = false
    println(match1 || match2)
    println(match1 && match2)

}