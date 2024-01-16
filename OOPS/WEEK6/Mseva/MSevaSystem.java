
package MSeva;

import java.util.Scanner;

public class MSevaSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to M-Seva");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your symptoms (comma-separated): ");
        String[] userSymptoms = scanner.nextLine().split(", ");

        Disease[] diseases = {
            new AcutePancreatitis(),
            new Appendicitis(),
            new BladderCancer(),
            new PancreaticCancer()
        };

        boolean found = false;

        for (Disease disease : diseases) {
            String result = disease.identifyDisease(userSymptoms);
            if (result != null) {
                System.out.println("Possible disease: " + result);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching disease found for the given symptoms.");
        }
    }

    private static boolean hasCommonSymptoms(String[] symptoms) {
        for (String commonSymptom : CommonSymptoms.COMMON_SYMPTOMS) {
            if (!contains(symptoms, commonSymptom)) {
                return false;
            }
        }
        return true;
    }

    private static boolean hasSpecificSymptoms(String[] userSymptoms, String[] specificSymptoms) {
        for (String specificSymptom : specificSymptoms) {
            if (!contains(userSymptoms, specificSymptom)) {
                return false;
            }
        }
        return true;
    }

    private static boolean contains(String[] array, String target) {
        for (String element : array) {
            if (element.equalsIgnoreCase(target)) {
                return true;
            }
        }
        return false;
    }
}

