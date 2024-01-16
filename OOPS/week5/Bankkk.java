// RBI.java
abstract class RBI {
    // Common methods for all banks
    abstract void credit(double amount);
    abstract void debit(double amount);
    abstract void displayBalance();

    // Loan eligibility methods (specific to each bank)
    abstract void personalLoanEligibility(double annualIncome, String jobType);
    abstract void homeLoanEligibility(double propertyValue, double annualIncome);
    abstract void vehicleLoanEligibility(boolean medicalFitness, double annualIncome);
}

// SBI.java
class SBI extends RBI {
    @Override
    void credit(double amount) {
        // Implementation for SBI credit
        System.out.println("SBI: Credited amount: " + amount);
    }

    @Override
    void debit(double amount) {
        // Implementation for SBI debit
        System.out.println("SBI: Debited amount: " + amount);
    }

    @Override
    void displayBalance() {
        // Implementation for SBI display balance
        System.out.println("SBI: Displaying balance");
    }

    @Override
    void personalLoanEligibility(double annualIncome, String jobType) {
        // Implementation for SBI personal loan eligibility
        System.out.println("SBI: Personal Loan Eligibility check based on annual income and job type");
    }

    @Override
    void homeLoanEligibility(double propertyValue, double annualIncome) {
        // Implementation for SBI home loan eligibility
        System.out.println("SBI: Home Loan Eligibility check based on property value and annual income");
    }

    @Override
    void vehicleLoanEligibility(boolean medicalFitness, double annualIncome) {
        // Implementation for SBI vehicle loan eligibility
        System.out.println("SBI: Vehicle Loan Eligibility check based on medical fitness and annual income");
    }
}

// HDFC.java
class HDFC extends RBI {
    @Override
    void credit(double amount) {
        // Implementation for SBI credit
        System.out.println("SBI: Credited amount: " + amount);
    }

    @Override
    void debit(double amount) {
        // Implementation for SBI debit
        System.out.println("SBI: Debited amount: " + amount);
    }

    @Override
    void displayBalance() {
        // Implementation for SBI display balance
        System.out.println("SBI: Displaying balance");
    }

    @Override
    void personalLoanEligibility(double annualIncome, String jobType) {
        // Implementation for SBI personal loan eligibility
        System.out.println("SBI: Personal Loan Eligibility check based on annual income and job type");
    }

    @Override
    void homeLoanEligibility(double propertyValue, double annualIncome) {
        // Implementation for SBI home loan eligibility
        System.out.println("SBI: Home Loan Eligibility check based on property value and annual income");
    }

    @Override
    void vehicleLoanEligibility(boolean medicalFitness, double annualIncome) {
        // Implementation for SBI vehicle loan eligibility
        System.out.println("SBI: Vehicle Loan Eligibility check based on medical fitness and annual income");
    }
}

// DCB.java
class DCB extends RBI {
   @Override
    void credit(double amount) {
        // Implementation for SBI credit
        System.out.println("SBI: Credited amount: " + amount);
    }

    @Override
    void debit(double amount) {
        // Implementation for SBI debit
        System.out.println("SBI: Debited amount: " + amount);
    }

    @Override
    void displayBalance() {
        // Implementation for SBI display balance
        System.out.println("SBI: Displaying balance");
    }

    @Override
    void personalLoanEligibility(double annualIncome, String jobType) {
        // Implementation for SBI personal loan eligibility
        System.out.println("SBI: Personal Loan Eligibility check based on annual income and job type");
    }

    @Override
    void homeLoanEligibility(double propertyValue, double annualIncome) {
        // Implementation for SBI home loan eligibility
        System.out.println("SBI: Home Loan Eligibility check based on property value and annual income");
    }

    @Override
    void vehicleLoanEligibility(boolean medicalFitness, double annualIncome) {
        // Implementation for SBI vehicle loan eligibility
        System.out.println("SBI: Vehicle Loan Eligibility check based on medical fitness and annual income");
    }
}

// Main.java
public class Bankkk {
    public static void main(String[] args) {
        // Example usage
        SBI sbi = new SBI();
        HDFC hdfc = new HDFC();
        DCB dcb = new DCB();

        sbi.credit(5000);
        sbi.personalLoanEligibility(60000, "private");

        hdfc.debit(3000);
        hdfc.homeLoanEligibility(5000000, 80000);

        dcb.displayBalance();
        dcb.vehicleLoanEligibility(true, 70000);
    }
}

