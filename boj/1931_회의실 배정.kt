package boj

fun main(){
    val n = readln().toInt()
    val array = ArrayList<Pair<Int, Int>>(n)
    var count = 1

    repeat(n) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        array.add(Pair(a, b))
    }

    array.sortWith(compareBy({it.second},{it.first}))
    println(array[0])

    var end = array[0].second
    println(end)

    for(i in 0 until n){
        if (array[i].first >= end ){
            count++
            end = array[i].second
        }
    }

    print(count)
}