class Student(
    firstName: String,
    lastName: String,
    age: Int,
    var enrollment: String,
    var branch: String,
    var studentClass: String,
    var batch: String
) : Person(firstName, lastName, age) {

    constructor() : this("", "", 0, "", "", "", "")

    override fun display() {
        super.display()
        println("Enrollment   : $enrollment")
        println("Branch       : $branch")
        println("Class        : $studentClass")
        println("Lab Batch    : $batch")
        println("----------------------------")
    }
}