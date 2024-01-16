
package MSeva;

public class PancreaticCancer implements Disease, CommonSymptoms {
    private String[] specificSymptoms = {"Fever", "Fatigue"};

    @Override
    public String identifyDisease(String[] symptoms) {
        if (hasCommonSymptoms(symptoms) && hasSpecificSymptoms(symptoms, specificSymptoms)) {
            return "Pancreatic Cancer (PC)";
        }
        return null;
    }
}

