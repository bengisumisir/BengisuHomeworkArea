package org.example;

// Main Class
public class Main {

    public static void main(String[] args) {

        // Singleton Example Usage
        SingletonExample singleton1 = SingletonExample.getInstance();
        singleton1.showMessage();

        SingletonExample singleton2 = SingletonExample.getInstance();
        System.out.println("Are both Singleton instances the same? " + (singleton1 == singleton2));

        // Builder Example Usage
        Product product = new Product.Builder()
                .setName("Laptop")
                .setPrice(1500.00)
                .setQuantity(2)
                .build();

        product.displayDetails();
    }
}
