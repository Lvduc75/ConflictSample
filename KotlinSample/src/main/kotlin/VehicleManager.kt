import java.io.File

class VehicleManager {
    private val vehicles = mutableListOf<Vehicle>()

    fun loadVehiclesFromFile(filename: String) {
        val file = File(filename)
        if (file.exists()) {
            file.forEachLine { line ->
                val data = line.split(",")
                when (data[0]) {
                    "Car" -> vehicles.add(
                        Car(data[1], data[2], data[3], data[4].toDouble(), data[5], data[6], data[7].toInt())
                    )
                    "Motorbike" -> vehicles.add(
                        Motorbike(data[1], data[2], data[3], data[4].toDouble(), data[5], data[6].toInt(), data[7].toBoolean())
                    )
                }
            }
            println("Data loaded successfully!")
        } else {
            println("File not found!")
        }
    }

    fun addVehicle(vehicle: Vehicle) {
        vehicles.add(vehicle)
    }

    fun updateVehicleById(id: String) {
        val vehicle = vehicles.find { it.id == id }
        if (vehicle != null) {
            // Logic to update vehicle properties
        } else {
            println("Vehicle not found.")
        }
    }

    fun deleteVehicleById(id: String) {
        val vehicle = vehicles.find { it.id == id }
        if (vehicle != null) {
            vehicles.remove(vehicle)
            println("Vehicle deleted.")
        } else {
            println("Vehicle not found.")
        }
    }

    fun searchByName(name: String) {
        val results = vehicles.filter { it.name.contains(name, ignoreCase = true) }.sortedByDescending { it.name }
        results.forEach { println(it.displayInfo()) }
    }

    fun searchById(id: String) {
        val vehicle = vehicles.find { it.id == id }
        println(vehicle?.displayInfo() ?: "Vehicle not found.")
    }

    fun showAllVehicles() {
        vehicles.forEach { println(it.displayInfo()) }
    }

    fun showVehiclesByDescendingPrice() {
        vehicles.sortedByDescending { it.price }.forEach {
            println(it.displayInfo())
            if (it is Motorbike) it.makeSound()
        }
    }

    fun saveVehiclesToFile(filename: String) {
        File(filename).printWriter().use { writer ->
            vehicles.forEach { vehicle ->
                val data = when (vehicle) {
                    is Car -> "Car,${vehicle.id},${vehicle.name},${vehicle.color},${vehicle.price},${vehicle.brand},${vehicle.type},${vehicle.yearOfManufacture}"
                    is Motorbike -> "Motorbike,${vehicle.id},${vehicle.name},${vehicle.color},${vehicle.price},${vehicle.brand},${vehicle.speed},${vehicle.requiresLicense}"
                    else -> ""
                }
                writer.println(data)
            }
        }
        println("Data saved successfully!")
    }
}