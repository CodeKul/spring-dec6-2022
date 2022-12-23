package com.codekul.springdec6.onetomany.controller;

import com.codekul.springdec6.onetomany.entity.Vehicle;
import com.codekul.springdec6.onetomany.repository.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    @Autowired
    private VehicleRepo vehicleRepo;

    @PostMapping("saveVehicle")
    public String saveVehicle(@RequestBody Vehicle vehicle){
        vehicleRepo.save(vehicle);
        return "saved..";
    }
}
