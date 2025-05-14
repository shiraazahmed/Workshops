package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Vehicle> inventory;

    public Dealer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.inventory = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return new ArrayList<>(inventory);
    }

    public List<Vehicle> getVehiclesByPriceRange(double minPrice, double maxPrice) {
        return null;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return null;
    }

    public List<Vehicle> getVehiclesByYearRange(int minYear, int maxYear) {
        return null;
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        return null;
    }

    public List<Vehicle> getVehiclesByMileageRange(int maxMileage) {
        return null;
    }

    public List<Vehicle> getVehiclesByType(String type) {
        return null;
    }

    public void removeVehicle(int vin) {
    }
}

