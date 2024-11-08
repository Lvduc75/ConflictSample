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

    while (true) {
        displayMenu()
        print("Choose an option: ")
        when (scanner.nextInt()) {
            0 -> {
                print("Enter filename: ")
                manager.loadVehiclesFromFile(scanner.next())
            }

            1 -> {
                // Add vehicle logic here
            }

            2 -> {
                print("Enter vehicle ID to update: ")
                manager.updateVehicleById(scanner.next())
            }

            3 -> {
                print("Enter vehicle ID to delete: ")
                manager.deleteVehicleById(scanner.next())
            }


            7 -> return
            else -> println("Invalid option. Please try again.")
        }
    }
}
