package src.ShapesPerimeters;

public class Rectangle extends Shape{
    private double length;
    private double width;
    private double area;
    private double perimeter;

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return (length+ width)* 2;
    }
}
