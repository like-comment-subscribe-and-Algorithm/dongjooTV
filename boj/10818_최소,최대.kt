import kotlin.math.*

fun main(){
    val N = readln().toInt()
    val number = readln().split(" ")

    var minNum = number[0].toInt()
    var maxNum = number[0].toInt()

    for (i in number) {
        var num = i.toInt()
        minNum = min(minNum, num)
        maxNum = max(maxNum, num)
    }

    println("$minNum $maxNum")
}