class Car(
    var type: String,
    var model: Int,
    var price: Double,
    var owner: String,
    var milesDriven: Int
) {

    init {
        println("Object of class is created and Init is called.")
    }

    fun getCarInfo() {
        println("Car Information: $type, $model")
    }

    fun getOriginalPrice() {
        println("Original Car Price: $price")
    }

    fun getCurrentPrice() {
        val currentPrice = price - (milesDriven * 10)
        println("Current Car Price: $currentPrice")
    }

    fun displayInfo() {
        println("----------------------")
        getCarInfo()
        println("Car Owner: $owner")
        println("Miles Drive: $milesDriven")
        getOriginalPrice()
        getCurrentPrice()
        println("----------------------")
    }
}

fun main() {

    println("Creating Car Class Object car1")
    val car1 = Car("BMW", 2018, 100000.0, "Aman", 105)
    car1.displayInfo()

    println()

    println("Creating Car Class Object car2")
    val car2 = Car("BMW", 2019, 400000.0, "Karan", 20)
    car2.displayInfo()

    println()

    println("****** ArrayList of Car ******")

    val carList = ArrayList<Car>()

    carList.add(Car("Toyota", 2017, 1080000.0, "KJS", 100))
    carList.add(Car("Maruti", 2020, 4000000.0, "NPP", 200))

    for (car in carList) {
        car.displayInfo()
    }
}