//the getter and setters are auto generated which is displayed here
class Student{
    var studentName:String="Syed Amaan"
        get() {
            println("Getting studentName")
            return field
        }
        set(value) {
            println("Setting studentName")
            field = value
        }
    var studentId:Int=0
        get() {
            println("getting studentId")
            return field
        }
        set(value) {
            if(value<0){
                println("Value should not be negative")
            }
            println("Setting studentId")
            field = value
        }
    fun printStudent(){
        println("$studentId $studentName")
    }
}

fun main() {
    var student = Student()
    println(student.studentName)
    student.studentName="Syed Amaan Ali"
    println(student.studentId)
    student.studentId=1
    student.printStudent()
}