// File: dept/ME.java
package dept;

public class ME implements Department {
    @Override
    public void displaySubjects() {
        System.out.println("Mechanical Engineering Subjects:");
        System.out.println("1. Thermodynamics");
        System.out.println("2. Fluid Mechanics");
        System.out.println("3. Machine Design");
    }
}
