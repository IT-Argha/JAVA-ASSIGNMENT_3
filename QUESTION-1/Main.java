//Q:1
// AUTHOR: Argha Digar
// TITLE: Employee and HRManager Program
// DESCRIPTION: This Java program defines an Employee class with work() and getSalary() methods, and a HRManager subclass that overrides the work() method and adds a new method called addEmployee().

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working as an employee.");
    }

    public double getSalary() {
        return salary;
    }
       public String getName() {
        return name;
    }
}

class HRManager extends Employee {
    public HRManager(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println(getName() + " is working as an HR Manager.");
    }

    public void addEmployee(Employee employee) {
        System.out.println(getName() + " is adding a new employee: " + employee.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("ARGHA", 50000.0);
        HRManager hrManager = new HRManager("JEET", 60000.0);

        employee1.work();
        System.out.println("Employee Salary: $" + employee1.getSalary());

        hrManager.work();
        System.out.println("HR Manager Salary: $" + hrManager.getSalary());

        Employee employee2 = new Employee("ARNAB", 55000.0);
        hrManager.addEmployee(employee2);
    }
}
