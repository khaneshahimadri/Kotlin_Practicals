open class Product(
    var productName: String,
    var quantity: Int,
    var amount: Double
) {

    constructor() : this("", 0, 0.0)

    open fun display() {
        println("Product Name : $productName")
        println("Quantity     : $quantity")
        println("Amount       : $amount")
    }
}