fun main() {

    val intValue = 10
    val doubleFromInt = intValue.toDouble()


    val strValue = "10"
    val intValue1 = strValue.toInt()
    val intValue2 = Integer.parseInt(strValue)


    val strDouble = "11.12"
    val doubleFromString = strDouble.toDouble()


    println("Integer Value:$intValue")
    println("Double Value (From Integer):$doubleFromInt")
    println("String Value:$strValue")
    println("Integer Value1 (From String):$intValue1")
    println("Integer Value2 (From String):$intValue2")
    println("Double Value (From String):$doubleFromString")
}