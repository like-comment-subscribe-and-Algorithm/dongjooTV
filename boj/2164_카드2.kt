import java.util.*

fun main(){
    val n = readln().toInt()
    val queue = LinkedList<Int>()

    for(i in 1 .. n){
        queue.add(i)
    }

    while (queue.size > 1) {
        queue.pollFirst()
        val a = queue.pollFirst()
        queue.addLast(a)
    }

    print(queue.poll())

}