import java.util.Scanner;

class Employee {
    private String name;
    private int experience; // Experience in years
    private double dailyRate; // Daily salary based on experience

    public Employee(String name, int experience) {
        this.name = name;
        this.experience = experience;
        this.dailyRate = calculateDailyRate(); // Set daily rate based on experience
    }

    // Method to calculate daily rate based on experience
    private double calculateDailyRate() {
        if (experience >= 20) {
            return 5000; // Daily rate for 20+ years experience
        } else if (experience >= 15) {
            return 4000; // Daily rate for 15-19 years experience
        } else if (experience >= 10) {
            return 3000; // Daily rate for 10-14 years experience
        } else if (experience >= 5) {
            return 2000; // Daily rate for 5-9 years experience
        } else {
            return 1000; // Daily rate for less than 5 years experience
        }
    }

    public double calculateSalary(int workingDays) {
        double bonus = (workingDays > 25) ? 1000 * (workingDays - 25) : 0;
        return dailyRate * workingDays + bonus; // Total salary including bonus
    }

    public String getName() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter years of experience: ");
        int experience = scanner.nextInt();
        
        Employee employee = new Employee(name, experience);

        System.out.print("Enter the number of working days: ");
        int workingDays = scanner.nextInt();

        double totalSalary = employee.calculateSalary(workingDays);
        
        System.out.println(employee.getName() + "'s total salary: " + totalSalary + " TL");

        scanner.close();
    }
}


