import java.util.Scanner

fun displayMenu() {
    println(
        """
        Menu board:
        00. Load data from file.
        01. Add new vehicle.
        02. Update vehicle by ID.
        03. Delete vehicle by ID.
        04. Search vehicle.
        05. Show vehicle list.
        06. Save data to file.
        07. Quit.
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

            4 -> {
                println("1. Search by name\n2. Search by ID")
                when (scanner.nextInt()) {
                    1 -> {
                        print("Enter name to search: ")
                        manager.searchByName(scanner.next())
                    }

                    2 -> {
                        print("Enter ID to search: ")
                        manager.searchById(scanner.next())
                    }
                }
            }

            5 -> {
                println("1. Show all vehicles\n2. Show all vehicles (descending by price)")
                when (scanner.nextInt()) {
                    1 -> manager.showAllVehicles()
                    2 -> manager.showVehiclesByDescendingPrice()
                }
            }

            6 -> {
                print("Enter filename to save: ")
                manager.saveVehiclesToFile(scanner.next())
            }

            7 -> return
            else -> println("Invalid option. Please try again.")
        }
    }
}
