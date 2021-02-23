package fr.centralesupelec.sio.lime

import kotlin.random.Random

object VehicluesRepository {

    private const val PARIS_LAT_MIN = 48.816
    private const val PARIS_LAT_MAX = 48.900
    private const val PARIS_LNG_MIN = 2.259
    private const val PARIS_LNG_MAX = 2.414

    private val allVehicles: List<Vehicle>


    init {
        val vehicles = mutableListOf<Vehicle>()
        for (i in 0..49) {
            vehicles.add(Scooter(i))
        }
        for (i in 50..99) {
            vehicles.add(Bike(i))
        }
        /*vehicles.forEach { vehicle ->
            vehicle.location = Location(48.850, 2.30)
        }*/
        vehicles.forEach {
            it.location = Location(
                latitude = Random.nextDouble(PARIS_LAT_MIN, PARIS_LAT_MAX),
                longitude = Random.nextDouble(PARIS_LNG_MIN, PARIS_LNG_MAX)
            )
        }
        allVehicles = vehicles
    }

    fun getVehicles(): List<Vehicle> {
        return allVehicles
    }
}