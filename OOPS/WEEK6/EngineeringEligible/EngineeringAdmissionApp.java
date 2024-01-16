
import admission.EligibilityCheck;
import admission.EngineeringAdmission;

public class EngineeringAdmissionApp {
    public static void main(String[] args) {
        EngineeringAdmission admissionProcessor = new EngineeringAdmission();

        // Example applicants
        int[][] applicantsMarks = {
            {95, 96, 75, 85}, // Eligible
            {88, 97, 78, 82}, // Not eligible
            {92, 92, 80, 88}  // Eligible
        };

        System.out.println("Eligible Students for Engineering Admission:");

        for (int i = 0; i < applicantsMarks.length; i++) {
            int mathsMarks = applicantsMarks[i][0];
            int physicsMarks = applicantsMarks[i][1];
            int chemistryMarks = applicantsMarks[i][2];
            int englishMarks = applicantsMarks[i][3];

            if (admissionProcessor.isEligible(mathsMarks, physicsMarks, chemistryMarks, englishMarks)) {
                System.out.println("Applicant " + (i + 1) + " is eligible.");
            }
        }
    }
}
