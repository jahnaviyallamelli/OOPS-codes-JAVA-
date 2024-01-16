import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Super class Vehicle
class Vehicle {
    protected String company;
    protected String model;
    protected double mileage;
    protected double fuelCapacity;
    protected double displacement;

    // Constructor
    public Vehicle(String company, String model, double mileage, double fuelCapacity, double displacement) {
        this.company = company;
        this.model = model;
        this.mileage = mileage;
        this.fuelCapacity = fuelCapacity;
        this.displacement = displacement;
    }

    // Display details of the vehicle
    public void displayDetails() {
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
        System.out.println("Displacement: " + displacement + " cc");
    }
}

// Subclass TwoWheeler
class TwoWheeler extends Vehicle {
    private String frontBrake;
    private String rearBrake;
    private String tyreType;
    private String headLamp;
    private String userReviews;

    // Constructor
    public TwoWheeler(String company, String model, double mileage, double fuelCapacity, double displacement,
                      String frontBrake, String rearBrake, String tyreType, String headLamp, String userReviews) {
        super(company, model, mileage, fuelCapacity, displacement);
        this.frontBrake = frontBrake;
        this.rearBrake = rearBrake;
        this.tyreType = tyreType;
        this.headLamp = headLamp;
        this.userReviews = userReviews;
    }

    // Display details of the two-wheeler
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Front Brake: " + frontBrake);
        System.out.println("Rear Brake: " + rearBrake);
        System.out.println("Tyre Type: " + tyreType);
        System.out.println("Head Lamp: " + headLamp);
        System.out.println("User Reviews: " + userReviews);
    }
}

// Subclass FourWheeler
class FourWheeler extends Vehicle {
    private boolean airConditioner;
    private boolean airBags;
    private boolean powerSteering;
    private boolean rainSensingWiper;

    // Constructor
    public FourWheeler(String company, String model, double mileage, double fuelCapacity, double displacement,
                       boolean airConditioner, boolean airBags, boolean powerSteering, boolean rainSensingWiper) {
        super(company, model, mileage, fuelCapacity, displacement);
        this.airConditioner = airConditioner;
        this.airBags = airBags;
        this.powerSteering = powerSteering;
        this.rainSensingWiper = rainSensingWiper;
    }

    // Display details of the four-wheeler
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Air Conditioner: " + airConditioner);
        System.out.println("Air Bags: " + airBags);
        System.out.println("Power Steering: " + powerSteering);
        System.out.println("Rain Sensing Wiper: " + rainSensingWiper);
    }
}

public class VehicleComparisonApp {
    public static void main(String[] args) {
        // Create a repository of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new TwoWheeler("Honda", "CBR250R", 30, 14, 250, "Disc", "Disc", "Tubeless", "LED", "Positive"));
        vehicles.add(new TwoWheeler("Yamaha", "FZ-S", 45, 13, 150, "Disc", "Drum", "Tubeless", "Halogen", "Positive"));
        vehicles.add(new FourWheeler("Toyota", "Camry", 18, 55, 2500, true, true, true, true));
        vehicles.add(new FourWheeler("Hyundai", "Creta", 20, 50, 1600, true, true, true, false));

        // Display available vehicles
        System.out.println("Available Vehicles:");
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println((i + 1) + ". " + vehicles.get(i).company + " " + vehicles.get(i).model);
        }

        // User selection
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the numbers of vehicles you want to compare (comma-separated): ");
        String input = scanner.nextLine();
        String[] selectedIndices = input.split(",");
        List<Vehicle> selectedVehicles = new ArrayList<>();

        // Validate user input
        for (String index : selectedIndices) {
            int selectedIndex = Integer.parseInt(index.trim()) - 1;
            if (selectedIndex >= 0 && selectedIndex < vehicles.size()) {
                selectedVehicles.add(vehicles.get(selectedIndex));
            } else {
                System.out.println("Invalid selection: " + (selectedIndex + 1));
            }
        }

        // Compare and display details of selected vehicles
        if (!selectedVehicles.isEmpty()) {
            System.out.println("\nComparing Selected Vehicles:");
            for (Vehicle vehicle : selectedVehicles) {
                System.out.println("\nVehicle Details for " + vehicle.company + " " + vehicle.model);
                vehicle.displayDetails();
            }

            // Determine the best model (for simplicity, based on highest mileage)
            Vehicle bestModel = selectedVehicles.get(0);
            for (Vehicle vehicle : selectedVehicles) {
                if (vehicle.mileage > bestModel.mileage) {
                    bestModel = vehicle;
                }
            }

            System.out.println("\nBest Model to Buy:");
            System.out.println("Company: " + bestModel.company);
            System.out.println("Model: " + bestModel.model);
        } else {
            System.out.println("No valid vehicles selected for comparison.");
        }

        // Close the scanner
        scanner.close();
    }
}

