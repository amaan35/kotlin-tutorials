import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`)
    println("Enter three numbers to check the greatest of them : ")
    var x = scan.nextInt()
    var y = scan.nextInt()
    var z = scan.nextInt()
    if (x>y){
        if (x>z){
            println("$x is greatest")
        }
        else
            println("$z is greatest")
    }
    else{
        if (y>z){
            println("$y is greatest")
        }
        else
            println("$z is greatest")
    }
}