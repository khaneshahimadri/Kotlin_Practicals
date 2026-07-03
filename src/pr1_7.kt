fun factorial(n: Int): Int {
    return if (n == 0 || n == 1)
        1
    else
        n * factorial(n - 1)
}

fun main() {
    print("Enter Number: ")
    val num = readLine()!!.toInt()

    val result = factorial(num)

    println("Factorial of $num = $result")
}