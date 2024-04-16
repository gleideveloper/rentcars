package com.gleidev.rentcars.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@Data
@ToString
public class Vehicle implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String vehicleName;
    private String vehicleType;
}
