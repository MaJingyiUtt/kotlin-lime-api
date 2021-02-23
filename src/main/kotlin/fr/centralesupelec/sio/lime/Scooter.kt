package fr.centralesupelec.sio.lime

class Scooter(id: Int) : Vehicle(id) {

    var batteryLevel: Short = 100

    val lowBattery: Boolean
        get() = batteryLevel < 15

    override fun toString(): String {
        return "Scooter ($batteryLevel): $location"
    }
}