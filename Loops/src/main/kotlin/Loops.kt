fun main(){
    var count = 1
    while (count<=10){
        println(count)
        count++
    }
    do {
        println(count)
        count++
    }while (count<=10)
    for(count in 11..20){
        println(count)
    }
    for(count in 20 downTo 11){
        println(count)
    }
    for (count in 11..30 step 2){
        println(count)
    }
}