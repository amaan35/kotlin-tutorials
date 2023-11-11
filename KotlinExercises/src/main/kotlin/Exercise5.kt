import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`)
    println("Please enter a string to be reversed : ")
    var str = scan.nextLine()
    reverse(str)
}

fun reverse(str: String) {
    var str = str.toCharArray()
    var reverseStr = ""
    for(c in str.size-1 downTo 0){
        reverseStr += str[c]
    }
    println(reverseStr)
}
