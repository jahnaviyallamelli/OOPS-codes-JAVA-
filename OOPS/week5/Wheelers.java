// Vehicle.java
interface Vehicle {
    String getCompany();
    String getModel();
    String getType(); // Petrol, Diesel, CNG
    double getConsumption();
    void displayInfo();
}

// TwoWheeler.java
class TwoWheeler implements Vehicle {
    private String company;
    private String model;
    private String type;
    private double mileage;

    public TwoWheeler(String company, String model, String type) {
        this.company = company;
        this.model = model;
        this.type = type;

        if (type.equalsIgnoreCase("Petrol")) {
            mileage = 62.0; 
        } else if (type.equalsIgnoreCase("Diesel")) {
            mileage = 82.0; 
        } else if (type.equalsIgnoreCase("CNG")) {
            mileage = 72.0; 
        }
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getConsumption() {
        return 1 / mileage; 
    }

    @Override
    public void displayInfo() {
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
    }
}

// FourWheeler.java
class FourWheeler implements Vehicle {
    private String company;
    private String model;
    private String type;
    private double mileage;

    public FourWheeler(String company, String model, String type) {
        this.company = company;
        this.model = model;
        this.type = type;

        // Set mileage based on type
        if (type.equalsIgnoreCase("Petrol")) {
            mileage = 14.0; // Petrol mileage for 4-wheeler
        } else if (type.equalsIgnoreCase("Diesel")) {
            mileage = 22.0; // Diesel mileage for 4-wheeler
        } else if (type.equalsIgnoreCase("CNG")) {
            mileage = 18.0; // CNG mileage for 4-wheeler
        }
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getConsumption() {
        return 1 / mileage; // Fuel consumption per kilometer
    }

    @Override
    public void displayInfo() {
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
    }
}

// Main.java
public class Wheelers {
    public static void main(String[] args) {
        // Example usage
        TwoWheeler bike = new TwoWheeler("Honda", "Activa", "Petrol");
        FourWheeler car = new FourWheeler("Toyota", "Camry", "Hybrid");

        bike.displayInfo();
        System.out.println("Fuel Consumption: " + bike.getConsumption() + " liters/km");

        System.out.println();

        car.displayInfo();
        System.out.println("Fuel Consumption: " + car.getConsumption() + " liters/km");
    }
}

