package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Scenario 1: Trying to create a department without a team leader
        try {
            Department departmentWithoutLeader = new Department("Finance", null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Output: "A team leader is required for each department."
        }

        // Create an initial team leader
        Employee initialTeamLeader = new Male("Michael", "Johnson", LocalDate.of(1980, 2, 10));

        // Create a department with the initial team leader
        Department hrDepartment = new Department("Human Resources", initialTeamLeader);

        // Display initial department information
        hrDepartment.displayDepartmentInfo();

        // Add employees to the department
        Employee john = new Male("John", "Doe", LocalDate.of(1985, 5, 15));
        Employee alex = new Male("Alex", "Hamilton", LocalDate.of(1959, 7, 25));
        Employee mike = new Male("Mike", "Anderson", LocalDate.of(1992, 4, 10));
        Employee jane = new Female("Jane", "Smith", LocalDate.of(1990, 7, 25));
        Employee emma = new Female("Emma", "Johnson", LocalDate.of(1963, 7, 25));
        Employee sophia = new Female("Sophia", "Brown", LocalDate.of(1983, 8, 3));
        hrDepartment.addEmployee(john);
        hrDepartment.addEmployee(jane);
        hrDepartment.addEmployee(alex);
        hrDepartment.addEmployee(mike);
        hrDepartment.addEmployee(emma);
        hrDepartment.addEmployee(sophia);
        System.out.println("Added employees John, Jane, Alex, Mike, Emma and Sophia to the department.");

        // Display department information
        hrDepartment.displayDepartmentInfo();

        // Update an employee
        Employee updatedJane = new Female("Jane", "Doe", LocalDate.of(1990, 7, 25));
        hrDepartment.updateEmployee(jane, updatedJane);
        System.out.println("Updated employee Jane's last name to Doe.");

        // Update an employee
        Employee updatedSophia = new Female("Sophia Mary", "Brown", LocalDate.of(1983, 8, 3));
        hrDepartment.updateEmployee(sophia, updatedSophia);
        System.out.println("Updated employee Sophia's first name to Sophia Mary.");

        // Remove an employee
        hrDepartment.removeEmployee(john);
        System.out.println("Removed employee John from the department.");

        // Add tasks to the department
        hrDepartment.addTask("Complete performance reviews");
        hrDepartment.addTask("Organize team-building event");
        System.out.println("Added tasks to the department.");

        // Mark a task as completed
        hrDepartment.markTaskAsCompleted("Complete performance reviews");

        // Change the team leader to Jane
        hrDepartment.changeTeamLeader(jane);

        // Display final department information
        hrDepartment.displayDepartmentInfo();
    }
}