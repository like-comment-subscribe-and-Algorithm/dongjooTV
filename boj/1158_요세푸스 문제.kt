package boj

import java.util.*

fun main(){
    val (n, k) = readln().split(" ").map { it.toInt() }
    val queue = LinkedList<Int>()

    for(i in 1 .. n){
        queue.add(i)
    }

    print("<")
    while(queue.isNotEmpty()){
        var index = 0
        while(queue.isNotEmpty() && index < k-1){
            val front = queue.poll()
            // 맨 앞에 수를 맨 뒤로 추가
            queue.add(front)
            index++
        }
        print("${queue.poll()}")
        if(queue.isNotEmpty()){
            print(", ")
        }
    }
    print(">")
}