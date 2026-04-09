package product;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Product pr1 = new Product("A100", 50.0);
        Product pr2 = new Product("A100", 150.0);

        HashSet<Product> products = new HashSet<>();
        products.add(pr1);
        products.add(pr2);
        System.out.println("Products count: " + products.size());
    }
}
