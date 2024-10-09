public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private int experience;
    private int salary;
    private int age;
    private String title;

    public Employee(String firstName, String lastName, String position, int experience, int salary, int age, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.experience = experience;
        this.salary = salary;
        this.age = age;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + ", Position: " + position + 
               ", Experience: " + experience + " years" +
               ", Salary: $" + salary +
               ", Age: " + age +
               ", Title: " + title;
    }
}

