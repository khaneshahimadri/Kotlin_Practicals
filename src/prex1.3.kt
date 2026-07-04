fun main() {

    val studentList = ArrayList<Student>()

    studentList.add(Student("Rahul", "Patel", 20, "101", "CE", "B.Tech", "A1"))
    studentList.add(Student("Priya", "Shah", 19, "102", "IT", "B.Tech", "A2"))
    studentList.add(Student("Amit", "Joshi", 21, "103", "CE", "B.Tech", "B1"))
    studentList.add(Student("Neha", "Patel", 20, "104", "CSE", "B.Tech", "B2"))
    studentList.add(Student("Karan", "Mehta", 22, "105", "IT", "B.Tech", "C1"))

    println("Student Details\n")

    for (student in studentList) {
        student.display()
    }
}