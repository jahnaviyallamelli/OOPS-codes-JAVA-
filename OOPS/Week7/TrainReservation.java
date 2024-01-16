import java.util.Random;

class TrainReservation {
    private static final int AC_CAPACITY = 70;
    private static final int SLEEPER_CAPACITY = 70;

    public static void main(String[] args) {
        try {
            reserveTickets();
        } catch (Exception e) {
            System.out.println("Reservation Failed: " + e.getMessage());
        }
    }

    private static void reserveTickets() throws Exception {
        // Prompt user for input
        int requiredBerths = promptUserForBerths();
        String selectedClass = promptUserForClass();

        // Check conditions and reserve tickets
        if (requiredBerths > 6) {
            throw new Exception("You may be an Agent. Maximum 6 berths allowed.");
        }

        if (!isValidClass(selectedClass)) {
            throw new Exception("Invalid class selection. Choose either A/c or Sleeper.");
        }

        // Allocate and display confirmed berths
        allocateAndDisplayBerths(requiredBerths, selectedClass);
    }

    private static int promptUserForBerths() {
        // Simulated user input; replace with actual user input logic
        return 4;
    }

    private static String promptUserForClass() {
        // Simulated user input; replace with actual user input logic
        return "A/c";
    }

    private static boolean isValidClass(String selectedClass) {
        return selectedClass.equalsIgnoreCase("A/c") || selectedClass.equalsIgnoreCase("Sleeper");
    }

    private static void allocateAndDisplayBerths(int requiredBerths, String selectedClass) {
        System.out.println("\nAllocating berths...");

        // Randomly allocate berths
        Random random = new Random();
        int allocatedBerths = 0;

        while (allocatedBerths < requiredBerths) {
            int berthNumber;
            if (selectedClass.equalsIgnoreCase("A/c")) {
                berthNumber = random.nextInt(AC_CAPACITY) + 1; // Random berth in A/c class
            } else {
                berthNumber = random.nextInt(SLEEPER_CAPACITY) + 1; // Random berth in Sleeper class
            }

            System.out.println("Berth allocated: " + selectedClass + berthNumber);
            allocatedBerths++;
        }

        System.out.println("\nReservation successful! Confirmed berths for class " + selectedClass);
    }
}

