package org.example;

import java.time.LocalDate;

public class Male extends Employee {

    // Constructor for Male employee
    public Male(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }

    // Override the getRetirementAge method to return the retirement age for men
    @Override
    protected int getRetirementAge() {
        return 65; // Retirement age for men is 65
    }
}