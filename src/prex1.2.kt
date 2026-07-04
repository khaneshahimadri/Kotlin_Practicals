fun main() {

    val laptopList = ArrayList<Laptop>()

    laptopList.add(Laptop("Dell", 2, 50000.0, "i5", "8GB", "512GB"))
    laptopList.add(Laptop("HP", 1, 55000.0, "i7", "16GB", "1TB"))
    laptopList.add(Laptop("Lenovo", 3, 48000.0, "Ryzen 5", "8GB", "512GB"))
    laptopList.add(Laptop("Asus", 2, 62000.0, "i7", "16GB", "512GB"))
    laptopList.add(Laptop("Acer", 1, 45000.0, "i3", "8GB", "256GB"))

    println("Laptop Details\n")

    for (laptop in laptopList) {
        laptop.display()
    }
}