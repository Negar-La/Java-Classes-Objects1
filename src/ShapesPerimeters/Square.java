package src.ShapesPerimeters;

public class Square extends Shape {
    private double length;
    private double area;

    public Square(double length) {
        this.length = length;
    }

    private double perimeter;

    public double getArea() { //read-only field =. only getters and not setters
        return length * length;
    }

    public double getPerimeter() {
        return length * 4;
    }
}
