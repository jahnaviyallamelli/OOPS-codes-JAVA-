// Fare.java
interface Fare {
    double getFare(double distance);
    String getAmenities();
}

class Bus implements Fare {
    private String busType;

    public Bus(String busType) {
        this.busType = busType;
    }

    @Override
    public double getFare(double distance) {
        double farePerKilometer = 5.0; 
        if (busType.equals("A/c")) {
            farePerKilometer *= 1.5;
        }
        return farePerKilometer * distance;
    }

    @Override
    public String getAmenities() {
        if (busType.equals("A/c")) {
            return "A/c, Charging Points, Comfortable Seats";
        } else {
            return "Non A/c, Basic Seats";
        }
    }
}

class Train implements Fare {
    private String trainType;

    public Train(String trainType) {
        this.trainType = trainType;
    }

    @Override
    public double getFare(double distance) {
        // Assuming fare calculation based on distance and type of Train
        double farePerKilometer = 4.0; // Fare per kilometer for Train
        if (trainType.equals("A/c")) {
            farePerKilometer *= 1.8; // Additional fare for A/c Train
        } else if (trainType.equals("Sleeper")) {
            farePerKilometer *= 1.2; // Additional fare for Sleeper Train
        }
        return farePerKilometer * distance;
    }

    @Override
    public String getAmenities() {
        // Assuming amenities provided by type of Train
        if (trainType.equals("A/c")) {
            return "A/c, Bedding, Meals";
        } else if (trainType.equals("Sleeper")) {
            return "Sleeper Berths, Meals";
        } else {
            return "General Seating";
        }
    }
}

// Flight.java
class Flight implements Fare {
    private String flightClass;

    public Flight(String flightClass) {
        this.flightClass = flightClass;
    }

    @Override
    public double getFare(double distance) {
        // Assuming fare calculation based on distance and type of Flight class
        double farePerKilometer = 10.0; // Fare per kilometer for Flight
        if (flightClass.equals("Business")) {
            farePerKilometer *= 2.5; // Additional fare for Business class
        }
        return farePerKilometer * distance;
    }

    @Override
    public String getAmenities() {
        // Assuming amenities provided by type of Flight class
        if (flightClass.equals("Business")) {
            return "Business Class Lounge, Premium Meals, Priority Boarding";
        } else {
            return "Economy Class Seating, Meals";
        }
    }
}


public class Travellings {
    public static void main(String[] args) {
        // Example usage
        Bus acBus = new Bus("A/c");
        Train sleeperTrain = new Train("Sleeper");
        Flight businessFlight = new Flight("Business");

        double busFare = acBus.getFare(200);
        String busAmenities = acBus.getAmenities();
        System.out.println("Bus Fare: Rs. " + busFare);
        System.out.println("Bus Amenities: " + busAmenities);

        double trainFare = sleeperTrain.getFare(500);
        String trainAmenities = sleeperTrain.getAmenities();
        System.out.println("\nTrain Fare: Rs. " + trainFare);
        System.out.println("Train Amenities: " + trainAmenities);

        double flightFare = businessFlight.getFare(1000);
        String flightAmenities = businessFlight.getAmenities();
        System.out.println("\nFlight Fare: Rs. " + flightFare);
        System.out.println("Flight Amenities: " + flightAmenities);
    }
}

