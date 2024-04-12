package com.gleidev.rentcars.service.impl;

import com.gleidev.rentcars.service.TaxService;

public class TaxBrasilServiceImpl implements TaxService {
    public double tax(double basicPayment){
        if(basicPayment <= 100.0){
            return basicPayment * 0.20;
        }else{
            return basicPayment * 0.15;
        }
    }
}
