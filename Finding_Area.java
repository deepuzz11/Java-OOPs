package main;

import java.util.Scanner;

abstract class Shape {
    protected double side1;
    protected double side2;

    public Shape(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    void printArea() {
        double area = side1 * side2;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    void printArea() {
        double area = 0.5 * side1 * side2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    public Circle(double radius) {
        super(radius, 0); // side1 represents the radius, side2 not used
    }

    @Override
    void printArea() {
        double area = Math.PI * side1 * side1;
        System.out.println("Area of Circle: " + area);
    }
}

public class Finding_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        int choice = scanner.nextInt();
        Shape shape = null;
        switch (choice) {
            case 1:
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                shape = new Rectangle(length, width);
                break;
            case 2:
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                shape = new Triangle(base, height);
                break;
            case 3:
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }
        if (shape != null) {
            shape.printArea();
        }
        scanner.close();
    }
}
