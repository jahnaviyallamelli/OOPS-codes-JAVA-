import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> uniqueNumbers = new HashSet<>();

        System.out.println("Enter 5 numbers between 10 and 100 (inclusive):");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (number < 10 || number > 100) {
                System.out.println("Invalid input. Please enter a number between 10 and 100.");
                i--; 
                continue;
            }

            if (uniqueNumbers.contains(number)) {
                System.out.println("Duplicate number. Please enter a different number.");
                i--; 
                continue;
            }

            uniqueNumbers.add(number);

            System.out.println("Unique values: " + uniqueNumbers);
        }

        scanner.close();
    }
}

