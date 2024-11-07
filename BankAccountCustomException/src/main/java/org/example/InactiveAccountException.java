package org.example;

public class InactiveAccountException extends Exception {
    public InactiveAccountException(String message) {
        super(message);  // Mesajı üst sınıfa iletmek için kullanılır
    }
}
