class Laptop(
    productName: String,
    quantity: Int,
    amount: Double,
    var cpu: String,
    var ram: String,
    var hdd: String
) : Product(productName, quantity, amount) {

    constructor() : this("", 0, 0.0, "", "", "")

    override fun display() {
        super.display()
        println("CPU          : $cpu")
        println("RAM          : $ram")
        println("HDD          : $hdd")
        println("----------------------------")
    }
}