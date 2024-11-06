package org.example;

import java.time.LocalDate;

public class Female extends Employee {

    // Constructor for Female employee
    public Female(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }

    // Override the getRetirementAge method to return the retirement age for women
    @Override
    protected int getRetirementAge() {
        return 60; // Retirement age for women is 60
    }
}
