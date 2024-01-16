package audit;

public class TaxAuditImpl implements TaxAudit {
    private double totalIncome;
    private double totalExpenditure;
    private double taxPaid;

    public TaxAuditImpl(double totalIncome, double totalExpenditure, double taxPaid) {
        this.totalIncome = totalIncome;
        this.totalExpenditure = totalExpenditure;
        this.taxPaid = taxPaid;
    }

    public void taxChecker(double totalIncome, double totalExpenditure) throws TaxFraudException {
        double calculatedTax = 0.1 * (totalIncome - totalExpenditure);

        if (taxPaid != calculatedTax) {
            throw new TaxFraudException("Tax fraud detected! You need to pay $" + calculatedTax);
        }
    }
    public void taxPaid(double taxPaid) {
        this.taxPaid = taxPaid;
    }

    public void homeExpenditure(double expenditure) {
        totalExpenditure += expenditure;
    }

    public void healthExpenditure(double expenditure) {
        totalExpenditure += expenditure;
    }

    public void vehicleExpenditure(double expenditure) {
        totalExpenditure += expenditure;
    }

    public void personalFamilyExpenditure(double expenditure) {
        totalExpenditure += expenditure;
    }

    public void miscellaneousExpenditure(double expenditure) {
        totalExpenditure += expenditure;
    }
}
