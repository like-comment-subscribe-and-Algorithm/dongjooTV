
fun main(){
    val length = readLine()?.toInt()
    val n = readLine()
    var sum = 0

    for (i in 0..<length!!) {
        sum += n?.get(i).toString().toInt()
    }

    println(sum)
}