package com.gleidev.rentcars.model.enums;

public enum ContentType {
    BIKE(TypeConstants.BIKE),
    BUS(TypeConstants.BUS),
    CAR(TypeConstants.CAR),
    TRUCK(TypeConstants.TRUCK);

    private final String parserName;

    ContentType(String parserName) {
        this.parserName = parserName;
    }

    public String toString() {
        return this.parserName;
    }
    public interface TypeConstants {
        String BIKE = "Bike";
        String BUS = "Bus";
        String CAR = "Car";
        String TRUCK = "Truck";
    }
}
