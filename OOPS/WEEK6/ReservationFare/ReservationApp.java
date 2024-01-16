// File: ReservationApp.java
import reservation.Passenger;
import reservation.ReservationCost;
import reservation.ReservationCalculator;

public class ReservationApp {
    public static void main(String[] args) {
        // Example usage
        Passenger[] passengers = {
            new Passenger("Child", 0.0),
            new Passenger("Student", 100.0),
            new Passenger("SeniorCitizen", 200.0),
            new Passenger("Citizen", 150.0)
        };

        ReservationCost reservationCost = new ReservationCalculator();
        double totalFare = reservationCost.totalFare(passengers);

        System.out.println("Total Fare for all passengers: $" + totalFare);
    }
}
