class Matrix(
    private val matrix: Array<IntArray>,
    private val noOfRow: Int,
    private val noOfCol: Int
) {

    operator fun plus(other: Matrix): Matrix {
        val result = Array(noOfRow) { IntArray(noOfCol) }

        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                result[i][j] = matrix[i][j] + other.matrix[i][j]
            }
        }

        return Matrix(result, noOfRow, noOfCol)
    }

    operator fun minus(other: Matrix): Matrix {
        val result = Array(noOfRow) { IntArray(noOfCol) }

        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                result[i][j] = matrix[i][j] - other.matrix[i][j]
            }
        }

        return Matrix(result, noOfRow, noOfCol)
    }

    operator fun times(other: Matrix): Matrix {

        val result = Array(noOfRow) { IntArray(other.noOfCol) }

        for (i in 0 until noOfRow) {
            for (j in 0 until other.noOfCol) {
                for (k in 0 until noOfCol) {
                    result[i][j] += matrix[i][k] * other.matrix[k][j]
                }
            }
        }

        return Matrix(result, noOfRow, other.noOfCol)
    }

    override fun toString(): String {

        var output = "(${noOfRow} x ${noOfCol} Matrix):\n"

        for (i in matrix) {
            for (j in i) {
                output += "$j\t"
            }
            output += "\n"
        }

        return output
    }
}