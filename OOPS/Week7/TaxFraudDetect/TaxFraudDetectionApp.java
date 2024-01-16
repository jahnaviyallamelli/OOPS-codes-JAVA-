import java.util.*;
import audit.TaxAudit;
import audit.TaxAuditImpl;
import audit.TaxFraudException;

public class TaxFraudDetectionApp {
    public static void main(String[] args) {
        TaxAudit taxAudit = new TaxAuditImpl(50000.0, 20000.0, 3000.0);

        try {
            taxAudit.homeExpenditure(10000.0);
            taxAudit.healthExpenditure(5000.0);
            taxAudit.vehicleExpenditure(3000.0);
            taxAudit.personalFamilyExpenditure(2000.0);
            taxAudit.miscellaneousExpenditure(1000.0);

            taxAudit.taxChecker(50000.0, 20000.0);
            System.out.println("Tax audit passed. No fraud detected.");
        } catch (TaxFraudException e) {
            System.out.println("Tax fraud detected: " + e.getMessage());
        }
    }
}
