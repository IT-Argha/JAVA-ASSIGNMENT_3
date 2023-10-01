// Q : 8
// AUTHOR: Argha Digar
// TITLE: Car Information Program
// DESCRIPTION: This Java program defines a class called Car with private instance variables for company_name, model_name, year, and mileage. It provides public getter and setter methods to access and modify the company_name, model_name, and year variables. However, only a getter method is provided for the mileage variable. The program demonstrates how to create a Car instance, access its properties, and modify some of its properties.

class Car {
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    // Constructor
    public Car(String company_name, String model_name, int year, double mileage) {
        this.company_name = company_name;
        this.model_name = model_name;
        this.year = year;
        this.mileage = mileage;
    }

}

public class Main {
    public static void main(String[] args) {
        
        Car myCar = new Car("Toyota", "Camry", 2022, 30.5);

        // Use getter methods to access the values
        System.out.println("Company: " + myCar.getCompany_name());
        System.out.println("Model: " + myCar.getModel_name());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Mileage: " + myCar.getMileage());

        // Use setter methods to modify values
        myCar.setYear(2023);
        myCar.setMileage(32.0);

        // Check the updated values
        System.out.println("Updated Year: " + myCar.getYear());
        System.out.println("Updated Mileage: " + myCar.getMileage());
    }
}
