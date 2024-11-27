package org.example;

// Singleton Example Class
public class SingletonExample {

    // Static instance of the class (only one instance is allowed)
    private static SingletonExample instance;

    // Private constructor to prevent instantiation
    private SingletonExample() {
        System.out.println("Singleton Instance Created");
    }

    // Public static method to provide the instance
    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample(); // Lazy initialization
        }
        return instance;
    }

    // A sample method in the singleton class
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
