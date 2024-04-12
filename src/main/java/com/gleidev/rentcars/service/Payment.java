package com.gleidev.rentcars.service;


import com.gleidev.rentcars.model.entity.CarRental;

public interface Payment {
    double payment(CarRental carRental);
}
