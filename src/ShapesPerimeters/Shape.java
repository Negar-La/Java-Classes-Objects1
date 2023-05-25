package src.ShapesPerimeters;

public abstract class Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();  //empty method
    public abstract double getPerimeter(); //empty method
}
