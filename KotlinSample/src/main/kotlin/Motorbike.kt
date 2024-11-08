class Motorbike(
    override val id: String,
    override val name: String,
    override val color: String,
    override val price: Double,
    override val brand: String,
    val speed: Int,
    val requiresLicense: Boolean
) : Vehicle {
    override fun displayInfo(): String {
        return "Motorbike(id='$id', name='$name', color='$color', price=$price, brand='$brand', speed=$speed, requiresLicense=$requiresLicense)"
    }

    fun makeSound() {
        println("Tin tin tin")
    }
}