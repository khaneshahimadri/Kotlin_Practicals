fun main() {

    val list = ArrayList<Int>()

    for (i in 0..4) {
        print("a[$i] = ")
        list.add(readLine()!!.toInt())
    }

    var max = list[0]

    for (i in list) {
        if (i > max)
            max = i
    }

    println("Largest element = $max")
}