fun main() {

    var a = 10
    var b = 20

    println("********** With Using Third Variable **********")
    println("Before Swapping:")
    println("The value of a is: $a and value of b is: $b")

    var temp = a
    a = b
    b = temp

    println("After Swapping:")
    println("The value of a is: $a and value of b is: $b")

    var x = 10
    var y = 20

    println("\n********** Without Using Third Variable **********")
    println("Before Swapping:")
    println("The value of x is: $x and value of y is: $y")

    x = x + y
    y = x - y
    x = x - y

    println("After Swapping:")
    println("The value of x is: $x and value of y is: $y")
}