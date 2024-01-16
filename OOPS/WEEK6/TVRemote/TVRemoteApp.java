// File: TVRemote/TVRemoteApp.java
import TVRemote.Television;
import java.util.Scanner;

public class TVRemoteApp {
    public static void main(String[] args) {
        Television tv = new Television();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTV Remote Menu:");
            System.out.println("1. Switch ON");
            System.out.println("2. Star Sports Channel");
            System.out.println("3. NGC Channel");
            System.out.println("4. Discovery Channel");
            System.out.println("5. StarMovies Channel");
            System.out.println("6. Switch OFF");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tv.switchOn();
                    break;
                case 2:
                    tv.tuneChannel(1);
                    break;
                case 3:
                    tv.tuneChannel(2);
                    break;
                case 4:
                    tv.tuneChannel(3);
                    break;
                case 5:
                    tv.tuneChannel(4);
                    break;
                case 6:
                    tv.switchOff();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
