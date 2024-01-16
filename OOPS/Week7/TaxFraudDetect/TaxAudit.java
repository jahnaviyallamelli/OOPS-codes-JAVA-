package audit;

public interface TaxAudit {
    void taxChecker(double totalIncome, double totalExpenditure) throws TaxFraudException;

    void taxPaid(double taxPaid);

    void homeExpenditure(double expenditure);

    void healthExpenditure(double expenditure);

    void vehicleExpenditure(double expenditure);

    void personalFamilyExpenditure(double expenditure);

    void miscellaneousExpenditure(double expenditure);
}
