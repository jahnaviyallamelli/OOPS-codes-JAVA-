
package MSeva;

public class BladderCancer implements Disease, CommonSymptoms {
    private String[] specificSymptoms = {"Skin allergy", "Low bp"};

    @Override
    public String identifyDisease(String[] symptoms) {
        if (hasCommonSymptoms(symptoms) && hasSpecificSymptoms(symptoms, specificSymptoms)) {
            return "Bladder Cancer (BC)";
        }
        return null;
    }
}

