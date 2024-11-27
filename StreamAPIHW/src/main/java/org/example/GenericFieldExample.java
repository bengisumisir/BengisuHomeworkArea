package org.example;

// Generic class with a field of type T
public class GenericFieldExample<T> {
    // Generic field
    private T field;

    // Constructor to initialize the field
    public GenericFieldExample(T field) {
        this.field = field;
    }

    // Method to print the field value
    public void printField() {
        System.out.println("Field value: " + field);
    }

    public static void main(String[] args) {
        // Example with Integer
        GenericFieldExample<Integer> intExample = new GenericFieldExample<>(42);
        intExample.printField();

        // Example with String
        GenericFieldExample<String> stringExample = new GenericFieldExample<>("Hello, World!");
        stringExample.printField();

        // Example with Double
        GenericFieldExample<Double> doubleExample = new GenericFieldExample<>(3.14);
        doubleExample.printField();
    }
}