fun factorial(n: Int): Long {
    return if (n <= 1) {
        1L
    } else {
        n * factorial(n - 1)
    }
}

fun main() {
    val number = 5
    println("Factorial of $number is ${factorial(number)}")
}
