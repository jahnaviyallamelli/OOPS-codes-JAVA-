// File: admission/EngineeringAdmission.java
package admission;

public class EngineeringAdmission implements EligibilityCheck {
    @Override
    public boolean isEligible(int mathsMarks, int physicsMarks, int chemistryMarks, int englishMarks) {
        double totalPercentage = (mathsMarks + physicsMarks + chemistryMarks + englishMarks) / 4.0;

        return mathsMarks >= 90 &&
               physicsMarks >= 95 &&
               chemistryMarks >= 70 &&
               englishMarks >= 80 &&
               totalPercentage >= 80;
    }
}
