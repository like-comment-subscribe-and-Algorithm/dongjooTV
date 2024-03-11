package boj

import java.util.*

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val input = readln()
        val stack = Stack<Char>()

        for (char in input) {
            if (char == '(') {
                stack.push(char)
            } else if (char == ')' && stack.isNotEmpty()) {
                stack.pop()
            } else {
                println("NO")
                return@repeat
            }
        }

        if (stack.isEmpty()) {
            println("YES")
        } else {
            println("NO")
        }
    }
}

