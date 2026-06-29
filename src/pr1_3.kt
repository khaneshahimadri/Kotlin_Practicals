fun main() {
    println("student Enrollment number")
    val enrollmentnumber: String = readln()
    println("student name")
    val name: String? = readLine()
    println("student branch")
    val branch: String = readln()
    println("student class")
    val classname: String? = readLine()
    println("student batch")
    val batch: String? = readLine()
    println("student collage name")
    val collagename: String? = readLine()
    println("student university name")
    val universityname: String? = readLine()
    println("student age")
    val Age: String = readln()
    println("student's data")
    println("enrollment number=" + enrollmentnumber)
    println("name:" + name)
    println("branch:" + branch)
    println("class:" + classname)
    println("batch:" + batch)
    println("collage name:" + collagename)
    println("university name:" + universityname)
    println("age:" + Age)

    var s_name: String? = "23"
    //s_name = "23"
    val age:Int = s_name!!.toInt()
    println(age)

}