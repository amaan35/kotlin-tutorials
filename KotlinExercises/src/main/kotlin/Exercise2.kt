import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`)
    println("Please enter the radius of the circle : ")
    var radius = scan.nextDouble()
    var area = 3.14*radius*radius
    var circumference = 2*3.14*radius
    println("The area of the circle is $area and the circumference is $circumference")
}