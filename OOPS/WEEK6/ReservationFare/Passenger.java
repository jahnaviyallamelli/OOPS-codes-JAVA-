// File: reservation/Passenger.java
package reservation;

public class Passenger {
    // Class definition for Passenger (can be extended as needed)
    // You can include fields and methods specific to Passenger here
    private String category;
    private double actualFare;

    public Passenger(String category, double actualFare) {
        this.category = category;
        this.actualFare = actualFare;
    }

    public String getCategory() {
        return category;
    }

    public double getActualFare() {
        return actualFare;
    }
}
