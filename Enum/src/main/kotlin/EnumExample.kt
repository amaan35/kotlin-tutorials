enum class DAY(val num:Int) {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7)
}

fun main() {
    println(DAY.TUESDAY.num)
    println(DAY.FRIDAY.num)
    val monday = DAY.MONDAY
    println(monday.num)
}