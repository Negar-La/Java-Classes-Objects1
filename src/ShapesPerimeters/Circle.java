package src.ShapesPerimeters;

public class Circle extends Shape{
    private double radius;
    private double area;
    private double perimeter;
    @Override
   public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
   public  double getPerimeter() {
        return Math.PI* (radius * 2);
    }
}
