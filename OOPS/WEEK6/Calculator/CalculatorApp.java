// File: CalculatorApp.java
import calculator.BasicCalculator;

public class CalculatorApp {
    public static void main(String[] args) {
        // Create an instance of BasicCalculator
        BasicCalculator calculator = new BasicCalculator();

        // Perform some calculations
        double resultAdd = calculator.add(5, 3);
        double resultSubtract = calculator.subtract(8, 2);
        double resultMultiply = calculator.multiply(4, 6);

        try {
            double resultDivide = calculator.divide(10, 2);
            System.out.println("Addition: " + resultAdd);
            System.out.println("Subtraction: " + resultSubtract);
            System.out.println("Multiplication: " + resultMultiply);
            System.out.println("Division: " + resultDivide);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
