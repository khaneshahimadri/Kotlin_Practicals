fun main() {

    val firstMatrix = Matrix(
        arrayOf(
            intArrayOf(3, -2, 5),
            intArrayOf(3, 0, 4)
        ),
        2,
        3
    )

    val secondMatrix = Matrix(
        arrayOf(
            intArrayOf(2, 3),
            intArrayOf(-9, 6),
            intArrayOf(0, 4)
        ),
        3,
        2
    )

    val secondMatrix1 = Matrix(
        arrayOf(
            intArrayOf(6, 3),
            intArrayOf(9, 0),
            intArrayOf(5, 4)
        ),
        3,
        2
    )

    println("******** Addition ********")

    println("Matrix 1:")
    println(secondMatrix1)

    println("Matrix 2:")
    println(secondMatrix)

    val add = secondMatrix1 + secondMatrix

    println("Addition Result:")
    println(add)

    println("******** Subtraction ********")

    val sub = secondMatrix1 - secondMatrix

    println("Subtraction Result:")
    println(sub)

    println("******** Multiplication ********")

    println("Matrix 1:")
    println(firstMatrix)

    println("Matrix 2:")
    println(secondMatrix)

    val mul = firstMatrix * secondMatrix

    println("Multiplication Result:")
    println(mul)
}