// Data class đại diện cho thông tin người dùng
data class User(val name: String, val age: Int)

// Hàm mở rộng (extension function) để in thông tin người dùng
fun User.printInfo() {
    println("User(name = $name, age = $age)")
}

// Hàm tính tuổi trung bình
fun averageAge(users: List<User>): Double {
    return users.map { it.age }.average()
}

// Higher-order function để lọc người dùng theo điều kiện tuỳ chỉnh
fun filterUsers(users: List<User>, predicate: (User) -> Boolean): List<User> {
    return users.filter(predicate)
}