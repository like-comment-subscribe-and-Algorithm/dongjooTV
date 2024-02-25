package boj

import java.util.*

fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    val order = readln().split(" ").map { it.toInt() }.toIntArray()
    val queue = LinkedList<Int>()
    var count = 0
    var result = 0

    for(i in 1 .. n){
        queue.add(i)
    }

    while (count != m) {
        // 첫 번째 원소 뽑아내기
        if (queue.first == order[count])
            queue.poll()
        else {
            for ( i in 1..<queue.size){
                //왼쪽으로 한 칸 이동
                if(queue[queue.size-i] == order[count]){
                    while (queue[0] != order[count]) {
                        queue.add(0, queue.last)
                        queue.removeLast()
                        result++
                    }
                    queue.poll()
                    break
                }else if (queue[i] == order[count]) { // 오른쪽으로 한 칸 이동
                    while (queue[0] != order[count]) {
                        queue.add(queue.first)
                        queue.removeFirst()
                        result++
                    }
                    queue.poll()
                    break
                }
            }
        }
        count++
    }
    println(result)
}