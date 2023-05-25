package src.ShapesPerimeters;

public class App {
    public static void main(String[] args) {
        Square obj1 = new Square(3);
        System.out.println(obj1.getArea());

        Shape obj2 = new Square(5);
        System.out.println(obj2.getPerimeter());

    }
}
