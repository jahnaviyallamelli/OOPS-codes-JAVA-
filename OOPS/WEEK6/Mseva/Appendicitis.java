package MSeva;

public class Appendicitis implements Disease, CommonSymptoms {
    private String[] specificSymptoms = {"Fever", "Fatigue"};

    @Override
    public String identifyDisease(String[] symptoms) {
        if (hasCommonSymptoms(symptoms) && hasSpecificSymptoms(symptoms, specificSymptoms)) {
            return "Appendicitis (A)";
        }
        return null;
    }
}

