fun addition(a:Int,b:Int,c:Int):Int{
    return a+b+c
}
fun subtraction(a:Int,b:Int,c:Int):Int{
    return a-b-c
}
fun multiplication(a:Int,b:Int,c:Int):Int{
    return a*b*c
}
fun division(a:Int,b:Int):Int{
    return a/b
}
fun main()
{
    var sum = addition(111, 2222, -222)
    println("Addition of 111, 2222, -222 is $sum")
    var sub = subtraction(111, 2222, -222)
    println("Subtraction of 111, 2222, -222 is $sub")
    var mul = multiplication(111, 2222, -222)
    println("Multiplication of 111, 2222, -222 is $mul")
    var div = division(2222, 111)
    println("Division of 2222, 111 is $div")
}
