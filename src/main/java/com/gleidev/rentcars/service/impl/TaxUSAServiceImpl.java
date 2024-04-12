package com.gleidev.rentcars.service.impl;

import com.gleidev.rentcars.service.TaxService;

public class TaxUSAServiceImpl implements TaxService {
    public double tax(double basicPayment){
        if(basicPayment <= 100.0){
            return basicPayment * 0.15;
        }else{
            return basicPayment * 0.10;
        }
    }
}
