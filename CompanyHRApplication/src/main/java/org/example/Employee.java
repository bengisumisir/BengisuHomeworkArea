package org.example;

import java.time.LocalDate;
import java.time.Period;

public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected LocalDate birthDate;

    // Constructor: Initializes the employee with first name, last name, and birthdate
    public Employee(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    // Getter for first name
    public String getFirstName() {
        return firstName;
    }

    // Getter for last name
    public String getLastName() {
        return lastName;
    }

    // Method to calculate age
    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    // Method to calculate years to retirement
    // Each subclass will define its own retirement age
    public int yearsToRetirement() {
        int retirementAge = getRetirementAge();
        int currentAge = getAge();  // Get the age from the new getAge method
        return retirementAge - currentAge;
    }

    // Abstract method: Each subclass will provide the specific retirement age
    protected abstract int getRetirementAge();
}
