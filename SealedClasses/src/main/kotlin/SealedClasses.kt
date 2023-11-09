enum class DAY(val num:Int){
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    fun printFormattedDay(){
        println("Day is $this")
    }
}
sealed class Human{
    class Boy(val name:String) : Human()
    class Girl(val name:String) : Human()
    fun display(human: Human){
        when(human){
            is Boy-> println("${human.name} is a boy")
            is Girl-> println("${human.name} is a girl")
        }
    }
}
fun main() {
    val day:DAY=DAY.SUNDAY
    day.printFormattedDay()
    val boy1=Human.Boy("boy1")
    val boy2=Human.Boy("boy2")
    val girl1=Human.Girl("girl1")
    boy1.display(boy1)
    boy2.display(boy2)
    girl1.display(girl1)
}