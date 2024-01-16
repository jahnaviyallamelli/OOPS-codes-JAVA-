// File: dept/ECE.java
package dept;

public class ECE implements Department {
    @Override
    public void displaySubjects() {
        System.out.println("Electronics and Communication Engineering Subjects:");
        System.out.println("1. Digital Signal Processing");
        System.out.println("2. Analog Electronics");
        System.out.println("3. Communication Systems");
    }
}
