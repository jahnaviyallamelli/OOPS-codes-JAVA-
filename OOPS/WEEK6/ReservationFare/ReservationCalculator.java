// File: reservation/ReservationCalculator.java
package reservation;

public class ReservationCalculator implements ReservationCost {
    @Override
    public double totalFare(Passenger[] passengers) {
        double totalFare = 0;

        for (Passenger passenger : passengers) {
            switch (passenger.getCategory()) {
                case "Child":
                    // Children travel for free
                    totalFare += 0;
                    break;
                case "Student":
                    // Students get a 30% discount
                    totalFare += passenger.getActualFare() * 0.7;
                    break;
                case "SeniorCitizen":
                    // Senior citizens get a 50% discount
                    totalFare += passenger.getActualFare() * 0.5;
                    break;
                case "Citizen":
                    // Citizens pay the actual fare
                    totalFare += passenger.getActualFare();
                    break;
            }
        }

        return totalFare;
    }
}
