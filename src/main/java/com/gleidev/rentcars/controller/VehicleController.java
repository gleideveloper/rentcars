package com.gleidev.rentcars.controller;

import com.gleidev.rentcars.model.Vehicle;
import com.gleidev.rentcars.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    private ServiceRegistry serviceRegistry;

    @PostMapping
    public void processStudentDetails(@RequestBody Vehicle vehicle){
        serviceRegistry.getService(vehicle.getVehicleType()).process(vehicle);
    }
}
