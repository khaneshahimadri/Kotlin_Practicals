open class Person(
    var firstName: String,
    var lastName: String,
    var age: Int
) {

    constructor() : this("", "", 0)

    open fun display() {
        println("First Name   : $firstName")
        println("Last Name    : $lastName")
        println("Age          : $age")
    }
}