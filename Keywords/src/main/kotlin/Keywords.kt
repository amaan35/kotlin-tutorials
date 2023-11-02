import java.util.ArrayList as SubList
fun main(){
    val ob:Any = "String"
    val str:String = ob as String
    println(str.length)
    var list = SubList<String>()
    list.add("Syed")
    list.add("Amaan")
    list.add("Ali")
    println(list)
    for(i in list){
        println(i)
    }
    var str2 = "4"
    if(str2 is String){
        println("is String")
    }
}