
public class Main {
    public static void main(String[] args) {
        // Create a department
        Department department = new Department("Software Development");

        // Add employees
        department.addEmployee(new Employee("Ali", "Yilmaz", "Developer", 3, 60000, 28, "Senior Developer"));
        department.addEmployee(new Employee("Ayşe", "Demir", "Test Engineer", 2, 50000, 26, "Junior Test Engineer"));
        department.addEmployee(new Employee("Mehmet", "Kara", "Project Manager", 5, 80000, 35, "Senior Project Manager"));
        department.addEmployee(new Employee("Fatma", "Celik", "System Analyst", 4, 70000, 30, "System Analyst"));
        department.addEmployee(new Employee("Emre", "Akman", "Data Scientist", 6, 75000, 32, "Data Scientist"));
        department.addEmployee(new Employee("Zeynep", "Aydın", "UX Designer", 1, 55000, 25, "Junior UX Designer"));
        department.addEmployee(new Employee("Can", "Öztürk", "DevOps Engineer", 3, 65000, 29, "DevOps Engineer"));
        department.addEmployee(new Employee("Ece", "Kara", "Product Owner", 4, 72000, 33, "Product Owner"));
        department.addEmployee(new Employee("Burak", "Çetin", "Front-End Developer", 2, 58000, 27, "Junior Front-End Developer"));
        department.addEmployee(new Employee("Selin", "Koç", "Back-End Developer", 3, 62000, 31, "Back-End Developer"));

        // List employees
        department.listEmployees();
    }
}

