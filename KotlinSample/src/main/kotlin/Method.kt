// Định nghĩa lớp Person
class Person(val name: String, val age: Int) {

    // Hàm để in thông tin của người
    fun printInfo() {
        println("Name: $name")
        println("Age: $age")
    }
}

// Hàm main để chạy chương trình
fun main() {
    // Tạo đối tượng của lớp Person
    val person = Person("John Doe", 25)

    // Gọi hàm printInfo để in thông tin của người
    person.printInfo()
}
