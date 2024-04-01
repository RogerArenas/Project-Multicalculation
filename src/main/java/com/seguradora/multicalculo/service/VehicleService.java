package com.seguradora.multicalculo.service;

import com.seguradora.multicalculo.model.Vehicle;
import com.seguradora.multicalculo.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle createVehicle(Vehicle vehicle) {
        Vehicle vehicle1 = new Vehicle();

        return vehicleRepository.save(vehicle);
    }

}
