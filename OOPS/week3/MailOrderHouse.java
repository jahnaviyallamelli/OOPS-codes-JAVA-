import java.util.Scanner;

public class MailOrderHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double product1Price = 99.90;
        double product2Price = 20.20;
        double product3Price = 6.87;
        double product4Price = 45.50;
        double product5Price = 40.49;

        double totalRetailValue = 0.0;

        while (true) {
            System.out.print("Enter Product ID (1-5) or -1 to stop: ");
            int productId = scanner.nextInt();

            if (productId == -1) {
                break;
            }

            System.out.print("Enter quantity sold: ");
            int quantitySold = scanner.nextInt();

            double retailValue = 0.0;

            switch (productId) {
                case 1:
                    retailValue = product1Price * quantitySold;
                    break;
                case 2:
                    retailValue = product2Price * quantitySold;
                    break;
                case 3:
                    retailValue = product3Price * quantitySold;
                    break;
                case 4:
                    retailValue = product4Price * quantitySold;
                    break;
                case 5:
                    retailValue = product5Price * quantitySold;
                    break;
                default:
                    System.out.println("Invalid Product ID. Please enter a number between 1 and 5.");
                    continue; // Skip the rest of the loop for invalid input
            }

            totalRetailValue += retailValue;
        }

        System.out.println("Total Retail Value of Products Sold: Rs. " + totalRetailValue);

        scanner.close();
    }
}

