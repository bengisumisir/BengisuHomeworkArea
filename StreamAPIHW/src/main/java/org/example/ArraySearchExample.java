package org.example;

import java.util.Arrays;

public class ArraySearchExample {
    // Method to find an element in an array using Stream API
    public static <T> Object findInArray(T[] array, T elementToFind) {
        // Use Arrays.stream() to convert the array into a stream and search
        return Arrays.stream(array)
                .filter(element -> element.equals(elementToFind))
                .findFirst()
                .orElse((T) Integer.valueOf(-1));

    }

    public static void main(String[] args) {
        // Example with an array of integers
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println(findInArray(intArray, 3)); // Output: 3
        System.out.println(findInArray(intArray, 6)); // Output: -1

        // Example with an array of Strings
        String[] stringArray = {"dog", "cat", "bird"};
        System.out.println(findInArray(stringArray, "cat")); // Output: cat
        System.out.println(findInArray(stringArray, "fish")); // Output: -1
    }
}