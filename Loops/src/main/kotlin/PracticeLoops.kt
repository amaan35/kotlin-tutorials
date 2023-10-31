fun main(){
    println("Enter a number to check number of digits in it : ")
    countDigits(readln().toInt())
    println("Enter a number to reverse it : ")
    reverseNum(readln().toInt())
}
fun reverseNum(num:Int){
    var n=num
    var rev = 0
    while (n!=0){
        val r = n%10
        rev = rev*10+r
        n=n/10
    }
    println("$rev")
}
fun countDigits(num:Int){
    var count = 0
    var n = num
    while (n>0) {
        n=n/10
        count++
    }
    println("Number of digits : $count")
}