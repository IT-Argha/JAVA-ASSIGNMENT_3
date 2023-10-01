//Q:3
// AUTHOR: Argha Digar
// TITLE: Vehicle Class Hierarchy Program
// DESCRIPTION: This Java program defines a vehicle class hierarchy with a base class Vehicle and three subclasses (Truck, Car, and Motorcycle). Each class includes properties for make, model, year, and fuel type, as well
class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public double calculateFuelEfficiency(double milesDriven, double gallonsConsumed) {
        if (gallonsConsumed <= 0) {
            return 0.0; // Avoid division by zero
        }
        return milesDriven / gallonsConsumed;
    }

    public double calculateDistance(double speed, double time) {
        return speed * time;
    }

    public double calculateMaxSpeed(double enginePower, double weight) {

        return enginePower / weight * 100;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }
}

class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "F-150", 2022, "Gasoline");
        Car car = new Car("Toyota", "Camry", 2023, "Hybrid");
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2021, "Gasoline");

        double fuelEfficiency = truck.calculateFuelEfficiency(250.0, 10.0);
        double distance = truck.calculateDistance(60.0, 4.0);
        double maxSpeed = truck.calculateMaxSpeed(300.0, 4000.0);

        System.out.println("Truck Make: " + truck.getMake());
        System.out.println("Truck Model: " + truck.getModel());
        System.out.println("Truck Year: " + truck.getYear());
        System.out.println("Truck Fuel Type: " + truck.getFuelType());
        System.out.println("Truck Fuel Efficiency: " + fuelEfficiency + " miles per gallon");
        System.out.println("Truck Distance Traveled: " + distance + " miles");
        System.out.println("Truck Maximum Speed: " + maxSpeed + " mph");
    }
}
