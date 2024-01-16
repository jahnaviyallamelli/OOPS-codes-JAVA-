import java.util.Scanner;

class Product {
    private String productName;
    private String company;
    private int quantity;

    public Product(String productName, String company, int quantity) {
        this.productName = productName;
        this.company = company;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public String getCompany() {
        return company;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Amazon {
    public static double calculateCost(Product product) {
        // Assuming a product's cost is $100 per unit
        double costPerUnit = 100.0;
        double totalCost = costPerUnit * product.getQuantity();

        // Apply discounts
        if (totalCost > 50000) {
            totalCost *= 0.85; // 15% discount for purchase above 50,000
        }

        // Additional 10% discount for HDFC credit card holders
        totalCost *= 0.90;

        return totalCost;
    }
}

class Flipkart {
    public static double calculateCost(Product product, boolean isRGUKTStudent) {
        // Assuming a product's cost is $100 per unit
        double costPerUnit = 100.0;
        double totalCost = costPerUnit * product.getQuantity();

        // Apply discounts
        if (totalCost > 30000) {
            totalCost *= 0.95; // 5% discount for purchase above 30,000
        }

        // Additional 30% discount for RGUKT students
        if (isRGUKTStudent) {
            totalCost *= 0.70;
        }

        return totalCost;
    }
}

public class ECommerceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input product details
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter company: ");
        String company = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        // Create Product object
        Product product = new Product(productName, company, quantity);

        // Check cost-effectiveness and suggest where to buy
        double amazonCost = Amazon.calculateCost(product);
        double flipkartCost = Flipkart.calculateCost(product, isRGUKTStudent());

        System.out.println("\nCost on Amazon: $" + amazonCost);
        System.out.println("Cost on Flipkart: $" + flipkartCost);

        if (amazonCost < flipkartCost) {
            System.out.println("\nSuggestion: Buy from Amazon for cost-effectiveness.");
        } else if (flipkartCost < amazonCost) {
            System.out.println("\nSuggestion: Buy from Flipkart for cost-effectiveness.");
        } else {
            System.out.println("\nBoth Amazon and Flipkart offer the same cost. Choose any.");
        }

        // Close the scanner
        scanner.close();
    }

    private static boolean isRGUKTStudent() {
        // Assuming user input for RGUKT student status
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you an RGUKT student? (Yes/No): ");
        String answer = scanner.next().toLowerCase();
        return answer.equals("yes");
    }
}

