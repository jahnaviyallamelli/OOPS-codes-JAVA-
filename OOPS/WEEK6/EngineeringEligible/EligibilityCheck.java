// File: admission/EligibilityCheck.java
package admission;

public interface EligibilityCheck {
    boolean isEligible(int mathsMarks, int physicsMarks, int chemistryMarks, int englishMarks);
}
