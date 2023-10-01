// Q : 10
// AUTHOR: Argha Digar
// TITLE: Shape Drawing and Area Calculation
// DESCRIPTION: This Java program defines a base class Shape with methods draw() and calculateArea(). It also includes three subclasses: Circle, Square, and Triangle. The draw() method is overridden in each subclass to draw the respective shape, and the calculateArea() method is overridden to calculate and return the area of each shape. The program demonstrates how to create instances of these shapes and utilize their draw and area calculation functionalities.

class Shape {  
    public void draw() {
        System.out.println("Drawing a shape");
    }

    public double calculateArea() {
        return 0.0;
    }
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a circle");
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Square
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void draw() {
        System.out.println("Drawing a square");
    }

    public double calculateArea() {
        return side * side;
    }
}

// Subclass Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void draw() {
        System.out.println("Drawing a triangle");
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);
        Shape triangle = new Triangle(3.0, 6.0);

        circle.draw();
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println();

        square.draw();
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println();
        
        triangle.draw();
        System.out.println("Triangle Area: " + triangle.calculateArea());
    }
}

