package person;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Ahmed");
        Person p2 = new Person(1, "Mohamed");

        System.out.println("p1.equals(p2): " + p1.equals(p2));

        HashSet<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        System.out.println("HashSet size: " + set.size());
    }
}
