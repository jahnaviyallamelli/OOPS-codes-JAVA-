
import complex.Arith;
import java.util.Scanner;

public class ComplexCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first complex number
        System.out.println("Enter the real part of the first complex number:");
        int rp1 = scanner.nextInt();
        System.out.println("Enter the imaginary part of the first complex number:");
        int ip1 = scanner.nextInt();

        // Input for second complex number
        System.out.println("Enter the real part of the second complex number:");
        int rp2 = scanner.nextInt();
        System.out.println("Enter the imaginary part of the second complex number:");
        int ip2 = scanner.nextInt();

        // Create Arith objects
        Arith complex1 = new Arith(rp1, ip1);
        Arith complex2 = new Arith(rp2, ip2);

        // Perform addition and subtraction
        complex1.add(complex1, complex2);
        System.out.print("Addition: ");
        complex1.display();

        Arith resultSub = new Arith();
        resultSub.sub(complex1, complex2);
        System.out.print("Subtraction: ");
        resultSub.display();
    }
}
