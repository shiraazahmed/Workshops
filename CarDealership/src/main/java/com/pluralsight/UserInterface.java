package com.pluralsight;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private final Dealer dealer;
    private final Scanner scanner = new Scanner(System.in);

    public UserInterface(Dealer dealer) {
        this.dealer = dealer;
    }

    public void display() {
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    processAddVehicle();
                    break;
                case 2:
                    listAllVehicles();
                    break;
                case 99:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 99);
    }

    private void displayMenu() {
        System.out.println("\nVehicle Management System");
        System.out.println("1. Add Vehicle");
        System.out.println("2. List All Vehicles");
        System.out.println("5. Exit");
    }

    private void processAddVehicle() {
        System.out.println("Enter vehicle details:");
        System.out.print("VIN: ");
        int vin = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Make: ");
        String make = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Type: ");
        String type = scanner.nextLine();
        System.out.print("Odometer: ");
        int odometer = scanner.nextInt();
        System.out.print("Price: ");
        double price = scanner.nextDouble();

        Vehicle vehicle = new Vehicle(vin, make, model, year, color, type, odometer, price);
        dealer.addVehicle(vehicle);
        System.out.println("Vehicle added successfully!");
    }

    private void listAllVehicles() {
        List<Vehicle> vehicles = dealer.getAllVehicles();
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles in inventory.");
        } else {
            System.out.println("Vehicle Inventory:");
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        DealerFiles dealerFiles = new DealerFiles("inventory.csv");
        Dealer dealer = dealerFiles.loadDealerFromFile();

        if (dealer == null) {
            System.out.println("Failed to load dealer from file. Ensure 'inventory.csv' is in the resources folder.");
            return;
        }

        UserInterface userInterface = new UserInterface(dealer);
        userInterface.display();

    }
}