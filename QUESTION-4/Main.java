//Q:4
// AUTHOR: Argha Digar
// TITLE: Employee Management System
// DESCRIPTION: This Java program defines an abstract class Employee with abstract methods calculateSalary() and displayInfo(). It also includes two subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.


abstract class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Abstract method to display employee information
    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public Manager(String name, int employeeId, double baseSalary, double bonus) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }


    public double calculateSalary() {
        return baseSalary + bonus;
    }


    public void displayInfo() {
        System.out.println("Manager Information:");
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}

class Programmer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Programmer(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }


    public void displayInfo() {
        System.out.println("Programmer Information:");
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked + " hours");
        System.out.println("Total Salary: $" + calculateSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Arijit", 1001, 60000.0, 10000.0);
        Programmer programmer = new Programmer("Argha", 1002, 25.0, 160);

        manager.displayInfo();
        System.out.println();
        programmer.displayInfo();
    }
}

