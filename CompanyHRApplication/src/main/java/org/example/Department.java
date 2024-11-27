package org.example;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private Employee teamLeader;
    private List<Employee> employees = new ArrayList<>();
    private List<String> tasks = new ArrayList<>();

    // Constructor: Initializes the department with a name and requires a team leader
    public Department(String departmentName, Employee teamLeader) {
        this.departmentName = departmentName;
        if (teamLeader == null) {
            throw new IllegalArgumentException("A team leader is required for each department.");
        }
        this.teamLeader = teamLeader;
    }

    // Change the team leader, ensuring only one team leader exists at a time
    public void changeTeamLeader(Employee newLeader)
    { System.out.println("Changing team leader from " + teamLeader.getFirstName() + " " + teamLeader.getLastName() +
            " to " + newLeader.getFirstName() + " " + newLeader.getLastName());
        this.teamLeader = newLeader;
    }

    // Add a new employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Remove an employee from the department
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    // Update an existing employee with a new employee
    public void updateEmployee(Employee oldEmployee, Employee newEmployee) {
        int index = employees.indexOf(oldEmployee);
        if (index != -1) {
            employees.set(index, newEmployee);
        }
    }

    // Add a new task to the department's task list and print the added task
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Added task: " + task); // Print added task
    }

    // Mark a task as completed
    public void markTaskAsCompleted(String task) {
        if (tasks.contains(task)) {
            tasks.remove(task);
            System.out.println("Task '" + task + "' has been marked as completed.");
        }
    }

    // Display all employees in the department with their names, ages, and years to retirement
    public void displayEmployees() {
        System.out.println("Employees in " + departmentName + ":");
        for (Employee e : employees) {
            System.out.println(e.getFirstName() + " " + e.getLastName() + ", Age: " + e.getAge() + ", Years to retirement: " + e.yearsToRetirement());
        }
    }

    // Display department information, including team leader and employees with their ages and years to retirement
    public void displayDepartmentInfo() {
        System.out.println("Department: " + departmentName);
        System.out.println("Team Leader: " + (teamLeader != null ? teamLeader.getFirstName() + " " + teamLeader.getLastName() + ", Age: " + teamLeader.getAge() + ", Years to retirement: " + teamLeader.yearsToRetirement() : "No team leader assigned"));
        displayEmployees();
    }
}