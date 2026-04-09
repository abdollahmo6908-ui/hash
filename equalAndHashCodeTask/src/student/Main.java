package student;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(2024, "test@sgu.edu.eg");
        Student s2 = new Student(2024, "another@sgu.edu.eg");

        HashSet<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println("Students in set: " + students.size());
    }
}
