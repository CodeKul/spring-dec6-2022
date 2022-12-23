package com.codekul.springdec6.onetomany.repository;

import com.codekul.springdec6.onetomany.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle,Integer> {
}
