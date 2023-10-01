// Q : 5
// AUTHOR: Argha Digar
// TITLE: Geometric Shapes Program
// DESCRIPTION: This Java program defines an abstract class GeometricShape with abstract methods area() and perimeter(). It also includes two subclasses, Triangle and Square, that extend the GeometricShape class and implement the respective methods to calculate the area and perimeter of each shape.

abstract class GeometricShape {
    // Abstract method to calculate the area
    public abstract double area();

    // Abstract method to calculate the perimeter
    public abstract double perimeter();
}

class Triangle extends GeometricShape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        // Using Heron's formula to calculate the area of a triangle
        double s = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}

class Square extends GeometricShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        Square square = new Square(4.0);

        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());

        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
    }
}
