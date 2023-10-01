//Q:2
// AUTHOR: Argha Digar
// TITLE: Person and Employee Information Program
// DESCRIPTION: This Java program defines a Person class with getFirstName() and getLastName() methods, and a subclass called Employee that adds a new method getEmployeeId() and overrides the getLastName() method to include the employee's job title.

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    private String employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Argha", "Digar", "65432", "Software Engineer");

        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name with Job Title: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
