data class DataClassesExample(val name:String, val age:Int){

}

fun main() {
    val example=DataClassesExample("Syed Amaan Ali", 22)
    println(example)
    val exampleCopy = example.copy()
    println(exampleCopy)
}