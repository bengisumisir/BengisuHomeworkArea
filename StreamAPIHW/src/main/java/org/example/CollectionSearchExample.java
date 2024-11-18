package org.example;

import java.util.Collection;
import java.util.Optional;

public class CollectionSearchExample {
    // Method to find an element in a collection using Stream API
    public static <T> Object findInCollection(Collection<T> collection, T elementToFind) {
        // Use Stream API to find the element
        Optional<T> result = collection.stream()
                .filter(element -> element.equals(elementToFind))
                .findFirst();
        // Return the element if found, otherwise -1
        return result.orElse((T) Integer.valueOf(-1)); // Explicit casting to T

    }

    public static void main(String[] args) {
        // Example with a collection of Strings
        Collection<String> collection = java.util.List.of("apple", "banana", "cherry");
        System.out.println(findInCollection(collection, "banana")); // Output: banana
        System.out.println(findInCollection(collection, "orange")); // Output: -1
    }
}