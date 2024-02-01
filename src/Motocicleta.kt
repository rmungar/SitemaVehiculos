class Motocicleta(override val marca: String, override val modelo: String, override val capacidadCombustible: Int, cilindrada:Int) : Vehiculo(marca, modelo, capacidadCombustible) {
    val cilindrada:Int = cilindrada

    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia()-40
    }

    override fun mostrarInformacion() {
        println("$marca $modelo con $capacidadCombustible L de capacidad de combustible y $cilindrada cilindradas")
    }
}