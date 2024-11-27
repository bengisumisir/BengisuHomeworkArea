package org.example;

// Builder Example Class
public class Product {

    // Fields of the class
    private String name;
    private double price;
    private int quantity;

    // Private constructor (only accessible from the Builder)
    private Product(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.quantity = builder.quantity;
    }

    // Static nested Builder class
    public static class Builder {
        private String name;
        private double price;
        private int quantity;

        // Setter method for name
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        // Setter method for price
        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        // Setter method for quantity
        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        // Build method to create Product instance
        public Product build() {
            return new Product(this); // Using the private constructor
        }
    }

    // A method to display product details
    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }
}
