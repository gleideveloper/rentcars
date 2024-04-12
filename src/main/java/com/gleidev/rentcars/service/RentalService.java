package com.gleidev.rentcars.service;

import com.gleidev.rentcars.model.entity.CarRental;
import com.gleidev.rentcars.model.entity.Invoice;

public class RentalService {

    private final TaxService taxService;
    private final Payment payment;
    public RentalService(Payment payment, TaxService taxService) {
        this.taxService = taxService;
        this.payment = payment;
    }

    public void processInoive(CarRental carRental){

        double basicPayment = payment.payment(carRental);
        double tax = taxService.tax(basicPayment);
        var invoice = new Invoice(basicPayment, tax);
        carRental.setInvoice(invoice);

    }

}
