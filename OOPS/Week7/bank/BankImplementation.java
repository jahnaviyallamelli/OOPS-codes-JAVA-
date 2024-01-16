package b;
public class BankImplementation implements BankPackage {

    private double balance;
    private String username;
    private String password;

    public BankImplementation(String username, String password, double initialBalance) {
        this.username = username;
        this.password = password;
        this.balance = initialBalance;
    }

    @Override
    public void credentialsCheck(String enteredUsername, String enteredPassword) throws InvalidCredentialsException {
        if (!username.equals(enteredUsername) || !password.equals(enteredPassword)) {
            throw new InvalidCredentialsException("Invalid username or password. Please try again.");
        }
    }

    @Override
    public void credit(double amount) {
        balance += amount;
        System.out.println("Amount credited: " + amount);
    }

    @Override
    public void debit(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Cannot debit the specified amount.");
        }
        balance -= amount;
        System.out.println("Amount debited: " + amount);
    }

    @Override
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    @Override
    public void exit() {
        System.out.println("Exiting the banking system. Goodbye!");
        // Perform any cleanup or exit logic here
        System.exit(0);
        
    }
}

