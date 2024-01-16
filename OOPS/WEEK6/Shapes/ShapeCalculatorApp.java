// File: ShapeCalculatorApp.java
import shapes.Square;
import shapes.Triangle;
import shapes.Circle;
import java.util.Scanner;

public class ShapeCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape:");
        System.out.println("1. Square");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the square: ");
                double squareSide = scanner.nextDouble();
                Square square = new Square(squareSide);
                System.out.println("Area: " + square.calculateArea());
                System.out.println("Perimeter: " + square.calculatePerimeter());
                break;
            case 2:
                System.out.print("Enter the lengths of the three sides of the triangle: ");
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();
                Triangle triangle = new Triangle(side1, side2, side3);
                System.out.println("Area: " + triangle.calculateArea());
                System.out.println("Perimeter: " + triangle.calculatePerimeter());
                break;
            case 3:
                System.out.print("Enter the radius of the circle: ");
                double circleRadius = scanner.nextDouble();
                Circle circle = new Circle(circleRadius);
                System.out.println("Area: " + circle.calculateArea());
                System.out.println("Perimeter: " + circle.calculatePerimeter());
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
