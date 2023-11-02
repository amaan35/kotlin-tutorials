fun main() {
    println("Program started")
    val student1 = Student()
    val student2 = Student()
    val student3 = Student()
    student1.addStudent(1, "Syed")
    student2.addStudent(2, "Amaan")
    student3.addStudent(3, "Ali")
    student1.showStudent()
    student2.showStudent()
    student3.showStudent()
}
class Student{
    var name:String = ""
    var id:Int = 0
    fun addStudent(id:Int, name:String){
        this.id = id
        this.name = name
    }
    fun showStudent(){
        println(id)
        println(name)
    }
}