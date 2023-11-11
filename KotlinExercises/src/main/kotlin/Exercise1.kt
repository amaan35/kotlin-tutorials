import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`)
    println("Enter numerator : ")
    var numerator = scan.nextInt()
    println("Enter denominator : ")
    var denominator = scan.nextInt()
    var quotient = numerator/denominator
    println("Quotient : $quotient")
    var remainder = numerator%denominator
    println("Remainder : $remainder")
}