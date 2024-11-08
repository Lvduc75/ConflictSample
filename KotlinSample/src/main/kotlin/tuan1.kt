import java.util.Scanner

fun displayMenu() {
    println(
        """
        System Service:
        1. Load data from file
        2. Add new vehicle
        3. Update vehicle by ID
        4. Delete vehicle by ID
        5. Search vehicle
        6. Show vehicle list
        7. Save data to file
        8. Quit
    """.trimIndent()
    )
}

fun main() {
    val manager = VehicleManager()
    val scanner = Scanner(System.`in`)

    
}
