fun main(){
//    println("Enter a number : ")
//    val number = readln().toInt()
//    if(number<0){
//        println("$number is negative")
//    }
//    else if(number==0){
//        println("$number is equal to 0")
//    }
//    else{
//        println("$number is positive")
//    }
    //short program
    println("Enter marks : ")
    val marks = readln().toInt()
//    if(marks in 91..100){
//        println("Grade A")
//    }else if (marks in 81 .. 90){
//        println("Grade B")
//    }else{
//        println("FAIL")
//    }
    print("Enter a number : ")
    val grade: Char = when(marks){
        in 91..100 -> 'A'
        in 81..90 -> 'B'
        in 71..80 -> 'C'
        else -> 'F'
    }
    println("$grade")
}