package com.gleidev.rentcars.service.impl;

import com.gleidev.rentcars.model.Vehicle;
import com.gleidev.rentcars.model.enums.ContentType.TypeConstants;
import com.gleidev.rentcars.service.ServiceAdapter;
import org.springframework.stereotype.Service;

@Service(TypeConstants.CAR)
public class CarService implements ServiceAdapter<Vehicle> {

    @Override
    public void process(Vehicle request){
        System.out.println("Inside car service - " + request.toString());
    }
}
