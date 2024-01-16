
package MSeva;

public class AcutePancreatitis implements Disease, CommonSymptoms {
    private String[] specificSymptoms = {"Muscle ache", "Fever"};

    @Override
    public String identifyDisease(String[] symptoms) {
        if (hasCommonSymptoms(symptoms) && hasSpecificSymptoms(symptoms, specificSymptoms)) {
            return "Acute Pancreatitis (AP)";
        }
        return null;
    }
}

