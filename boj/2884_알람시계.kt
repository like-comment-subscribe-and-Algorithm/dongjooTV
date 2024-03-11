fun main(){
    val time = readln().split(" ").map { it.toInt() }.toMutableList()

    val min = time[1] - 45

    if(min < 0){
        time[1] = 60 + min
        time[0] -= 1
    }else {
        time[1] = min
    }

    if (time[0] < 0) {
        time[0] = 23
    }

    println(time.joinToString(" "))
}