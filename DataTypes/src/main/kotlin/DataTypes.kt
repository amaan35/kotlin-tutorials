class User(val name:String, val phone:String, val address:String){
    fun printAll(){
        println("Name : $name Phone : $phone Address : $address")
    }
}
fun main(){
    val number1:Int = 30
    val number2: Byte = 12
    val number3: Short = 56
    val number4: Long = 87834
    val number5: Float = 34.56F
    val number6: Double = 34.564
    val character1: Char = 'A'
    val isActive:Boolean = true
    val username: String = "Syed Amaan Ali"
    var namesArray = arrayOf("Syed", "Amaan", "Ali")
    println(number1)
    println(number2)
    println(number3)
    println(number4)
    println(number5)
    println(number6)
    println(character1)
    println(isActive)
    println(username)
    println(namesArray[0])
    println(namesArray[1])
    println(namesArray[2])

    val user1:User = User("Amaan", "123345688", "Delhi")
    user1.printAll()
}