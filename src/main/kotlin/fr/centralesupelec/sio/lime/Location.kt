package fr.centralesupelec.sio.lime

class Location(
    var latitude: Double,
    var longitude: Double //val ==final in java
) {
    override fun toString() = "[ $latitude - $longitude ]"
}
