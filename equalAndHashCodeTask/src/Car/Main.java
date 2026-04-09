package Car;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Car, String> map = new HashMap<>();
        Car car1 = new Car("ABC-123", "Red");

        map.put(car1, "Owner Alpha");

        Car car2 = new Car("ABC-123", "Blue");
        System.out.println("Owner of car2: " + map.get(car2));
    }
}
