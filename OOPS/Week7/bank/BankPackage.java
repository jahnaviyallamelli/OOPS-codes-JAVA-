package b;
public interface BankPackage {

    void credentialsCheck(String username, String password) throws InvalidCredentialsException;

    void credit(double amount);

    void debit(double amount) throws InsufficientBalanceException;

    void displayBalance();

    void exit();
}

