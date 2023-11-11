fun main() {
    var arr = arrayOf(1,2,3,4,5)
    var even = 0
    var odd = 0
    for (i in arr){
        if (i%2==0){
            even++
        }
        else{
            odd++
        }
    }
    println("Even numbers : $even\nOdd numbers : $odd")
}