package com.pluralsight;

public class Vehicle {
    private int vin;
    private String make;
    private String model;
    private int year;
    private String color;
    private String vehicleType;
    private int odometer;
    private double price;

    public Vehicle(int vin, String make, String model, int year, String color, String vehicleType, int odometer, double price) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.vehicleType = vehicleType;
        this.odometer = odometer;
        this.price = price;
    }
    public int getVin() {
        return vin;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public int getOdometer() {
        return odometer;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "vin=" + vin +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", odometer=" + odometer +
                ", price=" + price +
                '}';
    }

}

