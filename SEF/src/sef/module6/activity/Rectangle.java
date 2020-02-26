package sef.module6.activity;

public class Rectangle extends Shape {

    // double parameters lenght and breadth
    private double length;
    private double breadth;
    // default constructor
    Rectangle() {
    }
//parametrized constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
// definition of method calculateArea()
    public double calculateArea() {
        double area = length * breadth; // are of Rectangle = length x breadth
        return area;
    }
    // definition of method calculatePerimeter()
    public double calculatePerimeter() {
        double perimeter = 2 * (length + breadth); //Perimiter of Square
        return perimeter;
    }
}
