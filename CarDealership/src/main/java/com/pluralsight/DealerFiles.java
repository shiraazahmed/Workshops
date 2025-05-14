package com.pluralsight;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DealerFiles {
    private final String fileName;

    public DealerFiles(String fileName) {
        this.fileName = fileName;
    }

    public Dealer loadDealerFromFile() {
        Dealer dealer = null;

        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {

            String line = bufferedReader.readLine();
            if (line != null) {
                String[] dealerInfo = line.split("\\|");
                dealer = new Dealer(dealerInfo[0], dealerInfo[1], dealerInfo[2]);
            }

            List<Vehicle> vehicles = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                String[] vehicleData = line.split("\\|");
                Vehicle vehicle = new Vehicle(
                        Integer.parseInt(vehicleData[0]),
                        vehicleData[2],
                        vehicleData[3],
                        Integer.parseInt(vehicleData[1]),
                        vehicleData[5],
                        vehicleData[4],
                        Integer.parseInt(vehicleData[6]),
                        Double.parseDouble(vehicleData[7])
                );
                vehicles.add(vehicle);
            }

            if (dealer != null) {
                for (Vehicle vehicle : vehicles) {
                    dealer.addVehicle(vehicle);
                }
            }
        } catch (Exception e) {
            System.out.println("Error loading dealer from file: " + e.getMessage());
        }
        return dealer;
    }
}

