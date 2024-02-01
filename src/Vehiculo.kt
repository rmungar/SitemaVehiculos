open class Vehiculo(marca:String, modelo:String, capacidadCombustible:Int) {
    open val marca = marca.replaceFirstChar { it -> it.uppercase() }
    open val modelo = modelo.replaceFirstChar { it -> it.uppercase() }
    open val capacidadCombustible = capacidadCombustible

    open fun mostrarInformacion() {
        println("$marca $modelo con $capacidadCombustible L de capacidad de combustible")
    }
    open fun calcularAutonomia():Int {
        return capacidadCombustible*10
    }
}