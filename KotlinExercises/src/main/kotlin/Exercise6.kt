fun main() {
    var arr1 = arrayOf(1,2,3,4)
    var arr2 = arrayOf(2,3,4,5)
    var result = ""
    for(i in arr1.indices){
        result += arr1[i] * arr2[i]
        result += " "
    }
    println(result)
}