package boj

var answer = 0
var sum = 0

fun main() {
    val (n, s) = readln().split(" ").map { it.toInt() }
    val inputs: List<Int> = readln().split(" ").map { it.toInt() }

    solve(0, 0, n, s, inputs)
    println(answer)
}

fun solve(index: Int, count: Int, n: Int, s: Int, inputs: List<Int>) {

    if (count > 0 && sum == s) {
        answer++
    }

    for (i in index until n) {
        sum += inputs[i]
        solve(i + 1, count + 1, n, s, inputs)
        sum -= inputs[i]
    }
}