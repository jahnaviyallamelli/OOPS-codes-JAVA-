// File: DisplaySubjectsMain.java
import dept.CSE;
import dept.ECE;
import dept.ME;
import dept.CE;

public class DisplaySubjectsMain {
    public static void main(String[] args) {
        // Display subjects for each department
        System.out.println("Displaying subjects for each department:");
        System.out.println("-------------+++++++++++-------------------");

        CSE cse = new CSE();
        ECE ece = new ECE();
        ME me = new ME();
        CE ce = new CE();

        System.out.println("\nCSE Department Subjects:");
        cse.displaySubjects();

        System.out.println("\nECE Department Subjects:");
        ece.displaySubjects();

        System.out.println("\nME Department Subjects:");
        me.displaySubjects();

        System.out.println("\nCE Department Subjects:");
        ce.displaySubjects();
    }
}
