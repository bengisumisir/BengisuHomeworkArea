package org.example;

public class DailyLimitExceededException extends Exception {
    public DailyLimitExceededException(String message) {
        super(message);  // Mesajı üst sınıfa iletmek için kullanılır
    }
}

