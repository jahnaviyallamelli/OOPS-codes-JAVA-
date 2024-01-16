// dept/CSE.java
package dept;

public class CSE implements Department {
    @Override
    public void displaySubjects() {
        System.out.println("Computer Science and Engineering Subjects:");
        System.out.println("1. Algorithms");
        System.out.println("2. Database Management");
        System.out.println("3. Operating Systems");
    }
}
