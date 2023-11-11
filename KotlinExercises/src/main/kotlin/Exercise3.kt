import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`)
    println("Enter the two values that need to be swapped : ")
    var x = scan.nextInt()
    var y = scan.nextInt()
    println("The values are x = $x and y = $y")
    var temp = x
    x=y
    y=temp
    println("The swapped values are x = $x and y = $y")
}