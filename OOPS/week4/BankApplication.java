import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account {
    private String bankName;
    private String branchName;
    private String accountName;
    private String accountNumber;
    private double balance;
    private String accountAddress;

    public Account(String bankName, String branchName, String accountName, String accountNumber,
                   double initialBalance, String accountAddress) {
        this.bankName = bankName;
        this.branchName = branchName;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        
        // Ensure that the initial balance is greater than 1000.0
        if (initialBalance > 1000.0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Error: Initial balance must be greater than 1000.0");
            System.exit(1);
        }

        this.accountAddress = accountAddress;
    }

    public void credit(double amount) {
        balance += amount;
        System.out.println("Amount credited successfully. New balance: " + balance);
    }

    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount debited successfully. New balance: " + balance);
        } else {
            System.out.println("Debit amount exceeded account balance. Transaction canceled.");
        }
    }

    public void getBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void exit() {
        System.out.println("Exiting individual transaction. Goodbye!");
    }

    public String getBankName() {
        return bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountAddress() {
        return accountAddress;
    }
}

public class BankApplication {
    private static final Map<String, Account> accounts = new HashMap<>();

    public static void main(String[] args) {
        initializeAccounts();

        Scanner scanner = new Scanner(System.in);
        boolean exitApplication = false;

        while (!exitApplication) {
            System.out.print("\nEnter Branch_name (Bank_Name) and Acct_No (Account_Number) separated by space: ");
            String branchName = scanner.next();
            String accountNumber = scanner.next();

            if (authorizeUser(branchName, accountNumber)) {
                System.out.println("Authorization successful! Welcome to " + branchName + " branch.");

                Account account = accounts.get(branchName + accountNumber);

                while (true) {
                    System.out.println("\nChoose Transaction:");
                    System.out.println("1. Credit");
                    System.out.println("2. Debit");
                    System.out.println("3. Get Balance");
                    System.out.println("4. Exit");

                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter amount to credit: ");
                            double creditAmount = scanner.nextDouble();
                            account.credit(creditAmount);
                            break;
                        case 2:
                            System.out.print("Enter amount to debit: ");
                            double debitAmount = scanner.nextDouble();
                            account.debit(debitAmount);
                            break;
                        case 3:
                            account.getBalance();
                            break;
                        case 4:
                            account.exit();
                            break;
                        default:
                            System.out.println("Invalid choice. Please choose again.");
                            break;
                    }

                    System.out.print("Exit individual transaction? (Yes/No): ");
                    String exitChoice = scanner.next().toLowerCase();
                    if (exitChoice.equals("yes")) {
                        break;
                    }
                }
            } else {
                System.out.println("Authorization failed. Invalid credentials. Please try again.");
            }

            System.out.print("Exit application? (Yes/No): ");
            String exitAppChoice = scanner.next().toLowerCase();
            exitApplication = exitAppChoice.equals("yes");
        }

        System.out.println("Exiting application. Goodbye!");
        scanner.close();
    }

    private static void initializeAccounts() {
        // Assume there are two branches with 5 customers each
        for (int i = 1; i <= 2; i++) {
            String branchName = "Branch" + i;
            for (int j = 1; j <= 5; j++) {
                String accountNumber = String.format("%03d", j);
                String key = branchName + accountNumber;
                Account account = new Account("SBI", branchName, "Customer" + j, accountNumber, 5000.0, "Address" + j);
                accounts.put(key, account);
            }
        }
    }

    private static boolean authorizeUser(String branchName, String accountNumber) {
        String key = branchName + accountNumber;
        return accounts.containsKey(key);
    }
}

