
fun main(){
    val input = readln()
    val map = mutableMapOf<Char, Int>()

    input.forEach {
        val char = it.uppercaseChar()

        if(map.containsKey(char)){
            map[char] = map[char]!!.plus(1)
        }else{
            map.put(char, 1)
        }
    }

    val max = map.maxBy { it.value }
    if (map.filter { it.value == max.value }.count() > 1) {
        print("?")
    } else {
        print(max.key)
    }

}