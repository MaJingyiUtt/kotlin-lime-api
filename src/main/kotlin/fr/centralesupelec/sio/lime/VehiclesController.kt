package fr.centralesupelec.sio.lime

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class VehiclesController {

    @GetMapping("vehicles")
    fun getItems():List<Vehicle> = VehicluesRepository.getVehicles()

}