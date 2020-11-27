package com.company.Problem22;

public class DistanceConverter {
    public Meters milesToMeters(Miles miles) {
        Meters meters = new Meters();
        meters.setDistance(miles.getDistance() * 1609);

        return meters;
    }

    public Miles metersToMiles(Meters meters) {
        Miles miles = new Miles();
        miles.setDistance(meters.getDistance() / 1609);

        return miles;
    }

    public Inches centimetersToInches (Centimeters centimeters) {
        Inches inches = new Inches();
        inches.setDistance(centimeters.getDistance() / 2.54);

        return inches;
    }

    public Centimeters inchesToCentimeters (Inches inches) {
        Centimeters centimeters = new Centimeters();
        centimeters.setDistance(inches.getDistance() * 2.54);

        return centimeters;
    }
}
