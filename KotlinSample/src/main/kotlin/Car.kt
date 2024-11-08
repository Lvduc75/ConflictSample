class Car(
    override val id: String,
    override val name: String,
    override val color: String,
    override val price: Double,
    override val brand: String,
    val type: String,
    val yearOfManufacture: Int
) : Vehicle {
    override fun displayInfo(): String {
        return "Car(id='$id', name='$name', color='$color', price=$price, brand='$brand', type='$type', yearOfManufacture=$yearOfManufacture)"
    }
}