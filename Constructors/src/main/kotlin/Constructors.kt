fun main() {
    var student1 = Student(1, "Syed")
    student1.printDetails()
    var student2 = Student("Amaan")
    student2.printDetails()
}
class Student constructor(var id:Int, var name:String){

    init {
        println("Init block called")
    }
    constructor(name:String): this(2,name){
        println("Secondary constructor called $name")
    }
    fun printDetails(){
        println("$id : $name")
    }
}