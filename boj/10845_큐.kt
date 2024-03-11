import java.util.*

fun main(){
    val n = readln().toInt()
    val queue = LinkedList<Int>()

    repeat(n){
        val input = readln().split(" ")

        when(input[0]){
            "push" -> queue.add(input[1].toInt())
            "pop" -> println(if(queue.isEmpty()) -1 else queue.poll())
            "size" -> println(queue.size)
            "empty" -> println(if(queue.isEmpty()) 1 else 0)
            "front" -> println(if(queue.isEmpty()) -1 else queue.element())
            "back" -> println(if(queue.isEmpty()) -1 else queue.last())
        }
    }
}