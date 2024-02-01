fun main() {
    val airbus = Vehiculo("Airbus","Boeing",10000)
    airbus.mostrarInformacion()
    println(airbus.calcularAutonomia())
    val coche = Automovil("Dodge", "Charger", 500, "deportivo")
    coche.mostrarInformacion()
    println(coche.calcularAutonomia())
    val moto = Motocicleta("Kawasaki", "Krico", 200, 120)
    moto.mostrarInformacion()
    println(moto.calcularAutonomia())
}