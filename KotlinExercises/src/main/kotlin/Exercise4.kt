import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`)
    println("Enter a string : ")
    var str = scan.nextLine()
    count(str)
}

fun count(str: String) {
    var ch = str.toCharArray()
    var num = 0
    var alpha = 0
    var special = 0
    var space = 0
    for(c in ch){
        if(Character.isDigit(c))
            num++
        else if (Character.isLetter(c)){
            alpha++
        }
        else if(Character.isSpaceChar(c)){
            space++
        }
        else{
            special++
        }
    }
    println("Space : $space\nLetter : $alpha\nNumber : $num\nSpecial : $special")
}
