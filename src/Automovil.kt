class Automovil(override val marca: String, override val modelo: String, override val capacidadCombustible: Int, tipo:String) : Vehiculo(marca,modelo,capacidadCombustible) {

    val tipo:String = tipo
    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia()+100
    }

    override fun mostrarInformacion() {
        println("$marca $modelo de tipo $tipo con $capacidadCombustible L de capacidad de combustible")
    }
}