package com.gleidev.rentcars.service.impl;

import com.gleidev.rentcars.model.entity.CarRental;
import com.gleidev.rentcars.service.Payment;

public class PaymentBasicImpl implements Payment {
    private final Double pricePerDay;
    private final Double pricePerHour;

    public PaymentBasicImpl(Double pricePerHour, Double pricePerDay) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public double payment(CarRental carRental) {
        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();
        double basicPayment = 0;

        //Convertendo em horas decimais
        double qtyHoursRental = (double) (t2 - t1) / (1000 * 60 * 60);

        if(qtyHoursRental <= 12){
            basicPayment = Math.ceil(qtyHoursRental) * pricePerHour;
        }else{
            basicPayment = Math.ceil(qtyHoursRental) * pricePerDay;
        }
        return basicPayment;
    }

}
